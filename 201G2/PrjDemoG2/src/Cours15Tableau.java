public class Cours15Tableau {
    public Cours15Tableau() {
        testerGetTableDesMultiples();
    }

    private void testerGetTableDesMultiples() {
        int test1[] = {7, 14, 21, 28, 35};
        afficherTableau(getTableDesMultiples(7, 5));

        System.out.println(sontDesTableauxEgaux(getTableDesMultiples(7, 5), test1));
        System.out.println(sontDesTableauxEgaux(getTableDesMultiples(17, 6), new int [] {17, 34, 51, 68, 85, 102}));
    }

    //méthode à faire dans le formatif 6
    private boolean sontDesTableauxEgaux(int[] tableDesMultiples, int[] test1) {
        return true;
    }

    private int[] getTableDesMultiples(int nb, int longueur) {
        int [] tabMultiple;

        tabMultiple = new int[longueur];
        for (int i=0; i<longueur; i++) {
            tabMultiple[i] = (i + 1) * nb;
        }

        return tabMultiple;
    }

    private void afficherTableau(int[] tableau) {
        System.out.print("{");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tableau[i]);
        }
        System.out.println("}");
    }


    public static void main(String[] args) {
        new Cours15Tableau();
    }
}
