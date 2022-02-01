public class ExerciceRectangle {
    public ExerciceRectangle() {
        testerCalculerAirRectangle();
    }

    //testerCalculerAirRectangle qui teste cette dernière plusieurs fois
    public void  testerCalculerAirRectangle() {
        double air1;
        air1 = calculerAirRectangle(2, 3);
        System.out.println("l'air d'un rectangle de 2 x 3 = " + air1);

        System.out.println("l'air d'un rectangle de 2 x 3 = " + calculerAirRectangle(2, 3));
        System.out.println("l'air d'un rectangle de 4 x 3 = " + calculerAirRectangle(4, 3));
        System.out.println("l'air d'un rectangle de 0 x 0 = " + calculerAirRectangle(0, 0));
        System.out.println("l'air d'un rectangle de 2 x 1 = " + calculerAirRectangle(2, 1));

        afficherAirRectangle(1, 3);
        afficherAirRectangle(1.1, 0);
        afficherAirRectangle(0, 0);
        afficherAirRectangle(1.2, 3.1);
        afficherAirRectangle(1, 3);
    }

    private void afficherAirRectangle(double hauteur, double largeur) {
        double air;

        air = calculerAirRectangle(hauteur, largeur);
        System.out.println("L'air d'un rectangle de " + hauteur + " x " + largeur + " = " + air);
    }

    // calculerAirRectangle qui reçoit en argument la hauteur et la largeur du rectangle et qui retourne l’air d’un rectangle.
    // Cette fonction ne fait pas d’affichage.
    public double  calculerAirRectangle(double hauteur, double largeur) {
        double air;

        air = hauteur * largeur;

        return air;
    }

    public static void main(String[] args) {
        new ExerciceRectangle();
    }
}
