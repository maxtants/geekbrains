from datetime import datetime

class Note:
   def __init__(self, name, text):
      self.id = id(self)
      self.name = name
      self.text = text
      self.datetime = datetime.now()

   