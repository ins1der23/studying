from random import randint

# some_numbers = [randint(1,10) for i in range(10)]
# print(some_numbers)
# some_numbers = set(some_numbers)
# print(some_numbers)
# print(len(some_numbers))


# some_numbers = [randint(1, 10) for i in range(10)]
# print(some_numbers)
# k = 5
# for i in range (k):
#     some_numbers.insert(0, some_numbers.pop())
# print(some_numbers)


my_dict = [{"V": "S001"}, 
           {"V": "S002"}, 
           {"VI": "S001"}, 
           {"VI": "S005"}, 
           {"VII": "S005"}, 
           {"V": "S009"}, 
           {"VIII": "S007"}]
my_list = []
for i in range(len(my_dict)):
    my_list += list(my_dict[i].values())
print(set(my_list))



# some_numbers = [randint(1, 10) for i in range(10)]
# print(some_numbers)
# count = 0
# for i in range(len(some_numbers)-1):
#     if some_numbers[i] < some_numbers[i+1]:
#         count += 1
# print(count)
