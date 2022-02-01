public class Cours16Tableau2D {
    public Cours16Tableau2D() {
        demoTableau2D();

        //  int a = 2 / 0;

        for (int i = 0; i <= 4; i++) {
            System.out.println(i + "! = " + factorielle(i));
        }

        demoString();
    }

    private void demoString() {
        String nom = "Fortin";

        for (int i = 0; i < nom.length(); i++) {
            System.out.println(nom.charAt(i));
        }

    }

    private int factorielle(int n) {
        int f = 1;

        if (n < 0)
            throw new IllegalArgumentException("Factoriel d'un nombre négatif n'est pas valide");

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                f *= i;
            }
        }

        return f;
    }

    private void demoTableau2D() {
        int[][] t2d1 = {{1, 2, 3}, {4, 5, 6}}; //tableau de 2 lignes par 3 colonnes

        int[][] t2D2 = new int[4][2]; //tableau 2D de 4 lignes et 2 colonnes

        System.out.println(getStringTabInt2D(t2d1));
    }

    private String getStringTabInt2D(int[][] t2d) {
        String str = "";
        for (int ligne = 0; ligne < t2d.length; ligne++) {
            for (int colonne = 0; colonne < t2d[ligne].length; colonne++) {
                str += (colonne == 0 ? "{" : ", ") + t2d[ligne][colonne];
            }
            str += "}\n";
        }

        return str;
    }

    public static void main(String[] args) {
        new Cours16Tableau2D();
    }
}
