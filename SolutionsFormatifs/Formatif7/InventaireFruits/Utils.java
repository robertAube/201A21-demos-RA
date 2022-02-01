//Robert Aubé

import java.util.Scanner;

public class Utils {
    public static String LIGNE_D_ETOILES = "***********************************************\n";

    public static String afficherLigne() {

        return ("***********************************************\n");
    }

    public static String to2Decimal(double value) {
        String strFormatAvec2Decimales;
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        strFormatAvec2Decimales = df.format(value);
        return strFormatAvec2Decimales;
    }

    public static double lireDouble(String question) {
        String reponseUtilisateur;
        double reponseDouble;

        reponseUtilisateur = lireString(question);
        reponseDouble = Double.parseDouble(reponseUtilisateur);

        return reponseDouble;
    }

    public static int lireInt(String question) {
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
