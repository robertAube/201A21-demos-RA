public class TraceFormatif3 {
    public TraceFormatif3() {
        int a;
        a = afficherPourTracer1(6);
        System.out.println("1 - a=" + a);
    }

    public int afficherPourTracer1(int b) {
        int a = 4;
        System.out.println("2 - a=" + a + "  b=" + b);
        afficherPourTracer2(a);
        System.out.println("3 - a=" + a + "  b=" + b);
        a = afficherPourTracer2(a + b + 1);
        System.out.println("4 - a=" + a + "  b=" + b);
        return a - b;
    }

    public int afficherPourTracer2(int b) {
        System.out.println("5 - b=" + b);
        b += 2;
        System.out.println("6 - b=" + b);
        return b;
    }

    public static void main(String[] args) {
        System.out.println("7");
        new TraceFormatif3();
        System.out.println("8");
    }
}
