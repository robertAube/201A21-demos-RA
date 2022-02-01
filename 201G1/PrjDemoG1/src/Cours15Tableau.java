public class Cours15Tableau {
    public Cours15Tableau() {
        testerAfficherTableau();
        testerGetTableDesMultiples();
    }

    private void testerAfficherTableau() {
        int [] tabTest1 = {1 ,2, 3};
        System.out.println(tabTest1);
        afficherTableau(tabTest1);
        afficherTableau(tabTest1);
        afficherTableau(new int[] {11, 22, 33, 44});
    }

    private void testerGetTableDesMultiples() {
        afficherTableau(getTableDesMultiples(7, 5));
        afficherTableau(getTableDesMultiples(12, 10));

        sontDesTableauxEgaux(getTableDesMultiples(7, 5), new int[] {7, 14, 21, 28, 35});
    }
    //méthode à faire dans le formatif 6
    private boolean sontDesTableauxEgaux(int[] tableDesMultiples, int[] test1) {
        return true;
    }
    private int[] getTableDesMultiples(int nb, int longueur) {
        int [] tabMultiple;
        tabMultiple = new int [longueur];

        for (int i = 0; i < tabMultiple.length; i++) {
            tabMultiple[i] = (i + 1) * nb;
        }

        return tabMultiple;
    }

    private void afficherTableau(int[] tableau) {
        System.out.print("{");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tableau[i]);
//            tableau[i] = 0; //change les valeur du tableau même dans la méthode appeleante (méthode qui m'a appelé)
        }
        System.out.println("}");
    }


    public static void main(String[] args) {
        new Cours15Tableau();
    }
}
