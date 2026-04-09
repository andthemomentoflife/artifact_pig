# STATUS

## Badges applying for
- Available
- Functional
- Reusable

## Justification

### Available
The artifact is publicly accessible via GitHub and has been permanently archived on Zenodo with the following DOI:
https://10.5281/zenodo.19480524

The repository contains all necessary code, data, and documentation required to use the artifact.

### Functional
The artifact provides a complete and executable pipeline for reproducing the main results of the paper.

- A Docker environment is provided to ensure consistent execution.
- All required datasets and intermediate results are included in the repository.
- Pre-generated LLM outputs are provided to eliminate dependency on external APIs and to ensure deterministic execution.

By following the instructions in the README, reviewers can successfully run the scripts and reproduce the reported results.

### Reusable
The artifact is designed to support reuse and extension by other researchers.

- The codebase is modular and organized by functionality (e.g., synthesis, mapping, evaluation).
- New models, benchmarks, and configurations can be easily integrated.
- Detailed usage instructions and examples are provided in the README.

This enables researchers to build upon the artifact for further experimentation beyond the original paper.