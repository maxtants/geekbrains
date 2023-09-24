# Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. Пользователь также может ввести имя или фамилию, и Вы должны реализовать функционал для изменения и удаления данных


import os

print()
print("Перечень доступных команд: \n" 
      + "list вывод в консоль всех записей телефонной книги \n"
      + "rm num удаление записи с номером num \n" 
      + "chrec num param new_value изменение записи c параметром name, surn или tel \n")


def rm(num):
    lst = []
    with open('phonebook.txt', 'r') as file:
        for line in file:
            if line[0] == num:
                continue
            else:
                lst.append(line)
                
    with open('phonebook.txt', 'w') as file:
        for line in lst:
            file.write(line)

def chrec(num, param, new_value):
    record_for_change = []
    with open('phonebook.txt', 'r') as file:
        for line in file:
            if line[0] == num:
                 record_for_change = line.split()
    
    if param == "name":
        record_for_change[1] = new_value
    elif param == "surn":
        record_for_change[2] = new_value
    elif param == "tel":
        record_for_change[3] = new_value
    
    rm(num)
    
    changed_record = record_for_change[0]
    for i in range(1, 4):
        changed_record += " " + record_for_change[i]
                        
    
    with open('phonebook.txt', 'a') as file:
        file.write("\n" + changed_record)


com = input("Введите команду: ").split()
path_abs = os.path.abspath("phonebook.txt")

if com[0] == "list":
    with open('phonebook.txt', 'r') as file:
        for line in file:
            print(line)
elif com[0] == "rm":
    rm(com[1])
elif com[0] == "chrec":
    chrec(com[1], com[2], com[3])
else:
    print("Такой команды нет")




