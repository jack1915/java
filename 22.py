# Напишите программу, которая принимает на вход число N и выдает
#  набор произведений чисел от 1 до N.
a = int(input("Input number "))
b = 1
for i in range(a):
    b *= i + 1
    print(b, end=", ")