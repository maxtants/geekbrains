# Задача 10: На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. 
# Определите минимальное число монеток, которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
# Выведите минимальное количество монет, которые нужно перевернуть

import random

n = int(input())
lst = []
avers = 0
revers = 0

for i in range(n):
    lst.append(random.randint(1, n))

for i in range(n):
    if lst[i] % 2 == 0:
        revers += 1
    else:
        avers += 1

print(avers if avers < revers else revers)