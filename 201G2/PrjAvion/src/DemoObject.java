public class DemoObject {
    public DemoObject() {
        testObject();
        demoClasseEnveloppe();
    }

    private void demoClasseEnveloppe() {
        int i =1;
        Integer envI = 1;

        envI.toString();

        System.out.println(Integer.MAX_VALUE);

    }

    private void testObject() {
        Passager p = new Passager();

        Object o = p;

        System.out.println(((Passager)o).getAge());
    }

    public static void main(String[] args) {
        new DemoObject();
    }
}
