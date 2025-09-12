from pathlib import Path
import json

MODELS = [
    "qwen", "gemma", "llama", "qwen3", "gemma3", "deepseek", "gptoss"
    ]
RQ1_PATH = Path(__file__).parent / Path("rq1")

def main():
    total_yes_baseline = 0
    total_yes_pig = 0

    for model in MODELS:
        BASELINE_PATH = RQ1_PATH / Path(model) / Path("baseline.json")
        PIG_PATH = RQ1_PATH / Path(model) / Path("pig.json")

        with open(BASELINE_PATH, "r") as f:
            BASELINE = json.load(f)
        with open(PIG_PATH, "r") as f:
            PIG = json.load(f)  

        baseline_yes = 0
        pig_yes = 0


        for file, vals in BASELINE.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    baseline_yes += 1

        for file, vals in PIG.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    pig_yes += 1


        print(f"Model: {model}")
        # Just check for instance counts
        print(f"Slicing: {baseline_yes}")
        print(f"Pig: {pig_yes}")
        percentage_increase = ((pig_yes - baseline_yes) / baseline_yes) * 100 if baseline_yes != 0 else 0
        print(f"Percentage Increase: {percentage_increase:.1f}%")

        total_yes_baseline += baseline_yes
        total_yes_pig += pig_yes

    total_yes_baseline = total_yes_baseline / len(MODELS)
    total_yes_pig = total_yes_pig / len(MODELS)
    percentage_increase = ((total_yes_pig - total_yes_baseline) / total_yes_baseline) * 100

    print("Summary:")
    print(f"Total Baseline: {total_yes_baseline:.1f}")
    print(f"Total Pig: {total_yes_pig:.1f}")
    print(f"Percentage Increase: {percentage_increase:.1f}%")

main()