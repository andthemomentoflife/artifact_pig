"""
A code snippet which extracts "only" code from LLM answer.
The form of the code snippet is different for each LLM models.
"""

import ast

from pathlib import Path
from openpyxl import load_workbook

PIG_PATH = Path.home() / "Desktop" / "Pig"

model_list = [
    "starcoder2-7b",
    "llama3.1-8b",
    "gemma2-9b",
    "qwen2-7b",
    "deepseek-coder-v2-16b",
    "codegemma-7b",
]


# ```python``` : usual case
def CodeExtract1(answer):
    # Extract code snippet
    standard = "```python"
    result = list()
    start = None

    for i in range(len(answer)):
        if (start == None) and (answer[i] == "`" and answer[i : i + 9] == "```python"):
            start = i + 9

        elif (start != None) and answer[i : i + 3] == "```":
            end = i
            result.append(answer[start:end].strip("`"))
            start = None

    if (len(result) == 0) and (standard in answer):
        result.append(answer.split("```python")[-1])

    elif standard not in answer:
        result.append(answer)

    return result


# <migrated_code>
def CodeExtract2(answer):
    # Extract code snippet
    standard = "<migrated_code>"
    result = list()
    start = None

    for i in range(len(answer)):
        if (start == None) and (
            answer[i] == "<" and answer[i : i + 15] == "<migrated_code>"
        ):
            start = i + 15

        elif (start != None) and answer[i : i + 16] == "</migrated_code>":
            end = i
            result.append(answer[start:end].strip("`"))
            start = None

    if (len(result) == 0) and (standard in answer):
        result.append(answer.split("<migrated_code>")[-1])

    elif standard not in answer:
        result.append(answer)

    return result


# weirdos
def CodeExtract3(answer):
    # Extract code snippet
    standard = "<migrated_code>"
    result = list()
    start = None

    for i in range(len(answer)):
        if (start == None) and (
            answer[i] == "<" and answer[i : i + 15] == "<migrated_code>"
        ):
            start = i + 15

        elif (start != None) and (
            answer[i : i + 3] == "```" or answer[i : i + 20] == "# END MIGRATION CODE"
        ):
            end = i
            result.append(answer[start:end])
            start = None

    return result


def CodeExtract(answer):
    try:
        code = CodeExtract1(answer)[0]
        _code = ast.parse(code)

    except:
        try:
            code = CodeExtract2(answer)[0].strip().strip("`").strip()
            _code = ast.parse(code)

        except:
            try:
                code = CodeExtract3(answer)[0].strip().strip("`").strip()
                _code = ast.parse(code)

            except:
                return None

    return code


if __name__ == "__main__":
    path = PIG_PATH / "baseline" / "pymigbench_baseline_all.xlsx"
    load_wb = load_workbook(path, data_only=True)

    for model in model_list:
        sheet = load_wb[model]

        for row in sheet.rows:
            answer = row[4].value

            if answer == "AskLLM Error" or answer == None:
                continue

            code = CodeExtract1(answer)[0]

            try:
                _code = ast.parse(code[0])

            except:
                try:
                    code = CodeExtract2(answer)[0].strip().strip("`").strip()
                    _code = ast.parse(code)

                except:
                    try:
                        code = CodeExtract3(answer)[0].strip().strip("`").strip()
                        _code = ast.parse(code)

                    except:
                        exceptions1 = ["118.json", "283.json", "1.json", "273.json"]
                        exceptions2 = []

                        if row[0].value in exceptions1 and model == "llama3.1-8b":
                            continue
                        if row[0].value in exceptions2 and model == "gemma2-9b":
                            continue

                        print(f"Error: {model} {row[0].value}")
                        print(code[0])
                        print()
                        break

        break
