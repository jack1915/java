# Задайте список, состоящий из произвольных чисел, количество задаёт пользователь.
# Напишите программу, которая найдёт сумму элементов списка, стоящих на нечётных позициях(не индексах).


def Summ(lst):
    print (lst)
    s = 0
    for i  in range(len(lst)):
        if i % 2 != 1:
            s += lst[i]
    print(f"Сумма равна: {s}")
lst = list(map(int, input("Введите числа через пробел:\n").split()))
Summ(lst)

# 2 
# import random
# def Summ(lst):
#     print(lst)
#     s = 0
#     for i in range(len(lst)):
#         if i % 2 != 1:
#             s += lst[i]
#     print(f"Сумма нечётных элементов равна: {s}")
# n = int(input("Введите колличество чисел "))
# lst = list([random.randint(-100, 100) for i in range(n)])
# Summ(lst)