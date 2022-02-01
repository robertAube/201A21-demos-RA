public class AvionTest {
    public AvionTest() {
        Avion avion = new Avion(100);

        Passager p = new Passager(15, 110);
        System.out.println(p);

        avion.addPassager(p);
        System.out.println(avion);
    }

    public static void main(String[] args) {
        new AvionTest();
    }
}
