package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import service.InputCheckService;

public class InputView {
   Scanner scanner = new Scanner(System.in);

   public String inputName() {
      String firstName = scanner.nextLine();
      boolean checked = false;
      try {
         InputCheckService inputCheckService = new InputCheckService();
         checked = inputCheckService.checkName(firstName);
      } catch (Exception e) {
         e.printStackTrace();
      }
      if (!checked) {
         inputFirstName();
      }
      return firstName;
   }

   public String inputFirstName() {
      System.out.print("Input your first name: ");
      return inputName();
   }

   public String inputSecondName() {
      System.out.print("Input your Second name: ");
      return inputName();
   }

   public String inputLastName() {
      System.out.print("Input your Last name: ");
      return inputName();
   }

   public LocalDate inputBirthDate() {
      System.out.print("Input your birth date (dd.mm.yyyy): ");
      String birthDate = scanner.nextLine();
      boolean checked = false;
      try {
         InputCheckService inputCheckService = new InputCheckService();
         checked = inputCheckService.checkBirthDate(birthDate);
      } catch (Exception e) {
         e.printStackTrace();
      }
      if (!checked) {
         inputBirthDate();
      }
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      LocalDate localDate = LocalDate.parse(birthDate, formatter);
      return localDate;
   }

   public long inputPhoneNumber() {
      System.out.print("Input your phone number (88001112233): ");
      String phoneNumber = scanner.nextLine();
      boolean checked = false;
      try {
         InputCheckService inputCheckService = new InputCheckService();
         checked = inputCheckService.checkPhoneNumber(phoneNumber);
      } catch (Exception e) {
         e.printStackTrace();
      }
      if (!checked) {
         inputPhoneNumber();
      }
      return Long.parseLong(phoneNumber);
   }

   public char inputGender() {
      System.out.print("Input your gender (m/f): ");
      String gender = scanner.nextLine();
      boolean checked = false;
      try {
         InputCheckService inputCheckService = new InputCheckService();
         checked = inputCheckService.checkGender(gender);
      } catch (Exception e) {
         e.printStackTrace();
      }
      if (!checked) {
         inputGender();
      }
      return gender.contains("m") ? 'm' : 'f';
   }

}
