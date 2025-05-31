# Based On old node and new node, extract the api migrating pattern due to LLM's frequent omitting lines

"""
Examples

# Example1
nodeo: app.route('/', methods = ['GET'])
noden: app.route('/', methods = ['GET'])

>>> old and new are exactly same

# Example2
nodeo: parser.add_argument('-u', '--username', help='Username', required=False)
noden: parser.add_argument("-u", "--username", help="Username")

>>> old and new are similar, but the old one has more arguments

# Exmample3
nodeo: parser.add_argument("-u", "--username", help="Username")
nodn: parser.add_argument("-u", "--username", help="Username", required=False)

>>> old and new are similar, but the new one has more arguments

Based on the apttern extracted, we can create new node for the old node which failed matching due to the LLM's frequent omitting lines


>> 당연히 얘는 같은 ast 구조를 지닌 애들에서만 가능함

생각해보니까 이러면 stmt 단위가 아니라 call 단위로 그거 봐야되네...막apicall 이 그 안에 있는그런거...뭔느알?

"""


"""
실제로 이식할때는 
모든 라인 다 매칭하고
추가변수까지 다 만들고
매칭 안 되는거에 대해서
다시 돌기

근데 그럼 custom matching 하는거 우짜징?
음....걍뺼까 


1. 커스텀 매칭
2. 패턴 매칭 ㅍ
3. 이식기에 매칭
"""


import ast
from typing import Union
from stmt_types import expr
from matching import matcher
import llm_pre


def only_expr(
    node,
    codeb: str,
    codea: str,
    roota,
    rooto,
    libo,
    libn,
    ParentO=None,
    ParentN=None,
    api=None,
    add_node=None,
):
    # Find the smallest original node
    if isinstance(node, ast.Module):
        node = node.body[0]

    if add_node != None:
        # For New Node
        _, matched_node = matcher(codeb, codea, add_node, roota, rooto)

        if matched_node == None:
            matched_node, _ = llm_pre.MatchName(
                add_node, roota, ParentO, ParentN, {}, False, False, libo, libn
            )
            # print(ast.unparse(matched_node), "matched_node")
            return matched_node

        else:
            return matched_node

    else:
        current = node
        tmp = current

        while True:
            if api not in ast.unparse(current):
                break

            if isinstance(current, (ast.Call)):
                if api in ast.unparse(current.func):
                    return current

                else:
                    for arg in current.args:
                        if api in ast.unparse(arg):
                            tmp = current
                            current = arg
                            break

                    else:
                        for kw in current.keywords:
                            if api in ast.unparse(kw):
                                tmp = current
                                current = kw.value
                                break

            elif isinstance(current, ast.Attribute):
                tmp = current
                current = current.value

            elif isinstance(current, (ast.Expr, ast.Assign)):
                tmp = current
                current = current.value

            elif isinstance(current, ast.Return):
                tmp = current
                current = current.value

            else:
                print(type(node), "not supported1")
                break

        return tmp


def find_call(node):
    while True:
        if isinstance(node, ast.Call):
            return node

        elif isinstance(node, ast.Attribute):
            node = node.value

        else:
            return None


def find_keyword(kw_lst: list[ast.keyword], target):
    for kw in kw_lst:
        if kw.arg == target:
            return kw.value

    return None


def new_node_create(nodeo, arg_pattern, name_patterns):
    args = []
    kwargs = []

    _nodeo = find_call(only_expr(nodeo))

    if _nodeo != None:
        # dealing with arg_pattern
        _args = sorted(arg_pattern["args"], key=lambda x: x[1])
        for arg in _args:
            indexo, indexn, typ = arg
            args.append(_nodeo.args[indexo])

        for kwarg in arg_pattern["keywords"]:
            _, _, kwnameo, kwnamen, typ = kwarg
            kwargs.append(
                ast.keyword(arg=kwnamen, value=find_keyword(_nodeo.keywords, kwnameo))
            )

    if name_patterns[-1][0] != ast.Name:
        # If the last node is not Name, then it is not a function call
        print("Not a function call")
        return

    # Making fnamens
    for name_pattern in reversed(name_patterns):
        typ = name_pattern[0]

        if typ == ast.Call:
            new_name = ast.Call(
                func=new_name,
                args=args,
                keywords=kwargs,
            )

        elif typ == ast.Attribute:
            new_name = ast.Attribute(
                value=new_name,
                attr=name_pattern[1],
                ctx=ast.Load(),
            )

        elif typ == ast.Name:
            # Very first start point
            new_name = ast.Name(id=name_pattern[1], ctx=ast.Load())

        else:
            print(type(typ), "not supported2")

    return new_name


def extract_arguments_pattern(argso: list, argsn: list, keyword):
    result = list()

    # When keyword has already mappings, then it is not necessary to check
    def find_keyword(argso: list[ast.keyword], argsn: list[ast.keyword]):
        pass_kwarg = set()

        for argo in argso:
            for argn in argsn:
                if argo.arg == argn.arg:
                    pass_kwarg.add(argo.arg)

                    # Record it into result
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append(
                        (indexo, indexn, argo.arg, argn.arg, type(argo.value))
                    )

        return pass_kwarg

    if keyword == False:
        for argo in argso:
            for argn in argsn:
                # argument can be ast.Name
                if isinstance(argo, ast.Name) and isinstance(argn, ast.Name):
                    if argo.id == argn.id:
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, ast.Name))

                    else:
                        # Additional variables?
                        # Will be added...
                        pass

                # argument can be ast.Constant
                elif isinstance(argo, ast.Constant) and isinstance(argn, ast.Constant):
                    if argo.value == argn.value:
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, ast.Constant))

                elif isinstance(argo, ast.List) and isinstance(argn, ast.List):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, ast.List))

                elif isinstance(argo, ast.Tuple) and isinstance(argn, ast.Tuple):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, ast.Tuple))

                elif isinstance(argo, ast.Subscript) and isinstance(
                    argn, ast.Subscript
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, ast.Subscript))

                elif isinstance(argo, ast.JoinedStr) and isinstance(
                    argn, ast.JoinedStr
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, ast.JoinedStr))

                # argo가 ast.Expr, ast.Call ... 인 경우에는 지들끼리 매칭이 되어야 함?
                elif isinstance(argo, ast.Call) and isinstance(argn, ast.Call):
                    # Strenghted Version
                    if ast.unparse(argo) == ast.unparse(argn):
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, ast.Call))
                    else:
                        # Will be added... When arguments are differently defined but same...
                        print(type(argo), type(argn), "not supported2")

                elif isinstance(argo, ast.Attribute) and isinstance(
                    argn, ast.Attribute
                ):
                    # Strenghted Version
                    if ast.unparse(argo) == ast.unparse(argn):
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, ast.Attribute))
                    else:
                        # Will be added... When arguments are differently defined but same...
                        print(type(argo), type(argn), "not supported3")

                else:
                    # Will be added...
                    print(type(argo), type(argn), "not supported3")

    else:
        history = find_keyword(argso, argsn)
        # keyword arguments
        for argo in argso:
            # Pass
            if argo.arg in history:
                continue

            for argn in argsn:

                # Type Annotation
                argo: ast.keyword
                argn: ast.keyword

                # argo and argn would be ast.keyword
                if isinstance(argo.value, ast.Name) and isinstance(
                    argn.value, ast.Name
                ):
                    if argo.value.id == argn.value.id:
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, argo.arg, argn.arg, ast.Name))

                elif isinstance(argo.value, ast.Constant) and isinstance(
                    argn.value, ast.Constant
                ):
                    if argo.value.value == argn.value.value:
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append(
                            (indexo, indexn, argo.arg, argn.arg, ast.Constant)
                        )

                elif isinstance(argo.value, ast.List) and isinstance(
                    argn.value, ast.List
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, argo.arg, argn.arg, ast.List))

                elif isinstance(argo.value, ast.Tuple) and isinstance(
                    argn.value, ast.Tuple
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, argo.arg, argn.arg, ast.Tuple))

                elif isinstance(argo.value, ast.Subscript) and isinstance(
                    argn.value, ast.Subscript
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, argo.arg, argn.arg, ast.Subscript))

                elif isinstance(argo.value, ast.JoinedStr) and isinstance(
                    argn.value, ast.JoinedStr
                ):
                    # More weakened version
                    indexo = argso.index(argo)
                    indexn = argsn.index(argn)

                    result.append((indexo, indexn, argo.arg, argn.arg, ast.JoinedStr))

                # argo가 ast.Expr, ast.Call ... 인 경우에는 지들끼리 매칭이 되어야 함?
                elif isinstance(argo.value, ast.Call) and isinstance(
                    argn.value, ast.Call
                ):
                    # Strenghted Version
                    if ast.unparse(argo) == ast.unparse(argn):
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append((indexo, indexn, argo.arg, argn.arg, ast.Call))
                    else:
                        # Will be added... When arguments are differently defined but same...
                        print(type(argo), type(argn), "not supported2")

                elif isinstance(argo.value, ast.Attribute) and isinstance(
                    argn.value, ast.Attribute
                ):
                    # Strenghted Version
                    if ast.unparse(argo) == ast.unparse(argn):
                        indexo = argso.index(argo)
                        indexn = argsn.index(argn)

                        result.append(
                            (indexo, indexn, argo.arg, argn.arg, ast.Attribute)
                        )
                    else:
                        # Will be added... When arguments are differently defined but same...
                        print(type(argo), type(argn), "not supported3")

                # elif isinstance(argo)

                else:
                    # Will be added...
                    print(type(argo.value), type(argn.value), "not supported4")

    return result


def extract_api_name_pattern(node: Union[ast.Call, ast.Attribute]):
    result = list()

    while True:

        if isinstance(node, ast.Call):
            result.append((ast.Call, None))
            node = node.func

        elif isinstance(node, ast.Attribute):
            result.append((ast.Attribute, node.attr))
            node = node.value

        elif isinstance(node, ast.Name):
            result.append((ast.Name, node.id))
            break

        else:
            print(type(node), "not supported5")
            break

    return result


class ExtractPattern(ast.NodeVisitor):
    def __init__(self, noden):
        self.noden = noden
        self.has_await = False  # In new node, await existed. But not in the old node.
        self.del_await = False  # In old node, await existed. But not in the new node.
        self.arguments = {"args": list(), "keywords": list()}  # Extracted arguments
        self.fnameo = list()  # Extracted function name from old node
        self.fnamen = list()  # Extracted function name from new node

        self.result = True  # If the old and new nodes are exactly having same ast structure, then result is True

    def visit_Name(self, nodeo: ast.Name):
        if isinstance(self.noden, ast.Name):
            self.fnameo = [(ast.Name, nodeo.id)]
            self.fnamen = [(ast.Name, self.noden.id)]

        else:
            # nodeo is Name but noden is not
            self.result = False

    def visit_Await(self, nodeo: ast.Await):
        if isinstance(self.noden, ast.Await):
            # Both old and new nodes are Await
            self.noden = self.noden.value

        else:
            # nodeo is await but noden is not
            self.del_await = True

        self.visit(nodeo.value)

    def visit_Call(self, nodeo: ast.Call):
        if isinstance(self.noden, ast.Call):
            # Extract argument patterns
            self.arguments["args"] = extract_arguments_pattern(
                nodeo.args, self.noden.args, False
            )
            self.arguments["keywords"] = extract_arguments_pattern(
                nodeo.keywords, self.noden.keywords, True
            )

            # Extract function name
            self.fnameo = extract_api_name_pattern(nodeo)
            self.fnamen = extract_api_name_pattern(self.noden)

        else:
            self.result = False

    def visit_Attribute(self, node):
        # Case where node consists of only attribute
        if isinstance(self.noden, ast.Attribute):
            self.fnameo = extract_api_name_pattern(node)
            self.fnamen = extract_api_name_pattern(self.noden)


if __name__ == "__main__":
    # Example1
    nodeo = ast.parse("app.route('/', methods = ['GET'])")
    noden = ast.parse("app.route('/', method = ['GET'])")

    print(ast.unparse(nodeo), "nodeo")
    print(ast.unparse(noden), "noden")

    # # Example2
    # nodeo = ast.parse(
    #     "parser.add_argument('-u', '--username', help='Username', required=False)"
    # )
    # noden = ast.parse("parser.add_argument('-u', '--username', help='Username')")

    # # Example3
    # nodeo = ast.parse("parser.add_argument('-u', '--username', help='Username')")
    # noden = ast.parse(
    #     "parser.add_argument('-u', '--username', help='Username', required=False)
    # )

    # Example4: Not a Call
    # nodeo = ast.parse("request.method")
    # noden = ast.parse("request.method")

    # Example 5: Call
    # nodeo = ast.parse("self.db.Put(key, value)")
    # noden = ast.parse("self.db.put(value, key)")

    # # Example 6: Call but additional argument
    # nodeo = ast.parse("self.db.Put(key1, value1)")
    # noden = ast.parse("self.db.put(key1, value1, key2)")

    # 일단 지금은 서로 없는 거는 안 건드리는 걸루. 어차피 필요 없다고 생각 (근데 나중에 추가 변수 필요한 경우 있으면 보강하지 머)

    tst_cls = ExtractPattern(only_expr(noden))
    tst_cls.visit(only_expr(nodeo))

    print("Arguments: ", tst_cls.arguments)
    print("Function Name Old: ", tst_cls.fnameo)
    print("Function Name New: ", tst_cls.fnamen)

    _nodeo = only_expr(ast.parse("app.route('/hello', methods = ['GET'])"))
    print(
        ast.unparse(
            new_node_create(
                _nodeo,
                tst_cls.arguments,
                tst_cls.fnameo,
            )
        ),
        "New Node",
    )
