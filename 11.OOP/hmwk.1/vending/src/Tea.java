public class Tea extends HotDrink {
   
   private int temperature;

   public Tea(String name, int volume, int temperature) {
      super(name, volume, temperature);
   }

   public int getTemperature() {
      return temperature;
   }

   public void setTemperature(int temperature) {
      this.temperature = temperature;
   }
}
