some_string = input("Введите что-нибудь ")
counter = 1
to_list = list(some_string)
size = len(some_string)
for i in range(size-1, -1, -1):
    for j in range(size-2, -1, -1):
        if some_string[i] == some_string[j]:
            counter += 1
    print(counter)
    to_list[i] += f"_{counter}"
    size -= 1
    counter = 1
result = ""
for item in to_list:
    result += item
print(result)



count_dict = {}
for char in some_string:
    count_dict[char] = count_dict.get(char, 0) + 1
    if count_dict[char] < 1:
        print(char, end = ' ')
    else:
        print(char + '_' + str(count_dict[char]), end = "")
