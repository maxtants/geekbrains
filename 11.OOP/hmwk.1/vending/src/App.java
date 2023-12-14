public class App {
    public static void main(String[] args) throws Exception {
        HotDrink tea = new HotDrink("tea", 4, 90);
        HotDrink cofe = new HotDrink("cofe", 3, 85);
        HotDrink cacao = new HotDrink("cacao", 5, 95);

        HotDrinksVendingMachine htvm = new HotDrinksVendingMachine();
        htvm.addHotDrink(tea);
        htvm.addHotDrink(cofe);
        htvm.addHotDrink(cacao);

        for (HotDrink hd : htvm.hotDrinks) {
            System.out.println(hd);
        }

    }
}
