import copy
import ast, sys, autoflake, os, json
from os import path

try:
    from synth import call, synthesis
    from synth.stmt_types import stmt as stmt_type

except:
    sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
    from synth import call, synthesis
    from synth.stmt_types import stmt as stmt_type


def all_dict(d: dict) -> set:
    s = set()
    for k, v in d.items():
        s = s | set(v)
    return s


def bodyindex1(p1, v1, check="default"):
    try:
        try:
            ind = p1.body.index(v1)
            if check == "default":
                return ind

            elif check == "aft":
                try:
                    return p1.body[ind + 1 :]
                except:
                    return p1.body

            else:
                if (check == "bef") and (ind > 0):
                    return p1.body[ind - 1]

                elif check == "bef":
                    return None

                else:
                    try:
                        return p1.body[ind + 1]
                    except:
                        return None

        except:
            ind = p1.orelse.index(v1)
            if check == "default":
                return ind

            elif check == "aft":
                try:
                    return p1.orelse[ind + 1 :]
                except:
                    return p1.oreelse

            else:
                if (check == "bef") and (ind > 0):
                    return p1.orelse[ind - 1]

                elif check == "bef":
                    return None

                else:
                    try:
                        return p1.orelse[ind + 1]
                    except:
                        return None

    except:
        try:
            ind = p1.finalbody.index(v1)
            if check == "default":
                return ind

            elif check == "aft":
                try:
                    return p1.finalbody[ind + 1 :]
                except:
                    return p1.finalbody

            else:
                if (check == "bef") and (ind > 0):
                    return p1.finalbody[ind - 1]

                elif check == "bef":
                    return None

                else:
                    try:
                        return p1.finalbody[ind + 1]
                    except:
                        return None
        except:
            if isinstance(p1, ast.Try):
                for handler in p1.handlers:
                    if v1 in handler.body:
                        if check == "default":
                            return handler.body.index(v1)

                        elif check == "aft":
                            try:
                                return handler.body[handler.body.index(v1) + 1 :]
                            except:
                                return handler.body

                        else:
                            if check == "bef" and handler.body.index(v1) > 0:
                                return handler.body[handler.body.index(v1) - 1]

                            elif check == "bef":
                                return None

                            else:
                                try:
                                    return handler.body[handler.body.index(v1) + 1]
                                except:
                                    return None

    # raise Exception('Error in bodyindex1')


def nametarget(node):
    if isinstance(node, ast.FunctionDef):
        return node.name
    elif isinstance(node, ast.AsyncFunctionDef):
        return node.name
    elif isinstance(node, ast.ClassDef):
        return node.name
    elif isinstance(node, ast.Module) or node == None:
        return "module"
    else:
        print("Failure in nametarget", type(node))
        return None


# https://gist.github.com/phpdude/1ae6f19de213d66286c8183e9e3b9ec1 Delete all docstrings
def clean(root):
    for node in ast.walk(root):
        # let's work only on functions & classes definitions
        if not isinstance(node, (ast.FunctionDef, ast.ClassDef, ast.AsyncFunctionDef)):
            continue

        if not len(node.body):
            continue

        if not isinstance(node.body[0], ast.Expr):
            continue

        if not hasattr(node.body[0], "value") or not isinstance(
            node.body[0].value, ast.Str
        ):
            continue

        node.body = node.body[1:]

    return root


def fillpass(root: ast.AST):
    for node in ast.walk(root):
        if (
            isinstance(node, ast.FunctionDef)
            or isinstance(node, ast.AsyncFunctionDef)
            or isinstance(node, ast.ClassDef)
            or isinstance(node, ast.With)
            or isinstance(node, ast.AsyncWith)
            or isinstance(node, ast.If)
            or isinstance(node, ast.For)
        ):
            if node.body == []:
                node.body.append(ast.Pass())
        elif isinstance(node, ast.Try):
            if node.body == []:
                node.body.append(ast.Pass())
        elif isinstance(node, ast.ExceptHandler):
            if node.body == []:
                node.body.append(ast.Pass())
        elif isinstance(node, ast.Module):
            if node.body == []:
                node.body.append(ast.Pass())
        else:
            pass

    return root


def FCTuple(root):
    # ClassBase & ClassDef | Decorator & ClassDef
    if isinstance(root, ast.ClassDef):
        for stmt in root.body:
            if isinstance(stmt, ast.FunctionDef) and stmt.name == "__init__":
                return stmt
    return root  # If there's no __init__ function return the original node


def self_var(root: ast.FunctionDef | ast.AsyncFunctionDef):
    for stmt in root.body:
        if isinstance(stmt, ast.Assign):
            for target in stmt.targets:
                if isinstance(target, ast.Name) and target.id == "self":
                    return True


def body_index(parent, node):
    try:
        try:
            try:
                return parent.body.index(node)
            except:
                return parent.orelse.index(node)
        except:
            if isinstance(parent, ast.Try):
                for handler in parent.handlers:
                    if node in handler.body:
                        return (handler.body.index(node), "handler", handler)
            else:
                return None
    except:
        return parent.finalbody.index(node)

    return None


class ContextRemover(ast.NodeTransformer):
    def __init__(self, nodes, targets=set(), blank=False):
        self.nodes = nodes
        self.check = True
        self.targets = targets
        self.blank = blank

    def visit_FunctionDef(self, node: ast.FunctionDef):
        old = self.check

        if node in self.nodes:
            self.check = False

            # if self.blank:
            #     # Replace it with Constant

            # else:
            #     return node

            return node

        self.generic_visit(node)

        if node.body == [] or self.check or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_AsyncFunctionDef(self, node: ast.AsyncFunctionDef):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if node.body == [] or self.check or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_ClassDef(self, node: ast.ClassDef):
        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if node.body == [] or self.check or node.body == [ast.Pass]:
            return None

        self.check = False
        return node

    def visit_Return(self, node: ast.Return):
        if node in self.nodes:
            self.check = False
            return node

        return None

    def visit_Delete(self, node: ast.Delete):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Assign(self, node: ast.Assign):
        if node in self.nodes:
            self.check = False
            return node
        return None

    # def visit_TypeAlias

    def visit_AugAssign(self, node: ast.AugAssign):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_AnnAssign(self, node: ast.AnnAssign):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_For(self, node: ast.For):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)
        # print(self.nodes, 'self.nodes')

        # print(ast.unparse(node), 'node in for', self.check, node.body)

        if self.check or node.body == [] or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_AsyncFor(self, node: ast.AsyncFor):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if self.check or node.body == [] or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_While(self, node: ast.While):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if self.check or node.body == [] or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_If(self, node: ast.If):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if (
            (node.body == [] or node.body == [ast.Pass])
            and (node.orelse == [] or node.orelse == [ast.Pass])
        ) or self.check:
            self.check = old
            return None

        self.check = False
        return node

    def visit_With(self, node: ast.With):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if self.check or node.body == [] or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_AsyncWith(self, node: ast.AsyncWith):
        old = self.check

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if self.check or node.body == [] or node.body == [ast.Pass]:
            self.check = old
            return None

        self.check = False
        return node

    def visit_Match(self, node: ast.Match):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Raise(self, node: ast.Raise):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Try(self, node: ast.Try):
        old = self.check

        if len(set(node.handlers) & self.nodes) > 0:
            self.check = False
            return node

        if node in self.nodes:
            self.check = False
            return node

        self.generic_visit(node)

        if self.check:
            self.check = old
            return None

        self.check = True

        for handler in node.handlers:
            if (handler.body != []) and (handler.body != [ast.Pass]):
                self.check = False

        if (
            (node.body != [] and node.body != [ast.Pass])
            or (node.orelse != [] and node.orelse != [ast.Pass])
            or (node.finalbody != [] and node.finalbody != [ast.Pass])
        ):
            self.check = False

        if self.check:
            self.check = old
            return None

        self.check = False
        return node

    def visit_Assert(self, node: ast.Assert):
        if node in self.nodes:
            self.check = False
            return node
        return None

    # def visit_Import
    # def visit_Importfrom

    def visit_Global(self, node: ast.Global):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Nonlocal(self, node: ast.Nonlocal):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Expr(self, node: ast.Expr):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Pass(self, node: ast.Pass):
        return None

    def visit_Break(self, node: ast.Break):
        if node in self.nodes:
            self.check = False
            return node
        return None

    def visit_Continue(self, node: ast.Continue):
        if node in self.nodes:
            self.check = False
            return node
        return None


def index_info(ParentO, OCN):
    indexes = dict()
    PN = call.FindSSParent(ParentO, OCN, 1)

    while True:
        index = body_index(PN, OCN)
        indexes[PN] = index

        if isinstance(PN, ast.Module):
            break

        OCN = PN
        PN = call.FindSSParent(ParentO, PN, 2)

    return indexes


def find_use_case(
    root, targets, index: int | tuple[int, str, ast.ExceptHandler] | None, libo
):
    for node in ast.walk(root):
        cond1 = type(node) in (
            set(stmt_type)
            - set(
                [
                    ast.FunctionDef,
                    ast.AsyncFunctionDef,
                    ast.ClassDef,
                    ast.If,
                    ast.For,
                    ast.AsyncFor,
                    ast.While,
                    ast.With,
                    ast.AsyncWith,
                    ast.Try,
                ]
            )
        )
        cond2 = isinstance(node, ast.If) or isinstance(node, ast.While)
        cond3 = isinstance(node, ast.For) or isinstance(node, ast.AsyncFor)
        cond4 = isinstance(node, ast.With) or isinstance(node, ast.AsyncWith)
        cond5 = isinstance(node, ast.Try)

        if cond1 or cond2 or cond3 or cond4 or cond5:
            if cond1 and isinstance(node, ast.Assign):
                node_copy = node.value
            elif cond1:
                node_copy = node
            elif cond2:
                node_copy = node.test
            elif cond3:
                node_copy = node.iter
            elif cond4:
                node_copy = node.items[0]  # Assume only one withitem exists
            elif cond5:
                continue
            else:
                pass

            NEC = call.NameExtractor(check1=True, libo=libo)
            NEC.visit(node_copy)
            new_index = body_index(root, node)

            if isinstance(index, int) and isinstance(new_index, int):
                cond1 = new_index > index
            elif isinstance(index, tuple) and isinstance(new_index, tuple):
                cond1 = new_index[0] > index[0]
            else:
                cond1 = True

            if len(set(NEC.list) & targets) > 0 and cond1:
                targets = targets - set(NEC.list)
                return (node, targets - set(NEC.list))

    return (None, targets)


# Find the needed nodes for the targets
def find_need_case(
    root,
    names,
    nodes,
    index: int | tuple[int, str, ast.ExceptHandler] | None,
    classdefs,
    funcdefs,
    libo,
    target0,
):
    # print(names, 'names')
    # print(ast.unparse(target0))
    # Search for Assign Nodes
    for node in ast.walk(root):
        if (
            isinstance(node, ast.Assign)
            or isinstance(node, ast.AnnAssign)
            or isinstance(node, ast.Global)
        ) and node != target0:
            targets = set()

            if isinstance(node, ast.Assign):
                for target in node.targets:
                    # Subscript is not a target
                    if isinstance(target, ast.Subscript):
                        continue

                    NEC = call.NameExtractor(check1=True, libo=libo)
                    NEC.visit(target)
                    targets = targets | set(NEC.list)

            elif isinstance(node, ast.AnnAssign):
                NEC = call.NameExtractor(check1=True, libo=libo)
                NEC.visit(node.target)
                targets = targets | set(NEC.list)

            else:
                for n in node.names:
                    targets.add(n)

            new_index = body_index(root, node)

            if isinstance(index, int) and isinstance(new_index, int):
                if (
                    isinstance(target0, ast.FunctionDef)
                    or isinstance(target0, ast.AsyncFunctionDef)
                    or isinstance(target0, ast.ClassDef)
                    and isinstance(root, ast.Module)
                ):
                    cond1 = True
                else:
                    cond1 = new_index < index
            elif isinstance(index, tuple) and isinstance(new_index, tuple):
                cond1 = new_index[0] < index[0]
            else:
                cond1 = True

            if len(targets & names) > 0 and (cond1 or (node in nodes)):
                nodes.add(node)
                # print(ast.unparse(node), 'assign')
                names = names - targets

            elif len(targets & names) > 0 and cond1 and (node not in nodes):
                nodes.add(node)
                # print(ast.unparse(node), 'assign')
                names = names - targets

            else:
                pass

    # Search for classdefs, funcdefs -> 마지막에만 해야함
    for c in set(classdefs.keys()) & names:
        nodes.add(classdefs[c])

    for f in set(funcdefs.keys()) & names:
        nodes.add(funcdefs[f])

    return (nodes, names)


def need_nodes(
    nodes: set, codeo, CENs, Imps, indexes, ParentO, funcdefs, classdefs, libo
):
    nodes_tmp = copy.copy(nodes)
    stack = copy.copy(nodes)
    history = set()
    names = set()

    while True:
        if len(stack) == 0:
            break

        target = stack.pop()

        if target == None or target in history:
            continue
        history.add(target)
        # print(ast.unparse(target), 'target')

        NEC = call.NameExtractor(check1=True, libo=libo)

        if isinstance(target, ast.Assign):
            for t in target.targets:
                if isinstance(t, ast.Subscript):
                    NEC.visit(t)
                    names = names | set(NEC.list)

                if isinstance(t, ast.Attribute):
                    NEC = call.NameExtractor(
                        check=True, check1=True, libo=libo
                    )  # app.secret_key = ~
                    NEC.visit(t)

                    # print(names, 'names')

                    for name in NEC.list:
                        # print(name, 'name')
                        if "self." not in name:
                            names.add(name)

            NEC = call.NameExtractor(check1=True, libo=libo)
            NEC.visit(target.value)
            names = names | set(NEC.list)

        else:
            for node in ast.walk(target):
                # Need node로 추가되면 안되는 경우들
                if isinstance(node, ast.Assign):
                    # print(ast.unparse)
                    # print(ast.unparse(node), 'assign', names)

                    for t in node.targets:
                        # print(ast.unparse(t), 'tt')
                        if isinstance(t, ast.Subscript):
                            NEC = call.NameExtractor(check1=True, libo=libo)
                            NEC.visit(t)
                            names = names | set(NEC.list)

                        if isinstance(t, ast.Attribute) and not "self" in ast.unparse(
                            t
                        ):
                            NEC = call.NameExtractor(check=True, check1=True, libo=libo)
                            NEC.visit(t)
                            names = names | set(NEC.list)

                    # print(names, 'namessss')

                    NEC = call.NameExtractor(check1=True, libo=libo)
                    NEC.visit(node.value)
                    names = names | set(NEC.list)

                elif isinstance(node, ast.AnnAssign):
                    if isinstance(node.target, ast.Subscript):
                        NEC = call.NameExtractor(check1=True, libo=libo)
                        NEC.visit(node.target)
                        names = names | set(NEC.list)

                    if isinstance(node.target, ast.Attribute):
                        NEC = call.NameExtractor(check=True, check1=True, libo=libo)
                        NEC.visit(node.target)
                        names = names | set(NEC.list)

                    if node.value != None:
                        NEC.visit(node.value)
                        names = names | set(NEC.list)

                elif type(node) in [
                    ast.FunctionDef,
                    ast.AsyncFunctionDef,
                    ast.ClassDef,
                    ast.If,
                    ast.For,
                    ast.AsyncFor,
                    ast.While,
                    ast.Try,
                    ast.Module,
                ]:

                    cond2 = isinstance(node, ast.If) or isinstance(node, ast.While)
                    cond3 = isinstance(node, ast.For) or isinstance(node, ast.AsyncFor)
                    cond4 = isinstance(node, ast.With) or isinstance(
                        node, ast.AsyncWith
                    )

                    node_copy = None

                    if cond2:
                        node_copy = node.test
                    elif cond3:
                        node_copy = node.iter
                    elif cond4:
                        node_copy = node.items[0]  # Assume only one withitem exists

                    try:
                        NEC = call.NameExtractor(check1=True, libo=libo)
                        NEC.visit(node_copy)
                        names = names | set(NEC.list)

                    except:
                        pass

                elif type(node) in [ast.With, ast.AsyncWith]:
                    for item in node.items:
                        NEC = call.NameExtractor(check1=True, libo=libo)
                        NEC.visit(item)
                        names = names | set(NEC.list)

                elif type(node) in stmt_type:
                    Cparent = call.FindCParent(ParentO, node)
                    cond1 = (
                        isinstance(Cparent, ast.ClassDef)
                        and (Cparent.name in ast.unparse(node))
                        and ("super" in ast.unparse(node))
                    )  # super().__init__

                    if not cond1:
                        NEC.visit(node)
                        names = names | set(NEC.list)

                elif isinstance(node, ast.ListComp) or isinstance(node, ast.SetComp):
                    for c in node.generators:
                        NEC = call.NameExtractor(check1=True, libo=libo)
                        NEC.visit(c.target)
                        names = names - set(NEC.list)
                    break

                else:
                    pass

                # If function arg... no names - args
                Fparent = call.FindFParent(ParentO, node)
                # print(ast.unparse(node), names)
                if isinstance(Fparent, ast.FunctionDef) or isinstance(
                    Fparent, ast.AsyncFunctionDef
                ):
                    # print(Fparent.name, 'Fparent')
                    NEC4A = call.NameExtractor(check1=True, libo=libo)
                    NEC4A.visit(Fparent.args)
                    names = names - set(NEC4A.list)
                # print(names, 'names')

        names = names - CENs - Imps
        # print(nodes, 'nodes')
        # print(names, 'namess')

        if type(target) in [
            ast.FunctionDef,
            ast.AsyncFunctionDef,
            ast.ClassDef,
            ast.If,
            ast.For,
            ast.AsyncFor,
            ast.While,
            ast.Try,
            ast.With,
            ast.AsyncWith,
        ]:
            FCP = call.FindSSParent(ParentO, target, 2)
        else:
            FCP = call.FindSSParent(ParentO, target, 1)

        while True:
            try:
                index = indexes[FCP]
            except:
                index = None

            if isinstance(FCP, ast.AsyncFunctionDef) or isinstance(
                FCP, ast.FunctionDef
            ):
                NEC4A = call.NameExtractor(check1=True, libo=libo)
                NEC4A.visit(FCP.args)

                for decorator in FCP.decorator_list:
                    NEC4D = call.NameExtractor(check1=True, libo=libo)
                    NEC4D.visit(decorator)
                    names = names | set(NEC4D.list)

                names = names - set(NEC4A.list)
                nodes, names = find_need_case(
                    FCP, names, nodes, index, classdefs, funcdefs, libo, target
                )

            elif isinstance(FCP, ast.ClassDef):
                # print(FCP, 'FCP', FCP.name)
                init = FCTuple(FCP)
                if not isinstance(init, ast.ClassDef):
                    nodes.add(init)
                nodes, names = find_need_case(
                    FCP, names, nodes, index, classdefs, funcdefs, libo, target
                )

            elif isinstance(FCP, ast.For) or isinstance(FCP, ast.AsyncFor):
                NEC4I = call.NameExtractor(check1=True)
                NEC4I.visit(FCP.iter)
                names = names | set(NEC4I.list)
                nodes, names = find_need_case(
                    FCP, names, nodes, index, classdefs, funcdefs, libo, target
                )

            elif isinstance(FCP, ast.While) or isinstance(FCP, ast.If):
                NEC4T = call.NameExtractor(check1=True)
                NEC4T.visit(FCP.test)
                names = names | set(NEC4T.list)
                nodes, names = find_need_case(
                    FCP, names, nodes, index, classdefs, funcdefs, libo, target
                )

            elif isinstance(FCP, ast.With) or isinstance(FCP, ast.AsyncWith):
                for item in FCP.items:
                    NEC4I = call.NameExtractor(check1=True)
                    NEC4I.visit(item)
                    names = names | set(NEC4I.list)

                nodes, names = find_need_case(
                    FCP, names, nodes, index, classdefs, funcdefs, libo, target
                )

            elif isinstance(FCP, ast.Try):
                # 만약에 Excepthandler가 있으면 거기안에있는 Stmt 다 돌아야하고
                if isinstance(target, ast.ExceptHandler):
                    nodes.add(FCP)
                    nodes, names = find_need_case(
                        FCP, names, nodes, index, classdefs, funcdefs, libo, target
                    )
                else:
                    pass

            elif isinstance(FCP, ast.Module) or FCP == None or len(names) == 0:
                FCP = codeo
                nodes, names = find_need_case(
                    codeo, names, nodes, index, classdefs, funcdefs, libo, target
                )
                break

            else:
                break  # This doesn't happen

            FCP = call.FindSSParent(ParentO, FCP, 2)

        stack = ((nodes - nodes_tmp - history) | stack) - {None}

    # print(nodes, 'nodes')
    return nodes


# Main: Reomove Context of the given nodes
def remove_context(
    OCNs: dict,
    codeo: ast.AST,
    apio,
    ParentO,
    libo,
    libn,
    funcdefs,
    classdefs,
    blank=False,
):
    nodes_final = set()
    nodes = set()

    CENs = {
        "str",
        "ast",
        "os",
        "json",
        "sys",
        "__salt__",
        "len",
        "ValueError",
        "int",
        "float",
        libo,
        libn,
        "super",
        "range",
        "type",
        "AssertionError",
        "open",
        "all",
        "list",
        "isinstance",
        "Exception",
        "self",
        "bool",
        "bytes",
        "abort",
        "kwargs",
        "globals",
        "zip",
        "dict",
        "map",
        "max",
        "PermissionError",
        "enumerate",
        "__name__",
        "__file__",
        "ImportError",
        "IOError",
        "local",
        "lcd",
        "any",
        "IndexError",
        "print",
        "urllib",
        "set",
    }
    indexes = None

    VEC = synthesis.VarExtractor()
    VEC.visit(codeo)
    Imps = VEC.imports
    targets = set()  # Real api related nodes only

    if apio in OCNs.keys():
        for OCN in OCNs[apio]:
            # 1. Mark the targeted node
            if isinstance(OCN, tuple):  # classbase | decorator | handler
                if OCN[2] == "classbase":
                    nodes.add(FCTuple(OCN[0]))
                    targets.add(OCN[0])  # Add Class

                elif OCN[2] == "decorator":
                    # Only leave the target decorator
                    if OCN[0] in nodes:
                        OCN[0].decorator_list.append(OCN[1])
                        nodes.add(OCN[1])
                        targets.add(OCN[1])  # Add Function ... CLass...

                    else:
                        OCN[0].decorator_list = [OCN[1]]
                        nodes.add(OCN[0])
                        nodes.add(OCN[1])

                        targets.add(OCN[1])

                else:
                    nodes.add(OCN[0])

                    targets.add(OCN[0])  # Add ExceptHandler

            elif isinstance(OCN, ast.arg):
                fp = call.FindFParent(ParentO, OCN)
                nodes.add(fp)

            else:  # Usual Nodes
                nodes.add(OCN)
                OCN = call.FindRealParent(ParentO, OCN, 1)
                nodes.add(OCN)

                targets.add(OCN)

                indexes = index_info(ParentO, OCN)

                # 2. Mark the Use Case related to targeted node
                if isinstance(OCN, ast.Assign):
                    targets = set()
                    for target in OCN.targets:
                        if isinstance(target, ast.Name):
                            targets.add(target.id)

                        if isinstance(target, ast.Tuple):
                            for elt in target.elts:
                                if isinstance(elt, ast.Name):
                                    targets.add(elt.id)

                        if (
                            isinstance(target, ast.Attribute)
                            and isinstance(target.value, ast.Name)
                            and "self" in target.value.id
                        ):
                            targets.add("self." + target.attr)

                    targets = targets - CENs - Imps
                    OCN_copy = OCN
                    FCP = call.FindSSParent(ParentO, OCN, 1)

                    while True:
                        UseCase, targets = find_use_case(
                            FCP, targets, indexes[FCP], libo
                        )

                        if UseCase != None:
                            # print(targets, ast.unparse(UseCase))
                            nodes.add(UseCase)

                        if (len(targets) == 0) or (
                            FCP == None or isinstance(FCP, ast.Module)
                        ):
                            break

                        OCN_copy = FCP
                        FCP = call.FindSSParent(ParentO, OCN_copy, depth=2)

            # 3. Mark the needed nodes for the targeted nodes with fixed point
            nodes = need_nodes(
                nodes, codeo, CENs, Imps, indexes, ParentO, funcdefs, classdefs, libo
            )
            nodes_final = nodes | nodes_final
            # print(nodes, 'nodes')

    # 4. Remove the context which are not in targets
    if blank:
        # Add targets
        CR = ContextRemover(nodes_final, blank=blank)

    else:
        CR = ContextRemover(nodes_final, blank=blank)
    codea = CR.visit(codeo)

    # 5. Fill Pass | AutoFlake
    codea = fillpass(codea)
    codea = autoflake.fix_code(
        (ast.unparse(ast.fix_missing_locations(codea))), remove_all_unused_imports=True
    )
    return ast.parse(codea)


if __name__ == "__main__":
    path = os.path.abspath(os.getcwd()) + "/benchmarks"
    file_list_json = [file for file in os.listdir(path) if file.endswith(".json")]

    for j in file_list_json:
        if j != "265.json":
            continue
        print("File in progress: ", j)

        with open(path + "/" + j) as f:
            data = json.load(f)
            fileb, filea = open(path + "/" + data["bef_file"], "r"), open(
                path + "/" + data["aft_file"], "r"
            )
            codeb, codea = fileb.read(), filea.read()

            libo, libn = data["libo"], data["libn"]
            apios = list(data["apio"])

            for apio in apios:
                if apio != "match":
                    continue
                root = ast.parse(codeb)
                ParentO = call.ParentAst(root)
                CPO = call.Preparation([], apios=[apio])
                CPO.visit(root)
                OCNs = CPO.nodes

                funcdefs = CPO.funcdefs
                classdefs = CPO.classdefs

                r = clean(root)
                t = remove_context(
                    OCNs, r, apio, ParentO, libo, libn, funcdefs, classdefs
                )
                print("===========" * 3, apio, "===========" * 3)
                print(ast.unparse(t))
