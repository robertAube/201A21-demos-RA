/*
Cours : 420-201 – Introduction à la programmation
Groupe : 1
Nom : Aubé
Prénom : Robert
DA : 1234567
*/
import java.util.Scanner;

public class Formatif3Sol {
    public Formatif3Sol() {
        testerAfficherInfoRectangle();
        demanderEtAfficherInfoRectangle();
    }

    private void demanderEtAfficherInfoRectangle() {
        String couleur;
        int longueur;
        int largeur;

        longueur = lireEntier("Quelle est la longueur de votre rectangle? ");
        largeur = lireEntier("Quelle est la largeur de votre rectangle? ");
        couleur = lireString("Quelle est la couleur de votre rectangle? ");

        afficherInfoRectangle(couleur, longueur, largeur);
    }

    private void testerAfficherInfoRectangle() {
        afficherInfoRectangle("bleu", 3, 7);
        afficherInfoRectangle("ROUGE", 1, 2);
        afficherInfoRectangle("ROUGE", 0, 0);
    }

    private void afficherInfoRectangle(String couleur, int longueur, int largeur) {
        System.out.println("Le rectangle a une longueur de " + longueur + " et une largeur de " + largeur);
        System.out.println("Le rectangle est " + couleur);
        System.out.println("Son périmètre est de " + calculerPerimetre(longueur, largeur));
        System.out.println("Son air est de " + calculerAire(longueur, largeur));
    }

    private int calculerPerimetre(int longueur, int largeur) {
        int perimetre;
		
        perimetre = 2 * (longueur + largeur);
		
        return perimetre;
    }

    private int calculerAire(int longueur, int largeur) {
        int aire;
		
        aire = longueur * largeur;
		
        return aire;
    }

    private int lireEntier(String question) {
        int intReponse = 0;
        String strReponse;

        strReponse = lireString(question);
        intReponse = Integer.parseInt(strReponse);

        return intReponse;
    }

    public void demoParseInt() {
        String strValeur = "2020";
        int intValeur;

        intValeur = Integer.parseInt(strValeur);

        System.out.println("La chaîne est " + strValeur);
        System.out.println("L'entier est " + intValeur);
        System.out.println("Si on ajoute 1 à l'entier, on a : " + (intValeur + 1));
        System.out.println("Si on ajoute 1 à la string, on a : " + (strValeur + 1));
    }

    private void testerLireString() {
        System.out.println(lireString("Quel est votre prénom ? "));
        String reponse = lireString("Où allez-vous ? ");
        System.out.println(reponse);
        lireString("À quel cégep tu vas ? ");
        System.out.println("Intéressant...");
    }

    private String lireString(String question) {
        Scanner sc;
        String reponse = "rep";

        sc = new Scanner(System.in);
        afficherQuestion(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private void testerAfficherQuestion() {
        afficherQuestion("Quel est votre prénom?");
        String q = "Quelle est votre couleur favorite?";
        afficherQuestion(q);
    }


    private void afficherQuestion(String question) {
        System.out.print(question);
    }

    public static void main(String[] args) {
        new Formatif3Sol();
    }
}
