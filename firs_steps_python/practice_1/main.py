year = int(input('Введите год для проверки: '))
leap = (year % 4 == 0 and year % 100 != 0 or year % 400 ==0)
if leap: 
    print('YES')
else: print('NO')