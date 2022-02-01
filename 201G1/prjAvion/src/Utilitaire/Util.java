package Utilitaire;

import java.util.Random;
import java.util.Scanner;

public class Util {

    public static int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit être plus grand que min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int lireEntierValide(String question, int valeurMin, int valeurMax) {
        int valeurUsager;

        do {
            valeurUsager = lireEntier(question);
            if (valeurUsager < valeurMin) {
                System.out.println("Erreur : " + valeurUsager + " est inférieur à " + valeurMin + ".");
            } else if (valeurUsager > valeurMax) {
                System.out.println("Erreur : " + valeurUsager + " est supérieur à " + valeurMax + ".");
            }
        } while (valeurUsager < valeurMin || valeurMax < valeurUsager);

        return valeurUsager;
    }

    public static int lireEntier(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public static String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }
}
