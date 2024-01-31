package controller;


import service.CalculationService;

public class CalculatorController {

   public void createTask() {
      
      CalculationService cs = new CalculationService();
      cs.calculate();
   }
}
