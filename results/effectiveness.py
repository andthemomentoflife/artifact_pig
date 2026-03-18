from pathlib import Path
import json

MODELS = ["qwen", "gemma", "llama", "qwen3", "gemma3", "deepseek", "gptoss"]
RQ1_PATH = Path(__file__).parent / Path("rq1")
THRESHOLDS = [1.0, 0.75, 0.50, 0.25]


def compute_stats(data: dict):
    correct_apis = 0
    file_counts = [0] * len(THRESHOLDS)

    for file, vals in data.items():
        total = len(vals)
        correct = sum(1 for v in vals.values() if v["is_correct"] == "y")
        correct_apis += correct

        if total > 0:
            ratio = correct / total
            for i, t in enumerate(THRESHOLDS):
                if ratio >= t:
                    file_counts[i] += 1

    return correct_apis, file_counts


def pct_increase(base, new):
    if base == 0:
        return 0.0
    return (new - base) / base * 100


def fmt_pig(base_val, pig_val, float_mode=False):
    pct = pct_increase(base_val, pig_val)
    if float_mode:
        return f"(\u25b2{pct:.1f}%) {pig_val:.1f}"
    return f"(\u25b2{pct:.1f}%) {pig_val}"


def print_table(rows, averages, totals):
    total_apis, total_files = totals

    # Column widths
    cw_model = 16
    cw_type = 10
    cw_correct = 20
    cw_file = 18

    th_labels = ["100%", "≥75%", "≥50%", "≥25%"]

    sep = "=" * (cw_model + cw_type + cw_correct + cw_file * 4 + 10)
    thin = "-" * len(sep)

    # Header
    print(sep)
    header1 = (
        f"{'Settings':<{cw_model + cw_type + 2}}"
        f"{'# Correct APIs':^{cw_correct}}"
        f"{'# Files (Total: ' + str(total_files) + ')':^{cw_file * 4}}"
    )
    print(header1)

    header2 = (
        f"{'Model':<{cw_model}} {'Type':<{cw_type}}"
        f"{'(Total: ' + str(total_apis) + ')':^{cw_correct}}"
        f"{'Percentage of correct APIs':^{cw_file * 4}}"
    )
    print(header2)

    header3 = f"{'':<{cw_model}} {'':<{cw_type}}" f"{'':<{cw_correct}}" + "".join(
        f"{t:^{cw_file}}" for t in th_labels
    )
    print(header3)
    print(sep)

    for i, (model, b_correct, b_files, p_correct, p_files) in enumerate(rows):
        if i > 0:
            print(thin)

        # Baseline row
        b_files_str = "".join(f"{v:^{cw_file}}" for v in b_files)
        print(
            f"{model:<{cw_model}} {'BASELINE':<{cw_type}}"
            f"{b_correct:^{cw_correct}}"
            f"{b_files_str}"
        )

        # PIG row with increase indicators
        p_correct_str = fmt_pig(b_correct, p_correct)
        p_files_str = "".join(
            f"{fmt_pig(b_files[j], p_files[j]):^{cw_file}}"
            for j in range(len(THRESHOLDS))
        )
        print(
            f"{'':<{cw_model}} {'PIG':<{cw_type}}"
            f"{p_correct_str:^{cw_correct}}"
            f"{p_files_str}"
        )

    print(sep)

    # Average rows
    avg_b_correct, avg_b_files, avg_p_correct, avg_p_files = averages

    b_avg_files_str = "".join(f"{v:^{cw_file}.1f}" for v in avg_b_files)
    print(
        f"{'Average':<{cw_model}} {'BASELINE':<{cw_type}}"
        f"{avg_b_correct:^{cw_correct}.1f}"
        f"{b_avg_files_str}"
    )

    p_correct_str = fmt_pig(avg_b_correct, avg_p_correct, float_mode=True)
    p_avg_files_str = "".join(
        f"{fmt_pig(avg_b_files[j], avg_p_files[j], float_mode=True):^{cw_file}}"
        for j in range(len(THRESHOLDS))
    )
    print(
        f"{'':<{cw_model}} {'PIG':<{cw_type}}"
        f"{p_correct_str:^{cw_correct}}"
        f"{p_avg_files_str}"
    )
    print(sep)


def main():
    rows = []

    sum_b_correct = sum_p_correct = 0
    sum_b_files = [0] * len(THRESHOLDS)
    sum_p_files = [0] * len(THRESHOLDS)

    # For totals row header
    total_apis = 0
    all_files = set()

    for model in MODELS:
        baseline_path = RQ1_PATH / model / "baseline.json"
        pig_path = RQ1_PATH / model / "pig.json"

        with open(baseline_path) as f:
            baseline = json.load(f)
        with open(pig_path) as f:
            pig = json.load(f)

        # Count total APIs and files from baseline (ground truth)
        for file, vals in baseline.items():
            all_files.add(file)
            total_apis += len(vals)

        b_correct, b_files = compute_stats(baseline)
        p_correct, p_files = compute_stats(pig)

        rows.append((model, b_correct, b_files, p_correct, p_files))

        sum_b_correct += b_correct
        sum_p_correct += p_correct
        for i in range(len(THRESHOLDS)):
            sum_b_files[i] += b_files[i]
            sum_p_files[i] += p_files[i]

    n = len(MODELS)
    averages = (
        sum_b_correct / n,
        [x / n for x in sum_b_files],
        sum_p_correct / n,
        [x / n for x in sum_p_files],
    )

    # total_apis and total_files are per-model (not summed), use first model as reference
    with open(RQ1_PATH / MODELS[0] / "baseline.json") as f:
        ref = json.load(f)
    ref_total_apis = sum(len(v) for v in ref.values())
    ref_total_files = len(ref)

    print_table(rows, averages, totals=(ref_total_apis, ref_total_files))


main()
