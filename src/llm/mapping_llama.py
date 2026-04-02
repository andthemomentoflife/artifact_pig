import os, json, ast, sys
import argparse
from os import path
from openpyxl import Workbook
from regex import W

try:
    from . import prompts
except:
    import prompts

sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
from synth import call
from mapping.compare_arg import find_candidate_apis

try:
    import context_remover_refactor
except:
    from llm import context_remover_refactor

from pathlib import Path
from ollama import Client

PIG_PATH = Path(__file__).parent.parent.parent
MAPPING_HISTORY_PATH = PIG_PATH / "src" / "mapping" / "MAPPING_HISTORY.json"

with open(MAPPING_HISTORY_PATH, "r") as f:
    api_mapping_result = json.load(f)


def name_and_signs(cands: list) -> str:
    n = 1
    text = ""

    cands = cands[:3]

    for cand in cands:
        try:
            name, args, name_score, arg_score = cand
        except:
            name, args = cand

        if len(args) == 0:
            text += f"{n}. API Name: {name} | No Argument\n"

        else:
            text += f"{n}. API Name: {name} | Argument: {list(args)}\n"

        n += 1

    return text


# Ollama API host
# Make sure to set the correct host for your Ollama server
host = os.environ.get("OLLAMA_HOST", "http://localhost:11434")


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


def run(output_path: str, model: str, files: list, b_api: bool):
    contents = []
    path = PIG_PATH / "benchmarks"

    write_wb = Workbook()
    print(">>> Model: ", model)

    sheet_name = model.replace(":", "-")
    ws_model = write_wb.create_sheet(sheet_name)

    for j in files:
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
                contents.append(api)

                try:
                    if j not in api_mapping_result:
                        apins = find_candidate_apis(libo, api, [], libn)

                    else:
                        total_apins = api_mapping_result[j]
                        apins = total_apins[api]

                    apins: str = name_and_signs(apins)
                    answer = AskLLM(libo, libn, api, codebb, model, apins, b_api)
                    contents.append(answer)

                except:
                    print("AskLLM Error")
                    contents.append("AskLLM Error")

            print(contents)

            ws_model.append(contents)
            contents = []

    write_wb.save(output_path)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="LLM Mapping Runner")
    parser.add_argument(
        "--model",
        type=str,
        default="llama:3.1:8b",
        help="Model to use (e.g., llama3.1:8b, gemma2:9b, qwen2:7b, deepseek-r1:32b, gemma3:27b, qwen3:32b)",
    )

    parser.add_argument(
        "--output_path", type=str, help="Path to save the output Excel file"
    )

    parser.add_argument(
        "--file",
        type=str,
        nargs="+",
        default=["1.json"],
        help="Target file to process (e.g. 1.json)",
    )

    parser.add_argument(
        "--b_api",
        type=bool,
        default=True,
        help="Enable API candidate information in the prompt (True/False)",
    )

    args = parser.parse_args()
    output_path = args.output_path
    model = args.model
    file = args.file
    b_api = args.b_api

    run(output_path, model, args.file, b_api)
