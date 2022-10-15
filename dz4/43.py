# Задайте последовательность чисел. Напишите программу, которая выведет
#  список неповторяющихся
#  элементов исходной последовательности в том же порядке.
from random import randrange


def list(count: int):
    if count < 0:
        print("Неправильно набран номер")
        return []

    list_nums = []
    for i in range(count):
        list_nums.append(randrange(count))

    return list_nums


def new_el(list_nums: list):
    result = []
    my_dict = {}.fromkeys(list_nums, 0)

    for i in list_nums:
        my_dict[i] += 1

    for k in my_dict:
        if my_dict[k] == 1:
            result.append(k)

    return result


all_list = list(int(input("ВВедите число: ")))
print(all_list)
print(new_el(all_list))
