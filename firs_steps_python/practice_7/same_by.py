from typing import Callable

def same_by(condtion: Callable, some_list: list ) -> bool:
    result = [condtion(x) for x in some_list]
    print(result)
    if result.count(result[0]) == len(result): return True
    else: return False
    



values = [0, 2, 10, 6, 7] 
if same_by(lambda x: x % 2, values):
    print('same')
else:
    print('different')
