public class Cours08DemoSi {
    public Cours08DemoSi() {
        // testerAfficherSiUnNbEstPositifV2();
        // testerCalculerRabais () ;
        // testerEstEchec();
        testerBoolean();
    }

    private void testerBoolean() {
        final boolean VRAI = true; //constante
        final boolean FAUX = false; //constante

        System.out.println("VRAI && FAUX -> " + (VRAI && FAUX));
        System.out.println("VRAI && (2 < 3) -> " + (VRAI && (2 < 3)));
        System.out.println("VRAI || FAUX -> " + (VRAI || FAUX));
    }

    private void testerEstEchec() {
        int note;

        note = 0;
        System.out.println("Si note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == true));
        note = 59;
        System.out.println("Si note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == true));
        note = 60;
        System.out.println("Si note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == false));
        note = 100;
        System.out.println("Si note = " + note + " -> " + estEnEchec(note) + " ok? " + (estEnEchec(note) == false));
    }

    private boolean estEnEchec(int note) {
        boolean estEchec;

        estEchec = note < 60;

        return estEchec;
    }

    public void testerAfficherSiUnNbEstPositifV2() {
        afficherSiUnNbEstPositifV2(2);
        afficherSiUnNbEstPositifV2(-1);
        afficherSiUnNbEstPositifV2(0);
        afficherSiUnNbEstPositifV2(1);
    }


    public void testerCalculerRabais () {
        int montant;

        montant = 0;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0));

        montant = 99;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0));

        montant = 100;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0.02));

        montant = 499;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0.02));

        montant = 500;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0.03));

        montant = 999;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0.03));

        montant = 1000;
        System.out.print("Si montant = " + montant + " rabais -> " + calculerRabais(montant));
        System.out.println("  --->  " + (calculerRabais(montant) == 0.05));}

    /**
     * Calcule (il fait juste le calcul et ne l’affiche pas) un rabais en fonction d'un montant reçu en argument.
     * Le rabais se calcule comme suit:
     * o	-infini, 100[ -> 0
     * o	[100, 500[ -> 2%
     * o	[500, 1000[ -> 3%
     * o	[1000, infini -> 5%
     *
     * @param montant
     * @return le rabais calculer
     */
    public double calculerRabais(int montant) {
        double rabais = 0;

        if (montant < 100)
            rabais = 0;
        else if (montant < 500 && montant >= 100)
            rabais = 0.02;
        else if (montant < 1000)
            rabais = 0.03;
        else
            rabais = 0.05;
        return rabais;
    }

    private void afficherSiUnNbEstPositifV2(int nombre) {
        String str;

        str = "afficherSiUnNbEstPositifV2 ( " + nombre + " ) est ";
        if (nombre > 0) {
            str += "positif.";
        }
        else if (nombre == 0) {
            str += "négatif et positif.";
        }
        else
        {
            str += "négatif.";
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        new Cours08DemoSi();
    }
}
