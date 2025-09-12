# Implementation of PIG
This directory contains the source code of the work. Detailed information about the source code can be found in the `README.md` file in each directory.

# Directory Structure
### LLM directory: `llm`
This directory contains the source code for querying the LLMs, including the code slicing.

### Mapping directory: `mapping`
This directory contains the source code for the mapping process, which is used to map the APIs in the source library to the APIs in the target library.

### Synth directory: `synth`
This directory contains the source code for the transplanting process.

### `gumtree` directory, `default.jar` and `ours.jar` files
These files are the package files of `GumTree`, which is used for the code matching.
PIG uses `jar` files for the code matching process. As the class file uses pythonparse, you need to install the `pythonparser` package from the following [repository](https://github.com/GumTreeDiff/pythonparser). Please refer to the installation guide in the [repository](https://github.com/GumTreeDiff/gumtree/wiki/Getting-Started) for more details. 
After all dependency downloaded, go to `artifact_pig/src/gumtree/client/src/main/java/com/github/gumtreediff/client/PMatcher.java` and compile the `PMatcher.java` file to generate the `default.jar` and `ours.jar` files. Each `jar` file has different settings for the code matching process. 

```java 
GumtreeProperties Properties = new GumtreeProperties();
Properties.put(ConfigurationOptions.st_minprio, 1);
// value:1 => default.jar , value:0 => ours.jar
```

After compiling the `default.jar` and `ours.jar` files, locate them in the `artifact_pig/src/default.jar` and `artifact_pig/src/ours.jar`, respectively.

### `ours.jar` file
This file is the package file of `GumTree`, which is used for the code matching process. It is used in the `synth` directory. This file is the modified version of `GumTree`.

### `requirements.txt`
In order to execute the code, you need to install the dependencies listed in this file. You can install them using the following command:

```bash
pip install -r requirements.txt
```

If there exists a problem with the `jpype` package, you can install `jpype1` instead of `jpype`.