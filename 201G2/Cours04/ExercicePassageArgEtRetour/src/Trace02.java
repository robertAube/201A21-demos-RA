public class Trace02 {
    public Trace02() {
        int x = 7;

        System.out.println("1. x=" + x);
        x = afficherPourTracer1(x + 2);
        System.out.println("2. x=" + x);
    }

    public int afficherPourTracer1(int a) {
        int b = 3;
        System.out.println("3. a=" + a + " b=" + b);
        a = a - 1 ;
        b = afficherPourTracer2(b, 3);
        System.out.println("4. a=" + a + " b=" + b);
        return b + 3;
    }

    public int afficherPourTracer2(int x, int y) {
        System.out.println("5. x=" + x + " y=" + y);
        x = x + 2 + y;
        System.out.println("6. x=" + x + " y=" + y);
        return x - y;
    }

    public static void main(String[] args) {
        System.out.println("7.");
        new Trace02();
        System.out.println("8.");
    }
}
