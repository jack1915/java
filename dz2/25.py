# Реализуйте алгоритм перемешивания списка. Без функции shuffle из модуля random.
# 10
import random
list = [0,1,2,3,4,5,6,7,8,9]
print (" список 1: " + str(list))
for i in range(len(list)-1, 0, -1):
    j = random.randint(0, i + 1) 
    list[i], list[j] = list[j], list[i] 
print (" список 2: " +  str(list))