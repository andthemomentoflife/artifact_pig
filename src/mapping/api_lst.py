# input: lib name, lib path
# output: list of apis in the lib | except

import os, ast, sys
from pathlib import Path
from typing import Union
from os import path

sys.path.append((path.dirname(path.abspath(__file__))))
import gits

sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))

try:
    from ..synth import llm_pre
except:
    from synth import llm_pre


from Cython.Compiler import Nodes, TreeFragment
from Cython.Compiler.Visitor import CythonTransform

STD_LIB_PATH = gits.HOME_PATH / "typeshed-main/stdlib"
std_libs = [
    file.split(".")[0] for file in os.listdir(STD_LIB_PATH) if not file.startswith("_")
]

# Visiting an AST, and collecting all the api names and signature for Cython files
class GetAllApisCython(CythonTransform):
    def __init__(self, libo, target_api=None):
        self.classes = list()
        self.properties = list()
        self.functions = list()  # True If the new module uses libo, too
        self.methods = list()
        self.etcs = list()
        self.target_api = target_api

        self.libo = libo
        self.name = None
        self.signs = dict()

        super().__init__("")

    def get_signs(self, node, name=None):
        values = []

        if isinstance(node, Nodes.ClassDefNode) or isinstance(
            node, Nodes.PyClassDefNode
        ):
            if isinstance(node.body, Nodes.StatListNode):
                for stmt in node.body.stats:

                    if isinstance(stmt, Nodes.CFuncDefNode) or isinstance(
                        stmt, Nodes.FuncDefNode
                    ):
                        try:
                            name = stmt.declarator.base.name
                        except:
                            name = stmt.name

                        # There exist the case where the class uses __init__ to define class
                        if (
                            isinstance(stmt, Nodes.CFuncDefNode)
                        ) and name == "__init__":
                            values = self.get_signs(stmt, name=name)
                            break

                        elif isinstance(stmt, Nodes.FuncDefNode) and name == "__init__":
                            values = self.get_signs(stmt, name=name)
                            break

        elif isinstance(node, Nodes.DefNode):
            try:
                values = [arg.declarator.name for arg in node.args]

            except:
                pass

            if node.star_arg != None:
                values.append(node.star_arg.name)

            if node.starstar_arg != None:
                values.append(node.starstar_arg.declarator.name)

            selfs_num = values.count("self")

            for _ in range(selfs_num):
                values.remove("self")

        elif isinstance(node, Nodes.CFuncDefNode):
            for arg in node.declarator.args:
                values.append(arg.declarator.declared_name())

            selfs_num = values.count("self")

            for _ in range(selfs_num):
                values.remove("self")

        else:
            pass

        return values

    def visit_ClassDefNode(self, node):
        tmp = self.name
        tmp_target_api = self.target_api
        vals = self.get_signs(node)

        try:
            name = node.name
        except:
            name = node.class_name

        if self.target_api == None:
            if self.name == None and not name.startswith("_"):
                self.classes.append((name, vals))

            else:
                self.methods.append((name, (vals, self.name)))

        else:
            if name == self.target_api[0] and self.name == None:
                self.classes.append((self.target_api[1], vals))

            self.target_api = None

        self.name = name
        self.visitchildren(node)
        self.name = tmp
        self.target_api = tmp_target_api

    def visit_PyClassDefNode(self, node):
        tmp = self.name
        vals = self.get_signs(node, name=node.name)

        try:
            name = node.name
        except:
            name = node.class_name

        if self.target_api == None and not name.startswith("_"):
            if self.name == None:
                self.classes.append((name, vals))

            else:
                self.methods.append((name, (vals, self.name)))

        else:
            if name == self.target_api[0] and self.name == None:
                self.classes.append((self.target_api[1], vals))

        self.name = name
        self.visitchildren(node)
        self.name = tmp

    def visit_DefNode(self, node):
        if not node.name.startswith("__") and not node.name.startswith("_"):
            tmp = self.name
            vals = self.get_signs(node, name=node.name)

            if self.target_api == None and not node.name.startswith("_"):
                if self.name == None:
                    self.functions.append((node.name, vals))
                else:
                    self.methods.append((node.name, (vals, self.name)))

            else:
                if node.name == self.target_api[0] and self.name == None:
                    self.functions.append((self.target_api[1], vals))

            self.name = node.name
            self.visitchildren(node)
            self.name = tmp

    def visit_CFuncDefNode(self, node):
        if not node.declarator.base.name.startswith(
            "__"
        ) and not node.declarator.base.name.startswith("_"):
            tmp = self.name
            vals = self.get_signs(node, name=node.declarator.base.name)

            if self.target_api == None:
                if self.name == None:
                    self.functions.append((node.declarator.base.name, vals))
                else:
                    self.methods.append((node.declarator.base.name, (vals, self.name)))

            else:
                if (
                    node.declarator.base.name == self.target_api[0]
                    and self.name == None
                ):
                    self.functions.append((self.target_api[1], vals))

            self.name = node.declarator.base.name
            self.visitchildren(node)
            self.name = tmp

# Visiting an AST, and collecting all the api names and signature
class GetAllApis(ast.NodeVisitor):
    def __init__(
        self, libo: str, py_path: Path, mapping: bool, target_api=None, history=None
    ):
        self.classes = list()
        self.properties = list()
        self.functions = list()
        self.methods = list()
        self.etcs = list()

        self.libo = libo
        self.name = None
        self.fname = None
        self.signs = dict()
        self.py_path = py_path  # Describe the path of current code
        self.mapping = mapping  # if True, we don't have to consider self import
        self.target_api = target_api
        if history == None:
            self.history = dict()
            self.history[self.py_path] = set()

        else:
            self.history = history

    # Extracting SIGNS of APIs
    def get_signs(
        self,
        node: Union[ast.ClassDef, ast.FunctionDef, ast.AsyncFunctionDef],
        name=None,
    ):
        values = []

        if isinstance(node, ast.ClassDef):
            dec0 = False

            for decorator in node.decorator_list:
                if "define" in ast.unparse(decorator):
                    dec0 = True

            for stmt in node.body:
                # There exist the case where the class uses __init__ to define class
                if (
                    isinstance(stmt, ast.FunctionDef)
                    or isinstance(stmt, ast.AsyncFunctionDef)
                ) and stmt.name == "__init__":
                    values = self.get_signs(stmt, name=node.name)
                    break

                # There exist the case where the class uses attrs (using field or ib)
                if isinstance(stmt, ast.Assign) and (
                    "field(" in ast.unparse(stmt) or "ib(" in ast.unparse(stmt)
                ):
                    for target in stmt.targets:
                        if isinstance(target, ast.Name):
                            values.append(target.id)

                # There exist the case where the class uses attrs (using define)
                if isinstance(stmt, ast.AnnAssign) and dec0:
                    values.append(stmt.target.id)

            # There exist the case where the class uses characteristic (using attributes).
            for decorator in node.decorator_list:
                if "attributes(" in ast.unparse(decorator) and isinstance(
                    decorator, ast.Call
                ):
                    for arg in decorator.args:
                        if isinstance(arg, ast.Constant):
                            values.append(arg.value)

                        if (
                            isinstance(arg, ast.Call)
                            and isinstance(arg.func, ast.Name)
                            and arg.func.id == "Attribute"
                        ):
                            for arg2 in arg.args:
                                if isinstance(arg2, ast.Constant):
                                    values.append(arg2.value)

        else:  # FunctionDef, AsyncFunctionDef
            arguments = node.args

            for posonlyarg in arguments.posonlyargs:
                values.append(posonlyarg.arg)

            for arg in arguments.args:
                values.append(arg.arg)

            if arguments.vararg:
                values.append(arguments.vararg.arg)

            for kwonlyarg in arguments.kwonlyargs:
                values.append(kwonlyarg.arg)

            if arguments.kwarg:
                values.append(arguments.kwarg.arg)

            selfs_num = values.count("self")

            for _ in range(selfs_num):
                values.remove("self")

        return values

    def visit_ClassDef(self, node: ast.ClassDef):
        tmp = self.name
        tmp_target_api = self.target_api
        vals = self.get_signs(node)

        if self.target_api == None:
            if self.name == None and not node.name.startswith("_"):
                self.classes.append((node.name, vals))

            else:
                if not node.name.startswith("_"):
                    self.methods.append(
                        (node.name, (vals, self.name))
                    )  # ClassDef is a method of another class

        else:
            if node.name == self.target_api[0] and self.name == None:
                self.classes.append((self.target_api[1], vals))

        self.name = node.name
        self.generic_visit(node)
        self.name = tmp
        self.target_api = tmp_target_api

    def visit_FunctionDef(self, node: ast.FunctionDef):
        tmp = self.fname
        vals = self.get_signs(node)

        if self.target_api == None:

            if (
                self.name == None
                and not node.name.startswith("__")
                and not node.name.startswith("_")
            ):
                self.functions.append((node.name, vals))

            else:
                if not node.name.startswith("__") and not node.name.startswith("_"):
                    self.methods.append((node.name, (vals, self.name)))

                elif node.name == "__truediv__":
                    self.methods.append((node.name, (vals, self.name)))

                for decorator in node.decorator_list:
                    if "property" in ast.unparse(
                        decorator
                    ) and not node.name.startswith("__"):
                        self.properties.append((node.name, (vals, self.name)))
        else:
            if node.name == self.target_api[0] and self.name == None:
                self.functions.append((self.target_api[1], vals))

        self.fname = node.name
        self.generic_visit(node)
        self.fname = tmp

    def visit_AsyncFunctionDef(self, node: ast.AsyncFunctionDef):
        tmp = self.fname
        vals = self.get_signs(node)

        if self.target_api == None:
            if (
                self.name == None
                and not node.name.startswith("__")
                and not node.name.startswith("_")
            ):
                self.functions.append((node.name, vals))
            else:
                if not node.name.startswith("__") and not node.name.startswith("_"):
                    self.methods.append((node.name, (vals, self.name)))

                for decorator in node.decorator_list:
                    if "property" in ast.unparse(
                        decorator
                    ) and not node.name.startswith("__"):
                        self.properties.append((node.name, (vals, self.name)))

        else:
            if node.name == self.target_api[0] and self.name == None:
                self.functions.append((self.target_api[1], vals))

        self.fname = node.name
        self.generic_visit(node)
        self.fname = tmp

    def visit_ImportFrom(self, node: ast.ImportFrom):
        if self.target_api == None:
            # Self Imports
            if node.level > 0 or (
                node.module != None and llm_pre.libname(self.libo) in node.module
            ):
                # Assiging self.py_path
                self.py_path_tmp = self.py_path

                if node.level > 0:
                    for _ in range(node.level):
                        self.py_path_tmp = self.py_path_tmp.parent

                else:
                    try:
                        self.py_path_tmp = (
                            gits.HOME_PATH / Path(gits.git_loc[(self.libo)]).parent
                        )

                    except:
                        # TypeShed
                        self.py_path_tmp = (
                            gits.HOME_PATH / Path(gits.git_loc_old[(self.libo)]).parent
                        )

                # Check For Underbar Flag and cimplementation (confluent_kafka)
                underbar_flag = False
                cimpl = False

                if node.module != None:
                    modules = node.module.split(".")

                    for module in modules:
                        if module.startswith("_") and (not module.startswith("__")):
                            underbar_flag = True
                        if module == "cimpl":
                            cimpl = True

                # Search For Imports
                for alias in node.names:
                    if (not self.mapping) or underbar_flag or (alias.asname != None):
                        if alias.name == "*":
                            target_api = None
                        else:
                            if alias.asname == None:
                                target_api = (alias.name, alias.name)
                            else:
                                target_api = (alias.name, alias.asname)

                        node_module = node.module if node.module != None else ""

                        module_file = self.py_path_tmp / Path(
                            (node_module).replace(".", "/") + ".py"
                        )
                        dir_file = self.py_path_tmp / Path(
                            (node_module).replace(".", "/") + "/__init__.py"
                        )

                        module_file_pyx = self.py_path_tmp / Path(
                            (node_module).replace(".", "/") + ".pyx"
                        )

                        if module_file.exists() or (dir_file.exists()):

                            target_file = (
                                module_file if module_file.exists() else dir_file
                            )

                            if (
                                self.py_path not in self.history
                                or target_file not in self.history[self.py_path]
                            ):
                                try:
                                    self.history[self.py_path].add(target_file)

                                except:
                                    self.history[self.py_path] = set()
                                    self.history[self.py_path].add(target_file)

                                with open(target_file, "r") as f:
                                    code = f.read().strip()

                                    tree = ast.parse(code)
                                    visitor = GetAllApis(
                                        self.libo,
                                        target_file,
                                        self.mapping,
                                        target_api,
                                        self.history,
                                    )
                                    visitor.visit(tree)

                                    self.classes += visitor.classes
                                    self.properties += visitor.properties
                                    self.functions += visitor.functions
                                    self.methods += visitor.methods
                                    self.etcs += visitor.etcs

                                self.history[self.py_path].remove(target_file)

                        if module_file_pyx.exists():
                            if (
                                self.py_path not in self.history
                                or module_file_pyx not in self.history[self.py_path]
                            ):

                                try:
                                    self.history[self.py_path].add(module_file_pyx)
                                except:
                                    self.history[self.py_path] = set()
                                    self.history[self.py_path].add(module_file_pyx)

                                try:
                                    with open(module_file_pyx, "r") as f:
                                        code = f.read()

                                        tree = TreeFragment.parse_from_strings(
                                            str(module_file_pyx), code
                                        )
                                        visitor = GetAllApisCython(
                                            self.libo, target_api
                                        )
                                        visitor.visit(tree)

                                        self.classes += visitor.classes
                                        self.properties += visitor.properties
                                        self.functions += visitor.functions
                                        self.methods += visitor.methods
                                        self.etcs += visitor.etcs

                                except:
                                    print(module_file_pyx, "is not readable")
                                    # 177.json

                                self.history[self.py_path].remove(module_file_pyx)

                if cimpl:
                    for alias in node.names:
                        if alias.asname == None:
                            self.etcs.append((alias.name, []))
                        else:
                            self.etcs.append((alias.asname, []))

            # # TypeShed Imports
            elif node.module != None and node.module.split(".")[0] in std_libs:
                for alias in node.names:
                    if alias.name == "*":
                        tmp_result: dict = typeshed(
                            node.module.split(".")[0]
                        )  # Just one depth

                        self.classes += tmp_result[node.module.split(".")[0]][0]
                        self.functions += tmp_result[node.module.split(".")[0]][2]
                        self.etcs += tmp_result[node.module.split(".")[0]][4]

                    else:
                        pass

        else:
            pass

    # Assign only in the case of module level
    def visit_Assign(self, node: ast.Assign):
        if self.name == None and self.fname == None:
            for target in node.targets:
                if isinstance(target, ast.Name) and not target.id.startswith("_"):
                    self.etcs.append((target.id, []))

        else:
            for target in node.targets:
                if (
                    isinstance(target, ast.Attribute)
                    and isinstance(target.value, ast.Name)
                    and target.value.id == "self"
                    and (ast.unparse(target).split(".")[1].startswith("_") == False)
                ):
                    self.properties.append((target.attr, ([], self.name)))

                elif (
                    isinstance(target, ast.Name)
                    and self.fname == None
                    and (not target.id.startswith("_"))
                ):
                    self.properties.append((target.id, ([], self.name)))

    def visit_AnnAssign(self, node: ast.AnnAssign):
        if self.name == None and self.fname == None:
            if isinstance(node.target, ast.Name):
                self.etcs.append((node.target.id, []))

    def visit_Global(self, node: ast.Global):
        for name in node.names:
            if not name.startswith("_"):
                self.etcs.append((name, []))


# Find Whole APIs in the given library
def get_all_apis(
    lib_path: Path, imp_path, libo, typeshed_b=False, py=False, cy=False, mapping=False
):
    # If mapping is True, then we don't have to consider self import (No need to consider import path. we only need argument and name of API)
    if libo in std_libs and typeshed_b == False:
        return typeshed(libo)

    apis = dict()  # key: path | val: (apis, properties)

    try:
        file_list_py = [
            file
            for file in os.listdir(lib_path)
            if (
                (file.endswith(".py") or file.endswith(".pyi") or file.endswith(".pyx"))
                and (not file.startswith("_") or file == "__init__.py")
                and (not file == "setup.py")
            )
        ]

    except:
        file_list_py = [str(lib_path).split("/")[-1]]
        lib_path = lib_path.parent

    # Iterating __init__ first
    if "__init__.py" in file_list_py:
        file_list_py.remove("__init__.py")
        file_list_py = ["__init__.py"] + file_list_py

    elif "__init__.pyi" in file_list_py:
        file_list_py.remove("__init__.pyi")
        file_list_py = ["__init__.pyi"] + file_list_py

    for file in file_list_py:
        if file in ["examples", "example", "src"]:
            continue
        with open(lib_path / file, "r") as f:
            code = f.read().strip()

        if file.endswith(".pyx"):
            try:
                tree = TreeFragment.parse_from_strings(file, code)
                visitor = GetAllApisCython(libo=libo)
            except:
                continue

        else:
            tree = ast.parse(code)
            visitor = GetAllApis(libo, lib_path / file, mapping)

        visitor.visit(tree)

        v1n, v2n, v3n, v4n, v5n = (
            visitor.classes,
            visitor.properties,
            visitor.functions,
            visitor.methods,
            visitor.etcs,
        )

        if typeshed_b and (file == "__init__.py" or file == "__init__.pyi"):
            try:
                v1, v2, v3, v4, v5 = apis[imp_path]
                apis[imp_path] = (v1 + v1n, v2 + v2n, v3 + v3n, v4 + v4n, v5 + v5n)

            except:
                apis[imp_path] = (v1n, v2n, v3n, v4n, v5n)

        elif (file != "__init__.py" and file != "__init__.pyi") and py == True:
            try:
                v1, v2, v3, v4, v5 = apis[imp_path]
                apis[imp_path] = (v1 + v1n, v2 + v2n, v3 + v3n, v4 + v4n, v5 + v5n)

            except:
                apis[imp_path] = (v1n, v2n, v3n, v4n, v5n)

        elif (file != "__init__.py" and file != "__init__.pyi") and py == False:
            try:
                apis[imp_path + "." + file.split(".")[0]] = (
                    v1n,
                    v2n,
                    v3n,
                    v4n,
                    v5n,
                )
            except:
                apis[imp_path + "." + file.split(".")[0]] = (v1n, v2n, v3n, v4n, v5n)

        elif (file == "__init__.py" or file == "__init__.pyi") and py == False:
            try:
                v1, v2, v3, v4, v5 = apis[imp_path]
                apis[imp_path] = (v1 + v1n, v2 + v2n, v3 + v3n, v4 + v4n, v5 + v5n)

            except:
                apis[imp_path] = (v1n, v2n, v3n, v4n, v5n)

        else:
            pass

    if typeshed_b == False and py == False:
        folders = [
            folder
            for folder in os.listdir(lib_path)
            if (os.path.isdir(lib_path / folder))
        ]

        for folder in folders:
            if folder in ["examples", "example", "src"] or str(folder).startswith("_"):
                continue
            apis_new = get_all_apis(
                lib_path / folder, imp_path + "." + folder, libo, mapping=mapping
            )
            apis.update(apis_new)

    return apis


def update_dict(dict1, dict2):
    for key, val in dict2.items():
        v1, v2, v3, v4, v5 = val

        if key in dict1:
            dict1[key] = (
                dict1[key][0] + v1,
                dict1[key][1] + v2,
                dict1[key][2] + v3,
                dict1[key][3] + v4,
                dict1[key][4] + v5,
            )

        if key not in dict1:
            dict1[key] = (v1, v2, v3, v4, v5)

    return dict1


def typeshed(lib):
    pyi: Path = STD_LIB_PATH / (lib + ".pyi")
    _pyi: Path = STD_LIB_PATH / ("_" + lib + ".pyi")
    dir: Path = STD_LIB_PATH / lib

    result = dict()

    if pyi.exists():
        apis = get_all_apis(pyi, lib, lib, typeshed_b=True, py=True)
        result = update_dict(result, apis)

    if _pyi.exists():
        apis = get_all_apis(_pyi, lib, lib, typeshed_b=True, py=True)
        result = update_dict(result, apis)

    if dir.exists():
        apis = get_all_apis(dir, lib, lib, typeshed_b=True, py=False)
        result = update_dict(result, apis)

    return result


# Extracting signuatres of original libaries APIs (for single API)
def apio_sign(apio, apios):
    for _, val in apios.items():
        classes = val[0]
        properties = val[1]
        functions = val[2]
        methods = val[3]
        etcs = val[4]

        for api, sign in classes:
            if api == apio:
                return sign

        for prop, sign in properties:
            if prop == apio:
                return sign

        for original, sign in functions:
            if original == apio:
                return sign

        for method, sign in methods:
            if method == apio:
                return sign

        for etc, sign in etcs:
            if etc == apio:
                return sign

    text = input(
        f"Enter signature list of {apio} with blank space. If None just enter newline: "
    )
    text = text.strip().split(" ")

    if text == [""]:
        return []

    return

# Extracting signuatres of original libaries APIs (for multiple APIs for a single file)
def apin_signs(libn):
    lib_path = gits.HOME_PATH / Path(gits.git_loc[libn])

    if ".py" in str(lib_path):
        apis = get_all_apis(
            lib_path,
            str(lib_path).split("/")[-1].split(".")[0],
            libn,
            py=True,
            mapping=True,
        )
    else:
        apis = get_all_apis(lib_path, str(lib_path).split("/")[-1], libn, mapping=True)

    # key: path | val: (apis:a set of tuple(api name, sign list), properties: a set of tuple(property name, sign list), originals)

    return apis


# Main Function
def get_apis(lib_path, lib):
    if ".py" in str(lib_path):
        apis = get_all_apis(
            lib_path,
            str(lib_path).split("/")[-1].split(".")[0],
            lib,
            py=True,
        )
    else:
        apis = get_all_apis(lib_path, str(lib_path).split("/")[-1], lib)

    return apis
