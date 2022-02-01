public class Mathematique {
    public Mathematique() {
        System.out.println("Faire des mathématiques");
        calculer1et1V1();
        calculer1et1V2();
        calculerLaSommeDe2Reel();
    }

    private void calculerLaSommeDe2Reel() {
        double valeur1;
        double valeur2;
        double resultat;

        valeur1 = 2.3;
        valeur2 = 3.1;

        resultat = valeur1 + valeur2;

        System.out.println( valeur1 + " + " + valeur2 + " = " + resultat);
    }

    //Avec utilisation de variables
    private void calculer1et1V2() {
        int valeur;
        valeur = 1 + 1; //affection
        System.out.println("1 + 1 = " + valeur); // + fait une concaténation de "1 + 1" et de la variable valeur qui a été transformé en chaine de caractère
    }

    private void calculer1et1V1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1); // + fait une addition
    }

    public static void main(String[] args) {
        new Mathematique();
    }
}
