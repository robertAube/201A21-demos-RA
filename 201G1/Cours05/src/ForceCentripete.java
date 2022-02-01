public class ForceCentripete {
    public ForceCentripete() {
        testerCalculerForceCentripete();
    }

    public void testerCalculerForceCentripete() {
        double forceCentripete;
        forceCentripete =  calculerForceCentripete(1, 2,1);
        System.out.println(forceCentripete);

        forceCentripete =  calculerForceCentripete(2, 1,4);
        System.out.println(forceCentripete);

        System.out.println(calculerForceCentripete(2, 1,4));

        afficherForceCentripete(1, 2,1);

        afficherForceCentripete(2, 1,4);
    }

    public void afficherForceCentripete(double masse, double vitesse, double rayon) {
        double forceCentripete;

        forceCentripete =  calculerForceCentripete(1, 2,1);
        System.out.println("Masse : " + masse);
        System.out.println("Vitesse : " + vitesse);
        System.out.println("Rayon : " + rayon);

        System.out.println("Force centripete : " + forceCentripete);
    }

    // calcule la force centripète en fonction de m, v et r.
    // Cette méthode n’afficher rien, mais retourne le résultat du calcul.
    public double calculerForceCentripete(double masse, double vitesse, double rayon) {
        double forceC;

        forceC = masse * Math.pow(vitesse, 2) / rayon;

        return forceC;
    }

    public static void main(String[] args) {
        new ForceCentripete();
    }
}
