public class CercleTest {
    public CercleTest() {
        System.out.println("TestCercle()");

        testerConstructeurEtToString();
        testerGetSet();
        testerCreerAirCirconferenceDiametre();
        testerEstRayonValide();
    }

    private void testerEstRayonValide() {
        System.out.println("* testerEstRayonValide()");

        System.out.println(Cercle.estRayonValide(-1) == false);
        System.out.println(Cercle.estRayonValide(0) == true);
        System.out.print(Cercle.estRayonValide(1) == true);
    }

    public void testerCreerAirCirconferenceDiametre() {
        System.out.println("testerCreerAirCirconference()");
        Cercle c;

        c = new Cercle(10);

        System.out.println("L'air d'un cercle de rayon " + c.getRayon() + " = " + c.getAire());
        System.out.println("La circonférence d'un cercle de rayon " + c.getRayon() + " = " + c.getCirconference());
        System.out.println("La diamètre d'un cercle de rayon " + c.getRayon() + " = " + c.getDiametre());
    }

    public void testerGetSet() {
        System.out.println("* testerGetSet()");
        Cercle c;

        c = new Cercle();
        System.out.println(c.getRayon() == 0);
        c.setRayon(2);
        System.out.println(c.getRayon() == 2);
   //     c.setRayon(-1);  //provoque une IllegalArgumentException
    }

    public void testerConstructeurEtToString() {
        System.out.println("* testerConstructeurEtToString()");
        Cercle c;

        c = new Cercle();
        System.out.println(c);

        System.out.println();
        c = new Cercle(5);
        System.out.println(c);
    }

    public static void main(String[] args) {
        new CercleTest();
    }
}
