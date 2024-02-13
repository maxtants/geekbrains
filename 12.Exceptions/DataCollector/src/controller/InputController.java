package controller;

import model.Person;
import view.InputView;

public class InputController {
   public Person inputPersonData() {
      Person person = new Person();
      InputView inputView = new InputView();
      person.setFirstName(inputView.inputFirstName());
      person.setSecondName(inputView.inputSecondName());
      person.setLastName(inputView.inputLastName());
      person.setBirthDate(inputView.inputBirthDate());
      person.setPhoneNumber(inputView.inputPhoneNumber());
      person.setGender(inputView.inputGender());
      return person;
   }
}
