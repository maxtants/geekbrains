import json

has_element = False
dict_list = []
id = None

def load():
   global dict_list
   global id
   print("input note id: ", end = '')
   id = input()
   with open("notes.json") as f:
      dict_list = json.load(f)

def get_note():
   global has_element
   global dict_list
   global id

   load()
   for el in dict_list:
      if str(el['id']) == id:
         print(el)
         has_element = True
   
   if not has_element:
      print("no such note")


def delete_note():
   global has_element
   global dict_list
   global id

   load()
   for el in dict_list:
      if str(el['id']) == id:
         dict_list.remove(el)
         has_element = True
   
   with open("notes.json", "w") as f:
      json.dump(dict_list, f, indent = 4)
   
   if not has_element:
      print("no such note")
