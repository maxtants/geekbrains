package model;

import java.time.LocalDate;

public class Person {
   private String firstName;
   private String secondName;
   private String lastName;
   private LocalDate birthDate;
   private long phoneNumber;
   private char gender;

   public String getFirstName() {
      return firstName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getSecondName() {
      return secondName;
   }
   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public LocalDate getBirthDate() {
      return birthDate;
   }
   public void setBirthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
   }
   public long getPhoneNumber() {
      return phoneNumber;
   }
   public void setPhoneNumber(long phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   public char getGender() {
      return gender;
   }
   public void setGender(char gender) {
      this.gender = gender;
   }
   
  
}
