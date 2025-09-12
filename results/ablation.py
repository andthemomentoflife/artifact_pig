from pathlib import Path
import json

MODELS = [
    "qwen", "gemma", "llama", "qwen3", "gemma3", "deepseek", "gptoss"
    ]
RQ_PATH = Path(__file__).parent.parent / Path("rq2")
RQ1_PATH = Path(__file__).parent 

def main():
    SLICING_LST = []
    API_LST = []
    MATCH_LST = []
    PIG_LST = []

    for model in MODELS:
        SLICING_PATH = RQ1_PATH / Path(model) / Path("LLM2.json")
        API_PATH = RQ_PATH / Path(model) / Path("default.json")
        MATCH_PATH = RQ_PATH / Path(model) / Path("nopost.json")
        PIG_PATH = RQ1_PATH / Path(model) / Path("LLM4.json")

        with open(SLICING_PATH, "r") as f:
            SLICING = json.load(f)
        with open(API_PATH, "r") as f:
            API = json.load(f)
        with open(MATCH_PATH, "r") as f:
            MATCH = json.load(f)
        with open(PIG_PATH, "r") as f:
            PIG = json.load(f)  

        slicing_yes = 0
        api_yes = 0
        match_yes = 0
        pig_yes = 0


        for file, vals in SLICING.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    slicing_yes += 1

        for file, vals in API.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    api_yes += 1

        for file, vals in MATCH.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    match_yes += 1

        for file, vals in PIG.items():
            for api, val in vals.items():
                if val["is_correct"] == "y":
                    pig_yes += 1


        print(f"Model: {model}")
        # Just check for instance counts
        print(f"Slicing: {slicing_yes}")
        print(f"API: {api_yes}")
        print(f"Matching: {match_yes}")
        print(f"Pig: {pig_yes}")

        SLICING_LST.append(slicing_yes)
        API_LST.append(api_yes)
        MATCH_LST.append(match_yes)
        PIG_LST.append(pig_yes)

    print("Summary:")
    print("Slicing:", SLICING_LST)
    print("API:", API_LST)
    print("Matching:", MATCH_LST)
    print("Pig:", PIG_LST)

slicing = [129, 159, 141, 189, 164, 161, 196]
api = [132, 165, 157, 198, 177, 172, 209]
matching = [142, 180, 169, 199, 200, 187, 227]
pig = [165, 198, 187, 213, 208, 212, 243]


AVERAGE_PERCENT1 = 0
AVERAGE_PERCENT2 = 0
AVERAGE_PERCENT3 = 0


for i in range(len(slicing)):
    
    print(f"Model: {MODELS[i]}")
    print(f"Slicing: {slicing[i]}")
    percent1 = (api[i] - slicing[i]) / slicing[i] * 100
    percent2 = (matching[i] - slicing[i]) / slicing[i] * 100
    percent3 = (pig[i] - slicing[i]) / slicing[i] * 100

    AVERAGE_PERCENT1 += percent1
    AVERAGE_PERCENT2 += percent2
    AVERAGE_PERCENT3 += percent3

    print(f"API: {api[i]} ({percent1:.2f}%)")
    print(f"Matching: {matching[i]} ({percent2:.2f}%)")
    print(f"Pig: {pig[i]} ({percent3:.2f}%)"    )

    print()

print(f"Average Improvement:")
print(f"API: {AVERAGE_PERCENT1 / len(slicing):.1f}%")
print(f"Matching: {AVERAGE_PERCENT2 / len(slicing):.1f}%")
print(f"Pig: {AVERAGE_PERCENT3 / len(slicing):.1f}%")

# main()