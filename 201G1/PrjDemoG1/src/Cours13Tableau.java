import java.util.Scanner;

public class Cours13Tableau {
    public Cours13Tableau() {
        testerTableau();
        saisirEtAfficherNoteSupMoyenneV2();
    }

    private void testerTableau() {
        int tab[];

        tab = new int[4];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 2;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab [" + i + "] = " + tab[i]);
            ;
        }
    }

    // Cette méthode saisit un certain nombre de notes entre 0 et 100
    // puis affiche la moyenne de ceux-ci
    // et toutes les notes parmi celles-ci qui sont au-dessus de la moyenne.
    public void saisirEtAfficherNoteSupMoyenneV2() {
        int tabNotes[];
        int nbNotesASaisir;
        double moyenne;

        //lire les notes
        nbNotesASaisir = lireEntierValide("Combien de notes à saisir? ", 0, 25);

        tabNotes = saisirTableauEntiers(nbNotesASaisir, "Entrer la note : ", 0, 100); //la grandeur de ce tableau ne peut pas être changé.

        if (nbNotesASaisir > 0) {
            moyenne = calculerMoyenne(tabNotes);

            System.out.println("La moyenne des notes est : " + moyenne);
            afficherElementAuDessus(tabNotes, (int) moyenne);
        }
    }

    //	Écrire une méthode qui affiche les nombres d’un tableau d’entier au-dessus ou égale à une valeur passée en argument.
    public void afficherElementAuDessus(int tab[], int min) {
        for (int i = 0; i <tab.length ; i++)
        {
            if (tab[i] > min) {
                System.out.println(tab [i]);
            }
        }
    }

    public  int[] saisirTableauEntiers (int nbElementASaisir, String question, int min, int max) {
        int tabEntier[];
        tabEntier = new int[nbElementASaisir];

        for (int i = 0; i < tabEntier.length; i++) {
            tabEntier[i] = lireEntierValide(question, min, max);
        }

        return tabEntier;
    }

    private double calculerMoyenne(int[] tab) {
        double moyenne =0;
        int somme;

        if (tab.length > 0) {
            somme = 0;
            for (int i = 0; i < tab.length; i++) {
                somme += tab[i];
            }

            moyenne = somme / tab.length;
        }
        else { //à améliorer...
            System.out.println("Le tableau ne doit pas être vide.");
        }

        return moyenne;
    }

    public void saisirEtAfficherNoteSupMoyenneV1() {
        int tabNotes[];
        int nbNotesASaisir;
        int sommeNotes;
        double moyenne;

        nbNotesASaisir = lireEntierValide("Combien de notes à saisir? ", 0, 25);

        tabNotes = new int[nbNotesASaisir]; //la grandeur de ce tableau ne peut pas être changé.

        sommeNotes = 0;
        for (int i = 0; i < tabNotes.length; i++) {
            tabNotes[i] = lireEntierValide("Entrer la note no " + (i + 1) + " : ", 0, 100);
            sommeNotes += tabNotes[i];
        }

        if (nbNotesASaisir > 0) {
            moyenne = sommeNotes / nbNotesASaisir;

            System.out.println("La moyenne des notes est : " + moyenne);
            for (int i = 0; i < tabNotes.length; i++) {
                if (tabNotes[i] > moyenne) {
                    System.out.println("Note no " + (i + 1) + " : " + tabNotes[i]);
                }
            }
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
        new Cours13Tableau();
    }
}
