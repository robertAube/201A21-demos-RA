import java.sql.SQLOutput;

public class PremierPgm {
    //Méthode constructeur de la classe PremierPgm
    public PremierPgm() {
        System.out.println("Je suis dans le constructeur de la classe PremierPgm");
        afficherNom(); //appeler la méthode afficherNom()
        afficherPrenom();
        afficherPrenomEtNom();
    }

    private void afficherPrenomEtNom() {
        afficherPrenom();
        afficherNom();
    }

    private void afficherNom() {
        System.out.println("Nom: Aubé");
    }

    private void afficherPrenom() {
        System.out.println("Prénom: Robert");
    }

    //Méthode main: Là que commence le programme
    public static void main(String[] args) { //main
        System.out.println("Bonjour le monde!!!"); //sout
        System.out.println("Cégep Limoilou!"); //sout

        new PremierPgm(); //instancier la classe PremierPgm
    }
}
