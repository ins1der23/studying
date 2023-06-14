# n = None
# m = 1.89
# # o = 'str\"ing'
# print(m, type(m))
# m = 'hy\"jk"hkghj"'
# print(m, type(m))

# a = 6
# b = 7.9
# c = 'hello'
# print(a, '-', b, '-',  c)
# print(f"{a} - {b} - {c} ")
# print("{} - {} - {}".format(a, b, c))
# print(f"{a} + {b} = {a+b}")

# print("Input first string")
# e = int(input())
# print(e)
# d = int(input("Input second string: "))
# print(f"{e} + {d} = {e+d}")

# c = 5.68
# print(c, type(c))
# c = int(c)
# print(c + 2, type(c))
# c = str(c)
# print(c + 'dfg', type(c))
# d = 1
# print(d, type(d))
# d = bool(d)
# print(d, type(d))
# v ='ads'
# v= int(v)


# a = 6.967686
# b = 9.767656
# print(round(a*b, 3))

# a += 3
# a -= 4
# a *= 5
# a /= 5
# a %= 2
# a **= 3

# a = 1 > 4
# print(a)

# a = 1 < 4 and 5 > 2
# print(a)

# a = 1 == 2
# print(a)

# a = 1 != 2
# print(a)

# a = 'qwe'
# b = 'qwe'
# print(a == b)

# a = 1 < 3 < 5 < 4 < 9
# print(a)


# username = input('Введите имя: ')
# if username == 'Маша':
#     print('Ура, это же МАША!')
# elif username == 'Марина':
#     print('Я так ждала Вас, Марина!')
# elif username == 'Ильнар':
#     print('Ильнар - топ)')
# else:
#     print('Привет, ', username)


# n = int(input())
# if n % 2 == 0 and n % 3 == 0:
#     print('Число кратно 6')
# if n % 5 == 0 and n % 3 == 0:
#     print('Число кратно 15')
    

# n = 423
# summa = 0
# while n > 0:
#     x = n % 10
#     summa = summa + x
#     n = n // 10
# print(summa) # 9

# i = 0
# while i < 5:
#     if i == 3:
#         break
#     i = i + 1
# else:
#     print('Пожалуй')
#     print('хватит )')
# print(i)


# n = int(input())
# flag = True
# i = 2
# while flag:
#     if n % i == 0: # если остаток при делении числа n на i равен 0
#         flag = False
#         print(i)
#     elif i > n // 2: # делить числа не может превышать введенное число, деленное на 2
#         print(n)
#         flag = False
#     i += 1


for i in 1, -2, 3, 14, 5:
    print(i)
# 1 -2 3 15 5

r = range(5) # 0 1 2 3 4
r = range(2, 5) # 2 3 4
r = range(-5, 0) # ----
r = range(1, 10, 2) # 1 3 5 7
r = range(100, 0, -20) # 100 80 60 40 20
for i in r:
    print(i)
# 100 80 60 40 20

for i in range(5):
    print(i)
# 0 1 2 3 4


for i in 'qwerty':
    print(i)
# q
# w
# e
# r
# t
# y


line = ""
for i in range(5):
    line = ""
    for j in range(5):
        line += "*"
    print(line)


text = 'СъЕШЬ ещё этих МяГкИх французских булок'
print(len(text)) # 39
print('ещё' in text) # True
print(text.lower()) # съешь ещё этих мягких французских булок
print(text.upper()) # СЪЕШЬ ЕЩЁ ЭТИХ МЯГКИХ ФРАНЦУЗСКИХ БУЛОК
print(text.replace('ещё','ЕЩЁ')) # СъЕШЬ ЕЩЁ этих МяГкИх французских булок


text = 'съешь ещё этих мягких французских булок'
print(text[0]) # c
print(text[1]) # ъ
print(text[len(text)-1]) # к
print(text[-5]) # б
print(text[:]) # съешь ещё этих мягких французских булок
print(text[:2]) # съ
print(text[len(text)-2:]) # ок
print(text[2:9]) # ешь ещё
print(text[6:-18]) # ещё этих мягких
print(text[0:len(text):6]) # сеикакл, каждый 6 элемент
print(text[::6]) # сеикакл, каждый 6 элемент

print(text[2:9] + text[-5] + text[:2]) # ешь ещёбсъ
