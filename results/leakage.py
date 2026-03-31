from pathlib import Path
import json

MODELS = ["qwen", "gemma", "llama", "qwen3", "gemma3", "deepseek", "gptoss"]
MODEL_LABELS = [
    "qwen2",
    "gemma2",
    "llama3.1",
    "qwen3",
    "gemma3",
    "deepseek-r1",
    "gpt-oss",
]
RQ1_PATH = Path(__file__).parent / Path("rq1")


def compute_correct(data: dict) -> int:
    return sum(
        1 for vals in data.values() for v in vals.values() if v["is_correct"] == "y"
    )


def pct_increase(base, new):
    if base == 0:
        return 0.0
    return (new - base) / base * 100


def main():
    baseline_counts = []
    pig_counts = []

    for model in MODELS:
        with open(RQ1_PATH / model / "baseline_leakage.json") as f:
            baseline = json.load(f)
        with open(RQ1_PATH / model / "pig_leakage.json") as f:
            pig = json.load(f)

        baseline_counts.append(compute_correct(baseline))
        pig_counts.append(compute_correct(pig))

    avg_baseline = sum(baseline_counts) / len(MODELS)
    avg_pig = sum(pig_counts) / len(MODELS)
    avg_increase = pct_increase(avg_baseline, avg_pig)

    # Column widths
    cw_type = 12
    cw_model = 11
    cw_avg = 9

    all_labels = MODEL_LABELS + ["Average"]
    all_baseline = baseline_counts + [avg_baseline]
    all_pig = pig_counts + [avg_pig]

    sep = "-" * (cw_type + cw_model * len(MODELS) + cw_avg + len(MODELS))

    # Header
    header = f"{'Model':<{cw_type}}" + "".join(f"{l:^{cw_model}}" for l in all_labels)
    print(sep)
    print(header)
    print(sep)

    # Baseline row
    row_b = f"{'BASELINE':<{cw_type}}"
    for i, v in enumerate(all_baseline):
        if i < len(MODELS):
            row_b += f"{v:^{cw_model}}"
        else:
            row_b += f"{v:^{cw_model}.1f}"
    print(row_b)

    # PIG row
    row_p = f"{'PIG':<{cw_type}}"
    for i, v in enumerate(all_pig):
        if i < len(MODELS):
            row_p += f"{v:^{cw_model}}"
        else:
            row_p += f"{v:^{cw_model}.1f}"
    print(row_p)

    # % Increase row
    row_i = f"{'% Increase':<{cw_type}}"
    for b, p in zip(baseline_counts, pig_counts):
        pct = pct_increase(b, p)
        val = f"\u25b2{pct:.1f}%"
        row_i += f"{val:^{cw_model}}"

    arrow = "\u25b2"  # Upward arrow
    row_i += f"{arrow + f'{avg_increase:.1f}%':^{cw_avg}}"
    print(row_i)

    print(sep)


main()
