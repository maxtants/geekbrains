import view.help_view
import view.new_note_view
import view.note_list_view
import view.get_note_view

def help():
   view.help_view.show_help_info()

def create_new_note():
   view.new_note_view.get_info_for_new_note()

def list_notes():
   view.note_list_view.show_notes_list()

def get_note_by_id():
   view.get_note_view.get_note()

def delete_note():
   view.get_note_view.delete_note()