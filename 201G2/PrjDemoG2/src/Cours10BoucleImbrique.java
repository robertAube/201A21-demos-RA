public class Cours10BoucleImbrique {
    public Cours10BoucleImbrique() {
        int base;
        int hauteur;
        String strAff;

        base = 0;
        hauteur = 0;
        strAff = getStringBoiteVideV1(base, hauteur);
        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);


        base = 5;
        hauteur = 6;
        strAff = getStringBoiteVideV2(base, hauteur);
        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);

//        base = -1;
//        hauteur = 0;
//        strAff = getStringBoiteVide(base, hauteur);
//        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);
//
//
//        base = 0;
//        hauteur = -1;
//        strAff = getStringBoiteVide(base, hauteur);
//        System.out.println("Boite de " + base + " X " + hauteur + ": \n" + strAff);


    }


//    getStringBoiteVide qui retourne une chaine de caractères d’une boîte vide dont les dimensions sont reçues en paramètre. La base et la hauteur doivent être entre 0 et 20. Sinon on affiche un message d’erreur.
//    Voici un exemple du contenu d’une String retourné par la méthode si on lui passe 20 x 5 en paramètre :
//            ********************
//            *                  *
//            *                  *
//            *                  *
//            ********************


    public String getStringBoiteVideV1(int base, int hauteur) {
        String str = "";

        if (0 <= base && base <= 20 && 0 <= hauteur && hauteur <= 20) {
            for (int cptHauteur = 0; cptHauteur < hauteur; cptHauteur++) { //faire base X une ligne de la largeur de la base
                for (int cptBase = 0; cptBase < base; cptBase++) { //faire une ligne de la largeur de la base
                    if (cptBase == 0 || cptBase == (base - 1) || cptHauteur == 0 || cptHauteur == (hauteur - 1))
                        str += '*';
                    else
                        str += ' ';
                }
                str += '\n';
            }
        } else {
            System.out.println("La base et la hauteur doivent être entre 0 et 20");
        }

        return str;
    }


    public String getStringBoiteVideV2(int base, int hauteur) {
        String str = "";

        if (0 <= base && base <= 20 && 0 <= hauteur && hauteur <= 20) {
            for (int cptHauteur = 0; cptHauteur < hauteur; cptHauteur++) { //faire base X une ligne de la largeur de la base
                for (int cptBase = 0; cptBase < base; cptBase++) { //faire une ligne de la largeur de la base
                    //si compact
                    str += (cptBase == 0 || cptBase == (base - 1) || cptHauteur == 0 || cptHauteur == (hauteur - 1)) ? '*' : ' ';
                }
                str += '\n';
            }
        } else {
            System.out.println("La base et la hauteur doivent être entre 0 et 20");
        }

        return str;
    }


    public static void main(String[] args) {
        new Cours10BoucleImbrique();
    }
}
