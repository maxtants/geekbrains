import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Raffler {
   ArrayList<Toy> toys = new ArrayList<>();
   Queue<Toy> prises = new LinkedList<>();

   public void addToy(Toy toy) {
      for (int i = 0; i < toy.getAmount(); i++) {
         toys.add(toy);
      }
   }

   public void runRaffle() {
      Toy[] toysArr = toys.toArray(new Toy[0]);
      int i = (int) (Math.random() * toysArr.length);
      System.out.printf("Your prise is: %s!", toysArr[i].getName());
      System.out.println();
      toys.remove(toysArr[i]);
      prises.add(toysArr[i]);
   }

   public void getPrise() {
      if (prises.size() == 0) {
         System.out.println("No prises left!");
         return;
      }
      try {
         File file = new File("prises.txt");
         file.createNewFile();
         FileWriter writer = new FileWriter(file, true);
         writer.write(prises.poll().getName() + "\n");
         writer.flush();
         writer.close(); 
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      

   }

}
