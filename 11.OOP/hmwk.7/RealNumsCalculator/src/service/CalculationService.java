package service;

import controller.CalculatorController;
import model.Operand;
import model.Operator;
import view.ErrorView;
import view.InputView;
import view.OutputView;

public class CalculationService {

   public void calculate() {
      
      Double result = null;
      
      InputView inputView = new InputView();
      Operator operator = inputView.inputOperator();
      Operand operand_1 = inputView.inputOperand(1); 
      Operand operand_2 = inputView.inputOperand(2);
      
      switch (operator.getOperator()) {
         case "+":
            result = operand_1.getOperand() + operand_2.getOperand(); 
            break;
         case "*":
            result = operand_1.getOperand() * operand_2.getOperand(); 
            break;
         case "/":
            if (operand_1.getOperand() != 0 && operand_2.getOperand() != 0) {
               result = operand_1.getOperand() / operand_2.getOperand(); 
            } else {
               ErrorView.showError();
               CalculatorController cc = new CalculatorController();
               cc.createTask();
            }
            break;
         default:
            break;
      }

      OutputView outputView = new OutputView();
      outputView.print(Double.toString(result));
   }
}
