# LLM Query and Code Slicing

This directory contains the phase of the PIG model responsible for querying the LLM and slicing the code, as described in step 1 and 2 (Decomposing Migration Tasks with Slicing and Querying LLM with plausible API Candidates) of the Overview.

# Directory Structure
### Slicing: `context_remover_refactor.py`
This file contains the code slicing logic, which is responsible for extracting relevant code snippets based on the API candidates provided by the LLM. The main function in this file is `remove_context()`.

When executing the file `context_remover_refactor.py`, it will read the JSON files in the `benchmarks` directory, which contain the API candidates and their corresponding code snippets. The function `remove_context()` will then process these files, extracting the relevant code snippets based on the API candidates. The results will be printed to the console.

### Prompts: `prompts.py`
This file contains the prompts used for PIG's LLM queries, including the prompt and the migration query prompts. `init_prompt` and `second_query` returns the prompt and query for the LLM, respectively.

### LLM Query: `mapping_gpt.py` and `mapping_llama.py`
Both files contain the code to query the LLM and slice the code. The `mapping_gpt.py` file uses the OpenAI API (**To be supported if needed**), while the `mapping_llama.py` file uses the Ollama API. The main function in both files is `query_llm`, which takes the host, model, and other parameters as input and returns the response from the LLM. 

The function `run()` will make an excel file with the results of the LLM queries, with first column as the filename, second column as the old API name, third column as the migrated code. For every API, migrated code will be located in same pattern for the following columns.

The settings for the LLM queries is initialized with all features of PIG, including the provision of API mapping results. If you want to use the LLM queries without the API mapping results, you can set `b_api=False` in the `AskLLM()` function.

#### `mapping_llama.py`
- `name_and_signs()`: This function takes a list of candidates and returns a string containing the names and signatures of the candidates.
- `AskLLM()`: This function queries the LLM with the provided parameters and returns the answer from the LLM. It uses the `Client` class from the `ollama` library to interact with the Ollama API.
- `run()`: This function iterates through the list of models, queries the LLM for each model, and saves the results in an Excel file.

#### `mapping_gpt.py`
- `ExtractLLM()`: This function returns only code snippets from the LLM response, using `CodeExtract()`.
- `CodeExtract()`: This function extracts code snippets from the LLM response and returns them as a list.
- `prepare()`: This function prepares the data for the LLM query by loading the Excel file containing the code snippets and API candidates. The function is used for the transplanting process.

# How to Use
1. Specify the host of the ollama server in `mapping_llama.py` file.
2. Add the models you want to use in the `model_list` variable in `mapping_llama.py`.
3. In `mapping_llama.py`, set the path to save the migrated code in the last line of the file with extension `.xlsx`.
4. Run the `mapping_llama.py` file. (It will automatically execute the `run` function.)