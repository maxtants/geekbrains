# Задача 30:  Заполните массив элементами арифметической прогрессии. Её первый элемент, разность и количество элементов нужно ввести с клавиатуры. Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# #Каждое число вводится с новой строки.

first_element = int(input("Progression first element: "))
difference = int(input("Progression difference: "))
elements_count = int(input("Elements count: "))

lst = []

for i in range(1, elements_count + 1):
    lst.append(first_element + (i - 1) * difference)
    
print(lst)
