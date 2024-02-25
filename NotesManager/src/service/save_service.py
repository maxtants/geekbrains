import json

def save_to_json_file(dic):
   dict_list = []
   with open("notes.json", "r") as f:
      dict_list = json.load(f)
   
   with open("notes.json", "w") as f:
      dict_list.append(dic)
      json.dump(dict_list, f, indent = 4)

         
         