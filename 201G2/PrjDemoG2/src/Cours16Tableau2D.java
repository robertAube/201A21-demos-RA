import java.util.Scanner;

public class Cours16Tableau2D {
    public Cours16Tableau2D() {
        demoTableau2D();
        demoString();
        demoLireInt();
    }

    private void demoLireInt() {
        System.out.println(lireInt("Donnez un nombre ?"));


        saisirIntEntre("Entrez un nombre 1 : ", 2,5);
        saisirIntEntre("Entrez un nombre 2 : ", 100,3);
    }

    public int saisirIntEntre(String question, int min, int max) {
        int valeurSaisi;
        if (max < min) {
            throw new IllegalArgumentException("max "+ max + " doit être plus grand que min " + min);
        }
        valeurSaisi = lireInt(question);
        return valeurSaisi;
    }

    public int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }


    public String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private void demoString() {
        String nom = "Fortin";

        for (int i = 0; i < nom.length(); i++) {
            System.out.print(nom.charAt(i));
        }
    }

    private void demoTableau2D() {
        int[] t1 = {1, 2, 2, 4, 8};
        int[][] t2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; //tableau de 4 lignes par 3 colonnes

        int [][] t2d2 = new int[2][3]; //tableau de 2 lignes par 3 colonnes

        System.out.println(getStringTabInt2D(t2d));
    }

    private String getStringTabInt2D(int[][] t2d) {
        String str = "";
        for (int ligne = 0; ligne < t2d.length; ligne++) { //Pour chaque ligne
            for (int colonne = 0; colonne < t2d[ligne].length; colonne++) {
                str += (colonne == 0 ? "[" : ", ") + t2d[ligne][colonne];
            }
            str += "]\n";
        }
        return str;
    }

    public static void main(String[] args) {
        new Cours16Tableau2D();
    }
}
