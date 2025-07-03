# Implementation of PIG
This directory contains the source code of the work. Detailed information about the source code can be found in the `README.md` file in each directory.

# Directory Structure
### LLM directory: `llm`
This directory contains the source code for querying the LLMs, including the code slicing.

### Mapping directory: `mapping`
This directory contains the source code for the mapping process, which is used to map the APIs in the source library to the APIs in the target library.

### Synth directory: `synth`
This directory contains the source code for the transplanting process.

### `default.jar` file
This file is the package file of `GumTree`, which is used for the code matching process. It is used in the `synth` directory. Different to `ours.jar`, this file is the default setting of `GumTree`, which is used in the experiment for settings in RQ2: `SLICING` and `API`.

### `ours.jar` file
This file is the package file of `GumTree`, which is used for the code matching process. It is used in the `synth` directory. This file is the modified version of `GumTree`.