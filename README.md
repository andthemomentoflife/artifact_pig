# PIG: Leveraging Large Language Models for Python Library Migrations

This repository contains the data and results for the paper **"PIG: Leveraging Large Language Models for Python Library Migrations"**.

## 📄 Paper

[PIG: Leveraging Large Language Models for Python Library Migrations](paper/fse2026-pig.pdf)  

## Running Via Docker (Recommended)
To run the code using Docker, follow these steps:
1. **Build the Docker Image**: Run the following command in the terminal from the root directory of the repository:

```bash
docker build -t pig dockerfile/.
```

2. **Run the Docker Container**: After building the image, run the container with:

```bash
docker run -it pig
```

This command will start the Docker container and open an interactive terminal session.

---

## 📊 Reproducing Tables

The following scripts reproduce the main tables reported in the paper.
Each script computes the results from manually reviewed data recorded per model,
stored in `results/rq1/`, `results/rq2/`, and `results/rq3/` respectively.

To reproduce each table, run:

```bash
# Table1: Effectiveness
python results/effectiveness.py

# Figure 6: Ablation Study
python results/ablation.py

# Talbe 2: Data Leakage
python results/leakage.py
```

> **Note:** `results/ablation.py` generates a bar chart and saves it as `results/ablation_result.png`. To view the image, copy it out of the container using `docker cp`.
> ```bash
> docker cp <container_id>:/artifact_pig/results/ablation_result.png ./ablation_result.png
>```
---
 
## 📉 Error Analysis (Fig. 2)
 
`llm_answer/error_analysis.py` reproduces the error type proportion chart (Fig. 2) using the manually labeled error data in `llm_answer/error.json`.
 
```bash
python llm_answer/error_analysis.py
```

> **Note:** `llm_answer/error_analysis.py` generates a bar chart and saves it as `llm_answer/error_proportions.png`. To view the image, copy it out of the container using `docker cp`.
> ```bash
> docker cp <container_id>:/artifact_pig/llm_answer/error_proportions.png ./error_proportions.png
>```

---

## 🔍 Limitations and Future Work (Section 4.3)
 
`results/discussion.py` analyzes the failure cases discussed in Section 4.3, using the manually labeled data in `results/rq3/discussion.json`.
 
```bash
python results/discussion.py
```
 
This script prints a breakdown of failure types and their proportions to the terminal.

---
# How to execute the transplanting process
As described in the paper, Pig includes a LLM-based approach. As LLM outputs can vary across runs, we provide the LLM-generated code for each experiment run in `llm_answer/` for reference. Based on the LLM-generated code, you can reproduce the transplanting process and results by running the code in `src/synth/`. Specifically,

```bash
python src/synth/main.py
```