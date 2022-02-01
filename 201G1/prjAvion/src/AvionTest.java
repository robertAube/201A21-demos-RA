public class AvionTest
{
    Avion avion1;

    public AvionTest()
    {
        avion1 = new Avion(10);
        ajouterDesPassagers();
        testerGetMoyenneAge();
        testerGetPoidsPassager();
    }

    private void testerGetMoyenneAge()
    {
        System.out.println("testerGetMoyenneAge()");
        avion1 = new Avion(10);

        System.out.println("1. " + avion1);
        avion1.ajouterPassager(new Passager(200, 20));
        System.out.println("2. " + (avion1.getMoyenneAge() == 20));
        avion1.ajouterPassager(new Passager(100, 30));
        System.out.println("3. " + (avion1.getMoyenneAge() == 25));
        avion1.ajouterPassager(new Passager(150, 25));
        System.out.println("4. " + (avion1.getMoyenneAge() == 25));
    }


    private void testerGetPoidsPassager()
    {
        System.out.println("testerGetPoidsPassager()");
        avion1 = new Avion(10);

        System.out.println("1. " + (avion1.getPoidsPassager() == 0));
        avion1.ajouterPassager(new Passager(200, 20));
        System.out.println("2. " + (avion1.getPoidsPassager() == 200));
        avion1.ajouterPassager(new Passager(100, 30));
        System.out.println("3. " + (avion1.getPoidsPassager() == 300));
        avion1.ajouterPassager(new Passager(150, 25));
        System.out.println("4. " + (avion1.getPoidsPassager() == 450));
    }


    private void ajouterDesPassagers()
    {
        System.out.println("ajouterDesPassagers()");
        avion1 = new Avion(10);

        System.out.println("1. " + avion1.toString());
        avion1.ajouterPassager(new Passager(200, 20));
        System.out.println("2. " + avion1);
        avion1.ajouterPassager(new Passager(100, 30));
        System.out.println("3. " + avion1);
        avion1.ajouterPassager(new Passager(150, 25));
        System.out.println("4. " + avion1);
    }

    public static void main(String[] args)
    {
        new AvionTest();
    }
}
