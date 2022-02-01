//Robert Aubé
public class Inventaire {

    public static Fruit[] getStockFruitFaible(Fruit[] tabFruit, int stockFaible) {
        int nbFruitStockFaible = getNbFruitStockFaible(tabFruit, stockFaible);

        Fruit[] tabFruitFaible = new Fruit[nbFruitStockFaible];

        for (int i = 0, j = 0; i < tabFruit.length; i++) {
            int quantité = tabFruit[i].getQuantite();
            if (quantité < stockFaible) {
                tabFruitFaible[j] = tabFruit[i];
                j++;
            }
        }
        return tabFruitFaible;
    }

    private static int getNbFruitStockFaible(Fruit[] tabFruit, int stockFaible) {
        int nbFruitStockFaible;
        int qteDuFruit;

        nbFruitStockFaible = 0;
        for (int i = 0; i < tabFruit.length; i++) {
            qteDuFruit = tabFruit[i].getQuantite();
            if (qteDuFruit < stockFaible) {
                nbFruitStockFaible++;
            }
        }
        
        return nbFruitStockFaible;
    }
}
