public class Cours11Boucles {
    Cours11Boucles() {
        exempleCast();
        //afficherAlphabet();
    }

    private void exempleCast() {
        char lettre = 'a';
        int valInt = 2;
        double valDouble = 12.2345;
        double  quotient;

        lettre += valInt;

        System.out.println(lettre);

        System.out.println(valDouble + " - (int) valDouble -> " + (int) valDouble);

        quotient = 17 / 3;
        System.out.println(quotient);

        quotient = 17.0 / 3.0;
        System.out.println(quotient);

        quotient = (double) 17 / 3;
        System.out.println(quotient);
    }

    // En utilisant une boucle for la méthode  affiche l’alphabet, d’abord à l’endroit, puis à l’envers, après un saut de ligne.
    public void testerAffichageCaracere() {
        char lettre = 'a';
        System.out.println(lettre); //char
        System.out.println(lettre + 1); //int
        System.out.println((char) (lettre + 1)); //cast
        lettre++;
        System.out.println(lettre); //char
    }

    public void afficherAlphabet() {
        for (char lettre = 'a'; lettre <= 'z'; lettre++) {
            System.out.print(lettre);
        }
        System.out.println();
        for (char lettre = 'z'; lettre >= 'a'; lettre--) {
            System.out.print(lettre);
        }
    }


    public static void main(String[] args) {
        new Cours11Boucles();
    }
}
