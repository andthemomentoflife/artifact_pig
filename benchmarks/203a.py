#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import sys
import os
import argparse
import traceback
import multiprocessing as mp
import zulip
import slack_sdk
from slack_sdk.rtm import RTMClient
from typing import Any, Dict, Callable

import bridge_with_slack_config

# change these templates to change the format of displayed message
ZULIP_MESSAGE_TEMPLATE = "**{username}**: {message}"
SLACK_MESSAGE_TEMPLATE = "<{username}> {message}"


def check_zulip_message_validity(msg: Dict[str, Any], config: Dict[str, Any]) -> bool:
    is_a_stream = msg["type"] == "stream"
    in_the_specified_stream = msg["display_recipient"] == config["stream"]
    at_the_specified_subject = msg["subject"] == config["topic"]

    # We do this to identify the messages generated from Matrix -> Zulip
    # and we make sure we don't forward it again to the Matrix.
    not_from_zulip_bot = msg["sender_email"] != config["email"]
    if (
        is_a_stream
        and not_from_zulip_bot
        and in_the_specified_stream
        and at_the_specified_subject
    ):
        return True
    return False


class SlackBridge:
    def __init__(self, config: Dict[str, Any]) -> None:
        self.config = config
        self.zulip_config = config["zulip"]
        self.slack_config = config["slack"]

        # zulip-specific
        self.zulip_client = zulip.Client(
            email=self.zulip_config["email"],
            api_key=self.zulip_config["api_key"],
            site=self.zulip_config["site"],
        )
        self.zulip_stream = self.zulip_config["stream"]
        self.zulip_subject = self.zulip_config["topic"]

        # slack-specific
        self.channel = self.slack_config["channel"]
        self.slack_client = RTMClient(
            token=self.slack_config["token"], auto_reconnect=True
        )
        # Spawn a non-websocket client for getting the users
        # list and for posting messages in Slack.
        self.slack_webclient = slack_sdk.WebClient(token=self.slack_config["token"])

    def wrap_slack_mention_with_bracket(self, zulip_msg: Dict[str, Any]) -> None:
        words = zulip_msg["content"].split(" ")
        for w in words:
            if w.startswith("@"):
                zulip_msg["content"] = zulip_msg["content"].replace(w, "<" + w + ">")

    def replace_slack_id_with_name(self, msg: Dict[str, Any]) -> None:
        words = msg["text"].split(" ")
        for w in words:
            if w.startswith("<@") and w.endswith(">"):
                _id = w[2:-1]
                msg["text"] = msg["text"].replace(_id, self.slack_id_to_name[_id])

    def zulip_to_slack(self) -> Callable[[Dict[str, Any]], None]:
        def _zulip_to_slack(msg: Dict[str, Any]) -> None:
            message_valid = check_zulip_message_validity(msg, self.zulip_config)
            if message_valid:
                self.wrap_slack_mention_with_bracket(msg)
                slack_text = SLACK_MESSAGE_TEMPLATE.format(
                    username=msg["sender_full_name"], message=msg["content"]
                )
                self.slack_webclient.chat_postMessage(
                    channel=self.channel,
                    text=slack_text,
                )

        return _zulip_to_slack

    def run_slack_listener(self) -> None:
        members = self.slack_webclient.users_list()["members"]
        # See also https://api.slack.com/changelog/2017-09-the-one-about-usernames
        self.slack_id_to_name = {
            u["id"]: u["profile"].get("display_name", u["profile"]["real_name"])
            for u in members
        }
        self.slack_name_to_id = {v: k for k, v in self.slack_id_to_name.items()}

        @RTMClient.run_on(event="message")
        def slack_to_zulip(**payload: Any) -> None:
            msg = payload["data"]
            if msg["channel"] != self.channel:
                return
            user_id = msg["user"]
            user = self.slack_id_to_name[user_id]
            from_bot = user == self.slack_config["username"]
            if from_bot:
                return
            self.replace_slack_id_with_name(msg)
            content = ZULIP_MESSAGE_TEMPLATE.format(username=user, message=msg["text"])
            msg_data = dict(
                type="stream",
                to=self.zulip_stream,
                subject=self.zulip_subject,
                content=content,
            )
            self.zulip_client.send_message(msg_data)

        self.slack_client.start()


if __name__ == "__main__":
    usage = """run-slack-bridge

    Relay each message received at a specified subject in a specified stream from
    the first realm to a channel in a Slack workspace.
    """

    sys.path.append(os.path.join(os.path.dirname(__file__), ".."))
    parser = argparse.ArgumentParser(usage=usage)

    print("Starting slack mirroring bot")
    print("MAKE SURE THE BOT IS SUBSCRIBED TO THE RELEVANT ZULIP STREAM")

    config = bridge_with_slack_config.config

    backoff = zulip.RandomExponentialBackoff(timeout_success_equivalent=300)
    while backoff.keep_going():
        try:
            sb = SlackBridge(config)

            zp = mp.Process(
                target=sb.zulip_client.call_on_each_message, args=(sb.zulip_to_slack(),)
            )
            sp = mp.Process(target=sb.run_slack_listener, args=())
            print("Starting message handler on Zulip client")
            zp.start()
            print("Starting message handler on Slack client")
            sp.start()

            zp.join()
            sp.join()
        except Exception:
            traceback.print_exc()
        backoff.fail()
