# Parsing the mapping history.txt

from pathlib import Path

PIG_PATH = Path(__file__).parent.parent.parent
MAPPING_PATH = PIG_PATH / "src" / "mapping"


# def parse_mapping_history() -> dict[str:dict]:
#     mapping_history = dict()

#     with open(PIG_PATH / "src" / "mapping" / "mapping_history_1025.txt", "r") as f:
#         lines = f.readlines()

#     for line in lines:
#         if "json is in progress:" in line:
#             file_num = line.split(".")[0] + ".json"

#         if line.startswith("{"):
#             mapping = dict(eval(line.strip()))
#             mapping_history[file_num] = mapping

#     return mapping_history


def parse_mapping_history() -> dict[str, dict]:
    mapping_history = dict()

    with open(MAPPING_PATH / "0401_API_MAPPING_default.log", "r") as f:
        lines = f.readlines()

        for line in lines:
            if line.startswith("INFO:__main__:Processing"):
                file_num = line.split(" ")[-1].strip()
                mapping_history[file_num] = dict()
            else:
                apio = line.split(":")[2].strip()
                mapping = eval(line.split(":")[3].strip())
                mapping_history[file_num][apio] = mapping

    return mapping_history


def name_and_signs(cands: list) -> str:
    n = 1
    text = ""

    cands = cands[:3]

    for cand in cands: 
        try: name, args, name_score, arg_score = cand
        except: 
            name, args = cand

        if len(args) == 0:
            text += f"{n}. API Name: {name} | No Argument\n"

        else:
            text += f"{n}. API Name: {name} | Argument: {list(args)}\n"

        n += 1

    return text
