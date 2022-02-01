public class DemoRetourMethode {
    public DemoRetourMethode() {
        testerCaclulerAirRectangle();
    }

    private void testerCaclulerAirRectangle() {
        int air = calculerAirRectangle(3,4);

        System.out.println("Si une rectangle fait 3 x 4, l'air est de " + air);
        System.out.println("Si une rectangle fait 1 x 4, l'air est de " + calculerAirRectangle(1, 4));
        calculerEtAfficherAirRectangle(3, 11);
    }

    private void testerCalculeForce() {
        double force;
        force = calculerForce(2, 3);
        System.out.println("force = " + force);

        System.out.println("Si la masse est de 4 et l'accération de 5, alors la force est de " + calculerForce(4, 6));

        calculerEtAfficherForce(2, 10);

        testerCalculeForce();
    }

    //déclaration de la méthode
    //Écrire une fonction calculerEtAfficherForce qui reçoit en argument l’accélération (a) et la masse (m) et qui affiche la force (F) en utilisant la formule suivante :
    //F = ma
    private void calculerEtAfficherForce(double acceleration, double masse) {
        double force;
        force = calculerForce(masse, acceleration);
        System.out.println("Acceleration = " + acceleration);
        System.out.println("Masse = " + masse);
        System.out.println("Force = " + force);
    }

    private double calculerForce(double masse, double acceleration) {
        double force;

        force = masse * acceleration;

        return force;
    }


    private void calculerEtAfficherAirRectangle(int largeur, int hauteur) {
        int air;
        air = calculerAirRectangle(largeur, hauteur);
        System.out.println("largeur = " + largeur);
        System.out.println("hauteur = " + hauteur);
        System.out.println("air = " + air);
    }

    private int calculerAirRectangle(int largeur, int hauteur) {
        int air;

        air = largeur * hauteur;
        return air;
    }


    public static void main(String[] args) {
        new DemoRetourMethode();
    }
}
