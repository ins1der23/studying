def random_int_list(size: int, lower_bound: int, upper_bound: int, ) -> list:
    from random import randint
    return [randint(lower_bound, upper_bound) for i in range(size)]
    '''Создание списка случайных int от lower_bound до upper_bound размером size '''


some_list = random_int_list(20, 1,5)
print(some_list)
count = 0
for i in range(1, 5+1):
    count = some_list.count(i) // 2

print(count)