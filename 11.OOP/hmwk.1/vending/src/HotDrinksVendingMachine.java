import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachine {

   ArrayList<HotDrink> hotDrinks = new ArrayList<>();

   @Override
   public Product getProduct(String name) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
   }

   @Override
   public Product getProduct(String name, double volume) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
   }
   
   public HotDrink getHotDrink(String name, int volume, int temperature) {
      for (HotDrink hotDrink : hotDrinks) {
         if (hotDrink.getName().equals(name) 
            && hotDrink.getVolume() == volume 
            && hotDrink.getTemperature() == temperature) {
               return hotDrink;
         }
      }

      return null;
   }

   public void addHotDrink(HotDrink hotDrink) {
      hotDrinks.add(hotDrink);
   }
}
