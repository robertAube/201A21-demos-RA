public class Exercice1 {
    //constructeur : Méthode qui a le même nom que la classe
    public Exercice1() {
        calculerEtAfficherAgeJean(); //appel à une méthode
    }

    //calculerEtAfficherAgeJean, calcule et affiche l’âge de Jean sachant que Jean a 3 fois l’âge de Julie qui a 10 ans.
    private void calculerEtAfficherAgeJean() {
        int ageJulie;
        int ageJean;

        ageJulie = 12;
        ageJean = 3 * ageJulie;

        System.out.println("Si Julie a " + ageJulie + " ans, Jean a " + ageJean + " ans.");
    }

    //où débute le programme
    public static void main(String[] args) {
        new Exercice1();
    }
}
