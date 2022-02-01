import java.util.Scanner;

public class Formatif5Boucle {
    public Formatif5Boucle() {
        System.out.println(getLigneDeCaracteres(6, '*'));
        testerGetLigneDeCaracteres();

        System.out.println(lireChoixValide("12345", "Entrez un nombre de 1 à 5 : "));
    }

    public void afficherFelicitations(int nbFelicitation) {
        int cpt;

        for (cpt = 0; cpt < nbFelicitation; cpt++) {
            System.out.println("Félicitation!");
        }
    }

    public void lireEntierValide (){
        System.out.println(lireEntierValide("Entrer un nombre entre 0 et 100 inclusivement : ", 0, 100));
    }

    //Doit afficher que des vrai si getLigneDeCaracteres fonctionne selon les spécifications
    public void testerGetLigneDeCaracteres() {
        String s;

        s = getLigneDeCaracteres(0, 'x');
        System.out.println(s.equals(""));
        s = getLigneDeCaracteres(1, '*');
        System.out.println(s.equals("*"));
        s = getLigneDeCaracteres(5, 'x');
        System.out.println(s.equals("xxxxx"));
    }

    public void etudierIndexOf() {
        String strChiffre = "123456";
        String strLettre = "abcABC";

        System.out.println("abcabc".indexOf("b"));
        System.out.println("allo".indexOf("z"));

        System.out.println(strChiffre.indexOf("0"));
        System.out.println(strChiffre.indexOf("1"));
        System.out.println(strChiffre.indexOf("5"));

        System.out.println(strLettre.indexOf("a"));
        System.out.println(strLettre.indexOf("A"));
    }


    public String lireChoixValide (String choix, String question) {
        boolean estUnChoixInvalide;
        String choixUsager;
        do {
            choixUsager = lireString(question);
            estUnChoixInvalide = choix.indexOf(choixUsager) == -1;
            if (estUnChoixInvalide)
                System.out.println("Erreur : Votre choix est invalide, choisissez parmi ces caractères: " + choix );
        } while (estUnChoixInvalide);
        return choixUsager;
    }

    public void afficherPyramide (int hauteur) {
        System.out.println(getPyramide(hauteur));
    }

    public String getPyramide (int hauteur) {
        String pyramide;
        pyramide = "";
        for (int i = 1; i <= hauteur; i++) {
            pyramide += getLigneDeCaracteres( i, '*');
            pyramide += '\n';
        }
        return pyramide;
    }

    public String getLigneDeCaracteres(int nbCar, char c)
    {
        String strEtoile = "";
        int cpt;

        for (cpt = 0; cpt < nbCar; cpt++) {
            strEtoile += c;
        }
        return strEtoile;
    }

    public int additionSuccessive (int limite) {
        int cpt;
        int somme = 0;

        for (cpt = 1; cpt <= limite; cpt++) {
            somme += cpt;
        }
        return(somme);
    }

    public int lireEntierValide (String question, int valeurMin, int valeurMax) {
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

    public void tracerFormatif5() {
        int i = 1;
        int limite = 9;
        System.out.println("1. i=" + i);
        while (i < limite) {
            System.out.println("2. i=" + i + " limite=" + limite);
            if (i < 5)
                i += 3;
            else
                i += 4;
            System.out.println("3. i=" + i + " limite=" + limite);
        }

        for (int a = 5; a > 2; a-=2) {
            System.out.println("4. i=" + i + " limite=" + limite + " a=" + a);
        }

        System.out.println("5. i=" + i + " limite=" + limite);
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
        new Formatif5BoucleVProf();
    }
}
