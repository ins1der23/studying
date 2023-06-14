# def f(x):
#     return x ** 2
# g = f
# print(f(4)) # 16
# print(g(4)) # 16


# def calc1(x):
#     return x + 10
# print(calc1(10)) # 20

# def calc2(x):
#     return x * 10
# def math(op, x):
#     print(op(x))
# math(calc2, 10) # 100


# def sum(x, y):
#     return x + y
# def mylt(x, y):
#     return x * y
# def calc(op, a, b):
#     print(op(a, b))
# calc(mylt, 4, 5) # 20


# calc(lambda x, y: x + y, 4, 5) # 9


# data = [1, 2, 3, 5, 8, 15, 23, 38]
# out = []
# for i in data :
#     if i % 2 == 0:
#         out.append((i, i ** 2))
# print(out)


# def select(f, col):
#     return [f(x) for x in col]
# def where(f, col):
#     return [x for x in col if f(x)]
# data = [1, 2, 3, 5, 8, 15, 23, 38]
# res = select(int, data)
# print(res)
# res = where(lambda x: x % 2 == 0, res)
# print(res) # [2, 8, 38]
# res = list(select(lambda x: (x, x ** 2), res))
# print(res)

# list_1 = [x for x in range (1,20)]
# print(list_1)
# list_1 = list(map(lambda x: x + 10, list_1 ))
# print(list_1)


# data = list(map(int,input().split()))
# print(data)


# def where(f, col):
#     return [x for x in col if f(x)]
# data = '1 2 3 5 8 15 23 38'.split()
# print(data)
# res = list(map(int, data))
# print(res)
# res = where(lambda x: x % 2 == 0, res)
# print(res)
# res = list(map(lambda x: (x, x ** 2), res))
# print(res)


# data = [x for x in range(10)]
# print(data)
# res = list(filter(lambda x: x % 2 == 0, data))
# print(res) # [0, 2, 4, 6, 8]


data = '1 2 3 5 8 15 23 38'.split()
print(data)
res = list(map(int, data))
print(res)
res = list(filter(lambda x: x % 2 == 0, res))
print(res)
res = list(map(lambda x: (x, x ** 2), res))
print(res)


users = ['user1', 'user2', 'user3', 'user4', 'user5']
ids = [4, 5, 9, 14, 7]
data = list(zip(users, ids))
print(data) # [('user1', 4), ('user2', 5), ('user3', 9), ('user4', 14), ('user5', 7)]


users = ['user1', 'user2', 'user3']
data = list(enumerate(users))
print(data) # [(0, 'user1'), (1, 'user2'), (2, 'user3))]
