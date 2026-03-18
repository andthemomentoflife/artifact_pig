from pathlib import Path
import json

DISCUSSION_JSON = Path(__file__).parent / "rq3" / "discussion.json"

LABELS = ["API_MAPPING", "GUMTREE", "LLM_API", "LLM_PARSE"]
DISPLAY = {
    "API_MAPPING": "API Mapping",
    "GUMTREE": "GumTree",
    "LLM_API": "LLM API",
    "LLM_PARSE": "LLM Parse",
}


def main():
    with open(DISCUSSION_JSON) as f:
        discussion_data: dict = json.load(f)

    counts = {k: 0 for k in LABELS}

    for file, apis in discussion_data.items():
        for api, models in apis.items():
            for model, vals in models.items():
                for k in LABELS:
                    if vals.get(k, "") != "":
                        counts[k] += 1

    total = sum(counts.values())

    # Print table
    col_label = 16
    col_count = 10
    col_pct = 10
    sep = "-" * (col_label + col_count + col_pct)

    print(sep)
    print(
        f"{'Error Type':<{col_label}} {'Count':>{col_count}} {'Proportion':>{col_pct}}"
    )
    print(sep)
    for k in LABELS:
        pct = counts[k] / total * 100 if total else 0
        print(
            f"{DISPLAY[k]:<{col_label}} {counts[k]:>{col_count}} {pct:>{col_pct}.1f}%"
        )
    print(sep)
    print(f"{'Total':<{col_label}} {total:>{col_count}}")
    print(sep)


main()
