import java.util.Scanner;

public class Cours09CharBouclesModulo {
    public Cours09CharBouclesModulo() {
        // demoChar();
        // testerModulo();

//        compterDe1ANAvecFor(5);
//        compterDe1ANAvecFor(0);
//        compterDe1ANAvecFor(1);

        //compterDe1ANAvecWhile(5);

        compterDe1ANAvecDoWhile(0);
        compterDe1ANAvecDoWhile(1);
        compterDe1ANAvecDoWhile(3);

        appuyerSurEspaceEtEnterSVPDoWhile();
        appuyerSurEspaceEtEnterSVPWhile();
    }

    //A NE PAS FAIRE!!!!!!!!!!
    public void appuyerSurEspaceEtEnterSVPWhile() {
        String strSaisie;
        System.out.println("appuyerSurEspaceEtEnterSVPWhile()");

        //Instruction de trop :
        strSaisie = lireString("SVPA Apuyez sur la barre d'eapcement puis Enter : ");
        while (!strSaisie.equals(" ")) {
            strSaisie = lireString("SVP appuyez sur la barre d'eapcement puis Enter : ");
        }
    }

    public void appuyerSurEspaceEtEnterSVPDoWhile() {
        String strSaisie;

        System.out.println("appuyerSurEspaceEtEnterSVPDoWhile()");

        do {
            strSaisie = lireString("SVP appuyez sur la barre d'eapcement puis Enter : ");
        }
        while (!strSaisie.equals(" "));
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
        //Boucle for
        // for (initialisation du compteur; condition qui doit être vrai pour entrer dans la boucle et la poursuivre; incrémentation du compteur)
        // 1 - exécuter la première partie du for (initialisation)
        // 2 - vérifie la condition de la 2e partie :
        //     -- Si c'Est vrai, on exécute l'intérieur de la boucle for
        //     -- Si c'est faux, on sort de la boucle
        // 3 - Selon le cas, on exécute l'intérieur du for
        // 4 - on exécute la 3e partie du for, qui normalement modifie la condition de la 2e partie
        // 5 - on retourne faire 2
        for (int cpt = 1; cpt <= nb; cpt++) {
            System.out.println(cpt);
        }

        // System.out.println(cpt); // la variable cpt n'existe plus!
    }

    private void compterDe1ANAvecWhile(int nb) {
        System.out.println("compterDe1ANAvecWhile (" + nb + ")");
        int cpt = 1;

        while (cpt <= nb) {
            System.out.println(cpt);
            cpt++;
        }
    }


    private void compterDe1ANAvecDoWhile(int nb) {
        System.out.println("compterDe1ANAvecDoWhile (" + nb + ")");
        int cpt = 1;

        if (nb >= 1) {
            do {
                System.out.println(cpt);
                cpt++;
            }
            while (cpt <= nb);
        }
    }

    private void testerModulo() {
        int dividende;
        int diviseur;

        dividende = 6;
        diviseur = 2;
        System.out.println(dividende + " / " + diviseur + " = " + dividende / diviseur + " reste : " + dividende % diviseur);

        dividende = 7;
        diviseur = 2;
        System.out.println(dividende + " / " + diviseur + " = " + dividende / diviseur + " reste : " + dividende % diviseur);

        dividende = 9;
        diviseur = 3;
        System.out.println(dividende + " / " + diviseur + " = " + dividende / diviseur + " reste : " + dividende % diviseur);

        dividende = 13;
        diviseur = 3;
        System.out.println(dividende + " / " + diviseur + " = " + dividende / diviseur + " reste : " + dividende % diviseur);

        dividende = 14;
        diviseur = 3;
        System.out.println(dividende + " / " + diviseur + " = " + dividende / diviseur + " reste : " + dividende % diviseur);
    }

    private void demoChar() {
        char lettre;
        String pays;

        lettre = 'a';

        pays = "Canad";

        pays += lettre;

        System.out.println("lettre vaut " + lettre);
        System.out.println("pays vaut " + pays);
    }

    public static void main(String[] args) {
        new Cours09CharBouclesModulo();
    }
}
