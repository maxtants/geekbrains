public class App {
    public static void main(String[] args) throws Exception {
        Toy t1 = new Toy("bag", 10, 10);
        Toy t2 = new Toy("cap", 40, 40);
        Toy t3 = new Toy("ball", 50, 50);
        Raffler raffler = new Raffler();
        raffler.addToy(t1);
        raffler.addToy(t2);
        raffler.addToy(t3);
        
        raffler.runRaffle();
        raffler.runRaffle();
        raffler.runRaffle();
        raffler.runRaffle();

        raffler.getPrise();
        raffler.getPrise();
        raffler.getPrise();
        raffler.getPrise();
        raffler.getPrise();
    }
}
