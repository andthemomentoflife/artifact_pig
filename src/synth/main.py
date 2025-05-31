import os, sys, ast
from os import path

sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
from synth import *

from files import (
    llama_fail_files,
    llama_success_files,
    deepseek_success_files,
    deepseek_fail_files,
    qwen_fail_files,
    qwen_success_files,
    gemma_fail_files,
    gemma_success_files,
)
from sketch import run

BENCHMARK_PATH = Path(__file__).parent.parent.parent / Path("benchmarks")
TOTAL_FILES = [file for file in os.listdir(BENCHMARK_PATH) if file.endswith(".json")]

TARGET_FILES = {
    "llama": (llama_success_files, llama_fail_files),
    "deepseek": (deepseek_success_files, deepseek_fail_files),
    "qwen": (qwen_success_files, qwen_fail_files),
    "gemma": (gemma_success_files, gemma_fail_files),
}

MODEL_NAMES = {
    "llama": "llama3.1-8b",
    "gemma": "gemma2-9b",
    "qwen": "qwen2-7b",
    "deepseek": "deepseek-r1-32b",
    "gemma3": "gemma3-27b",
    "qwen3": "qwen3-32b",
}

RESULT_PATH = PIG_PATH / "result"
TOTAL_FILES = [file for file in os.listdir(BENCHMARK_PATH) if file.endswith(".json")]
PASS_FILES = []


def result_write(answer: str, option, model_name, num):
    MODEL_RESULT_PATH = RESULT_PATH / model_name / option

    with open(MODEL_RESULT_PATH / f"{num}.py", "w") as f:
        print("writing", MODEL_RESULT_PATH / f"{num}.py")
        try:
            f.write(answer)
        except:
            f.write(ast.unparse(answer))


if __name__ == "__main__":
    option = "default"  # success or fail
    model = "gemma"
    model_name = MODEL_NAMES[model]
    target_files = list((TOTAL_FILES))

    # target_files = ["616.json"]

    target_files.sort(key=lambda x: int(x.split(".")[0]))
    b_varmap = False
    b_imports = False
    b_postprocess = False
    b_surround = False
    gumtree = False

    target_files.sort(key=lambda x: int(x.split(".")[0]))

    for answer, file_num in run(
        model_name,
        target_files,
        model,
        option,
        b_varmap=b_varmap,
        b_imports=b_imports,
        b_postprocess=b_postprocess,
        b_surround=b_surround,
        gumtree=gumtree,
        option = option
    ):
        result_write(
            answer,
            option,
            model,
            file_num,
        )
