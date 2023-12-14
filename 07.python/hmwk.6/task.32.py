# Задача 32: Определить индексы элементов массива (списка), значения которых принадлежат заданному диапазону (т.е. не меньше заданного минимума и не больше заданного максимума)

min_value = int(input())
max_value = int(input())
array_size = int(input())

lst = []

for i in range(0, array_size):
    x = int(input(f"Введите {i + 1} элемент массива: "))
    if (x >= min_value and x <= max_value):
        lst.append(i)

print(lst)

