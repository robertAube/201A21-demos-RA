public class Cours08Si {
    public Cours08Si() {
        //testerCalculerRabaisV1();
        //testerBoolean();
        testerSiEchec();
    }

    private void testerBoolean() {
        boolean vrai = true; //constant
        boolean faux = false;

        System.out.println("vrai && faux -> " + (vrai && faux));
        System.out.println("vrai || faux -> " + (vrai || faux));
    }

    public void testerSiEchec() {
        int note;

        note =59;
        System.out.println("note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == true));
        note =60;
        System.out.println("note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == false));
    }

    public boolean estEnEchec(int note) {
        boolean estEchec;

        estEchec = note < 60;

        return estEchec;
    }

    public void testerAfficherSiNombreNegatifPositif() {
        afficherSiNombreNegatifPositif(-1);
        afficherSiNombreNegatifPositif(0);
        afficherSiNombreNegatifPositif(1);
    }

    public void afficherSiNombreNegatifPositif(int nombre) {
        String str;

        str = "Le nombre " + nombre + " est ";
        if (nombre < 0)
            str += "négatif.";
        else if (nombre == 0) {
            str += "à la fois positif et négatif.";
        } else
            str += "positif.";
        System.out.println(str);
    }

    public void testerCalculerRabais() {
        int montant;
        montant = 99;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        montant = 100;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        montant = 499;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        montant = 500;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        montant = 999;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        montant = 1000;
        System.out.println("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
    }


    public void testerCalculerRabaisV1() {
        int montant;
        montant = 99;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0));
        montant = 100;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0.02));
        montant = 499;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0.02));
        montant = 500;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0.03));
        montant = 999;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0.03));
        montant = 1000;
        System.out.print("Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant));
        System.out.println(" -> " + (calculerRabais(montant) == 0.05));
    }
    /**
     * Calcule (il fait juste le calculer et ne l’affiche pas) un rabais en fonction d'un montant reçu en argument.
     * Les sont:
     *	    -infini, 100[ -> 0
     * 	    [100, 500[ -> 2%
     * 	    [500, 1000[ -> 3%
     * 	    [1000, infini -> 5%
     * @param montant
     * @return rabais
     */
    public double calculerRabais(int montant) {
        double rabais = 0;

        if (montant < 100)
            rabais = 0;
        else if (montant < 500) // cette partie serait inutile :  && montant >= 100 (donc ne pas la mettre)
            rabais = 0.02;
        else if (montant < 1000)
            rabais = 0.03;
        else
            rabais = 0.05;

        return rabais;
    }

    public static void main(String[] args) {
        new Cours08Si();
    }
}
