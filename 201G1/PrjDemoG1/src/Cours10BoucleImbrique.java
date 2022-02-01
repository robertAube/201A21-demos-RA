public class Cours10BoucleImbrique {
    public Cours10BoucleImbrique() {
        testerGetStringBoiteVide();
    }

    private void testerGetStringBoiteVide() {
        int base;
        int hauteur;
        String strAff;

        base = 0;
        hauteur = 0;
        strAff = getStringBoiteVide(base, hauteur);
        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);


        base = 5;
        hauteur = 4;
        strAff = getStringBoiteVide(base, hauteur);
        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);

        base = 3;
        hauteur = 6;
        strAff = getStringBoiteVideAvecSiCompact(base, hauteur);
        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);

//        base = -1;
//        hauteur = 0;
//        strAff = getStringBoiteVide(base, hauteur);
//        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);
//
//        base = 5;
//        hauteur = 21;
//        strAff = getStringBoiteVide(base, hauteur);
//        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);
    }

//        getStringBoiteVide qui retourne une chaine de caractères d’une boîte vide dont les dimensions sont reçues en paramètre.
//        La base et la hauteur doivent être entre 0 et 20. Sinon on affiche un message d’erreur.
//        Voici un exemple du contenu d’une String retourné par la méthode si on lui passe 20 x 5 en paramètre :
//                ********************
//                *                  *
//                *                  *
//                *                  *
//                ********************


    public String getStringBoiteVide(int base, int hauteur) //signature de la méthode
    {
        String strBte = "";

        if (0 <= base && base <= 20 && 0 <= hauteur && hauteur <= 20) {
            //boucle imbriquée : boucle dans une boucle
            for (int cptHauteur = 0; cptHauteur < hauteur; cptHauteur++) {
                for (int cptBase = 0; cptBase < base; cptBase++) { // faire la base
                    if (cptBase == 0 || cptBase == base -1 || cptHauteur == 0 || cptHauteur == hauteur -1 ) {
                        strBte += "*";
                    } else {
                        strBte += " ";
                    }
                }
                strBte += "\n";
            }
        } else {
            System.out.println("La base et la hauteur doivent être entre 0 et 20");
        }

        return strBte;
    }


    public String getStringBoiteVideAvecSiCompact(int base, int hauteur) //signature de la méthode
    {
        String strBte = "";

        if (0 <= base && base <= 20 && 0 <= hauteur && hauteur <= 20) {
            //boucle imbriquée : boucle dans une boucle
            for (int cptHauteur = 0; cptHauteur < hauteur; cptHauteur++) {
                for (int cptBase = 0; cptBase < base; cptBase++) { // faire la base
                    strBte += (cptBase == 0 || cptBase == base -1 || cptHauteur == 0 || cptHauteur == hauteur -1 ) ? "*" : " ";
                }
                strBte += "\n";
            }
        } else {
            System.out.println("La base et la hauteur doivent être entre 0 et 20");
        }

        return strBte;
    }

    public static void main(String[] args) {
        new Cours10BoucleImbrique();
    }
}
