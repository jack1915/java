#  Напишите программу, которая принимает на вход вещественное
#   число и показывает сумму его цифр.
# print(sum(map(int, list(input()))))


a = float(input("Input number "))
b = 0
Mass = len(str(a)) - 2
a *= 10 ** Mass 
while a:
    b += a % 10
    a //= 10
print(int(b))