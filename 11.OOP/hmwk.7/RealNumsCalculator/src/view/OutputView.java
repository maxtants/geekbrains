package view;

import java.util.Scanner;

import controller.CalculatorController;

public class OutputView {
   public void print(String result) {
      System.out.println();
      System.out.printf("Результат операции: %s \n", result);
      System.out.println();

      System.out.print("Перейти к следующей операции? (y/n): ");
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      if (answer.equals("y")) {
         System.out.println();
         CalculatorController cc = new CalculatorController();
         cc.createTask();
         scanner.close();
      } else {
         System.exit(0);
      }

   }
}
