import java.util.Scanner;

public class Formatif4Si {
    public Formatif4Si() {
        testerEstExact();
        testerPoserQuestionEtCorriger();
        testerEstEntreBornes();
        testerConvertirNoteACote();

        lireNote("Veuillez entrer une note qui sera convertie en cote de A à F: ");
    }

    public void testerEstExact() {
        System.out.println(estExact("abc", "abc") == true);
        System.out.println(estExact("abc", "cbc") == false);
        System.out.println(estExact("abc", "Abc") == true);
    }

    public boolean estExact(String reponse, String bonneReponse) {
        boolean estEgal = reponse.equalsIgnoreCase(bonneReponse);
        return estEgal;
    }

    public void testerPoserQuestionEtCorriger() {
        poserQuestionEtCorriger("De quelle couleur est le cheval blanc de Napoléon?", "Blanc", "Vrai", "Faux");
        poserQuestionEtCorriger("Combien y a-t-il d'heures dans une journée?", "24", "Vrai", "Faux");
        poserQuestionEtCorriger("1 + 1 = ", "2", "Bravo!", "Non... la bonne réponse est 2. ");
        poserQuestionEtCorriger("6 + 1 = ", "7", "Bravo!", "Ben non... c'est 7 la réponse. ");
    }

    public void poserQuestionEtCorriger(String question, String bonneReponse, String siBonneReponse, String siMauvaiseReponse) {
        String reponse;

        reponse = lireString(question);
        if (estExact(reponse, bonneReponse))
            System.out.println(siBonneReponse);
        else
            System.out.println(siMauvaiseReponse);
    }


    public void testerEstEntreBornes() {
        System.out.println(estEntreBornes(74, 75, 80) == false); //affiche false
        System.out.println(estEntreBornes(75, 75, 80) == true); //affiche true
        System.out.println(estEntreBornes(80, 75, 80) == true); //affiche true
        System.out.println(estEntreBornes(81, 75, 80) == false); //affiche false
    }

    public boolean estEntreBornes(int nb, int borneMin, int borneMax) {
        boolean nbEstEntreMinEtMax;
        nbEstEntreMinEtMax = borneMin <= nb && nb <= borneMax;
        return nbEstEntreMinEtMax;
    }

    public void testerConvertirNoteACote() {
        System.out.println(convertirNoteACote(-1) == 'E'); //affiche E
        System.out.println(convertirNoteACote(0) == 'E'); //affiche E
        System.out.println(convertirNoteACote(59) == 'E'); //affiche E
        System.out.println(convertirNoteACote(60) == 'D'); //affiche D
        System.out.println(convertirNoteACote(70) == 'C'); //affiche C
        System.out.println(convertirNoteACote(80) == 'B'); //affiche B
        System.out.println(convertirNoteACote(90) == 'A'); //affiche A
        System.out.println(convertirNoteACote(100) == 'A'); //affiche A
        System.out.println(convertirNoteACote(101) == 'A'); //affiche A
    }

    public char convertirNoteACote(int note) {
        char cote;
        if (note < 60)
            cote = 'E';
        else if (note < 70)
            cote = 'D';
        else if (note < 80)
            cote = 'C';
        else if (note < 90)
            cote = 'B';
        else
            cote = 'A';
        return cote;
    }

    //Question 11
    public void lireNote(String question) {
        int reponse;

        reponse = lireEntier(question);

        if (estEntreBornes(reponse, 0, 100)) {
            System.out.println("Vous avez entré la note: " + reponse + ", ce qui vous donne la cote suivante: " + convertirNoteACote(reponse) + ".");
        } else {
            System.out.println("Désolé: la note " + reponse + " n'est pas valide. Veuillez entrer une valeur entre 0 et 100 inclusivement.");
        }
    }

    public void testerEgaliteChaines() {
        String str_L = "Limoilou";
        String str_CL = "Cegep " + str_L;
        String str_l = "limoilou";
        boolean estEgal;

        estEgal = str_L.equals(str_L);
        System.out.println(str_L + " est égale à " + str_L + " -> " + estEgal);

        estEgal = str_L.equals(str_CL);
        System.out.println(str_L + " est égale à " + str_CL + " -> " + estEgal);

        estEgal = str_L.equals(str_l);
        System.out.println(str_L + " est égale à " + str_l + " -> " + estEgal);

        estEgal = str_L.equalsIgnoreCase(str_l);
        System.out.println(str_L + " est égale à " + str_l + " -> " + estEgal);
    }

    public boolean estPlusPetit(int n1, int n2) {
        return (n1 < n2);
    }

    public void afficherCondition() {
        String s = "";
        int a = 1;
        int aa = 1;
        int b = 2;
        int c = 3;
        char la = 'a';
        char lc = 'c';

        s += "\n01. a = " + a;
        s += "\n02. aa = " + aa;
        s += "\n03. b = " + b;
        s += "\n04. c = " + c;
        s += "\n05. la = " + la;
        s += "\n06. lc = " + lc;
        s += "\n07. a == a -> " + (a == a);
        s += "\n08. a < aa -> " + (a < aa);
        s += "\n09. a <= aa -> " + (a <= aa);
        s += "\n10. a > b -> " + (a > b);
        s += "\n11. a >= 0 -> " + (a >= 0);
        s += "\n12. a - 2 >= 0 -> " + (a - 2 >= 0);
        s += "\n13. la < lc -> " + (la < lc);
        s += "\n14. a - 2 >= 0 || a < 8 -> " + (a - 2 >= 0 || a < 8);
        s += "\n15. a - 2 >= 0 && a < 8 -> " + (a - 2 >= 0 && a < 8);
        s += "\n16. a >= 1 && c < b + c && aa * a >= b -> " + (a >= 1 && c < b + c && aa * a >= b);
        s += "\n17. a > b && a - 36 < 8 * b - 17 && a - 2 * 13 < b - 7 -> " + (a > b && a - 36 < 8 * b - 17 && a - 2 * 13 < b - 7);
        s += "\n18. estPlusPetit(2 * a, aa * 3) -> " + estPlusPetit(2 * a, aa * 3);
        System.out.println(s);
    }

    public void parOuJePasse() {
        String s = "";
        int a = 1;
        int b = 2;
        int c = 3;

        if (a < 2)
            s += "je passe à 1\n";
        else
            s += "je passe à 2\n";

        s += "je passe à 3\n";

        if (a > b + c)
            s += "je passe à 4\n";
        else if (a + b > c)
            s += "je passe à 5\n";
        else if (a + b != c)
            s += "je passe à 6\n";
        else if (a + b == c)
            s += "je passe à 7\n";
        else
            s += "je passe à 8\n";

        s += "je passe à 9\n";

        System.out.println(s);
    }
/*
01. a = 1
02. aa = 1
03. b = 2
04. c = 3
05. la = a
06. lc = c
07. a == a -> true
08. a < aa -> false
09. a <= aa -> true
10. a > b -> false
11. a >= 0 -> true
12. a - 2 >= 0 -> false
13. la < lc -> true
14. a - 2 >= 0 || a < 8 -> true
15. a - 2 >= 0 && a < 8 -> false
16. a >= 1 && c < b + c && aa * a >= b -> false
17. a > b && a - 36 < 8 * b - 17 && a - 2 * 13 < b - 7 -> false
18. estPlusPetit(2 * a, aa * 3) -> true
 */

/*
je passe à 1
je passe à 3
je passe à 7
je passe à 9
 */
    /**
     * Lit un entier au clavier.
     *
     * @param question
     * @return
     */
    public int lireEntier(String question) {
        int reponse;
        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }

    public String lireString(String question) {
        Scanner sc; //Instance de l'utilitaire de lecture
        String reponse;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.print(question);
        reponse = sc.nextLine(); //lecture du nom

        return reponse;
    }

    public static void main(String[] args) {
        new Formatif4Si();
    }
}
