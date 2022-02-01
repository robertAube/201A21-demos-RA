public class CalculeAgeJean {
    //méthode constructeur
    public CalculeAgeJean() {
        calculerEtAfficherAgeJeanV1();

        calculerEtAfficherAgeJeanV2(10); //Je passe la valeur 10 en paramètre (paramètre = argument)
        calculerEtAfficherAgeJeanV2(11); //Je passe la valeur 10 en paramètre (paramètre = argument)
        calculerEtAfficherAgeJeanV2(5); //Je passe la valeur 10 en paramètre (paramètre = argument)
        calculerEtAfficherAgeJeanV2(14); //Je passe la valeur 10 en paramètre (paramètre = argument)
    }

    private void calculerEtAfficherAgeJeanV2(int ageJulie) {
        int ageJean;

        ageJean = 3 * ageJulie;

        System.out.println("Si Julie a " + ageJulie + " ans, alors Jean a " + ageJean + " ans.");
    }

    //calcule et affiche l’âge de Jean sachant que Jean a 3 fois l’âge de Julie qui a 10 ans.
    private void calculerEtAfficherAgeJeanV1() {
        int ageJean;
        int ageJulie;

        ageJulie = 10;
        ageJean = 3 * ageJulie;

        System.out.println("Si Julie a " + ageJulie + " ans, alors Jean a " + ageJean + " ans.");
    }


    public static void main(String[] args) {
        new CalculeAgeJean();
    }
}
