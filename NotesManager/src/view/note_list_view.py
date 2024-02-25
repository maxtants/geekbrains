import json


def show_notes_list():
   with open("notes.json") as f:
      dict_list = json.load(f)
      for el in dict_list:
         print(el)