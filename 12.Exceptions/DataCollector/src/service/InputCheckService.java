package service;

public class InputCheckService {
   public boolean checkName(String name) throws RuntimeException {
      if (name.equals("") || name.contains(" ")) {
         throw new RuntimeException("Your name cannot be empty or contain spaces!");
      }
      return true;
   }

   public boolean checkBirthDate(String birthDate) throws RuntimeException {
      String regex = "^[0-3][1-9][.][0-1][0-9][.][1,2][0-9]{3}$";
      if (!birthDate.matches(regex)) {
         throw new RuntimeException("Birth date doesn't match the format!");
      }
      return true;
   }

   public boolean checkPhoneNumber(String phoneNumber) {
      String regex = "^\\d{11}$";
      if (!phoneNumber.matches(regex)) {
         throw new RuntimeException("Phone number doesn't match the format!");
      }
      return true;
   }

   public boolean checkGender(String gender) {
      if (!(gender.contains("m") || gender.contains("f"))) {
         throw new RuntimeException("Gender doesn't match the format!");
      }
      return true;
   }
}

    
