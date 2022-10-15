# Задайте натуральное число N. Напишите программу, 
# которая составит список простых множителей числа N.
def List(num):
    pr_fact = []
    di = 2
    while num > 1:
        if num % di == 0:
            pr_fact.append(di)
            num //= di
        else:
            di += 1
    return pr_fact



print(List(int(input())))