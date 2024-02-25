import os
import sys

import controller.command_controller as ccontroller

os.system('cls||clear')

while True:
   print("Input command or write 'help': ", end = '')
   command = input()
   print()
   
   if command == "help":
      ccontroller.help()
   elif command == "new":
      ccontroller.create_new_note()
   elif command == "list":
      ccontroller.list_notes()
   elif command == "get":
      ccontroller.get_note_by_id()
   elif command == "del":
      ccontroller.delete_note()
   else:
      sys.exit(0)

   print()