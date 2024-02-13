package service;

import java.io.File;
import java.io.FileWriter;

import model.Person;

public class SavingService {
   public void saveToFile(Person person) {
      boolean hasFile = checkFileExists(person.getLastName());
      if (hasFile) {
         addToFile(person);
      } else {
         createFile(person);
      }
   }

   private boolean checkFileExists(String lastName) {
      File[] files = null;
      try {
         String path = new File("").getAbsolutePath();
         File dir = new File(path);
         files = dir.listFiles();
      } catch (Exception e) {
         e.printStackTrace();
      }
      for (File file : files) {
         if (file.getName().matches(String.format("%s.txt", lastName))) {
            return true;
         }
      }
      return false;
   }

   private void createFile(Person person) {
      try {
         File file = new File(String.format("%s.txt", person.getLastName()));
         file.createNewFile();
         FileWriter fw = new FileWriter(file);
         writePersonData(fw, person);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private void addToFile(Person person) {
      try {
         FileWriter fw = new FileWriter(String.format("%s.txt", person.getLastName()), true);
         writePersonData(fw, person);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private void writePersonData(FileWriter fw, Person person) {
      try {
         fw.write(String.format("<%s>", person.getFirstName()));
         fw.write(String.format("<%s>", person.getSecondName()));
         fw.write(String.format("<%s>", person.getLastName()));
         fw.write(String.format("<%s>", person.getBirthDate()));
         fw.write(String.format("<%s>", person.getPhoneNumber()));
         fw.write(String.format("<%s>\n", person.getGender()));
         fw.flush();
         fw.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
