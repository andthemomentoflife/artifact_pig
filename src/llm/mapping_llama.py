import openai
import os, json, ast, sys, re
from os import path
from openpyxl import Workbook, load_workbook
import time

try:
    from . import prompts, utils
except:
    import prompts, utils

sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
from synth import call
from mapping import api_match_difflib, api_mapping_result

try:
    import context_remover_refactor
except:
    from llm import context_remover_refactor

from pathlib import Path
from ollama import Client

PIG_PATH = Path.home() / "Desktop" / "pig_sal"

host = "http://163.152.162.226:8000"

# CAND_APIS: dict = utils.name_and_signs(utils.parse_mapping_history())

model_list = [
    "llama3.1:8b",
    "gemma2:9b",
    "qwen2:7b",
    "deepseek-r1:32b",
    "gemma3:27b",
    "qwen3:32b",
]


def AskLLM(
    libo: str,
    libn: str,
    apio: str,
    codeb: str,
    model,
    apins,
    b_api=True,
    b_slicing=True,
) -> str:

    INIT_PROMPT = prompts.init_prompt(libo, libn, apio)
    apins = apins.strip()

    SECOND_QUERY = prompts.second_query(
        libo, libn, apio, apins, codeb, b_api, b_slicing
    )

    print(SECOND_QUERY)

    client = Client(host=host)
    client.pull(model=model)
    INIT_RESPONSE_RAW = client.chat(
        model=model,
        messages=[
            {"role": "system", "content": INIT_PROMPT},
            {"role": "user", "content": SECOND_QUERY},
        ],
        options={
            "num_ctx": 4096,
            "temperature": 1.0,
        },
    )

    INIT_RESPONSE = INIT_RESPONSE_RAW["message"]["content"]

    return INIT_RESPONSE


def run():
    contents = []
    path = PIG_PATH / "benchmarks"
    file_list = os.listdir(path)
    file_list_json = [file for file in file_list if file.endswith(".json")]
    file_list_json.sort(key=lambda x: int(x.split(".")[0]))

    write_wb = Workbook()

    for model in model_list:
        print(">>> Model: ", model)
        sheet_name = model.replace(":", "-")
        ws_model = write_wb.create_sheet(sheet_name)
        file_list_json.sort(key=lambda x: int(x.split(".")[0]))

        for j in file_list_json:
            if j not in [
                "67.json",
                "130.json",
                "206.json",
                "457.json",
                "489.json",
                "492.json",
                "528.json",
                "616.json",
            ]:
                continue
            print("File in progress: ", j)
            contents.append(j)

            with open(path / j) as f:
                data = json.load(f)
                fileb = open(path / data["bef_file"], "r")

                codeb = fileb.read()

                libo = data["libo"]
                libn = data["libn"]
                apio = list(data["apio"])

                for api in apio:
                    print("=" * 10, api, "=" * 10)
                    root = ast.parse(codeb)

                    ParentO = call.ParentAst(root)

                    CPO = call.Preparation([], apios=api)
                    CPO.visit(root)
                    OCNs = CPO.nodes
                    funcdefs = CPO.funcdefs
                    classdefs = CPO.classdefs

                    codebb = ast.unparse(
                        context_remover_refactor.remove_context(
                            OCNs, root, api, ParentO, libo, libn, funcdefs, classdefs
                        )
                    )  # Should consider the case where real usage lib name is different to the name of it
                    contents.append(codebb)

                    try:
                        total_apins = api_mapping_result.result[j]
                        apins = total_apins[api]
                        apins: str = utils.name_and_signs(apins)
                        print(apins)

                        answer = AskLLM(
                            libo, libn, api, codebb, model, apins, b_api=True
                        )
                        contents.append(answer)
                        print(answer)

                    except:
                        print("AskLLM Error")

                ws_model.append(contents)
                contents = []

    write_wb.save(PIG_PATH / "langchain/additional_benchmarks_ours_pig.xlsx")


if __name__ == "__main__":
    run()
