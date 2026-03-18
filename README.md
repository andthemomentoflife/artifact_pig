# PIG: Leveraging Large Language Models for Python Library Migrations

This repository contains the data and results for the paper **"PIG: Leveraging Large Language Models for Python Library Migrations"**.

## 📄 Paper

[PIG: Leveraging Large Language Models for Python Library Migrations](paper/fse2026-pig.pdf)  

---

## 📊 Reproducing Tables

The following scripts reproduce the main tables reported in the paper.
Each script computes the results from manually reviewed data recorded per model,
stored in `results/rq1/`, `results/rq2/`, and `results/rq3/` respectively.

| Script | Data | Table |
|--------|------|-------|
| `results/effectiveness.py` | `results/rq1/` | End-to-end effectiveness |
| `results/ablation.py` | `results/rq2/` | Ablation Study |
| `results/leakage.py` | `results/rq1/` and `results/rq2/` | Data Leakage |

To reproduce each table, run:

```bash
# Table1: Effectiveness
python results/effectiveness.py

# Figure 6: Ablation Study
python results/ablation.py

# Talbe 2: Data Leakage
python results/leakage.py
```

> **Note:** `results/ablation.py` generates a bar chart (`ablation_result.png`) in addition to printing the table. Running this script will open a matplotlib window.

---
 
## 📉 Error Analysis (Fig. 2)
 
`llm_answer/error_analysis.py` reproduces the error type proportion chart (Fig. 2) using the manually labeled error data in `llm_answer/error.json`.
 
```bash
python results/error_analysis.py
```
 
Entries where `ETC` is `"nocode"` are excluded from all counts, as mentioned in paper.

> **Note:** Running this script will open a matplotlib window.

---

## 🔍 Limitations and Future Work (Section 4.3)
 
`results/discussion.py` analyzes the failure cases discussed in Section 4.3, using the manually labeled data in `results/rq3/discussion.json`.
 
```bash
python results/leakage_discussion.py
```
 
This script prints a breakdown of failure types and their proportions to the terminal.

---

## 📁 Directory Structure

### `benchmarks/`

Contains the benchmark data used in the paper.

- `<file_num>.json`: Basic information about each benchmark (source/target libraries, client repository, commit hash, target APIs, etc.)
- `<file_num>b.py`: Original code before migration.
- `<file_num>a.py`: Migrated code after migration.

> **Note:** Benchmarks numbered above 1000 are free from data leakage.

---

### `llm_answer/`

Contains LLM-generated code for each experiment run.

| File | Description |
|------|-------------|
| `answer_baseline.xlsx` | Outputs from the naive baseline. |
| `answer_slicing.xlsx` | Outputs using the slicing technique only. |
| `answer_pig.xlsx` | Outputs using both slicing and API candidate guidance (PIG). |
| `error.json` | Error information from `answer_baseline.xlsx`, used to generate prompts for subsequent runs. |

---

### `prompt/`

Contains prompt templates used in the experiments.

| File | Description |
|------|-------------|
| `baseline.txt` | Prompt for the baseline (based on prior work's prompt). |
| `slicing.txt` | Prompt using slicing only (API candidate guidance omitted from `pig.txt`). |
| `pig.txt` | Prompt using both slicing and API candidate guidance. |

---

### `results/`

Contains manually reviewed results for each research question, organized by subdirectory.

#### `rq1/` — Effectiveness

Results on the correctness of the baseline, slicing, and PIG models. Each model has a subdirectory `<model>/` containing:

| File | Description |
|------|-------------|
| `baseline.json` | Baseline migration results per API. |
| `slicing.json` | Slicing model migration results per API. |
| `pig.json` | PIG model migration results per API. |
| `baseline_leakage.json` | Baseline results on data-leakage-free benchmarks. |
| `pig_leakage.json` | PIG results on data-leakage-free benchmarks. |

Each top-level key is a filename (e.g., `528.json`), mapping to per-API evaluation results:

```json
{
  "FILENAME.json": {
    "ObjectOrFunctionName": {
      "is_correct": "y" | "n",
      "reason": "short reason string"
    }
  }
}
```

#### `rq2/` — Ablation Study

Results on the ablation study of PIG. Each model has a subdirectory `<model>/` containing:

| File | Description |
|------|-------------|
| `default.json` | Default GumTree settings only. (Setting *API* in paper) |
| `nopost.json` | Without post-processing. (Setting *MATCH* in paper) |
| `post.json` | With post-processing. (Setting *PIG* in paper) |

#### `rq3/` — Discussion

Contains `discussion.json`, which discusses the limitations of PIG based on experimental results.

Each top-level key is a filename, mapping to per-API candidate ranking results:

```json
{
  "FILENAME.json": {
    "ObjectOrFunctionName": [
      "O" | "X",
      "ranking of the API candidates"
    ]
  }
}
```

---

### `src/`

Contains the source code of PIG.

To run the transplanting process, execute `src/synth/main.py` from the root directory (`artifact_pig`).

**Dependencies:**
- Python dependencies: see `src/requirements.txt`
- Java: requires OpenJDK 17 or later (for GumTree; class file version 61.0)
- Additional details: see `src/README.md`

| Subdirectory | Description |
|--------------|-------------|
| `llm/` | LLM querying and code slicing. |
| `mapping/` | API mapping from source to target library. |
| `synth/` | Transplanting (code migration) process. |
