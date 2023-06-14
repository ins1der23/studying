def random_int_list(size: int, lower_bound: int, upper_bound: int, ) -> list:
    from random import randint
    return [randint(lower_bound, upper_bound) for i in range(size)]
    '''Создание списка случайных int от lower_bound до upper_bound размером size '''

def neigborhs(any_list: list) -> int:
    count = 0
    for i in range(1, len(any_list)-1):
        if any_list[i-1] < any_list[i] > any_list[i+1]:
            count += 1
    return count
    

first_list = random_int_list(10, -20, 20)
print(first_list)
second_list = random_int_list(10, -20, 20)
print(second_list)
print(neigborhs(first_list))
print(neigborhs(second_list))