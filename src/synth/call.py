import os, json, ast, sys
from os import path

try:
    from .stmt_types import stmt as stmt_type
except:
    from stmt_types import stmt as stmt_type

try:
    from .stmt_types import expr as expr_type
except:
    from stmt_types import expr as expr_type

sys.path.append((path.dirname(path.abspath(__file__))))
import llm_pre

from _ast import *

from typing import Dict


class FuncDefs(ast.NodeVisitor):
    def __init__(self):
        self.funcs = dict()

    def visit_FunctionDef(self, node: FunctionDef):
        self.funcs[node.name] = "non-async"
        self.generic_visit(node)

    def visit_AsyncFunctionDef(self, node: AsyncFunctionDef):
        self.funcs[node.name] = "async"
        self.generic_visit(node)


# For the API which is not called by attribute or call
def NameExtract(CN: dict, api: str, root: ast.AST, parent: dict) -> dict:
    for node in ast.walk(root):
        if isinstance(node, ast.Name) and node.id == api:
            # RealParent = FindRealParent(parent, node, 1)
            CN[api] = node
    return CN


def ClassDefs(root: ast.AST) -> Dict[str, ast.ClassDef]:
    result = dict()  # set with class name
    for node in ast.walk(root):
        if isinstance((node), ast.ClassDef):
            result[node.name] = node
    return result


# It returns the name of user defined function
def FunctionDefs(
    root: ast.AST, ParentO
) -> Dict[str, ast.FunctionDef | ast.AsyncFunctionDef]:
    result = dict()  # set with function name
    for node in ast.walk(root):
        if isinstance((node), ast.FunctionDef) or isinstance(
            (node), ast.AsyncFunctionDef
        ):
            result[node.name] = node

            # If Parent Node is class, add the 'self.' + name in result
            Cparent = FindCParent(ParentO, node)
            if Cparent != None:
                result["self." + node.name] = node

    return result


# Making Parent Hash Table
def ParentAst(root) -> dict:
    parentage = dict()  # key: parent value: child of set
    for node in ast.walk(root):
        for child in ast.iter_child_nodes(node):
            try:
                parentage[node].add(child)
            except:
                parentage[node] = {child}
    return parentage


def FindExceptHandler(parent: dict, node) -> ast.ExceptHandler:
    if isinstance(node, ast.ExceptHandler):
        return node

    for key, value in parent.items():
        if node in value:
            return FindExceptHandler(parent, key)

    return None


# Find the real parent(type: stmt) of the node
def FindRealParent(parent: dict, node, depth: int):
    if (type(node) in stmt_type) and depth == 1:
        return node

    for key, value in parent.items():
        if (type(node) in stmt_type) and depth == 1:
            return node  # ??

        elif node in value and type(key) in stmt_type and depth == 1:
            return key

        elif node in value and type(key) in stmt_type and depth > 1:
            return FindRealParent(parent, key, depth - 1)

        elif node in value and type(key) in expr_type:
            return FindRealParent(parent, key, depth)

        elif node in value and isinstance(key, ast.Module):
            return key

        elif node in value:
            # print('oooooo', key)
            # print('No Parent Found with input depths.', (key))
            return None

        else:
            pass  # Node not in value Find for another

    # print('No Parent Found with input depth.')
    return None


# irrelevant to the type of parent (expr, stmt) just find parent
def FindParent(parent: dict, node):
    for key, value in parent.items():
        if node in value:
            return key
        else:
            pass  # Node not in value Find for another
    print("No Parent Found.")
    return node


# Find the parent(which can include the stmts in the node) of the node
def FindSSParent(parent: dict, node, depth=1):
    for key, value in parent.items():
        if type(node) in llm_pre.stmtInstmt and depth == 1:
            return node
        elif node in value and type(key) in llm_pre.stmtInstmt and depth == 1:
            return key
        elif node in value and type(key) in llm_pre.stmtInstmt and depth > 1:
            return FindSSParent(parent, key, depth - 1)
        elif node in value:
            return FindSSParent(parent, key, depth)
        else:
            pass


# More detail version of FindSSParent
def FindSSParent1(parent: dict, node, depth=1):
    for key, value in parent.items():
        if type(node) in llm_pre.stmtInstmt1 and depth == 1:
            return node
        elif node in value and type(key) in llm_pre.stmtInstmt1 and depth == 1:
            return key
        elif node in value and type(key) in llm_pre.stmtInstmt1 and depth > 1:
            return FindSSParent1(parent, key, depth - 1)
        elif node in value:
            return FindSSParent1(parent, key, depth)
        else:
            pass


# Find the parent(which can include the stmts in the node -Func+Class) of the node
def FindFCParent(parent: dict, node, depth=1):
    if isinstance(node, ast.Module):
        return None

    for key, value in parent.items():
        if type(node) in llm_pre.stmtInFuncClass and depth == 1:
            return node
        elif node in value and type(key) in llm_pre.stmtInFuncClass and depth == 1:
            return key
        elif node in value and type(key) in llm_pre.stmtInFuncClass and depth > 1:
            return FindFCParent(parent, key, depth - 1)
        elif node in value:
            return FindFCParent(parent, key, depth)
        else:
            pass


# Check whether exact node exists in (Only Class) of the node
def FindCParent(parent: dict, node):
    if isinstance(node, ast.Module):
        return None
    if isinstance(node, ast.ClassDef):
        return node

    for key, value in parent.items():
        if node in value:
            return FindCParent(parent, key)


# Find the parent(Only Func) of the node
def FindFParent(parent: dict, node, depth=1):
    if isinstance(node, ast.Module):
        return None

    for key, value in parent.items():
        if type(node) in [ast.FunctionDef, ast.AsyncFunctionDef] and depth == 1:
            return node
        elif (
            node in value
            and type(key) in [ast.FunctionDef, ast.AsyncFunctionDef]
            and depth == 1
        ):
            return key
        elif (
            node in value
            and type(key) in [ast.FunctionDef, ast.AsyncFunctionDef]
            and depth > 1
        ):
            return FindFParent(parent, key, depth - 1)
        elif node in value:
            return FindFParent(parent, key, depth)
        else:
            pass


def FindExprParent(parent: dict, node) -> ast.Expression:
    for key, value in parent.items():
        if isinstance(node, ast.Attribute) or isinstance(node, ast.Call):
            return node
        elif node in value and (
            isinstance(node, ast.Attribute) or isinstance(node, ast.Call)
        ):
            return key
        elif node in value and (
            isinstance(node, ast.Attribute) or isinstance(node, ast.Call)
        ):
            return FindExprParent(parent, key)
        elif node in value:
            return FindExprParent(parent, key)
        else:
            pass  # Node not in value Find for another

    # print('No Parent Found with input depth.')
    return node


class NameExtractor(ast.NodeVisitor):
    def __init__(
        self, check=False, check1=False, libo="qwer"
    ):  # qwer is tmp variable...
        self.list = []
        self.constants = []
        self.types = []
        self.check = check
        self.check1 = check1  # if true, self. counts for separately
        self.libo = libo

    def visit_Name(self, node):
        self.list.append(node.id)

    def visit_Attribute(self, node):
        if self.libo in ast.unparse(
            node
        ):  # levldb.LevelDB should not be counted as variable
            pass

        else:

            if (
                self.check1
                and isinstance(node.value, ast.Name)
                and node.value.id == "self"
            ):
                self.list.append("self." + node.attr)

            else:
                if not self.check:
                    self.list.append(node.attr)

                # if Attribute has 'self' in it, the attr should be added, too
                NEC = NameExtractor()
                NEC.visit(node.value)

                if "self" in NEC.list:
                    self.list.append(node.attr)

                self.visit(node.value)

    def visit_keyword(self, node: keyword):
        self.visit(node.value)

    def visit_arg(self, node: ast.arg):
        self.list.append(node.arg)

    def visit_Constant(self, node: ast.Constant):
        self.constants.append(node.value)

    def visit_AnnAssign(self, node: ast.AnnAssign):
        if isinstance(node.annotation, ast.Name):
            self.types.append(
                node.annotation.id
            )  # Assume most types(basic types) are assigned as Name
        self.visit(node.target)
        if node.value != None:
            self.visit(node.value)


# Call Relation Usage Scenario
# {apple: {banana, cherry} : To call banana, apple needed
class Preparation(ast.NodeVisitor):
    def __init__(self, func: list, apios=[]):
        self.tableM: Dict[str, Set[str]] = dict()
        self.func = func
        # key: call name value: call/attribute node
        self.nodes: Dict[str, set[ast.AST]] = dict()
        self.funcdefs = dict()
        self.classdefs = dict()
        self.apios = apios

    def visit_Name(self, node: ast.Name):
        if node.id in self.apios:
            try:
                self.nodes[node.id].add(node)
            except:
                self.nodes[node.id] = {node}

    def visit_Module(self, node: Module):
        for stmt in node.body:
            self.visit(stmt)

    def visit_Interactive(self, node: Interactive):
        for stmt in node.body:
            self.visit(stmt)

    def visit_Expression(self, node: Expression):
        self.visit(node.body)

    def visit_FunctionDef(self, node: FunctionDef):
        self.funcdefs[node.name] = node

        if node.name not in self.tableM:
            self.tableM[node.name] = set()

        for arg in node.args.args:
            if arg.annotation != None:
                if isinstance(arg.annotation, ast.Name):
                    try:
                        self.nodes[arg.annotation.id].add(arg)
                    except:
                        self.nodes[arg.annotation.id] = {arg}

                elif isinstance(arg.annotation, ast.Attribute):
                    try:
                        self.nodes[arg.annotation.attr].add(arg)
                    except:
                        self.nodes[arg.annotation.attr] = {arg}

            self.tableM[node.name].add(arg.arg)

        for stmt in node.body:
            self.visit(stmt)

        for decorator in node.decorator_list:
            # self.visit(decorator)
            tmp = NameExtractor()
            tmp.visit(decorator)

            for x in tmp.list:
                try:
                    self.nodes[x].add((node, decorator, "decorator"))
                except:
                    self.nodes[x] = {(node, decorator, "decorator")}
                self.tableM[node.name].add(x)

        if node.returns != None:
            self.visit(node.returns)

        # self.func.remove(node.name)

    def visit_AsyncFunctionDef(self, node: AsyncFunctionDef):
        self.funcdefs[node.name] = node

        if node.name not in self.tableM:
            self.tableM[node.name] = set()

        for arg in node.args.args:
            if arg.annotation != None:
                if isinstance(arg.annotation, ast.Name):
                    try:
                        self.nodes[arg.annotation.id].add(arg)
                    except:
                        self.nodes[arg.annotation.id] = {arg}

            self.tableM[node.name].add(arg.arg)

        for stmt in node.body:
            self.visit(stmt)

        for decorator in node.decorator_list:

            self.visit(decorator)
            tmp = NameExtractor()
            tmp.visit(decorator)

            for x in tmp.list:
                try:
                    self.nodes[x].add((node, decorator, "decorator"))
                except:
                    self.nodes[x] = {(node, decorator, "decorator")}
                self.tableM[node.name].add(x)

        if node.returns != None:
            self.visit(node.returns)

        # self.func.remove(node.name)

    def visit_ClassDef(self, node: ClassDef):
        # if self.func != []: map(lambda x: self.tableM[x].add(node.name), self.func)
        # self.func.append(node.name)
        self.classdefs[node.name] = node

        for base in node.bases:
            tmp = NameExtractor()
            tmp.visit(base)

            for name1 in tmp.list:
                if name1 not in self.tableM:
                    self.tableM[name1] = set()
                self.tableM[name1].add(node.name)
                try:
                    self.nodes[name1].add(
                        (node, tuple(node.bases), "classbase")
                    )  # Assume the class base is only one.. Decorator too
                except:
                    self.nodes[name1] = {(node, tuple(node.bases), "classbase")}

        for keyword in node.keywords:
            tmp = NameExtractor()
            tmp.visit(keyword)

            for name1 in tmp.list:
                if name1 not in self.tableM:
                    self.tableM[name1] = set()
                self.tableM[name1].add(node.name)

        for stmt in node.body:
            self.visit(stmt)

        for decorator in node.decorator_list:
            if node.name not in self.tableM:
                self.tableM[node.name] = set()

            # self.visit(decorator)
            tmp = NameExtractor()
            tmp.visit(decorator)

            for x in tmp.list:
                try:
                    self.nodes[x].add((node, decorator, "decorator"))
                except:
                    self.nodes[x] = {(node, decorator, "decorator")}

            map(lambda x: self.tableM[node.name].add(x), tmp.list)

        # self.func.remove(node.name)

    def visit_Return(self, node: Return):
        if node.value != None:
            self.visit(node.value)

    def visit_Delete(self, node: Delete):
        for target in node.targets:
            self.visit(target)

    def visit_Assign(self, node: Assign):
        names1 = []

        for target in node.targets:
            self.visit(target)
            tmp1 = NameExtractor()
            tmp1.visit(target)
            names1 += tmp1.list

        names1 = set(names1)

        self.visit(node.value)

        tmp2 = NameExtractor()
        tmp2.visit(node.value)
        names2 = tmp2.list

        for name2 in names2:
            if name2 not in self.tableM:
                self.tableM[name2] = names1
            else:
                for x in names1:
                    self.tableM[name2].add(x)

    # def visit_TypeAlias(expr name, type_param* type_params, expr value)

    def visit_AugAssign(self, node: AugAssign):
        # self.visit(node.target)
        tmp1 = NameExtractor()
        tmp1.visit(node.target)
        names1 = set(tmp1.list)

        self.visit(node.value)

        tmp2 = NameExtractor()
        tmp2.visit(node.value)
        names2 = tmp2.list

        for name2 in names2:
            if name2 not in self.tableM:
                self.tableM[name2] = names1
            else:
                map(lambda x: self.tableM[name2].add(x), names1)

    # def visit_AnnAssign(self, node: AnnAssign):

    def visit_For(self, node: For):
        tmp1 = NameExtractor()
        tmp1.visit(node.iter)

        tmp2 = NameExtractor()
        tmp2.visit(node.target)
        names2 = set(tmp2.list)

        # target을 부르려면 iter가 있어야한다
        for name1 in tmp1.list:
            if name1 not in self.tableM:
                self.tableM[name1] = names2
            else:
                map(lambda x: self.tableM[name1].add(x), names2)

        self.visit(node.iter)
        self.visit(node.target)

        for stmt in node.body:
            self.visit(stmt)
        for stmt in node.orelse:
            self.visit(stmt)

    def visit_AsyncFor(self, node: AsyncFor):
        tmp1 = NameExtractor()
        tmp1.visit(node.iter)

        tmp2 = NameExtractor()
        tmp2.visit(node.target)
        names2 = set(tmp2.list)

        for name1 in tmp1.list:
            if name1 not in self.tableM:
                self.tableM[name1] = names2
            else:
                map(lambda x: self.tableM[name1].add(x), names2)

        for stmt in node.body:
            self.visit(stmt)
        for stmt in node.orelse:
            self.visit(stmt)

    def visit_While(self, node: While):
        self.visit(node.test)
        for stmt in node.body:
            self.visit(stmt)
        for stmt in node.orelse:
            self.visit(stmt)

    def visit_If(self, node: If):
        self.visit(node.test)
        for stmt in node.body:
            self.visit(stmt)
        for stmt in node.orelse:
            self.visit(stmt)

    def visit_With(self, node: With):
        for item in node.items:  # withitem
            self.visit(item)
            if item.optional_vars != None:
                tmp1 = NameExtractor()
                tmp1.visit(item.optional_vars)
                names1 = set(tmp1.list)

                tmp2 = NameExtractor()
                tmp2.visit(item.context_expr)
                names2 = tmp2.list

                for name2 in names2:
                    if name2 not in self.tableM:
                        self.tableM[name2] = names1
                    else:
                        map(lambda x: self.tableM[name2].add(x), names1)

        for stmt in node.body:
            self.visit(stmt)

    def visit_AsyncWith(self, node: AsyncWith):
        for item in node.items:
            if item.optional_vars != None:
                self.visit(item)
                tmp1 = NameExtractor()
                tmp1.visit(item.optional_vars)
                names1 = set(tmp1.list)

                tmp2 = NameExtractor()
                tmp2.visit(item.context_expr)
                names2 = tmp2.list

                for name2 in names2:
                    if name2 not in self.tableM:
                        self.tableM[name2] = names1
                    else:
                        map(lambda x: self.tableM[name2].add(x), names1)

        for stmt in node.body:
            self.visit(stmt)

    # def visit_Match(self, node: Match):

    def visit_Raise(self, node: Raise):
        if node.exc != None:
            self.visit(node.exc)
        if node.cause != None:
            self.visit(node.cause)

    def visit_Try(self, node: Try):
        for stmt in node.body:
            self.visit(stmt)
        for handler in node.handlers:
            self.visit(handler)
        for stmt in node.orelse:
            self.visit(stmt)
        for stmt in node.finalbody:
            self.visit(stmt)

    def visit_Assert(self, node: Assert):
        self.visit(node.test)
        if node.msg != None:
            self.visit(node.msg)

    def visit_Expr(self, node: Expr):
        self.visit(node.value)

    # def visit_Global(self, node: Global):
    # def visit_Nonlocal(self, node: Nonlocal):

    # expression starts
    def visit_BoolOp(self, node: BoolOp):
        for value in node.values:
            self.visit(value)

    def visit_NamedExpr(self, node: NamedExpr):
        tmp1 = NameExtractor()
        tmp1.visit(node.target)
        names1 = set(tmp1.list)

        self.visit(node.value)

        tmp2 = NameExtractor()
        tmp2.visit(node.value)
        names2 = tmp2.list

        for name2 in names2:
            if name2 not in self.tableM:
                self.tableM[name2] = names1
            else:
                map(lambda x: self.tableM[name2].add(x), names1)

    def visit_Lambda(self, node: Lambda):
        self.visit(node.body)

    def visit_Dict(self, node: Dict):  # due to 176.json, try and except
        try:
            for key in node.keys:
                self.visit(key)
            for value in node.values:
                self.visit(value)
        except:
            pass

    def visit_Set(self, node: Set):
        for elt in node.elts:
            self.visit(elt)

    def visit_ListComp(self, node: ListComp):
        for generator in node.generators:
            self.visit(generator)

            tmp1 = NameExtractor()
            tmp1.visit(generator.iter)
            tmp2 = NameExtractor()
            tmp2.visit(generator.target)

        self.visit(node.elt)

    def visit_SetComp(self, node: SetComp):
        for generator in node.generators:
            self.visit(generator)

            tmp1 = NameExtractor()
            tmp1.visit(generator.iter)
            tmp2 = NameExtractor()
            tmp2.visit(generator.target)

        self.visit(node.elt)

    def visit_DictComp(self, node: DictComp):
        for generator in node.generators:
            self.visit(generator)

            tmp1 = NameExtractor()
            tmp1.visit(generator.iter)
            tmp2 = NameExtractor()
            tmp2.visit(generator.target)

        self.visit(node.key)
        self.visit(node.value)

    def visit_GeneratorExp(self, node: GeneratorExp):
        for generator in node.generators:
            self.visit(generator)

            tmp1 = NameExtractor()
            tmp1.visit(generator.iter)
            tmp2 = NameExtractor()
            tmp2.visit(generator.target)

            for iff in generator.ifs:
                self.visit(iff)

        self.visit(node.elt)

    def visit_Await(self, node: Await):
        self.visit(node.value)

    def visit_Yield(self, node: Yield):
        if node.value != None:
            self.visit(node.value)

    def visit_YieldFrom(self, node: YieldFrom):
        self.visit(node.value)

    def visit_Compare(self, node: Compare):
        self.visit(node.left)
        for comparator in node.comparators:
            self.visit(comparator)

    def visit_Call(self, node: Call):
        names1 = []
        names2 = []

        # Special Case Where argument itself becomes the call... # 86.json
        if len(node.args) == 1 and isinstance(node.args[0], ast.Constant):
            try:
                self.nodes[node.args[0].value].add(node)
            except:
                self.nodes[node.args[0].value] = {node}

        for arg in node.args:
            tmp1 = NameExtractor()
            tmp1.visit(arg)
            names1 += tmp1.list
            self.visit(arg)

        for key in node.keywords:
            tmp1 = NameExtractor()
            tmp1.visit(key)
            names1 += tmp1.list
            self.visit(key)

        tmp2 = NameExtractor()
        tmp2.visit(node.func)
        names2 = tmp2.list

        for name1 in names1:  # arguments
            for name2 in names2:  # 0216 added for 9.json
                if name1 not in self.tableM:
                    self.tableM[name1] = set()
                self.tableM[name1].add(name2)

        self.visit(node.func)

        # self.nodes
        if isinstance(node.func, ast.Name):
            key = node.func.id
            try:
                self.nodes[key].add(node)
            except:
                self.nodes[key] = {node}

    def visit_FormattedValue(self, node: FormattedValue):
        self.visit(node.value)
        if node.format_spec != None:
            self.visit(node.format_spec)

    def visit_JoinedStr(self, node: JoinedStr):
        for value in node.values:
            self.visit(value)

    # def visit_Constant(self, node: Constant)

    def visit_Attribute(self, node: Attribute):
        tmp = NameExtractor()
        tmp.visit(node.value)
        for name in tmp.list:
            if name not in self.tableM:
                self.tableM[name] = set()
            self.tableM[name].add(node.attr)
        self.visit(node.value)

        # self.nodes
        key = node.attr
        try:
            self.nodes[key].add(node)
        except:
            self.nodes[key] = {node}

    def visit_Subscript(self, node: Subscript):
        tmp1 = NameExtractor()
        tmp1.visit(node.value)
        self.visit(node.value)

        tmp2 = NameExtractor()
        tmp2.visit(node.slice)
        names2 = set(tmp2.list)

        # map(lambda x: self.visit(x), names2)

        # name2 부르려면 name1 필요
        for name1 in tmp1.list:
            if name1 not in self.tableM:
                self.tableM[name1] = names2
            map(lambda x: self.tableM[name1].add(x), names2)

        if (
            node.slice != None
            and isinstance(node.slice, ast.Constant)
            and isinstance(node.slice.value, str)
        ):
            try:
                self.nodes[node.slice.value].add(node)
            except:
                self.nodes[node.slice.value] = {node}

        # slice subcripti can be call node (39.json) ->이거는 어케 찾냐....;;;

    def visit_Starred(self, node: Starred):
        self.visit(node.value)

    def visit_List(self, node: List):
        for elt in node.elts:
            self.visit(elt)

    def visit_Tuple(self, node: Tuple):
        for elt in node.elts:
            self.visit(elt)

    def visit_Slice(self, node: Slice):
        if node.lower != None:
            self.visit(node.lower)
        if node.upper != None:
            self.visit(node.upper)
        if node.step != None:
            self.visit(node.step)

    def visit_comprehension(self, node: comprehension):
        self.visit(node.iter)
        self.visit(node.target)

        tmp1 = NameExtractor()
        tmp1.visit(node.iter)

        tmp2 = NameExtractor()
        tmp2.visit(node.target)

        for name1 in tmp1.list:
            for name2 in tmp2.list:
                if name1 not in self.tableM:
                    self.tableM[name1] = set()
                self.tableM[name1].add(name2)

    def visit_ExceptHandler(self, node: ExceptHandler):
        if node.type == None:
            pass

        elif isinstance(node.type, ast.Name):
            try:
                self.nodes[node.type.id].add(
                    ((node, (), "handler"))
                )  # except handler type
            except:
                self.nodes[node.type.id] = {(node, (), "handler")}

        elif isinstance(node.type, ast.Tuple):
            for name in node.type.elts:
                if isinstance(name, ast.Name):
                    try:
                        self.nodes[name.id].add(
                            (node, (), "handler")
                        )  # except handler type
                    except:
                        self.nodes[name.id] = {(node, (), "handler")}
                elif isinstance(name, ast.Attribute):
                    try:
                        self.nodes[name.attr].add(
                            (node, (), "handler")
                        )  # except handler type
                    except:
                        self.nodes[name.attr] = {(node, (), "handler")}
                else:
                    print(type(name))
                    print("AttributeError: Not supported!")

        elif isinstance(node.type, ast.Attribute):
            try:
                self.nodes[node.type.attr].add(
                    (node, (), "handler")
                )  # except handler type
            except:
                self.nodes[node.type.attr] = {(node, (), "handler")}

        else:
            print(type(node.type))
            print("Not supported_call.py!")

        for stmt in node.body:
            self.visit(stmt)

    def visit_withitem(self, node: withitem):
        self.visit(node.context_expr)
        if node.optional_vars != None:
            self.visit(node.optional_vars)

    # def visit_TypeIgnore(self, node: TypeIgnore):


# {apple: {banana, cherry} : To call apple, banana and cherry are needed
def FixedPoint(d1: dict[str : set[str]], lib) -> dict[str : set[str]]:
    tmp1 = dict()
    tmp2 = dict()

    for key, value in d1.items():
        for v in value:
            if v == "self" or key == "self" or v in lib:
                continue
            if v not in tmp1:
                tmp1[v] = set()
            tmp1[v].add(key)

    while tmp1 != tmp2:
        tmp2 = tmp1.copy()
        for k1, v1 in tmp2.items():
            for k2, v2 in tmp2.items():
                if k2 in v1:
                    tmp1[k1] = tmp1[k1].union(v2)

    return tmp1


if __name__ == "__main__":
    pass
#     code = """import torch
# import torch.nn as nn
# import numpy as np
# from numpy.testing import assert_allclose

# def torch_init_layer(torch_layer, constant_init):
#     params = []
#     try:
#         params = torch_layer.parameters()
#     except:
#         pass
#     for param in params:
#         try:
#             torch.nn.init.constant_(param.data, constant_init)
#         except Exception:
#             pass

# class TorchConv(nn.Module):

#     def __init__(self):
#         super(TorchConv, self).__init__()
#         self.bn_1 = nn.BatchNorm2d(3, eps=1.001e-05)

#     def forward(self, x):
#         x = self.bn_1(x)
#         return x"""

#     root = ast.parse(code)
#     NewTree = ast.parse(root)
#     ParentN = ParentAst(NewTree)
#     CPN = Preparation([])
#     CPN.visit(NewTree)
#     RelationN = FixedPoint(CPN.tableM, ['tensorflow', 'torch'])
#     NCNs = CPN.nodes
#     print(CPN.tableM)
