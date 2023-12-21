import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior {
   List<Actor> actors = new ArrayList<>();

   @Override
   public void acceptToMarket(Actor actor) {
      // TODO Auto-generated method stub
      takeInQueue(actor);
   }

   @Override
   public void releaseFromMarket(List<Actor> actors) {
      // TODO Auto-generated method stub
      for (Actor actor : actors) {
         releaseFromQueue();
         actors.remove(actor);
      }
   }

   @Override
   public void update() {
      // TODO Auto-generated method stub
      System.out.println("Обновляем инфу про магаз");
   }

   @Override
   public void giveOrders() {
      // TODO Auto-generated method stub
      takeOrders();
   }

   @Override
   public void releaseFromQueue() {
      // TODO Auto-generated method stub
      System.out.println("Вышел из очереди");
   }

   @Override
   public void takeInQueue(Actor actor) {
      // TODO Auto-generated method stub
      actors.add(actor);
   }

   @Override
   public void takeOrders() {
      // TODO Auto-generated method stub
      for (Actor actor : actors) {
          if (!actor.hasOrder) {
            actor.hasOrder = true;
          }
      }
     
   }
   
   
}
