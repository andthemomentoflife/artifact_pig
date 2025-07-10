import ast, os, json, sys, autoflake
from os import path
from typing import Union
from pathlib import Path
import logging

try:
    from . import call, synthesis, llm_pre, fix_import, matching, stmt_types
except:
    import call, synthesis, llm_pre, fix_import, matching, stmt_types

from synth import *

try:
    from llm.mapping_gpt import ExtractLLM, prepare
    from llm import context_remover_refactor
    from mapping import gits, api_lst
except:
    if __package__ is None:
        sys.path.append(path.dirname(path.dirname(path.abspath(__file__))))
        from llm.mapping_gpt import ExtractLLM, prepare
        from llm import context_remover_refactor
        from mapping import gits, api_lst


# file open should not be changed
def build_in_function_filter(OldApi, Imports, OCN, parent) -> bool:
    # How the oldapi is imported? If directly imported : true else false
    def check(OldApi, Imports) -> bool:
        for i in Imports:
            # if isinstance(OldApi, ast.Import): Ignore this case

            if isinstance(i, ast.ImportFrom):
                for n in i.names:
                    if n.name == OldApi:
                        return True

        return False

    def filter(OCN, OldApi):
        if isinstance(OCN, ast.Name) and OCN.id == OldApi:
            OCN = call.FindExprParent(parent, OCN)

        if (
            isinstance(OCN, ast.Call)
            and isinstance(OCN.func, ast.Name)
            and OCN.func.id == OldApi
        ):
            return True

        return False

    if OldApi != "open":
        return False

    if check(OldApi, Imports):
        return False

    # As target api is indirectly imported, we can filter out the directly called methods
    return filter(OCN, OldApi)


# return edited root with additonal node added, requiredi import stmts (for surnode + main node), whether await
def PreRequired(
    h,
    key,
    val,
    history,
    mappings,
    CENs,
    UnAssignedVarsO,
    ParentO,
    ParentN,
    coden,
    FuncDefs,
    OldApi: str,
    libn: str,
    libo: str,
    apis,
    b_imports: bool,
    b_surround: bool,
    rootb_str: str,
    roota_str: str,
    rooto: ast.AST,
    roota: ast.AST,
    has_dec = False
):
    Vars = synthesis.UnusedVars()
    Vars.visit(h)
    NCImport = set()
    CENs1 = set()

    oVars = synthesis.UnusedVars(libo=llm_pre.libname(libo))
    oVars.visit(h)

    _, UAVs = synthesis.Vars(Vars.assigned, Vars.used)

    if isinstance(val, (ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)):
        FCP = call.FindFCParent(ParentO, val, 2)
    else:
        FCP = call.FindFCParent(ParentO, val)

        if FCP == None:
            FCP = call.FindFCParent(ParentO, key)

    name = context_remover_refactor.nametarget(FCP)

    # Real Variables which should be resolved through Import or Surround Nodes

    target_names = (
        UAVs[name]
        - ((UnAssignedVarsO[name]) - Vars.imports)
        - (CENs - {libn})
        - oVars.imports
        - FuncDefs
    )

    for (old, scope), _ in mappings.items():
        if scope == name and old in target_names:
            target_names = target_names - {old}

    oldapi = None
    assign_oldapi = None

    # What if the new api has same name with the old one?
    for node in ast.walk(val):
        if (
            isinstance(node, ast.Name)
            and node.id == OldApi
            and isinstance(node.ctx, ast.Load)
        ):
            oldapi = OldApi

        if (
            isinstance(node, ast.Name)
            and node.id == OldApi
            and isinstance(node.ctx, ast.Store)
        ):
            assign_oldapi = OldApi

    if oldapi != None and assign_oldapi == None:
        target_names.add(oldapi)


    if len(target_names) != 0:
        # First, Find Unassigned Variables in the New Code (It might be Function or Class or additional variables)

        if isinstance(val, (ast.With, ast.AsyncWith)):
            GPC = call.FindSSParent(ParentO, val, depth=2)
        else:
            GPC = call.FindSSParent(ParentO, val)

        if GPC == None:
            gp = h
        else:
            gp = GPC

        try:
            try:
                ind = context_remover_refactor.bodyindex1(gp, val)
            except:
                ind = context_remover_refactor.bodyindex1(gp, key)

        except:  # if 같은거 저기에 있는...
            New_GPC = call.FindRealParent(ParentO, gp, depth=2)

            if New_GPC == None:
                New_gp = h
            else:
                New_gp = New_GPC

            ind = context_remover_refactor.bodyindex1(New_gp, gp)
            gp = New_gp  # To be checked

        # Which should not be counted as Unassigned Variables
        exceptions = Vars.imports | CENs | FuncDefs | UnAssignedVarsO[name]

        if b_surround:
            # Find For Surround Nodes
            h, SurNodes, remains = synthesis.Surround(
                h,
                key,
                val,
                target_names,
                h,
                gp,
                coden,
                history,
                mappings,
                ind,
                name,
                ParentO,
                ParentN,
                OldApi,
                FuncDefs,
                exceptions,
                libo,
                rootb_str,
                roota_str,
                rooto,
                roota,
            )

        else:
            remains = target_names
            SurNodes = set()

        # Update history['changes'] with SurNodes
        history["changes"] = history["changes"] | SurNodes

        # !!!!!!!!!!!! Second, Find the Import Statements !!!!!!!!!!!
        nodes = SurNodes | {val}

        for remain in remains:  # 이 remains가 제대로 uav를 할지는 감이 안옴
            if b_imports:  # Find the import stmts with PIG
                NCImportmp, CENs1 = fix_import.Importfind(
                    coden, nodes, remain, libo, libn, apis
                )

            else:  # Find the import stmts normally
                NCImportmp, CENs1 = fix_import.Importfind(
                    coden, nodes, remain, libo, libn, apis, check=False
                )

            NCImport = NCImport | NCImportmp
            CENs = CENs1 | CENs

    return (h, NCImport, CENs1, history)


def CENSubs(CENs: set[str], Vars: dict) -> dict:
    for CEN in CENs:
        for _, val in Vars.items():
            if CEN in val:
                val.remove(CEN)

    return Vars


# key: api name(str) value: template(sketch)
def SketchMaker(
    OldApi: str,
    OCNs,
    ParentN: dict,
    ParentO: dict,
    codeo: ast.AST,
    coden: ast.AST,
    libo: str,
    libn: str,
    history: dict[str, dict],
    FuncDefs,
    UnAssignedVarsO,
    CENs,
    OldTree1,
    ParentO1,
    codeo_str: str,
    coden_str: str,
    apis,
    b_imports=True,
    b_varmap=True,
    b_surround=True,
    b_postprocess=True,
    gumtree=True,
) -> ast.AST:
    

    # Variable Extracting
    VarsO = synthesis.VarExtractor()
    VarsN = synthesis.VarExtractor()
    VarsO.visit(codeo)
    VarsN.visit(coden)

    # FuncDefs
    FuncDefs = set(call.FunctionDefs(codeo, ParentO).keys())

    # Basic node list
    temp1 = []
    temp2 = []

    result = dict()

    # Decorator node list
    Dtemp1 = dict()

    dec_to_stmt = dict()

    # Find Import stmts
    NCImport = set()

    HAS_NCNP = False  # True when new api nodes are found
    HAS_DEC = False  # True when decorators should be changed
    HAS_CB = False  # True when class base is found

    nodeo = None
    h = codeo

    mappings = dict()
    del_nodes_cands = set()

    print("=" * 50)
    print("OldApi:", OldApi)

    if OldApi in OCNs.keys():
        for o in OCNs[OldApi]:
            if isinstance(o, ast.ExceptHandler):
                temp1.append(o)

            elif isinstance(o, tuple) and o[2] == "decorator":
                HAS_DEC = True
                Dtemp1[o[1]] = o[0]  # key: : node | func or class node

            elif isinstance(o, tuple) and o[2] == "classbase":
                HAS_CB = True
                temp1.append(o[0])

            elif isinstance(o, tuple) and o[2] == "handler":
                temp1.append(o[0])  # similarity excepthandler itself but

            elif isinstance(o, ast.arg):
                # type_annotation
                temp1.append(o)

            # Just Normal Nodes
            else:
                Imports = [
                    n
                    for n in ast.walk(codeo)
                    if isinstance(n, (ast.Import, ast.ImportFrom))
                ]
                if build_in_function_filter(OldApi, Imports, o, ParentO):
                    continue

                ORP: Union[ast.If, ast.While, ast.For, ast.AsyncFor] = (
                    call.FindRealParent(ParentO, o, 1)
                )
                if type(ORP) in {ast.If, ast.While}:  # If.test | While.test
                    temp1.append(ORP.test)

                elif type(ORP) in {ast.For, ast.AsyncFor}:  # For.iter | AsyncFor.iter
                    temp1.append(ORP.iter)

                else:
                    temp1.append(ORP)

    # Normal Nodes
    for nodeo in temp1:
        if nodeo == None:
            continue

        nodeo, node4match = matching.notstmt(nodeo, OldApi)

        if isinstance(
            node4match,
            (
                ast.FunctionDef,
                ast.AsyncFunctionDef,
                ast.ClassDef,
                ast.ExceptHandler,
            ),
        ):
            NewNode, _ = llm_pre.MatchName(
                nodeo, coden, ParentO, ParentN, mappings, HAS_DEC, HAS_CB, libo, libn
            )

        else:
            MNresult, NewNode = matching.matcher(
                codeo_str, coden_str, node4match, coden, h, api=OldApi, gumtree=gumtree
            )

        if NewNode != None:
            NewNode2 = NewNode
            HAS_NCNP = True
            check = True

            if gumtree:
                check = matching.filter_stmt(NewNode, nodeo, apis, coden, OldApi)

            if check: 
                if isinstance(nodeo, ast.ExceptHandler) and isinstance(
                    NewNode, ast.ExceptHandler
                ):
                    NewNode = NewNode.type
                    result[nodeo.type] = NewNode

                elif isinstance(nodeo, ast.ExceptHandler) and isinstance(
                    NewNode, ast.Try
                ):
                    NewNode = NewNode.handlers[0]
                    result[nodeo] = NewNode

                elif isinstance(nodeo, ast.Name) and isinstance(NewNode, ast.arg):
                    NewNode = NewNode.annotation
                    result[nodeo] = NewNode

                elif isinstance(nodeo, (ast.With, ast.AsyncWith)) and isinstance(
                    NewNode, (ast.With, ast.AsyncWith)
                ):
                    result[nodeo] = NewNode

                else:
                    try:
                        result[MNresult] = NewNode
                    except:
                        result[nodeo] = NewNode

                # recording log for our gumtree
                try:
                    logging.info(f"Ours: {ast.unparse(NewNode)}")
                except:
                    logging.info("Ours: cannot unparse")

                if NewNode not in temp2:
                    temp2.append(NewNode)

            else:
                if gumtree: 
                    NewNode1 = matching.var_divide(nodeo, NewNode, OldTree1, coden)
                
                    if NewNode != NewNode1:
                        try:
                            result[MNresult] = NewNode1
                        except:
                            result[nodeo] = NewNode1

                        try:
                            logging.info(f"Ours: {ast.unparse(NewNode)}")
                        except:
                            logging.info("Ours: cannot unparse")
                        
                    else:
                        del_nodes_cands.add(nodeo)
                        logging.info(f"Deleted Node for: {ast.unparse(nodeo)}")

                else: 
                    try:
                        result[MNresult] = NewNode
                    except:
                        result[nodeo] = NewNode

                    try:
                        logging.info(f"Ours: {ast.unparse(NewNode)}")
                    except:
                        logging.info("Ours: cannot unparse")




        else:
            # NewNode2 = None
            logging.info(
                "Ours: Deleted Nodefor Node %s" % ast.unparse(nodeo) if nodeo else "None",
            )

            del_nodes_cands.add(nodeo)

    # Decorator Nodes
    for key, val in Dtemp1.items():  # node, clsorfunc
        # key: decorator node | func or class node
        _, NewNode = matching.matcher(
            codeo_str, coden_str, key, coden, h, dec=HAS_DEC, gumtree=gumtree
        )

        # Decorator to Decorator
        if NewNode != None and isinstance(NewNode, tuple(stmt_types.expr)):
            HAS_NCNP = True
            HAS_DEC = True
            result[key] = NewNode
            NewNode1 = NewNode
            logging.info("Ours: %s", ast.unparse(NewNode1))

        # Decorator to class or function
        elif NewNode != None and isinstance(NewNode, (ast.ClassDef, ast.FunctionDef)):
            # Simple Implementation Now
            val.body += NewNode.body
            del_nodes_cands.add(key)
        

        # Decorator to other nodes
        elif NewNode != None and not isinstance(NewNode, (ast.ClassDef, ast.FunctionDef, ast.AsyncFunctionDef)):
            if val.name in dec_to_stmt:
                # Find the existing node
                index = val.body.index(dec_to_stmt[val.name][0])
                val.body.insert(index + 1, NewNode)

            else:
                dec_to_stmt[val.name] = tuple([NewNode])
                val.body.insert(0, NewNode)

            del_nodes_cands.add(key)

        else:

            # print("not matched")
            NewNode1 = None
            del_nodes_cands.add(key)
            logging.info("Ours: Deleted Node for")

    # Class Base Nodes
    if HAS_CB and not HAS_DEC:
        result = llm_pre.MatchSim(
            temp1, temp2, OldApi, ParentO, ParentN, typ="classbase"
        )

    ParentO = call.ParentAst(h)
    stack = (
        set()
    )  # Already used for transplanting # 이게 하나에 여러개가 매핑이 되니까 하나 바꿨을때 딴것도 바뀜...

    # ===================================================== Transplant =============================================================
    for key, val in result.items():
        if val == None:
            continue

        if isinstance(key, (ast.ClassDef)) and isinstance(val, (ast.ClassDef)):
            ukey = ast.ClassDef(
                name=key.name,
                bases=key.bases,
                keywords=[],
                decorator_list=key.decorator_list,
                body=[],
                type_params=[],
            )
            uval = ast.ClassDef(
                name=val.name,
                bases=val.bases,
                keywords=[],
                decorator_list=val.decorator_list,
                body=[],
                type_params=[],
            )

            print("Class | key:", ast.unparse(ukey), "| val:", ast.unparse(uval))

        elif isinstance(key, (ast.FunctionDef, ast.AsyncFunctionDef)) and isinstance(
            val, (ast.FunctionDef, ast.AsyncFunctionDef)
        ):
            ukey = ast.FunctionDef(
                name=key.name, args=key.args, decorator_list=key.decorator_list, body=[]
            )
            uval = ast.FunctionDef(
                name=val.name, args=val.args, decorator_list=val.decorator_list, body=[]
            )

            print("Function | key:", ast.unparse(ukey), "| val:", ast.unparse(uval))

        else:

            print("key:", ast.unparse(key), "| val:", ast.unparse(val), key, val)

        name1 = llm_pre.scope_name(key, val, ParentO)
        name2 = llm_pre.scope_name(val, key, ParentN)

        # If the new api is already implemented, skip the transplant
        if key in history["changes"]:
            continue

        # Looking for variable mappings
        if b_varmap:
            mappings = matching.total_mappings(
                h,
                coden,
                ast.unparse(coden),
                ParentO,
                mappings,
                libo,
                libn,
                OldApi,
                nodeo=key,
                noden=val,
                name1=name1,
                name2=name2,
            )  # key: old, val: new

        print("mappings:", mappings)

        # Modify LLM code if needed (var def change)
        if val != None and (not isinstance(val, ast.Name)) and b_varmap:
            _, val, _ = llm_pre.ModDefVars(key, val, mappings, CENs, ParentO, stack)
            MUVC = llm_pre.ModUseVars(mappings, FuncDefs, ParentN)
            val = MUVC.visit(val)

        # Transplant the corresponding node
        if HAS_NCNP:
            if isinstance(
                val, (ast.FunctionDef, ast.AsyncFunctionDef)
            ) and not isinstance(key, (ast.FunctionDef, ast.AsyncFunctionDef)):
                h = synthesis.stmt_to_dec(key, val, h, ParentO, FuncDefs)
                del_nodes_cands.add(key)

            else:
                SSC = synthesis.SynthSame(key, val, history["changes"], ParentO, HAS_CB)
                h = ast.fix_missing_locations(SSC.visit(h))

                result[key] = SSC.NCNP
                history["changes"] = SSC.history

                # Case Where ast.Assign became ast.With
                if SSC.HAS_W:
                    TRC = synthesis.TrimRoot(SSC.W_stmts, SSC.NCNP)
                    h = TRC.visit(h)

        ParentO = call.ParentAst(h)  # Update ParentO as h is changed with SynthSame

        # ========================= Finding Pre-required(Surround) Apis and variables ============================
        ParentO = call.ParentAst(h)
        FuncDefs = set(call.FunctionDefs(h, ParentO).keys())

        (h, NCImportmp, CENs1, history) = PreRequired(
            h,
            key,
            val,
            history,
            mappings,
            CENs,
            UnAssignedVarsO,
            ParentO,
            ParentN,
            coden,
            FuncDefs,
            OldApi,
            libn,
            libo,
            apis,
            b_imports,
            b_surround,
            ast.unparse(OldTree1),
            coden_str,
            OldTree1,
            coden,
        )

        NCImport = NCImport | NCImportmp
        CENs = CENs1 | CENs

        if b_postprocess:
            # ================================== Modify Function with Async ====================================
            ParentO = call.ParentAst(h)  # Update ParentO
            FParent = call.FindFParent(ParentO, val)

            if FParent != None and isinstance(FParent, ast.FunctionDef):
                for new_val in set(history["changes"]) | {val}:
                    if llm_pre.is_async(new_val):
                        AFDC = synthesis.AsyncFD(FParent, True, False)
                        h = AFDC.visit(h)

        history["changes"].add(key)
        history["changes"].add(val)

    for del_node in del_nodes_cands:

        if HAS_DEC:
            h = synthesis.SynthDel(
                [del_node], dict(), dict(), history["changes"], dec=True
            ).visit(h)

        else:
            h = synthesis.SynthDel(
                [del_node], dict(), dict(), history["changes"]
            ).visit(h)

    # ================================================Adding decorators in function or class=================================================
    if HAS_DEC and dec_to_stmt != {} and b_surround:
        ParentO = call.ParentAst(h)
        FuncDefs = set(call.FunctionDefs(h, ParentO).keys())

        key = dec_to_stmt[list(dec_to_stmt.keys())[0]][0]

        (h, NCImportmp, CENs1, history) = PreRequired(
            h,
            None,
            key,
            history,
            mappings,
            CENs,
            UnAssignedVarsO,
            ParentO,
            ParentN,
            coden,
            FuncDefs,
            OldApi,
            libn,
            libo,
            apis,
            b_imports,
            b_surround,
            ast.unparse(OldTree1),
            coden_str,
            OldTree1,
            coden,
            has_dec= True
        )

        NCImport = NCImport | NCImportmp
        CENs = CENs1 | CENs

        

    # ============================================Recording Import history=============================================

    history["import"] = history["import"] | set([ast.unparse(imp) for imp in NCImport])

    return (history, h, CENs)


def FinalSynth(
    history,
    OldTree,
    UnusedVarsO,
    UnAssignedVarsO,
    CENs: set[str],
    FuncDefs,
    libo,
    libn,
    b_postprocess=False,
):
    NewTree = OldTree
    Imports = set()

    for i in history["import"]:
        try: Imports.add(ast.parse(i))
        except SyntaxError:
            continue

    # Deleting Import Statement from old library
    libo_real = llm_pre.libname(libo)
    IDC = synthesis.ImportDeleter(libo_real)
    NewTree = IDC.visit(NewTree)

    # Addinig Import Statements from new library
    SIC = synthesis.SynthImport(Imports)
    NewTree = SIC.visit(NewTree)  # OldTree

    # ====================================Preparation====================================

    VEC = synthesis.VarExtractor(check=True)
    VEC.visit(NewTree)

    VarsN = synthesis.UnusedVars()
    VarsN.visit(NewTree)

    UnUsedVarsN = synthesis.Vars(
        synthesis.Vars(VarsN.assigned, VarsN.used)[0], UnusedVarsO
    )[0]
    UnUsedVarsN = CENSubs(VEC.imports | CENs, UnUsedVarsN)
    UnAssignedVarsN = synthesis.Vars(
        synthesis.Vars(VarsN.assigned, VarsN.used)[1], UnAssignedVarsO
    )[0]
    UnAssignedVarsN = CENSubs(VEC.imports | CENs | FuncDefs, UnAssignedVarsN)

    # ====================================Unassigned variables deletion====================================

    # if b_postprocess:
    #     SDC = synthesis.SynthDel(
    #         [], UnAssignedVarsN, dict(), history=history["changes"]
    #     )  # unassigned dels
    #     NewTree = SDC.visit(NewTree)

    # tmp_NewTree = ast.unparse(ast.fix_missing_locations(NewTree))

    # ====================================UnUsed variables deletion====================================

    # if check:
    #     while True:
    #         SDC = synthesis.SynthDel(
    #             [], dict(), UnUsedVarsN, history=history["changes"], usedvars=VarsN.used
    #         )  # unused dels
    #         NewTree = SDC.visit(NewTree)
    #         if tmp_NewTree == ast.unparse(ast.fix_missing_locations(NewTree)):
    #             break
    #         tmp_NewTree = ast.unparse(ast.fix_missing_locations(NewTree))

    # ====================================Import stmts Mod====================================
    # Remove Duplicated Import stmts
    NewTree = llm_pre.DupImpSolver(NewTree)
    NewTree = context_remover_refactor.fillpass(NewTree)

    return NewTree


# Var Extraction
def preparation(code: str, apios: list[str], libo, libn):
    root = ast.parse(code)
    parent = call.ParentAst(root)

    CNC = call.Preparation([], apios=apios)
    CNC.visit(root)
    call_nodes = CNC.nodes

    Vars = synthesis.UnusedVars()
    Vars.visit(root)

    unused_vars, unassigned_vars = synthesis.Vars(Vars.assigned, Vars.used)
    funcdefs = set(call.FunctionDefs(root, parent).keys())

    return root, parent, call_nodes, unused_vars, unassigned_vars, funcdefs


def run(
    model: str,
    target_files: list[str],
    model_simp: str,
    directory: str,
    b_imports=False,
    b_varmap=False,
    b_surround=False,
    b_postprocess=False,
    gumtree=False,
    option = "default",
):

    results = prepare(model, option=option)
    file_list_json = target_files   

    for j in file_list_json:
        print("File in progress: ", j)

        with open(BENCHMARK_PATH / j) as f:
            data = json.load(f)
            fileb = open(BENCHMARK_PATH / data["bef_file"], "r")
            filea = open(BENCHMARK_PATH / data["aft_file"], "r")
            codeb, _ = fileb.read(), filea.read()

            libo, libn = data["libo"], data["libn"]
            apios = list(data["apio"])

            # vals = list of llm answers
            vals = results[j]

            # Prepare for history
            history = dict()
            (
                history["import"],
                history["changes"],
                history["dec_indexes"],
            ) = (set(), set(), dict())

            try:
                from cens import CENs
            except:
                from .cens import CENs

            CENs.add(libn)

            (
                OldTree,
                ParentO,
                OCNs,
                UnusedVarsO,
                UnAssignedVarsO,
                FuncDefsO,
            ) = preparation(codeb, apios, libo, libn)

            lib_path = gits.HOME_PATH / Path(gits.git_loc[libn])

            apis = api_lst.get_apis(lib_path, libn)

            for i in range(len(apios)):
                # llm answer and api name index
                val = vals[i]
                apio = apios[i]

                # Extracting the new code
                r = ExtractLLM(libo, libn, val)
                if model == "deepseek-r1-32b":
                    NewCode = r["codes"][-1].strip()

                elif model == "qwen3-32b":
                    # The longest code 
                    NewCode = max(r["codes"], key=len).strip()

                else:
                    NewCode = r["codes"][0].strip()

                try:
                    (NewTree, ParentN, _, _, _, _) = preparation(
                        NewCode, [], libo, libn
                    )
                    logging.info("File: %s | API: %s", j, apios[i])
                except:
                    logging.info("File: %s | API: %s | Parse Error", j, apios[i])
                    continue

                OldTree1 = ast.parse(codeb)
                CPO1 = call.Preparation([], apios=apios)
                CPO1.visit(OldTree1)
                OCNs1 = CPO1.nodes
                ParentO1 = call.ParentAst(OldTree1)

                codeb_str = ast.unparse(
                    context_remover_refactor.remove_context(
                        OCNs1,
                        OldTree1,
                        apio,
                        ParentO1,
                        libo,
                        libn,
                        CPO1.funcdefs,
                        CPO1.classdefs,
                    )
                )

                NewTree = ast.parse(NewCode)
                NewCode = ast.unparse(NewTree)
                NewTree = ast.parse(NewCode)

                (history, OldTree, CENs) = SketchMaker(
                    apio,
                    OCNs,
                    ParentN,
                    ParentO,
                    OldTree,
                    NewTree,
                    libo,
                    libn,
                    history,
                    FuncDefsO,
                    UnAssignedVarsO,
                    CENs,
                    OldTree1,
                    ParentO1,
                    codeb_str,
                    NewCode,
                    apis,
                    b_imports=b_imports,
                    b_varmap=b_varmap,
                    b_surround=b_surround,
                    b_postprocess=b_postprocess,
                    gumtree=gumtree,
                )

            if (NewTree) != "'parse error'":
                FuncDefs = set(call.FunctionDefs(OldTree, ParentO).keys())

                NewTree = FinalSynth(
                    history,
                    OldTree,
                    UnusedVarsO,
                    UnAssignedVarsO,
                    CENs,
                    FuncDefs,
                    libo,
                    libn,
                    b_postprocess=b_postprocess,
                )

                NewTree = autoflake.fix_code(
                    (ast.unparse(ast.fix_missing_locations(NewTree))),
                    remove_all_unused_imports=True,
                )
            else:
                pass

            yield (NewTree, (j.split(".")[0]))