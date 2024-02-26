public class Toy {
   private int id;
   private String name;
   private int amount;
   private int frequency;
   private static int count;

   public Toy(String name, int amount, int frequency) {
      this.id = ++count;
      this.name = name;
      this.amount = amount;
      this.frequency = frequency;
   }
   

   public int getId() {
      return id;
   }
 
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAmount() {
      return amount;
   }
   public void setAmount(int amount) {
      this.amount = amount;
   }
   public int getFrequency() {
      return frequency;
   }
   public void setFrequency(int frequency) {
      this.frequency = frequency;
   }

   @Override
   public String toString() {
      return String.format("id: %d, name: %s, amount: %d, frequency: %d", id, name, amount, frequency);
   }
   
}
