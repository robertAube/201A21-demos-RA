public class Cours07DemoSi {
    public Cours07DemoSi() {
        afficherSiUnNbEstPositifV1(2);
        afficherSiUnNbEstPositifV1(-1);
        afficherSiUnNbEstPositifV1(0);
        afficherSiUnNbEstPositifV2(2);
        afficherSiUnNbEstPositifV2(-1);
        afficherSiUnNbEstPositifV2(0);
    }

    private void afficherSiUnNbEstPositifV1(int nombre) {
        if (nombre >= 0) {
            System.out.println(nombre + " est positif.");
        }

    }

    private void afficherSiUnNbEstPositifV2(int nombre) {
        String str;

        str = "afficherSiUnNbEstPositifV2(" + nombre + ") est ";
        if (nombre >= 0) {
            str += "positif.";
        }
        else {
            str += "négatif.";
        }

        System.out.println(str);
    }


    public static void main(String[] args) {
        new Cours07DemoSi();
    }
}
