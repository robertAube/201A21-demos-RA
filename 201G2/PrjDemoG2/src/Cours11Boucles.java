public class Cours11Boucles {
    Cours11Boucles() {
        afficherAlphabet();
    }

    // En utilisant une boucle for la méthode  affiche l’alphabet, d’abord à l’endroit, puis à l’envers, après un saut de ligne.

    public void afficherAlphabet() {
        for (char lettre = 'a'; lettre <= 'z'; lettre++)
        {
            System.out.print(lettre);
        }
        System.out.println();
//        for (char lettre = 'a'; lettre <= 'z'; lettre++)
//        {
//            System.out.print((int) lettre);
//        }
//        System.out.println();
//        for (char lettre = 'A'; lettre <= 'Z'; lettre++)
//        {
//            System.out.print((int) lettre);
//        }

        for (char lettre = 'z'; lettre >= 'a'; lettre--)
        {
            System.out.print(lettre);
        }

    }

    public static void main(String[] args) {
        new Cours11Boucles();
    }
}
