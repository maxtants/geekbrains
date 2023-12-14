public class HotDrink {
   private String name;
   private int volume;
   private int temperature;

   
   public void setTemperature(int temperature) {
      this.temperature = temperature;
   }

   public HotDrink(String name, int volume, int temperature) {
      this.name = name;
      this.volume = volume;
      this.temperature = temperature;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getVolume() {
      return volume;
   }

   public void setPrice(int volume) {
      this.volume = volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   public int getTemperature() {
      return temperature;
   }


   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return String.format("%s: %d", name, volume);
   }
}