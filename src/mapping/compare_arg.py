# Open json file
import json
from pathlib import Path
import sys

sys.path.append(str(Path(__file__).parent.parent))

PIG_PATH = Path(__file__).parent.parent.parent
BENCHMARK_PATH = PIG_PATH / Path("benchmarks")
MAPPING_PATH = PIG_PATH / Path("src/mapping")

from itertools import product
from difflib import SequenceMatcher
from mapping import api_mapping_result


def compare_two_json():
    json1 = MAPPING_PATH / Path("0401_API_MAPPING_default_RESULT.json")
    json2 = MAPPING_PATH / Path("0516_MAPPING_RESULT.json")

    with open(json1, "r") as f:
        data1 = json.load(f)

    with open(json2, "r") as f:
        data2 = json.load(f)

    total_result = 0

    for file_num, apis in data2.items():
        for api, new_result in apis.items():
            contents = data1[file_num]
            if api in contents:
                result = contents[api]
                if result[0] == "O" and new_result[0] != "O":
                    print("Old API:", api, file_num)
                    total_result += 1

    print("Total result:", total_result)


def check():
    # Check whether the answer API is in the candidates
    ANSWER_PATH = PIG_PATH / Path("src/mapping/answer.json")
    with open(ANSWER_PATH, "r") as f:
        answers = json.load(f)

    found_num = 0
    not_found_num = 0
    not_cnt = 0
    top_one = 0

    result_0516 = dict()

    json_files = [file for file in os.listdir(BENCHMARK_PATH) if file.endswith(".json")]
    json_files.sort(key=lambda x: int(x.split(".")[0]))

    for j in json_files:
        result_0516[j] = dict()
        with open(BENCHMARK_PATH / j) as f:
            data = json.load(f)
            apios = data["apio"]

        for apio in apios:
            if apio not in answers[j]:
                not_cnt += 1
                continue

            answer_api = answers[j][apio]["answer"]
            answer_sign = answers[j][apio]["signn"]
            result = api_mapping_result.result[j][apio]

            for cand in result:
                apin = cand[0]
                sign = cand[1]

                if apin == answer_api and set(sign) == set(answer_sign):
                    ranking = result.index(cand)
                    cond = True

                else:
                    cond = False
                    sign = set(sign)
                    # Exception
                    if (
                        j == "39.json"
                        and apio == "request"
                        and apin == "request"
                        and sign == {"url", "method", "kwargs"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "125.json"
                        and apio == "IPAddress"
                        and apin == "ip_address"
                        and sign == {"address"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "125.json"
                        and apio == "IPNetwork"
                        and apin == "ip_network"
                        and sign == {"address"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "190.json"
                        and apio == "request"
                        and apin == "request"
                        and sign == {"url", "method", "kwargs"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "191.json"
                        and apio == "run"
                        and apin == "run"
                        and sign == {"app"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "199.json"
                        and apio == "StrictRedis"
                        and apin == "StrictRedis"
                        and sign == {}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "218.json"
                        and apio == "load"
                        and apin == "load"
                        and sign == {"stream", "Loader"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "218.json"
                        and apio == "dump"
                        and apin == "dump"
                        and sign == {"Dumper", "stream", "kwds", "data"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "221.json"
                        and apio == "ArgumentParser"
                        and apin == "ArgumentParser"
                        and sign == {"kwargs", "args"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "233.json"
                        and apio == "tweets"
                        and apin == "search_tweets"
                        and sign == {"kwargs", "q"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "265.json"
                        and apio == "parse"
                        and apin == "parse"
                        and sign == {"cls", "coerce", "version_string", "partial"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "280.json"
                        and apio == "open"
                        and apin == "request"
                        and sign
                        == {
                            "allow_redirects",
                            "data",
                            "files",
                            "headers",
                            "stream",
                            "method",
                            "cert",
                            "proxies",
                            "params",
                            "json",
                            "cookies",
                            "auth",
                            "timeout",
                            "url",
                            "verify",
                            "hooks",
                        }
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "283.json"
                        and apio == "IPv4Address"
                        and apin == "IPAddress"
                        and sign == {"version", "flags", "addr"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "283.json"
                        and apio == "IPv6Address"
                        and apin == "IPAddress"
                        and sign == {"version", "flags", "addr"}
                    ):
                        ranking = result.index(cand)
                        cond = True

                    if (
                        j == "303.json"
                        and apio == "HTTPError"
                        and apin == "HTTPError"
                        and sign == {}
                    ):
                        ranking = result.index(cand)
                        cond = True

                if cond:
                    found = True
                    break
                else:
                    found = False

            if found:
                found_num += 1
                result_0516[j][apio] = ("O", ranking + 1)

            else:
                not_found_num += 1
                result_0516[j][apio] = ("X", "-")

            if found and ranking == 0:
                top_one += 1

    print("Found:", found_num)
    print("Not Found:", not_found_num)
    print("Not Count:", not_cnt)
    print("Top One:", top_one)

    RESULT_0516 = MAPPING_PATH / Path("0516_MAPPING_RESULT.json")

    with open(RESULT_0516, "w") as f:
        json.dump(result_0516, f, indent=4)


import api_lst
import os


def find(api, result_new):
    cands = set()

    for path, vals in result_new.items():
        for val in vals:
            for apin, sign in val:
                if apin == api:
                    if isinstance(sign, list):
                        sign = tuple(sign)
                    else:
                        sign = tuple(sign[0])
                    cands.add((apin, tuple(sign), path))

    return cands


def compute_greedy_arg_mapping(args_a, args_b, libo, libn):
    # Step 1: Compute all possible similarities
    all_pairs = [
        (a, b, compute_string_similarity(a, b, libo, libn))
        for a, b in product(args_a, args_b)
    ]

    # Step 2: Sort by descending similarityclear
    sorted_pairs = sorted(all_pairs, key=lambda x: x[2], reverse=True)

    matched_a = set()
    matched_b = set()
    final_matches = []

    # Step 3: Greedy match
    for a, b, score in sorted_pairs:
        if a not in matched_a and b not in matched_b:
            final_matches.append((a, b, score))
            matched_a.add(a)
            matched_b.add(b)

    # Step 4: Normalize by number of matches (not argument list lengths)
    if final_matches:
        total_score = sum(score for _, _, score in final_matches)
        # normalized_score = total_score / len(final_matches)

        max_arg_num = max(len(args_a), len(args_b))
        # normalized_score = normalized_score / (
        #     max_arg_num - len(final_matches) + 1
        # ) ** (1 / 2)

        normalized_score = total_score / (max_arg_num - len(final_matches) + 1) ** (
            1 / 2
        )

    else:
        normalized_score = 0.0

    return normalized_score


def compute_string_similarity(word1: str, word2: str, libo, libn):
    # SHOULD BE BOTH UPPER CASE
    if (word1.isupper() and word2.islower()) or (word1.islower() and word2.isupper()):
        return 0

    if word1.lower() == word2.lower() or (
        word1.lower() == libo.lower() and word2.lower() == libn.lower()
    ):

        return 1

    sim1 = SequenceMatcher(None, word2.lower(), word1.lower()).ratio()
    sim2 = SequenceMatcher(None, word1.lower(), word2.lower()).ratio()

    return max(sim1, sim2)


def api_mapping():
    json_files = [file for file in os.listdir(BENCHMARK_PATH) if file.endswith(".json")]
    json_files.sort(key=lambda x: int(x.split(".")[0]))

    ANSWER_PATH = PIG_PATH / Path("src/mapping/answer.json")
    found_num = 0
    not_found_num = 0
    top_one = 0

    result_0516 = dict()

    with open(ANSWER_PATH, "r") as f:
        answers = json.load(f)

    for j in json_files:
        print("Processing", j)
        result_0516[j] = dict()

        if j != "177.json":
            continue


        with open(BENCHMARK_PATH / j) as f:
            data = json.load(f)
            apios = data["apio"]
            libo, libn = data["libo"], data["libn"]

            # lib_path = gits.HOME_PATH / Path(gits.git_loc[libn])
            # apins = api_lst.get_apis(lib_path, libn)
            apins = api_lst.apin_signs(libn)
            # print(apins, "apins")

            for apio in apios:
                histor = set()
                if apio != "get":
                    continue 
                if apio not in answers[j]:
                    continue

                answer_api = answers[j][apio]["answer"]
                answer_sign = answers[j][apio]["signn"]
                apio_sign = answers[j][apio]["signo"]

                for path, val in apins.items():
                    for i in range(len(val)):
                        for apin, sign in val[i]:
                            name_similarity = compute_string_similarity(
                                apio, apin, libo, libn
                            )

                            if not isinstance(sign, list):
                                sign = sign[0]

                            if len(apio_sign) == 0 and len(sign) == 0:
                                arg_similarity = 1

                            else:
                                _apio_sign = set(apio_sign) - {"self", "args", "kwargs"}
                                _sign = set(sign) - {"self", "args", "kwargs"}

                                arg_similarity = compute_greedy_arg_mapping(
                                    _apio_sign, _sign, libo, libn
                                )

                            histor.add(
                                (
                                    apin,
                                    tuple(set(sign)),
                                    name_similarity,
                                    arg_similarity,
                                    path,
                                )
                            )

                histor = sorted(histor, key=lambda x: (x[2], x[3]), reverse=True)
                print(histor[:10])
                found = False

                cands = list()
                real_cands = list()

                for apin, sign, name_score, arg_score, path in histor:
                    if (apin, sign) in cands:
                        continue
                    cands.append((apin, sign))
                    real_cands.append((apin, sign, name_score, arg_score, path))

                    if len(cands) == 3:
                        break

                # Check whether the answer API is in the candidates
                for apin, sign, name_score, arg_score, path in real_cands:
                    if apin == answer_api and set(sign) == set(answer_sign):
                        found = True
                        ranking = real_cands.index(
                            (apin, sign, name_score, arg_score, path)
                        )
                    else:
                        cond = False
                        osign = sign
                        sign = set(sign)

                        # Exception
                        if (
                            j == "39.json"
                            and apio == "request"
                            and apin == "request"
                            and sign == {"url", "method", "kwargs"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "125.json"
                            and apio == "IPAddress"
                            and apin == "ip_address"
                            and sign == {"address"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "125.json"
                            and apio == "IPNetwork"
                            and apin == "ip_network"
                            and sign == {"address"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "190.json"
                            and apio == "request"
                            and apin == "request"
                            and sign == {"url", "method", "kwargs"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "191.json"
                            and apio == "run"
                            and apin == "run"
                            and sign == {"app"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "199.json"
                            and apio == "StrictRedis"
                            and apin == "StrictRedis"
                            and sign == {}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "218.json"
                            and apio == "load"
                            and apin == "load"
                            and sign == {"stream", "Loader"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "218.json"
                            and apio == "dump"
                            and apin == "dump"
                            and sign == {"Dumper", "stream", "kwds", "data"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "221.json"
                            and apio == "ArgumentParser"
                            and apin == "ArgumentParser"
                            and sign == {"kwargs", "args"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "233.json"
                            and apio == "tweets"
                            and apin == "search_tweets"
                            and sign == {"kwargs", "q"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "265.json"
                            and apio == "parse"
                            and apin == "parse"
                            and sign == {"cls", "coerce", "version_string", "partial"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "280.json"
                            and apio == "open"
                            and apin == "request"
                            and sign
                            == {
                                "allow_redirects",
                                "data",
                                "files",
                                "headers",
                                "stream",
                                "method",
                                "cert",
                                "proxies",
                                "params",
                                "json",
                                "cookies",
                                "auth",
                                "timeout",
                                "url",
                                "verify",
                                "hooks",
                            }
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "283.json"
                            and apio == "IPv4Address"
                            and apin == "IPAddress"
                            and sign == {"version", "flags", "addr"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "283.json"
                            and apio == "IPv6Address"
                            and apin == "IPAddress"
                            and sign == {"version", "flags", "addr"}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if (
                            j == "303.json"
                            and apio == "HTTPError"
                            and apin == "HTTPError"
                            and sign == {}
                        ):
                            ranking = real_cands.index(
                                (apin, osign, name_score, arg_score, path)
                            )
                            cond = True

                        if cond:
                            found = True

                if found:
                    found_num += 1
                    result_0516[j][apio] = ("O", ranking + 1)

                    print("Found:", apio, "in", j, "with Ranking", ranking + 1)
                    for i, info in enumerate(real_cands):
                        print(i, info)

                    if ranking == 0:
                        top_one += 1

                else:
                    not_found_num += 1
                    result_0516[j][apio] = ("X", "-")

                with open(
                    MAPPING_PATH / Path("0531_MAPPING_RESULT.py"), "w"
                ) as f:
                    json.dump(result_0516, f, indent=4)

    print("Found:", found_num)
    print("Not Found:", not_found_num)
    print("Top One:", top_one)
    

    return result_0516

    # with open(RESULT_0516, "w") as f:
    #     json.dump(result_0516, f, indent=4)


def check():
    FILE_PATH = PIG_PATH / Path("src/mapping/0531_MAPPING_RESULT.json")

    with open(FILE_PATH, "r") as f:
        result = json.load(f)

    first = 0
    second = 0
    third = 0
    total = 0
    
    for file_num, apios in result.items():
        for apio, info in apios.items():
            total += 1
            if info[0] == "O" and (not (info[1] == 1 or info[1] == 2 or info[1] == 3)):
                print(file_num, apio, info[1])
                # if info[1]
            else:
                pass
                # print(file_num, apio, info[1]
                if info[1] == 1:
                    first += 1
                
                elif info[1] == 2:
                    second += 1
                elif info[1] == 3:
                    third += 1
                # print(file_num, apio, "Not Found")
    print("First:", first)
    print("Second:", second)
    print("Third:", third)
    print("Total:", total)


"""
Hyperparameters
sequencematcher 평균, kwarg, args 고려 X | normalized 
0.5 | 0.5 => FOUND_NUM: 130, NOT_FOUND_NUM: 107
0.6 | 0.4 => FOUND_NUM: 132, NOT_FOUND_NUM: 105
0.7 | 0.3 => FOUND_NUM: 132, NOT_FOUND_NUM: 105

sequencematcher max, kwarg, args 고려 O | normalized
0.8 | 0.2 => FOUND_NUM: 139, NOT_FOUND_NUM: 98
0.85 | 0.15 => FOUND_NUM: 141, NOT_FOUND_NUM: 96 
1 | 0 => FOUND_NUM: 144, NOT_FOUND_NUM: 93


>>> Name Arguements 둘다
sequencematcher max, kwarg, args 고려 O | not normalized
0.5 | 0.5 => FOUND_NUM: 136, NOT_FOUND_NUM: 101
{0.8 | 0.2 => FOUND_NUM: = 156, NOT_FOUND_NUM: 81}
0.85 | 0.15 => FOUND_NUM: 153, NOT_FOUND_NUM: 84

>>> Name만 했을때?
152, 85

>>> 
155 82

>>> Arguments만 했을때?
{Not normalized: 63 174}
normalized: 48 189

>>> Only Name 
Found: 150
Not Found: 87
Top One: 111

>>> cartesian product 
Found: 149
Not Found: 88
Top One: 113


!!!!!
>>> greedy (0.8, 0.2) [Sum]
Found: 156
Not Found: 81
Top One: 121

>>> greedy sum

>>> Greedy (0.8, 0.2) [Normalized]
Found: 149
Not Found: 88
Top One: 118

>>> greedy (avg에 함수 동률 계산)
Found: 151
Not Found: 86
Top One: 114
"""


def api_new__mapping():
    BENCHMARK_PATH = PIG_PATH / Path("benchmarks")
    json_files = [file for file in os.listdir(BENCHMARK_PATH) if file.endswith(".json")]
    json_files.sort(key=lambda x: int(x.split(".")[0]))
    result = dict()

    ANSWER_PATH = PIG_PATH / Path("src/mapping/answer.json")

    with open(ANSWER_PATH, "r") as f:
        answers = json.load(f)

    

    for j in json_files:
        # if j not in [
        #     "67.json",
        #     "130.json",
        #     "206.json",
        #     "457.json",
        #     "489.json",
        #     "492.json",
        #     "528.json",
        #     "616.json",
        # ]:
        #     continue

        result[j] = dict()

        with open(BENCHMARK_PATH / j) as f:

            data = json.load(f)
            apios = data["apio"]
            libo, libn = data["libo"], data["libn"]

            apins = api_lst.apin_signs(libn)

            for apio in apios:
                histor = set()
                apio_sign = answers[j][apio]["signo"]

                for path, val in apins.items():
                    for i in range(len(val)):
                        for apin, sign in val[i]:
                            name_similarity = compute_string_similarity(
                                apio, apin, libo, libn
                            )

                            if not isinstance(sign, list):
                                sign = sign[0]

                            if len(apio_sign) == 0 and len(sign) == 0:
                                arg_similarity = 1

                            else:
                                _apio_sign = set(apio_sign) - {"self", "args", "kwargs"}
                                _sign = set(sign) - {"self", "args", "kwargs"}

                                arg_similarity = compute_greedy_arg_mapping(
                                    _apio_sign, _sign, libo, libn
                                )

                            histor.add(
                                (
                                    apin,
                                    tuple(set(sign)),
                                    name_similarity,
                                    arg_similarity,
                                    path,
                                )
                            )

                histor = sorted(histor, key=lambda x: (x[2], x[3]), reverse=True)

                cands = list()
                real_cands = list()

                for apin, sign, name_score, arg_score, path in histor:
                    if (apin, sign) in cands:
                        continue
                    cands.append((apin, sign))
                    real_cands.append((apin, sign, name_score, arg_score, path))

                    if len(cands) == 3:
                        break

                result[j][apio] = cands
    


if __name__ == "__main__":
    # main(answer())  # Writing arguments of answer API
    # compare_length()  # Check whether arugments are rsimilar or not
    # result1 = api_mapping(
    # 0.8, 0.2
    # )  # Compare the arguments of the answer API and the original API

    # compare_two_json()

    # check()

    # api_mapping()
    check()
