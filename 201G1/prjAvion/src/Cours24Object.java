public class Cours24Object {
    public Cours24Object() {
        demoObject();
    }

    private void demoObject() {
        Passager p = new Passager();
        Object o = p;


        System.out.println(p);

        ((Passager)o).setAge(111);

        System.out.println(p);
    }

    public static void main(String[] args) {
        new Cours24Object();
    }
}
