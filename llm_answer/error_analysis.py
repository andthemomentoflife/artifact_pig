from pathlib import Path
import json
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
import numpy as np

ERROR_JSON = Path(__file__).parent / "error.json"

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

LABELS = ["API", "SEM", "MIG", "ETC"]
DISPLAY = ["INC", "SEM", "MIG", "MIN"]
COLORS = ["#E07070", "#89C4E1", "#F0E080", "#90C978"]
HATCHES = ["////", "////", "||||", "oooo"]


def count_errors(data: dict) -> dict:
    """Count non-nocode error labels for a single model."""
    counts = {k: 0 for k in LABELS}
    for file, apis in data.items():
        for api, vals in apis.items():
            if vals.get("ETC", "") == "nocode":
                continue
            for k in LABELS:
                if vals.get(k, "") != "":
                    counts[k] += 1
    return counts


def to_proportions(counts: dict) -> dict:
    total = sum(counts.values())
    if total == 0:
        return {k: 0.0 for k in counts}
    return {k: v / total for k, v in counts.items()}


def main():
    with open(ERROR_JSON) as f:
        error_data: dict = json.load(f)

    all_counts = {}
    for model in MODELS:
        all_counts[model] = count_errors(error_data.get(model, {}))

    # Print per-model counts
    cw = 10
    sep = "-" * (12 + cw * 4)
    print(sep)
    print(f"{'Model':<12}" + "".join(f"{d:^{cw}}" for d in DISPLAY))
    print(sep)
    for model, label in zip(MODELS, MODEL_LABELS):
        c = all_counts[model]
        print(f"{label:<12}" + "".join(f"{c[k]:^{cw}}" for k in LABELS))

    # Total row
    totals = {k: sum(all_counts[m][k] for m in MODELS) for k in LABELS}
    print(sep)
    print(f"{'Total':<12}" + "".join(f"{totals[k]:^{cw}}" for k in LABELS))
    print(sep)

    # ── Bar chart ──────────────────────────────────────────────────────────
    props = {model: to_proportions(all_counts[model]) for model in MODELS}

    x = np.arange(len(MODELS))
    fig, ax = plt.subplots(figsize=(11, 5))

    bottoms = np.zeros(len(MODELS))
    for key, disp, color, hatch in zip(LABELS, DISPLAY, COLORS, HATCHES):
        vals = np.array([props[m][key] for m in MODELS])
        ax.bar(
            x,
            vals,
            bottom=bottoms,
            width=0.5,
            color=color,
            hatch=hatch,
            edgecolor="black",
            linewidth=0.6,
            label=disp,
        )
        bottoms += vals

    ax.set_ylabel("Proportion", fontsize=11)
    ax.set_ylim(0, 1.0)
    ax.set_xticks(x)
    ax.set_xticklabels(MODEL_LABELS, fontsize=10)
    ax.yaxis.grid(True, linestyle="--", alpha=0.4)
    ax.set_axisbelow(True)
    ax.spines[["top", "right"]].set_visible(False)

    legend_patches = [
        mpatches.Patch(
            facecolor=COLORS[i], hatch=HATCHES[i], edgecolor="black", label=DISPLAY[i]
        )
        for i in range(len(LABELS))
    ]
    ax.legend(
        handles=legend_patches,
        title="Label",
        fontsize=9,
        loc="upper right",
        frameon=True,
    )

    out_path = Path(__file__).parent / "error_proportions.png"
    plt.tight_layout()
    plt.savefig(out_path, dpi=150, bbox_inches="tight")
    print(f"\nSaved: {out_path}")
    plt.show()


main()
