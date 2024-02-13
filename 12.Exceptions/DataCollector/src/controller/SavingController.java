package controller;

import model.Person;
import service.SavingService;

public class SavingController {
   public void savePersonDataToFile(Person person) {
      SavingService savingService = new SavingService();
      savingService.saveToFile(person);
   }
}
