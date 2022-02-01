import Utilitaire.*;

public class Embarquement {
    private AvionArrayList avion;

    public Embarquement() {
        int nbPassagerAEmbarquer = Util.lireInt("Combien de passager dans l'avion ? ");
        avion = new AvionArrayList(nbPassagerAEmbarquer);

        for (int i = 0; i < nbPassagerAEmbarquer; i++) {
            embarquerUnPassager();
        }

        System.out.println(avion);
    }

    private void embarquerUnPassager() {
        int poids;
        int age;
        boolean poidEtAgeEstValide;

        do {
            poids = Util.lireInt("Quel est le poids du passager ? ");
            age = Util.lireInt("Quel est l'age du passager ? ");
            poidEtAgeEstValide = Passager.ageEstValide(age) && Passager.poidsEstValide(poids);

            if (!poidEtAgeEstValide)
                System.out.println("Le poids et l'age doit être positif!");
        }
        while (!poidEtAgeEstValide);

        avion.ajouterPassager(new Passager(poids, age));
    }

    public static void main(String[] args) {
        new Embarquement();
    }
}
