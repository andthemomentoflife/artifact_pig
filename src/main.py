import ast
import sys
import json
import autoflake
from rich import print
from rich.console import Console
from rich.panel import Panel
from rich.syntax import Syntax
from rich.table import Table
from rich.rule import Rule
from pathlib import Path

sys.path.append(str(Path(__file__).parent))

from synth import call
from mapping.compare_arg import find_candidate_apis
from llm import context_remover_refactor
from llm.mapping_llama import AskLLM, name_and_signs
from llm.mapping_gpt import ExtractLLM
from synth.sketch import preparation, FinalSynth
from synth.sketch import SketchMaker
from mapping import api_lst, gits

console = Console()


def print_header(libo, libn, libo_path, libn_path, codeo_path):
    table = Table(show_header=False, box=None, padding=(0, 1))
    table.add_column(style="bold cyan", width=20)
    table.add_column(style="white")

    table.add_row("Source Library", f"[bold yellow]{libo}[/] → [bold green]{libn}[/]")
    table.add_row("Source Path", str(libo_path))
    table.add_row("Target Path", str(libn_path))
    table.add_row("Code Path", str(codeo_path))

    console.print(Panel(table, title="[bold]Migration Info[/]", border_style="blue"))


def print_code_block(title, code, language="python"):
    syntax = Syntax(code, language, theme="monokai", line_numbers=True)
    console.print(Panel(syntax, title=f"[bold]{title}[/]", border_style="dim white"))


def print_api_section(index, apio, apins, codebb, answer):
    console.print(Rule(f"[bold cyan] API [{index + 1}]: {apio} [/]", style="cyan"))

    # Candidate APIs
    console.print(
        Panel(
            f"[dim]{apins}[/]",
            title="[bold yellow]Candidate APIs[/]",
            border_style="yellow",
        )
    )

    # Sliced code
    print_code_block("Sliced Code", codebb)

    # LLM Answer
    console.print(
        Panel(str(answer), title="[bold green]LLM Answer[/]", border_style="green")
    )


def main(file_path):
    with open(file_path, "r") as file:
        data = json.load(file)

    libo = data.get("libo", "")
    libn = data.get("libn", "")
    libo_path = data.get("libo_path", "")
    libn_path = data.get("libn_path", "")
    codeo_path = data.get("codeo", "")
    apios = data.get("apios", [])
    signos = data.get("signos", {})
    model = data.get("model", "")

    with open(codeo_path, "r") as codeo_file:
        codeo_str = codeo_file.read()

    rooto = ast.parse(codeo_str)

    # Header
    print_header(libo, libn, libo_path, libn_path, codeo_path)

    # Original code
    print_code_block("Original Code", codeo_str)

    # Prepare API list
    lib_path = gits.HOME_PATH / Path(libn_path)
    apis = api_lst.get_apis(lib_path, libn)

    # Prepare for history
    history = dict()
    (
        history["import"],
        history["changes"],
        history["dec_indexes"],
    ) = (set(), set(), dict())

    from synth.cens import CENs

    CENs.add(libn)

    # Process each API
    for i, apio in enumerate(apios):
        # Sliced code
        apins = name_and_signs(find_candidate_apis(libo, apio, signos[apio], libn))
        ParentO = call.ParentAst(rooto)
        CPO = call.Preparation([], apios=apio)
        CPO.visit(rooto)

        codebb = ast.unparse(
            context_remover_refactor.remove_context(
                CPO.nodes, rooto, apio, ParentO, libo, libn, CPO.funcdefs, CPO.classdefs
            )
        )

        print_code_block("Sliced Code", codebb)

        # LLM query
        try:
            answer = AskLLM(libo, libn, apio, codebb, model, apins, True)
        except Exception as e:
            answer = """```python\nfrom pathlib import Path\npath = Path(__file__)\npath_parent = path.parents[0]```"""

        # Tailor LLM answer to extract migration code
        r = ExtractLLM(libo, libn, answer)["codes"][0].strip()

        print_api_section(i, apio, apins, codebb, r)

        # Transplant

        (
            OldTree,
            ParentO,
            OCNs,
            UnusedVarsO,
            UnAssignedVarsO,
            FuncDefsO,
        ) = preparation(codeo_str, apios, libo, libn)

        (NewTree, ParentN, _, _, _, _) = preparation(r, [], libo, libn)

        OldTree1 = ast.parse(codeo_str)
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

        NewTree = ast.parse(r)
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
        )

    console.print(Rule("[bold blue] Migration Complete [/]", style="blue"))

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
        b_postprocess=True,
    )

    NewTree = autoflake.fix_code(
        (ast.unparse(ast.fix_missing_locations(NewTree))),
        remove_all_unused_imports=True,
    )

    print(
        Panel(
            Syntax(NewTree, "python", theme="monokai", line_numbers=True),
            title="[bold green]Final Migrated Code[/]",
            border_style="green",
        )
    )


if __name__ == "__main__":
    if len(sys.argv) != 2:
        console.print("[bold red]Usage:[/] python main.py <path_to_json_file>")
        sys.exit(1)

    main(sys.argv[1])
