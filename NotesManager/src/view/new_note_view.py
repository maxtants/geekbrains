from model.note import Note
import service.save_service as save_service

def get_info_for_new_note():
   print("Input note name: ", end = '')
   name = input()
   print("Input note text: ", end = '')
   text = input()
   note = Note(name, text)
   id = note.id
   dt = note.datetime.strftime("%d/%m/%Y %H:%M:%S")
   dic = {
      'id': id,
      'name': note.name,
      'text': note.text,
      'datetime': dt
   }
   save_service.save_to_json_file(dic)
  