import java.util.Scanner;

import controller.InputController;
import controller.SavingController;
import model.Person;

public class App {
    static Scanner scanner;
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        
        while (true) {
            init();
            System.out.println();
            System.out.print("Data added successfully! Would you like to add another person? (y/n): ");
            scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("n")) {
                System.exit(0);
            } 
            System.out.println();
        }
       
    }

    private static void init() {
        InputController inputController = new InputController();
        Person person = inputController.inputPersonData();
        SavingController savingController = new SavingController();
        savingController.savePersonDataToFile(person);
    }
}
