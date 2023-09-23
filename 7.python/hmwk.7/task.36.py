# Задача 36: Напишите функцию print_operation_table(operation, num_rows=6, num_columns=6), которая принимает в качестве аргумента функцию, вычисляющую элемент по номеру строки и столбца. Аргументы num_rows и num_columns указывают число строк и столбцов таблицы, которые должны быть распечатаны. Нумерация строк и столбцов идет с единицы (подумайте, почему не с нуля). Примечание: бинарной операцией называется любая операция, у которой ровно два аргумента, как, например, у операции умножения.


operation = lambda x, y: x + y

def print_operation_table(operation, num_rows=6, num_columns=6):
    for i in range(1, 7):
        lst = [operation(i, j) for j in range(1, 7)]
        for el in lst:
            print(str(el) + " ", end = "")
        print(end = "\n")    
        
print_operation_table(operation)
        