import Utilitaire.Util;

public class Embarquement
{
    private Avion avion;

    public Embarquement()
    {
        int nbPassagerAEmbarquer = Util.lireEntierValide("Combien de passagers dans l'avion ? ", 0, 5000);
        avion = new Avion(nbPassagerAEmbarquer);

        for (int i = 0; i < nbPassagerAEmbarquer; i++)
        {
            embarquerUnPassager();
        }

        System.out.println(avion);
    }

    private void embarquerUnPassager()
    {
        int poids;
        int age;
        boolean poidEtAgeEstValide;

//        do
//        {
//            poids = Utilitaire.Util.lireEntier("Quel est le poids du passager ? ");
//            age = Utilitaire.Util.lireEntier("Quel est l'âge du passager ? ");
//            poidEtAgeEstValide = Passager.ageEstValide(age) && Passager.poidsEstValide(poids);
//
//            if (!poidEtAgeEstValide)
//                System.out.println("Le poids et l'age doivent être positifs!");
//        }
//        while (!poidEtAgeEstValide);

        poids = Util.lireEntier("Quel est le poids du passager ? ");
        age = Util.lireEntier("Quel est l'âge du passager ? ");
        while (!Passager.ageEstValide(age) || !Passager.poidsEstValide(poids))
        {
            System.out.println("Le poids et l'age doivent être positifs!");
            poids = Util.lireEntier("Quel est le poids du passager ? ");
            age = Util.lireEntier("Quel est l'âge du passager ? ");
        }

        avion.ajouterPassager(new Passager(poids, age));
    }

    public static void main(String[] args)
    {
        new Embarquement();
    }
}
