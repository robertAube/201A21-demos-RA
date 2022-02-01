import Utilitaire.Util;

public class PassagerTest
{
    public PassagerTest()
    {
        testerEquals();
        //saisirEtAfficherUnPassager();
        //testerPassager();
    }

    private void testerEquals() {
        Passager p1 = new Passager();
        Passager pNull = null;
        Passager p2 = new Passager();

        System.out.println("p1.equals(p1) -> " + p1.equals(p1));
        System.out.println("p1.equals(pNull) -> " + p1.equals(pNull));
        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
        System.out.println("p1.equals(new Avion(1)) -> " + p1.equals(new Avion(1)));
        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
    }

    private void saisirEtAfficherUnPassager()
    {
        Passager p;
        int age;
        int poids;
        boolean poidEtAgeEstValide;

        //saisir age et poids
        do
        {
            age = Util.lireEntier("Quel est l'âge du passager ? ");
            poids = Util.lireEntier("Quel est le poids du passager (en livre) ? ");

            poidEtAgeEstValide = Passager.ageEstValide(age) && Passager.poidsEstValide(poids);

            if (!poidEtAgeEstValide)
                System.out.println("Le poids et l'age doit être positif!");
        }
        while (!poidEtAgeEstValide);
        p = new Passager(age, poids);

        System.out.println(p);
    }

    private void testerPassager()
    {
        Passager p;

        p = new Passager(); //appel le constructeur par défaut
        System.out.println(p);

        p = new Passager(-1, 0);
        System.out.println(p);
    }

    public static void main(String[] args)
    {
        new PassagerTest();
    }
}