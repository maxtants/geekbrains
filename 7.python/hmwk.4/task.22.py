# Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
# Пользователь вводит 2 числа. n — кол-во элементов первого множества. m — кол-во элементов второго множества. Затем пользователь вводит сами элементы множеств.

n = int(input())
m = int(input())

list_n = []
for i in range(0, n):
    list_n.append(int(input()))

list_m = []
for i in range(0, m):
    list_n.append(int(input()))

list_res = list(set(list_n + list_m))

isSorted = True
temp = 0
while True:
    for i in range(1, len(list_res)):
        if list_res[i] < list_res[i - 1]:
            temp = list_res[i]
            list_res[i] = list_res[i - 1]
            list_res[i - 1] = temp
            isSorted = False
    if isSorted:
        break
    else:
        isSorted = True

print()
print(list_res)
