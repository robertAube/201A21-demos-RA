public class Trace01 {
    public Trace01() {
        int a = 4;

        System.out.println("1. a=" + a);
        a = afficherPourTracer1(6);
        System.out.println("2. a=" + a);
        a = afficherPourTracer1(a);
        System.out.println("3. a=" + a);
    }

    public int afficherPourTracer1(int b) {
        int a = 2;
        System.out.println("4. a=" + a + "  b=" + b);
        a = a + 1;
        b = a + b;
        System.out.println("5. " + "a=" + a + "  b=" + b);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Bonjour!");
        new Trace01();
        System.out.println("Terminé!");
    }
}
