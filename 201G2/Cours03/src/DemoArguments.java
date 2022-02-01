public class DemoArguments {
    public DemoArguments() {
        testerCalculerEtAfficherForce();
        testerCalculerEtAfficherAirRectangle();
    }

    private void testerCalculerEtAfficherAirRectangle() {
        calculerEtAfficherAirRectangle(2,3);
        calculerEtAfficherAirRectangle(3,2);
        calculerEtAfficherAirRectangle(3,3);
        calculerEtAfficherAirRectangle(0,0);
        calculerEtAfficherAirRectangle(-2,3);
    }

    private void calculerEtAfficherAirRectangle(int largeur, int hauteur) {
        int air;
        air = largeur * hauteur;
        System.out.println("largeur = " + largeur);
        System.out.println("hauteur = " + hauteur);
        System.out.println("air = " + air);
    }

    private void testerCalculerEtAfficherForce() {
        calculerEtAfficherForce(1, 2); //l'appel de la méthode
        calculerEtAfficherForce(0, 2); //l'appel de la méthode
        calculerEtAfficherForce(3.1, 2.4); //l'appel de la méthode
        calculerEtAfficherForce(100, 200); //l'appel de la méthode
    }

    //déclaration de la méthode
    //Écrire une fonction calculerEtAfficherForce qui reçoit en argument l’accélération (a) et la masse (m) et qui affiche la force (F) en utilisant la formule suivante :
    //F = ma
    private void calculerEtAfficherForce (double acceleration, double masse) {
        double force;
        force = masse * acceleration;
        System.out.println("Acceleration = " + acceleration);
        System.out.println("Masse = " + masse);
        System.out.println("Force = " + force);
    }

    public static void main(String[] args) {
        new DemoArguments();
    }
}
