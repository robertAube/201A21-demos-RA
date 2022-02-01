//Robert Aubé
public class TesterInventaire {
    public TesterInventaire() {
        testerInventaire();
    }

    private void testerInventaire() {
        Fruit[] tabFruit = new Fruit[4];
        Fruit[] tabFruitLow;

        tabFruit[0] = new Fruit("pomme", 40);
        tabFruit[1] = new Fruit ( "banane", 20);
        tabFruit[2] = new Fruit ( "orange", 10);
        tabFruit[3] = new Fruit ( "raisin", 18);

        tabFruitLow = Inventaire.getStockFruitFaible(tabFruit, 19);

        for (int i = 0; i < tabFruitLow.length; i++) {
            System.out.println(tabFruitLow[i].toString());
        }
    }

    public static void main(String[] args) {
        new Tester();
    }
}
