public class Cours01BonjourLeMonde {

    //méthode du constructeur
    Cours01BonjourLeMonde() {
        System.out.println("Je suis dans le constructeur");
        afficherMonNom();
        faireDesAdditionsV1();
        faireDesAdditionsV2();
        FaireDesAdditionsAvecDesReels();
    }

    private void FaireDesAdditionsAvecDesReels() {
        double val;

        val = 2.3; //affectation
        System.out.println("val = 2.3 --> " + val); // affiche 2.3
        val = val + 1;
        System.out.println("val = val + 1 --> " + val); // affiche 3.3
    }

    private void afficherMonNom() {
        System.out.println("Aubé");
        afficherMonPrenom();
    }

    private void afficherMonPrenom() {
        System.out.println("Robert");
    }

    private void faireDesAdditionsV1() {
        System.out.println("1 + 1 = ");
        System.out.println(1 + 1);
    }


    private void faireDesAdditionsV2() {
        int rep; //déclaration d'une variable entière

        rep = 2 + 2;
        System.out.println("2 + 2 = ");
        System.out.println(rep);

        rep = rep + 1;
        System.out.println("rep + 1 = " + rep);

    }

    //métode où le programme commence.
    public static void main(String[] args) {
        System.out.println("Boujour le monde");
        System.out.println("Cours de programmation");

        new Cours01BonjourLeMonde();
    }
}
