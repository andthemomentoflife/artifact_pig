import sys, ast, argparse
from os import path

sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
from synth import *

from sketch import run

BENCHMARK_PATH = Path(__file__).parent.parent.parent / Path("benchmarks")
MODEL_NAMES = {
    "llama": "llama3.1-8b",
    "gemma": "gemma2-9b",
    "qwen": "qwen2-7b",
    "deepseek": "deepseek-r1-32b",
    "gemma3": "gemma3-27b",
    "qwen3": "qwen3-32b",
    "gptoss": "gpt-oss-20b",
}

RESULT_PATH = PIG_PATH / "src" / "result"
PASS_FILES = []


def result_write(answer: str, option, model_name, num):
    with open(RESULT_PATH / f"{num}.py", "w") as f:
        print("writing", RESULT_PATH / f"{num}.py")
        try:
            f.write(answer)
        except:
            f.write(ast.unparse(answer))


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="artifact_pig synthesis runner")

    parser.add_argument(
        "--model",
        type=str,
        choices=list(MODEL_NAMES.keys()),
        default="gemma",
        help="Model to use (llama, gemma, qwen, deepseek, gemma3, qwen3, gptoss)",
    )
    parser.add_argument(
        "--option",
        type=str,
        choices=["default", "+slicing"],
        default="default",
        help="Execution option (default, +slicing)",
    )
    parser.add_argument(
        "--postprocess",
        type=lambda x: x.lower() != "false",
        default=True,
        help="Enable post-processing (True/False)",
    )
    parser.add_argument(
        "--gumtree",
        type=lambda x: x.lower() != "false",
        default=True,
        help="Enable GumTree matching (True/False)",
    )
    parser.add_argument(
        "--file",
        type=str,
        nargs="+",
        default=["1.json"],
        help="Target file to process (e.g. 1.json)",
    )

    args = parser.parse_args()
    option = args.option

    if args.postprocess:
        b_varmap = True
        b_imports = True
        b_postprocess = True
        b_surround = True
    else:
        b_varmap = False
        b_imports = False
        b_postprocess = False
        b_surround = False

    gumtree = args.gumtree
    target_files = args.file

    model = args.model
    model_name = MODEL_NAMES[model]
    target_files.sort(key=lambda x: int(x.split(".")[0]))

    for answer, file_num in run(
        model_name,
        target_files,
        b_varmap=b_varmap,
        b_imports=b_imports,
        b_postprocess=b_postprocess,
        b_surround=b_surround,
        gumtree=gumtree,
        option=option,
    ):
        result_write(
            answer,
            option,
            model,
            file_num,
        )
