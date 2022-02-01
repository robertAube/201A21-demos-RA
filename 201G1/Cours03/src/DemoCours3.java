public class DemoCours3 {
    public DemoCours3() {
        //testerCalculerEtAfficherAgeJean();
        //testerCalculerEtAfficherForce();
        testerCaclulerEtAffciherForceV2();

    }

    private void testerCaclulerEtAffciherForceV2() {
        calulerEtAfficherForceV2(2, 5);


        System.out.println("Si la masse est de 2 et l'acceleration de 3 la force est de " + calculerForce(2, 3) + ".");
    }

    private void testerCalculerEtAfficherForce() {
        calculerEtAfficherForceV1(5,2);
        calculerEtAfficherForceV1(1,6);
        calculerEtAfficherForceV1(4.3,2.1);
    }


    private void testerCalculerEtAfficherAgeJean() {
        int ageJulie;

        ageJulie = 15;
        calculerEtAfficherAgeJean(10);
        calculerEtAfficherAgeJean(11);
        calculerEtAfficherAgeJean(12);
        calculerEtAfficherAgeJean(13);
        calculerEtAfficherAgeJean(14);
        calculerEtAfficherAgeJean(55);
        calculerEtAfficherAgeJean(ageJulie);
    }

    //f = ma
    //Ici on a passé 2 valeurs : masse et l'accélération
    private void calculerEtAfficherForceV1(double masse, double acceleration) {
        double force;

        force = masse * acceleration;

        System.out.println(" masse = " + masse);
        System.out.println(" accélération = " + acceleration);
        System.out.println(" force = " + force);
    }

    //cette méthode retoune rien parce qu'elle est void
    private void calulerEtAfficherForceV2(double masse, double acceleration) {
        double force;

        force = calculerForce(masse, acceleration);

        System.out.print(" masse = " + masse + "\n");
        System.out.println(" accélération = " + acceleration);
        System.out.println(" force = " + force);
    }

    //Cette méthode retoune un double
    private double calculerForce(double masse, double acceleration) {
        double force;
        force = masse * acceleration;

        return force; // cette méthode retourne la force caclulé à partir de la masse et l'accéléraiton
    }

    //calculerEtAfficherAgeJean, calcule et affiche l’âge de Jean sachant que Jean a 3 fois l’âge de Julie qui a 10 ans.
    //ageJulie a été pasasé en argument
    private void calculerEtAfficherAgeJean(int ageJuli) {
        int ageJean;

        ageJean = 3 * ageJuli;

        System.out.println("Si Julie a " + ageJuli + " ans, Jean a " + ageJean + " ans.");
    }

    public static void main(String[] args) {
        new DemoCours3();
    }
}
