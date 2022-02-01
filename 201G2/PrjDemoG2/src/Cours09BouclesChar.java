import java.util.Scanner;

public class Cours09BouclesChar {
    public Cours09BouclesChar() {
        demoChar();

        compterDe1ANAvecFor(3);
        compterDeNA1AvecFor(3);

        compterDe1ANAvecWhile(3);

        appuyerSurEspaceETEnterSVP();
        appuyerSurEspaceETEnterSVPVersionANePasFaire();

        testerModulo();
    }

    private void testerModulo() {
        int dividende;
        int diviseur;

        dividende = 6;
        diviseur = 2;
        System.out.println(dividende + " modulo " + diviseur + " = " + dividende % diviseur);
        dividende = 7;
        diviseur = 2;
        System.out.println(dividende + " modulo " + diviseur + " = " + dividende % diviseur);
        dividende = 13;
        diviseur = 3;
        System.out.println(dividende + " modulo " + diviseur + " = " + dividende % diviseur);
        dividende = 14;
        diviseur = 3;
        System.out.println(dividende + " modulo " + diviseur + " = " + dividende % diviseur);
    }

    public void appuyerSurEspaceETEnterSVP() {
        String strSaisie;

        do {
            strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        } while (!strSaisie.equals(" "));

        System.out.println("Bravo d'avoir appuyé sur l'espace!");
    }

    public void appuyerSurEspaceETEnterSVPVersionANePasFaire() {
        String strSaisie;

        strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        while (!strSaisie.equals(" ")) {
            strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        }

        System.out.println("Bravo d'avoir appuyé sur l'espace!");
    }

    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private void compterDe1ANAvecFor(int nb) {
        System.out.println("compterDe1ANAvecFor (" + nb + ")");
        //Boucle
        // for (initialisation du compteur; condition qui doit être vrai pour entrer dans la boucle et la poursuivre; incrémentation du compteur)
        // 1- exécuter la première partie du for (initialisation)
        // 2- vérifie la condition de la 2e partie
        //     - Si c'est vrai, on exécute l'intérieur du for
        //     - Si c'est faux, on sorte de la boucle
        // 3- selon le cas, on exécute l'intérieur du for
        // 4- on exécute la 3e partie du for, qui normalement une incrémentation
        // 5- on retourne faire 2.

        for (int cpt = 1; cpt <= nb; cpt++) {
            System.out.println(cpt);
        }
        // System.out.println(cpt);  //la variable cpmpteur n'existe plus!
    }

    private void compterDe1ANAvecWhile(int nb) {

        System.out.println("compterDe1ANAvecWhile (" + nb + ")");
        int cpt = 1;

        while (cpt <= nb) {
            System.out.println(cpt);
            cpt++;
        }
    }


    // faire une méthode qui compte de N à 1 inclusivement
    private void compterDeNA1AvecFor(int nb) {
        System.out.println("compterDeNA1AvecFor (" + nb + ")");
        for (int cpt = nb; cpt >= 1; cpt--) {
            System.out.println(cpt);
        }
    }

    private void demoChar() {
        char lettre;

        lettre = 'G';

        System.out.println("la lettre est " + lettre);
    }

    public static void main(String[] args) {
        new Cours09BouclesChar();
    }
}
