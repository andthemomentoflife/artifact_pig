#!/usr/bin/env python

from __future__ import print_function

import argparse
import glob
import json
import mimetypes
import os
import subprocess
import tempfile

import boto
import boto.s3.connection
import shutil
import yattag


class Bucket:
    def __init__(self, name):
        self.name = name
        # Boto currently can't handle names with dots unless the region
        # is specified explicitly.
        # See: https://github.com/boto/boto/issues/2836
        self.s3 = boto.s3.connect_to_region(
            region_name=self.get_region(),
            calling_format=boto.s3.connection.OrdinaryCallingFormat(),
        )
        self.bucket = self.s3.get_bucket(name)

    def get_region(self):
        if not hasattr(self, "_region"):
            # S3, for what appears to be backwards-compatibility
            # reasons, maintains a distinction between location
            # constraints and region endpoints. Newer regions have
            # equivalent regions and location constraints, so we
            # hardcode the non-equivalent regions here with hopefully no
            # automatic support future S3 regions.
            #
            # Note also that someday, Boto should handle this for us
            # instead of the AWS command line tools.
            output = subprocess.check_output(
                ["aws", "s3api", "get-bucket-location", "--bucket", self.name]
            )
            location = json.loads(output)["LocationConstraint"]
            if not location:
                self._region = "us-east-1"
            elif location == "EU":
                self._region = "eu-west-1"
            else:
                self._region = location
        return self._region

    def generate_url(self, key):
        if not isinstance(key, boto.s3.key.Key):
            key = boto.s3.key.Key(bucket=self.bucket, name=key)

        return key.generate_url(expires_in=0, query_auth=False)

    def sync(self, local_dir):
        return subprocess.check_call(
            [
                "aws",
                "s3",
                "sync",
                local_dir,
                "s3://{0}".format(self.bucket.name),
                "--region",
                self.get_region(),
            ]
        )

    def put(self, body, key):
        key = boto.s3.key.Key(bucket=self.bucket, name=key)

        content_type = mimetypes.guess_type(key.name)[0]
        if content_type:
            key.content_type = content_type

        key.set_contents_from_string(body, replace=True)

    def list_wheels(self):
        return [key for key in self.bucket.list() if key.name.endswith(".whl")]

    def make_index(self):
        doc, tag, text = yattag.Doc().tagtext()
        with tag("html"):
            for key in self.list_wheels():
                with tag("a", href=self.generate_url(key)):
                    text(key.name)
                doc.stag("br")

        return doc.getvalue()


def build_wheels(packages, index_url, requirements, exclusions):
    temp_dir = tempfile.mkdtemp(prefix="mkwheelhouse-")

    args = ["pip", "wheel", "--wheel-dir", temp_dir, "--find-links", index_url]

    for requirement in requirements:
        args += ["--requirement", requirement]

    args += packages
    subprocess.check_call(args)

    for exclusion in exclusions:
        matches = glob.glob(os.path.join(temp_dir, exclusion))
        map(os.remove, matches)

    return temp_dir


def main():
    parser = argparse.ArgumentParser(
        description="Generate and upload wheels to an Amazon S3 wheelhouse"
    )
    parser.add_argument(
        "-r",
        "--requirement",
        action="append",
        default=[],
        metavar="REQUIREMENTS_FILE",
        help="Requirements file to build wheels for",
    )
    parser.add_argument(
        "-e",
        "--exclude",
        action="append",
        default=[],
        metavar="WHEEL_FILENAME",
        help="Wheels to exclude from upload",
    )
    parser.add_argument("bucket")
    parser.add_argument("package", nargs="*", default=[])

    args = parser.parse_args()

    if not args.requirement and not args.package:
        parser.error("specify at least one requirements file or package")

    bucket = Bucket(args.bucket)
    index_url = bucket.generate_url("index.html")

    build_dir = build_wheels(args.package, index_url, args.requirement, args.exclude)
    bucket.sync(build_dir)
    bucket.put(bucket.make_index(), key="index.html")
    shutil.rmtree(build_dir)

    print("Index written to:", index_url)


if __name__ == "__main__":
    main()
