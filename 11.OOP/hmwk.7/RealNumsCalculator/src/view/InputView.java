package view;

import java.util.Scanner;

import model.Operand;
import model.Operator;

public class InputView {
   Scanner scanner = new Scanner(System.in);

   public Operator inputOperator() {
      while (true) {
         System.out.print("Выберите тип операции (+, *, /): ");
         String input = scanner.nextLine();
         if (input.equals("+") || input.equals("*") || input.equals("/")) {
            Operator operator = new Operator(input);
            return operator;
         } else {
            ErrorView.showError();
         }
      }

   }

   public Operand inputOperand(int operandNumber) {
      while (true) {
         System.out.printf("Введите операнд %d: ", operandNumber);
         boolean isDouble = scanner.hasNextDouble();
         String input = scanner.nextLine();
         if (isDouble) {
            Operand operand = new Operand(Double.parseDouble(input));
            return operand;
         } else {
           ErrorView.showError();
         }
      }
   }
}
