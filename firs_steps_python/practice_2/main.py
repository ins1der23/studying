# num = int(input("Введите число А "))
# fib1 = 0
# fib2 = 1
# count = 2
# while fib2 < num:
#     fsumm = fib1 + fib2
#     fib1 = fib2
#     fib2 = fsumm
#     count += 1
# if fib2 == num:
#     print(count)
# else:
#     print("-1")


from random import randint
count = int(input('Введите количество арбузов '))
max = 0
min = 30000
for i in range(count):
    melon = randint(0, 30000)
    print(melon)
    if melon > max:
        max = melon
    if melon < min:
        min = melon
print()
print(max, min)


import random
day = int(input("Введите кол-во дней "))
cur_t = 0
plus = 0
max = 0
while day != 0:
    temp = random.randint(-5,5)
    cur_t = cur_t + temp
    print(f"День {day}, Температура {cur_t}")
    if cur_t > 0:
        plus +=1
        if plus > max:
            max = plus
    else:
        plus = 0
    day -=1
print(f"Макс период {max}")


from random import randint

days = int(input('Введите количество дней:\n'))
temp = 0
count = 0
total_days = 0

for i in range(days):
    temp += randint(-3, 3)
    print(temp)

    if temp > 0:
        count += 1
    else:
        count = 0

    if total_days < count:
        total_days = count

print(f'Оттепель длилась {total_days}')