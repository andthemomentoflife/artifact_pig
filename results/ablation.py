from pathlib import Path
import json
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
import numpy as np

MODELS = ["qwen", "gemma", "llama", "qwen3", "gemma3", "deepseek", "gptoss"]
MODEL_LABELS = [
    "qwen2:7b",
    "gemma2:9b",
    "llama3.1:8b",
    "qwen3:32b",
    "gemma3:27b",
    "deepseek-r1:32b",
    "gpt-oss:20b",
]
RQ2_PATH = Path(__file__).parent / Path("rq2")
RQ1_PATH = Path(__file__).parent / Path("rq1")

SETTINGS = ["SLICING", "API", "MATCH", "PIG"]
COLORS = ["white", "white", "white", "lightgray"]
HATCHES = ["", "xx", "..", ""]
EDGECOLORS = ["black", "black", "black", "black"]


def compute_correct(data: dict) -> int:
    return sum(
        1 for vals in data.values() for v in vals.values() if v["is_correct"] == "y"
    )


def pct(base, new):
    if base == 0:
        return 0.0
    return (new - base) / base * 100


def main():
    slicing_lst, api_lst, match_lst, pig_lst = [], [], [], []

    for model in MODELS:
        with open(RQ1_PATH / model / "slicing.json") as f:
            slicing_lst.append(compute_correct(json.load(f)))
        with open(RQ2_PATH / model / "default.json") as f:
            api_lst.append(compute_correct(json.load(f)))
        with open(RQ2_PATH / model / "nopost.json") as f:
            match_lst.append(compute_correct(json.load(f)))
        with open(RQ1_PATH / model / "pig.json") as f:
            pig_lst.append(compute_correct(json.load(f)))

    all_data = [slicing_lst, api_lst, match_lst, pig_lst]

    # ── Bar chart ──────────────────────────────────────────────────────────
    x = np.arange(len(MODELS))
    n_bars = len(SETTINGS)
    bar_width = 0.18
    offsets = np.linspace(-(n_bars - 1) / 2, (n_bars - 1) / 2, n_bars) * bar_width

    fig, ax = plt.subplots(figsize=(12, 5))

    for i, (setting, vals, color, hatch, ec) in enumerate(
        zip(SETTINGS, all_data, COLORS, HATCHES, EDGECOLORS)
    ):
        bars = ax.bar(
            x + offsets[i],
            vals,
            width=bar_width,
            label=setting,
            color=color,
            hatch=hatch,
            edgecolor=ec,
            linewidth=0.8,
        )

    ax.set_ylabel("Number of Correct APIs", fontsize=11)
    ax.set_xticks(x)
    ax.set_xticklabels(MODEL_LABELS, fontsize=9)
    ax.set_ylim(bottom=min(min(d) for d in all_data) * 0.9)
    ax.yaxis.grid(True, linestyle="--", alpha=0.6)
    ax.set_axisbelow(True)
    ax.spines[["top", "right"]].set_visible(False)

    legend_patches = [
        mpatches.Patch(
            facecolor=COLORS[i], hatch=HATCHES[i], edgecolor="black", label=SETTINGS[i]
        )
        for i in range(n_bars)
    ]
    ax.legend(handles=legend_patches, fontsize=9, loc="upper left", frameon=True)

    # ── Summary table below chart ──────────────────────────────────────────
    avgs = [sum(d) / len(MODELS) for d in all_data]

    col_labels = MODEL_LABELS + ["Avg"]
    row_labels = SETTINGS + ["▲API", "▲MATCH", "▲PIG"]

    table_data = []
    for d in all_data:
        table_data.append(
            [str(v) for v in d]
            + [f"{avgs[SETTINGS.index(SETTINGS[all_data.index(d)])]:,.1f}"]
        )

    # % increase rows vs SLICING
    for idx, label in enumerate(["▲API", "▲MATCH", "▲PIG"], start=1):
        row = []
        for j in range(len(MODELS)):
            p = pct(slicing_lst[j], all_data[idx][j])
            row.append(f"▲{p:.1f}%")
        avg_p = pct(avgs[0], avgs[idx])
        row.append(f"▲{avg_p:.1f}%")
        table_data.append(row)

    tbl = ax.table(
        cellText=table_data,
        rowLabels=row_labels,
        colLabels=col_labels,
        cellLoc="center",
        loc="bottom",
        bbox=[0, -0.55, 1, 0.45],
    )
    tbl.auto_set_font_size(False)
    tbl.set_fontsize(8)

    # Style header row
    for j in range(len(col_labels)):
        tbl[(0, j)].set_facecolor("#ddeeff")
    for i in range(len(row_labels)):
        tbl[(i + 1, -1)].set_facecolor("#f0f0f0")

    plt.tight_layout()
    plt.subplots_adjust(bottom=0.42)

    out_path = Path(__file__).parent / "ablation_result.png"
    plt.savefig(out_path, dpi=150, bbox_inches="tight")
    print(f"Saved: {out_path}")

    # ── Plain text table ───────────────────────────────────────────────────
    cw = 14
    sep = "-" * (12 + cw * (len(MODELS) + 1))
    print(sep)
    print(f"{'Setting':<12}" + "".join(f"{l:^{cw}}" for l in col_labels))
    print(sep)
    for i, setting in enumerate(SETTINGS):
        row_str = f"{setting:<12}" + "".join(f"{v:^{cw}}" for v in all_data[i])
        row_str += f"{avgs[i]:^{cw}.1f}"
        print(row_str)
    print(sep)
    for idx, label in enumerate(["▲API", "▲MATCH", "▲PIG"], start=1):
        row_str = f"{label:<12}"
        for j in range(len(MODELS)):
            p = pct(slicing_lst[j], all_data[idx][j])
            row_str += f"{'▲'+f'{p:.1f}%':^{cw}}"
        avg_p = pct(avgs[0], avgs[idx])
        row_str += f"{'▲'+f'{avg_p:.1f}%':^{cw}}"
        print(row_str)
    print(sep)

    plt.show()


main()
