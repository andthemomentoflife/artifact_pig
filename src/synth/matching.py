"""
This file is used to match the target ast node with the new ast node
Input: target node, LLM Code
Output: matched ast node
"""

import ast, jpype
from jpype.types import *
from pathlib import Path

try:
    from stmt_types import single_stmt, expr
except:
    from .stmt_types import single_stmt, expr

try:
    from synth import call, llm_pre, matching
    from llm import context_remover_refactor
    from llm.mapping_gpt import ExtractLLM, prepare

except:
    import sys

    sys.path.append(str(Path(__file__).parents[1]))
    from synth import call, llm_pre, matching
    from llm import context_remover_refactor
    from llm.mapping_gpt import ExtractLLM, prepare

from typing import Union

from synth import *


def node_minimize(node):
    if isinstance(node, (ast.For, ast.AsyncFor)):
        node = node.iter
    elif isinstance(node, (ast.While, ast.If)):
        node = node.test
    else:
        pass

    return node


def filter_stmt(noden, nodeo, apins: dict, rootn, apio) -> bool:
    if ast.unparse(noden) == ast.unparse(nodeo) and apio == "get":
        return True

    # if apio is called as an constant, just return True
    for n in ast.walk(nodeo):
        if isinstance(n, ast.Constant):
            if n.s == apio:
                return True
            
    nameso = set()
    for n in ast.walk(nodeo):
        if isinstance(n, ast.Name) and isinstance(n.ctx, ast.Load):
            nameso.add(n.id)
        elif isinstance(n, ast.Attribute):
            if isinstance(n.value, ast.Name) and n.value.id == "self":
                nameso.add(n.attr)
            else:
                nameso.add(n.attr)

    # Extract all names from the node
    names = set()
    parent = call.ParentAst(rootn)
    selfs = set()

    for n in ast.walk(noden):
        if isinstance(n, ast.Name) and isinstance(n.ctx, ast.Load):
            names.add(n.id)
        # elif isinstance(n, ast.Constant):
        #     names.add(n.s)
        elif isinstance(n, ast.Attribute):
            if isinstance(n.value, ast.Name) and n.value.id == "self":
                selfs.add(n.attr)

            else:
                names.add(n.attr)

        elif isinstance(n, ast.operator):
            names.add("__truediv__")

    # Case of Importing using as ~
    for n in ast.walk(rootn):
        if isinstance(n, ast.ImportFrom):
            for alias in n.names:
                if alias.asname != None and alias.asname in names:
                    names.add(alias.name)

    parentn = (
        call.FindFCParent(parent, noden) if call.FindFCParent(parent, noden) else rootn
    )

    # Remove general assign targets
    for n in ast.walk(parentn):
        if isinstance(n, ast.Assign):
            for target in n.targets:
                if isinstance(target, ast.Name) and target.id in names:
                    names.remove(target.id)

                if isinstance(target, ast.Tuple):
                    for t in target.elts:
                        if isinstance(t, ast.Name) and t.id in names:
                            names.remove(t.id)

        elif isinstance(n, ast.arg):
            if n.arg in names:
                names.remove(n.arg)

    for _, api_lst in apins.items():
        for apis in api_lst:
            for api, _ in apis:
                if api in names:
                    return True

    return False


def decide_winner(vote_dict: dict):
    # 최다 득표 수 고르기
    max_votes = max(vote_dict.values())

    # max_votses에 해당하는 후보들
    candidates = [cid for cid, votes in vote_dict.items() if votes == max_votes]

    # 후보가 1명인 경우
    if len(candidates) == 1:
        winner_id = candidates[0]
        decision = "Winner"

    else:
        decision = "No decision"
        winner_id = None

    # 결과 구성
    result = {
        "winner": winner_id,
        "decision": decision,
    }

    return result


def notstmt(node: ast.AST, apio) -> bool:
    if isinstance(node, ast.ExceptHandler) and node.type != None:
        return (node, node)
    if (
        isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef))
        and node.returns != None
        and apio in ast.unparse(node.returns)
    ):
        return (node.returns, node.returns)

    # if isinstance(node, (ast.With, ast.AsyncWith)):
    #     return (node.items[0].context_expr, node.items[0].context_expr)

    return (node, node)


def list_of_nodes(root: ast.Module):
    nodes = set()
    for node in ast.walk(root):
        nodes.add(node)
    return nodes


def mod_node(node: ast.AST) -> ast.AST:
    if isinstance(node, ast.ExceptHandler):
        return ast.Try(body=[ast.Pass()], handlers=[node], orelse=[], finalbody=[])

    return node


# Return variable mappings between two asts
def total_mappings(
    rooto: ast.AST,
    rootn: ast.AST,
    codea: str,
    parento,
    mapping: dict[
        tuple[str, str], set[str]
    ],  # key: tuple of old variable name and scope name val: set of new variable names
    libo: str,
    libn: str,
    oldapi: str,
    nodeo=None,
    noden=None,
    name1=None,
    name2=None,
) -> dict[str:str]:
    def check(val):
        # import libo as ~
        for node in ast.walk(rooto):
            if isinstance(node, ast.Import):
                for alias in node.names:
                    if alias.asname != None and llm_pre.libname(
                        alias.name
                    ) == llm_pre.libname(libo):
                        return False

        for node in ast.walk(rootn):
            if isinstance(node, ast.Import):
                for alias in node.names:
                    # If value is imported something...
                    if alias.asname != None and alias.asname == val:
                        return False

        if (
            (key == oldapi)
            or (val == oldapi)
            or (val == libo)
            or (libo == llm_pre.libname(val))
            or (val == llm_pre.libname(libo))
            or (llm_pre.libname(val) == llm_pre.libname(libo))
            or val == libn  # Added
            or (val == llm_pre.libname(libn))  # Added
        ):
            return False

        # If value is in already in variable...

        for node in ast.walk(rooto):
            if isinstance(node, ast.Name) and isinstance(
                node.ctx, ast.Store
            ):  # Scope 추가
                if node.id == val:
                    return False

            if isinstance(node, ast.arg):
                if node.arg == val:  # Scope 추가
                    return False

        return True

    # Check for nodeo and noden
    if (nodeo != None) and (noden != None) and (name1 != None) and (name2 != None):
        # 노드에서 매칭된거는 함수명 바껴도 어차피...
        _mappings = llm_pre.extract_var_map(
            nodeo, noden, rooto, rootn, parento, b0=True
        )

        for key, val in _mappings.items():
            if check(val) and (key != llm_pre.libname(libo)):  # 283.json qwen44
                try:
                    mapping[(key, name1)].add(val)
                except:
                    mapping[(key, name1)] = {val}

                try:
                    mapping[(key, name2)].add(val)
                except:
                    mapping[(key, name2)] = {val}

            else:
                pass

    else:
        node_mappings = total_matcher(rooto, codea)

        # Check for all nodes
        for nodeo, noden in node_mappings.items():
            if noden and nodeo:
                if isinstance(nodeo, ast.Assign) and isinstance(noden, ast.Assign):
                    if (
                        isinstance(nodeo.targets[0], ast.Name)
                        and isinstance(noden.targets[0], ast.Name)
                        and len(nodeo.targets) == 1
                        and len(noden.targets) == 1
                    ):
                        name = llm_pre.scope_name(nodeo, noden, parento)

                        if nodeo.targets[0].id != noden.targets[0].id:
                            try:

                                mapping[(nodeo.targets[0].id, name)].add(
                                    noden.targets[0].id
                                )
                            except:
                                mapping[(nodeo.targets[0].id, name)] = {
                                    noden.targets[0].id
                                }

                if ast.unparse(nodeo) == ast.unparse(noden):
                    continue

                elif isinstance(
                    nodeo, (ast.FunctionDef, ast.AsyncFunctionDef)
                ) and isinstance(noden, (ast.FunctionDef, ast.AsyncFunctionDef)):
                    mapping[(nodeo.name, nodeo.name)] = {noden.name}

                else:
                    _mappings = llm_pre.extract_var_map(
                        nodeo, noden, rooto, rootn, parento
                    )

                    name = llm_pre.scope_name(nodeo, noden, parento)

                    for key, val in _mappings.items():

                        if (
                            (key, name) in mapping
                            and check(val)
                            and check(key)
                            and (key != llm_pre.libname(libo) and key != libo)
                        ):
                            mapping[(key, name)].add(val)
                        elif (
                            check(val)
                            and check(key)
                            and (key != llm_pre.libname(libo) and key != libo)
                        ):
                            mapping[(key, name)] = {val}
                        else:
                            pass

    return mapping


# Returns all matched stmt nodes with the new ast
# 아예 쌩 원 본코드 루트 + context removed 된 원본코드 루트 + llm코드 string
def total_matcher(rooto: ast.AST, codea: str) -> dict:
    result = dict()

    _codea = ast.unparse(ast.parse(codea))

    for node in ast.walk(rooto):
        try:
            if ast.unparse(node) in _codea:
                continue
        except:
            pass

        if type(node) in single_stmt:
            target = node

        elif isinstance(node, (ast.For, ast.AsyncFor)):
            target = node.target

        elif isinstance(node, (ast.While, ast.If)):
            target = node.test

        elif isinstance(node, ast.withitem):
            target = node.context_expr

        elif isinstance(node, (ast.AsyncFunctionDef, ast.FunctionDef)):
            target = node

        else:
            continue

        try:
            _, matched_node = matcher(
                ast.unparse(rooto), codea, target, ast.parse(codea), rooto
            )
        except:
            matched_node = None

        try:
            print(ast.unparse(target), "matched node: ", ast.unparse(matched_node))
        except:
            pass

        if matched_node != None and (ast.unparse(target) != ast.unparse(matched_node)):
            if isinstance(
                target, (ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)
            ) and isinstance(
                matched_node, (ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)
            ):
                pass

            else:
                pass
            result[node] = matched_node

    return result


def find_all_indexes(text: str, substring):
    indexes = set()
    start = 0
    while True:
        index = text.find(substring, start)
        if index != -1:
            indexes.add(index)
            start = index + 1

            if start >= len(text):
                break

            continue

        else:
            break

    return indexes


def find_nearest_index(indexes, target_index, end_index):
    if not indexes:
        return None  # or raise an error
    return min(indexes, key=lambda x: abs(x - target_index) + abs(x - end_index))


# This is for comparing two nodoes whether they are same or not
def single_matcher(
    rootb_str: str,
    roota_str: str,
    nodeo: Union[ast.Assign, ast.AnnAssign, ast.AugAssign, ast.Expression],
    result_noden: Union[ast.Assign, ast.AnnAssign, ast.AugAssign, ast.Expression],
    roota,
) -> bool:
    Parent = call.ParentAst(roota)

    # Load Java
    jar_path = Path(__file__).parent.parent.parent / "ours.jar"

    if not (jpype.isJVMStarted()):
        jpype.startJVM(jpype.getDefaultJVMPath(), "-Djava.class.path=%s" % jar_path)

    jpkg = jpype.JPackage("com.github.gumtreediff.client")
    jMatch = jpkg.PMatcher()

    tmp_result = dict()

    depth = 0

    # Try matching for sub expression
    for node in ast.walk(nodeo):
        if isinstance(node, ast.Name) and (node.id) == "self":
            continue

        nodeo_str = ast.unparse(node).strip()
        if nodeo_str == "":
            continue

        try:
            all_indexes = find_all_indexes(rootb_str, nodeo_str)
            start1 = find_nearest_index(
                all_indexes,
                rootb_str.find(ast.unparse(nodeo).strip()),
                rootb_str.find(ast.unparse(nodeo).strip())
                + len(ast.unparse(nodeo).strip()),
            )

            end1 = start1 + len(ast.unparse(nodeo).strip())

            r = jMatch.PMadtcher(rootb_str, roota_str, nodeo_str, start1, end1)

            if len(r) == 0:
                r = jMatch.PMadtcher(
                    rootb_str, roota_str, nodeo_str, start1 + 1, end1 + 1
                )

                if len(r) == 0:
                    r = jMatch.PMadtcher(
                        rootb_str, roota_str, nodeo_str, start1 - 1, end1 - 1
                    )

        except:
            continue

        if len(r) != 0:
            start, end = r[0], r[1]

            # code, start, end
            roota_str = ast.unparse(roota)
            noden = BestMap(roota_str, roota, start, end)

            if noden != None:
                _noden = call.FindRealParent(Parent, noden, 1)

                if (
                    depth == 0
                    and _noden != None
                    and not isinstance(_noden, (ast.Import, ast.ImportFrom))
                ):

                    if _noden == result_noden or ast.unparse(
                        result_noden
                    ) in ast.unparse(_noden):
                        return True

                else:
                    if _noden != None and not isinstance(
                        _noden, (ast.Import, ast.ImportFrom)
                    ):
                        if _noden in tmp_result:
                            tmp_result[_noden] += 1
                        else:
                            tmp_result[_noden] = 1

        depth += 1

        # Pick the most matched node and verify
        if len(tmp_result) != 0:
            result = decide_winner(tmp_result)

            if result["decision"] == "No decision":
                return False

            else:
                noden = result["winner"]
                if _noden == result_noden or ast.unparse(result_noden) in ast.unparse(
                    _noden
                ):
                    return True

                else:
                    return False

        else:
            return False


def matcher1(codea: str, codec: str, valn) -> Union[str, None]:
    target = None

    def find_nearest_index(indexes, target_index, end_index):
        if not indexes:
            return None  # or raise an error

        for index in indexes:
            if index >= target_index and index <= end_index:
                return index

        # print(indexes, target_index, end_index)
        # return min(indexes, key=lambda x: abs(x - target_index) + abs(x - end_index))

    # Load Java

    try:
        tree = ast.parse(codec)

    except:
        print("Error in AST parsing")
        return False
    
    jar_path=   Path(__file__).parent.parent.parent / "ours.jar"

    if not (jpype.isJVMStarted()):
        jpype.startJVM(jpype.getDefaultJVMPath(), "-Djava.class.path=%s" % jar_path)

    jpkg = jpype.JPackage("com.github.gumtreediff.client")
    jMatch = jpkg.PMatcher()

    node_copy = valn

    # Code Modification
    if isinstance(node_copy, (ast.With, ast.AsyncWith)):
        node_copy = node_copy.items[0].context_expr

    tmp_result = dict()
    depth = 0

    # Try matching for sub expression
    for node in ast.walk(node_copy):
        if isinstance(node, ast.Name) and (node.id) == "self":
            continue

        valn_str = ast.unparse(node).strip()
        if valn_str == "":
            continue

        all_indexes = find_all_indexes(codea, valn_str)

        try:
            start1 = find_nearest_index(
                all_indexes,
                codea.find(ast.unparse(valn).strip()),
                codea.find(ast.unparse(valn).strip()) + len(ast.unparse(valn).strip()),
            )
            end1 = start1 + len(ast.unparse(valn).strip())

            r = jMatch.PMadtcher(codea, codec, valn_str, start1, end1)

        except:
            continue

        if len(r) != 0:
            start, end = r[0], r[1]

            # code, start, end
            noden = BestMap(codec, tree, start, end)
            Parent = call.ParentAst(tree)
           

            if noden != None:
                _noden = call.FindRealParent(Parent, noden, 1)

                if (
                    depth == 0
                    and _noden != None
                    and not isinstance(_noden, (ast.Import, ast.ImportFrom))
                ):

                    tmp_result[_noden] = 1
                    break

                else:
                    if _noden != None and not isinstance(
                        _noden, (ast.Import, ast.ImportFrom)
                    ):
                        if _noden in tmp_result:
                            tmp_result[_noden] += 1
                        else:
                            tmp_result[_noden] = 1

            elif noden == None and isinstance(node_copy, ast.Global):
                return codec[start:end]

        depth += 1

    # Pick the most matched node
    if len(tmp_result) != 0:
        result = decide_winner(tmp_result)

        if result["decision"] == "No decision":
            target = False

        else:
            target = result["winner"]

            if isinstance(target, ast.Assign) and isinstance(
                target.targets[0], ast.Name
            ):
                return target.targets[0].id

    else:
        if target != None:
            # Return var mapping!!!!
            if isinstance(target, ast.Assign) and isinstance(
                target.targets[0], ast.Name
            ):
                return target.targets[0].id

    return False

# LLM sometimes divdes variables 
def var_divide(target_node, noden, rootb, roota):
    jar_path = Path(__file__).parent.parent.parent / "ours.jar"

    if not (jpype.isJVMStarted()):
        jpype.startJVM(jpype.getDefaultJVMPath(), "-Djava.class.path=%s" % jar_path)

    jpkg = jpype.JPackage("com.github.gumtreediff.client")
    jMatch = jpkg.PMatcher()

    ParentN = call.ParentAst(roota)
    parent_noden = call.FindSSParent(ParentN, noden)

    codeb = ast.unparse(((rootb)))
    codea = ast.unparse(((roota)))

    # Find the index of node in parent_node
    if hasattr(parent_noden, "body") and noden in parent_noden.body:
        target_body = parent_noden.body
        index = parent_noden.body.index(noden)
    elif hasattr(parent_noden, "orelse") and noden in parent_noden.orelse:
        target_body = parent_noden.orelse
        index = parent_noden.orelse.index(noden)
    elif hasattr(parent_noden, "finalbody") and noden in parent_noden.finalbody:
        target_body = parent_noden.finalbody
        index = parent_noden.finalbody.index(noden)
    else:
        print("No matched node")
        return noden


    if isinstance(noden, ast.Assign):
        value = noden.value
        target_name = noden.targets[0]

        if not isinstance(target_name, ast.Name):
            print("Target is not a Name")
            return noden

        value_str = ast.unparse(value).strip()
        all_indexes = find_all_indexes(codea, value_str)
        start1 = find_nearest_index(
            all_indexes,
            codea.find(value_str),
            codea.find(value_str) + len(value_str),
        )

        if start1 is not None:
            end1 = start1 + len(value_str)

            r = jMatch.PMadtcher(codea, codeb, value_str, start1, end1)

            if len(r) != 0:
                # it is from codeb
                start, end = r[0], r[1]
                tree = ast.parse(codeb)

                # code, start, end | Matched node from the sliced code
                nodeo = BestMap(codeb, tree, start, end)

                parent1 = call.ParentAst(tree)
                 

                if nodeo != None:
                    parent_nodeo = call.FindRealParent(parent1, nodeo, 1)
                    if parent_nodeo != None: 

                        if ast.unparse(target_node) == ast.unparse(parent_nodeo):
                            # Find the first node that uses the noden's target
                            for i in range(index + 1, len(target_body)):
                                for n in ast.walk(target_body[i]):   
                                    if isinstance(n, ast.Name) and n.id == target_name.id:
                                    
                                        if matcher_check(noden, codeb, codea):
                                            noden = target_body[i]
                         
                                        return noden

                else:
                    return noden 

            else:
                return noden
    else:
        return noden


# Check wheter new node is matched with the new node
def matcher_check(noden, codeb: str, codea: str) -> bool:
    jar_path = Path(__file__).parent.parent.parent / "ours.jar"

    if not (jpype.isJVMStarted()):
        jpype.startJVM(jpype.getDefaultJVMPath(), "-Djava.class.path=%s" % jar_path)

    jpkg = jpype.JPackage("com.github.gumtreediff.client")
    jMatch = jpkg.PMatcher()

    codeb = ast.unparse(ast.fix_missing_locations(ast.parse(codeb)))
    codea = ast.unparse(ast.fix_missing_locations(ast.parse(codea)))

    noden_str = ast.unparse(noden).strip()
    all_indexes = find_all_indexes(codea, noden_str)
    start1 = find_nearest_index(
        all_indexes,
        codea.find(noden_str),
        codea.find(noden_str) + len(noden_str),
    )

    if start1 is not None:
        end1 = start1 + len(noden_str)
        r = jMatch.PMadtcher(codea, codeb, noden_str, start1, end1)

        if len(r) != 0:
            start2 = r[0]
            end2 = r[1]
            code_str = codea[start2:end2]

            try:
                tree = ast.parse(code_str)
                return False

            except:
                return True
            return False

    return True


def matcher(
    rootb_str: str,
    roota_str: str,
    nodeo,
    roota,
    rooto,
    dec=False,
    api=None,
    gumtree=True,
):
    Parent = call.ParentAst(roota)

    # Load Java
    if gumtree:
        jar_path = Path(__file__).parent.parent.parent / "ours.jar"

    else:
        jar_path = Path(__file__).parent.parent.parent / "default.jar"

    if not (jpype.isJVMStarted()):
        jpype.startJVM(jpype.getDefaultJVMPath(), "-Djava.class.path=%s" % jar_path)

    jpkg = jpype.JPackage("com.github.gumtreediff.client")
    jMatch = jpkg.PMatcher()

    node_copy = nodeo

    # Code Modification
    if isinstance(nodeo, (ast.With, ast.AsyncWith)):
        nodeo = nodeo.items[0].context_expr

    tmp_result = dict()

    depth = 0

    # Try matching for sub expression
    for node in ast.walk(nodeo):
        if isinstance(node, ast.Name) and (node.id) == "self":
            continue

        nodeo_str = ast.unparse(node).strip()
        if nodeo_str == "":
            continue

        all_indexes = find_all_indexes(rootb_str, nodeo_str)

        try:
            start1 = find_nearest_index(
                all_indexes,
                rootb_str.find(ast.unparse(nodeo).strip()),
                rootb_str.find(ast.unparse(nodeo).strip())
                + len(ast.unparse(nodeo).strip()),
            )

            end1 = start1 + len(ast.unparse(nodeo).strip())

            r = jMatch.PMadtcher(rootb_str, roota_str, nodeo_str, start1, end1)

        except:
            continue

        if len(r) != 0:
            start, end = r[0], r[1]

            # code, start, end
            noden = BestMap(roota_str, roota, start, end)

            if (
                noden != None
                and isinstance(nodeo, ast.arg)
                and isinstance(noden, ast.arg)
            ):
                # Type Annotation
                return (nodeo.annotation, noden.annotation)

            if noden != None:
                if dec: 
                    _noden = noden

                else:
                    _noden = call.FindRealParent(Parent, noden, 1)

                if (
                    depth == 0
                    and _noden != None
                    and not isinstance(_noden, (ast.Import, ast.ImportFrom))
                ):
                    
                    tmp_result[_noden] = 1
                    depth+=1

                    _noden = node_minimize(_noden)

                    return (nodeo, _noden)

                else:
                    if _noden != None and not isinstance(
                        _noden, (ast.Import, ast.ImportFrom)
                    ):
                        if _noden in tmp_result:
                            tmp_result[_noden] += 1
                        else:
                            tmp_result[_noden] = 1

        else:
            if not gumtree:
                return (nodeo, None)

        if depth == 0 and not gumtree:
            return (nodeo, None)

        depth += 1

    # Pick the most matched node
    if len(tmp_result) != 0:
        result = decide_winner(tmp_result)

        if result["decision"] == "No decision":
            noden = None

        else:
            noden = result["winner"]
            noden = node_minimize(noden)

            if gumtree and isinstance(noden, tuple(single_stmt)): 
                if matcher_check(noden, rootb_str, roota_str):
                    return (nodeo, noden)
                else:
                    return (nodeo, None)

            else:
                return (nodeo, noden)

        return (node_copy, noden)

    else:
        # print("No matched node")
        return (nodeo, None)


def BestMap1(code, tree, start, end) -> ast.AST:
    import asttokens

    try:
        asttokens_obj = asttokens.ASTTokens(code, tree=tree)
        tree = asttokens_obj.tree

    except:
        print("Error in AST tokens")
        return None

    for node in ast.walk(tree):
        if hasattr(node, "first_token") and hasattr(node, "last_token"):
            if node.first_token.startpos == start and node.last_token.endpos == end:
                return node

    print("No matched node")

    return None


def BestMap(code, tree, start, end) -> ast.AST:
    import asttokens

    try:
        asttokens_obj = asttokens.ASTTokens(code, tree=tree)
        tree = asttokens_obj.tree

    except:
        print("Error in AST tokens")
        return None

    for node in ast.walk(tree):
        if hasattr(node, "first_token") and hasattr(node, "last_token"):
            if node.first_token.startpos == start and (
                node.last_token.endpos == end or node.last_token.endpos == end - 1
            ):
                return node

    print("No matched node")

    return None