public class ForceCentripete {
    public ForceCentripete() {
        testerCalculerForceCentripete();
    }

    public void testerCalculerForceCentripete() {
        double force;
        force = calculerForceCentripete(0, 0, 1);

        System.out.println("La force centripete est de " + force  + " si...");
        System.out.println("masse = 0");
        System.out.println("vitesse = 0");
        System.out.println("rayon = 1");

        force = calculerForceCentripete(1, 1, 1);

        System.out.println("La force centripete est de " + force  + " si...");
        System.out.println("masse = 1");
        System.out.println("vitesse = 1");
        System.out.println("rayon = 1");

        afficherCentripete(1, 1, 1);
        afficherCentripete(1.2, 1, 1);
        afficherCentripete(100, 0, 1);
        afficherCentripete(1, 1, 2);
        afficherCentripete(1, 1, 4);
    }

    private void afficherCentripete( double masse, double vitesse, double rayon) {
        double force;

        force = calculerForceCentripete(masse, vitesse, rayon);

        System.out.println("La force centripete est de " + force  + " si...");
        System.out.println("masse = " + masse);
        System.out.println("vitesse = " + vitesse);
        System.out.println("rayon = " + rayon);
    }

    //calcule la force centripète en fonction de m, v et r. Cette méthode n’afficher rien, mais retourne le résultat du calcul.
    public double calculerForceCentripete( double masse, double vitesse, double rayon) {
        double force; //valeur de retour

        force = masse * Math.pow(vitesse, 2) / rayon;

        return force;
    }


    public static void main(String[] args) {
        new ForceCentripete();
    }
}
