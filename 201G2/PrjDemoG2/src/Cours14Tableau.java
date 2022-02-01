import java.util.Scanner;

public class Cours14Tableau {
    public Cours14Tableau() {
        //testerTableau();
        //saisirEtAfficherNotesAuDessusMoyenne();
//        testerCalculerMoyenne();
//
//        testerSaisirTabEntier();

        saisirEtAfficherNotesAuDessusMoyenneV2();

    }

    public void saisirEtAfficherNotesAuDessusMoyenneV2() {
        int tabNotes[];
        int nbNotesASaisir;
        double moyenne;

        nbNotesASaisir = lireEntierValide("Combien de notes à saisir? ", 0, 25);

        //Création du tableau
        tabNotes = saisirTabEntier(nbNotesASaisir, "Entrez une note : ", 0, 100);
        if (nbNotesASaisir > 0) {

            moyenne = calculerMoyenne(tabNotes);

            afficherOverVal(tabNotes, moyenne);
        }
    }


    // Afficher les nombres d’un tableau d’entiers au-dessus ou égale à une valeur passée en argument.
    public void afficherOverVal(int tab[], double seuilInf) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>seuilInf) {
                System.out.println(tab[i]);
            }
        }
    }

    private void testerSaisirTabEntier() {
        int tab[];

        tab = saisirTabEntier(3,"Donnez un nombre : ", 1, 10);

        System.out.println(calculerMoyenne(tab));
    }

//  Saisir un certain nombre d’entiers entre 2 bornes. Cette méthode reçoit en argument :
//  	Le nombre de valeurs à saisir.
//  	La question
//  	Une borne inférieure et une borne supérieure entre lesquelles toutes les valeurs du tableau devront être.
    // et retourne le tableau saisit

    public int [] saisirTabEntier(int nbVal, String question, int min, int max) {
        int [] tabSaisi;

        tabSaisi = new int[nbVal];

        for (int i = 0; i < tabSaisi.length; i++) {
            tabSaisi[i] = lireEntierValide(question, min, max);
        }

        return tabSaisi;
    }


    public void testerCalculerMoyenne() {
        int t1[] = {1, 2, 3};
        int t2[] = {};
        System.out.println(calculerMoyenne(t1) == 2);

        calculerMoyenne(t2); //???????????????????????


    }

    // Écrire une méthode qui calcule et retourne la moyenne d’un tableau d’entiers reçu en argument.
    public double calculerMoyenne(int tab[]) {
        double moyenne = 0;
        int somme;

        somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        moyenne = (double) somme / tab.length;

        return moyenne;
    }

    // 1 - saisir un certain nombre de notes entre 0 et 100
    // 2 - afficher la moyenne de ceux-ci
    // 3 - afficher toutes les notes parmi celles-ci qui sont au-dessus de la moyenne.
    public void saisirEtAfficherNotesAuDessusMoyenneV1() {
        int tabNotes[];
        int nbNotesASaisir;
        int sommeNote;
        double moyenne;

        nbNotesASaisir = lireEntierValide("Combien de notes à saisir? ", 0, 25);

        //Création du tableau
        tabNotes = new int[nbNotesASaisir];

        sommeNote = 0;
        for (int i = 0; i < tabNotes.length; i++) {
            tabNotes[i] = lireEntierValide("Entrez la note no " + (i + 1) + " : ", 0, 100);
            sommeNote += tabNotes[i];
        }


        if (nbNotesASaisir > 0) {
            moyenne = (double) sommeNote / nbNotesASaisir; //cast en double pour forcer java à faire la division avec des réels

            System.out.println("La moyenne des notes est : " + moyenne);

            for (int i = 0; i < tabNotes.length; i++) {
                if (tabNotes[i] > moyenne) {
                    System.out.println("Note no " + (i + 1) + " : " + tabNotes[i]);
                }
            }
        }
    }


    private void testerTableau() {
        int tab[]; // création de la variable qui fewra une référence au tableau.

        tab = new int[6]; //création d'un tableau de 6 éléments indicé de 0 à 5. Longueur fixe

        tab[0] = 4;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * 2;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }


    public int lireEntierValide(String question, int valeurMin, int valeurMax) {
        int valeurUsager;

        do {
            valeurUsager = lireInt(question);
            if (valeurUsager < valeurMin) {
                System.out.println("Erreur : " + valeurUsager + " est inférieur à " + valeurMin + ".");
            } else if (valeurUsager > valeurMax) {
                System.out.println("Erreur : " + valeurUsager + " est supérieur à " + valeurMax + ".");
            }
        } while (valeurUsager < valeurMin || valeurMax < valeurUsager);

        return valeurUsager;
    }


    public int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    public static void main(String[] args) {
        new Cours14Tableau();
    }
}
