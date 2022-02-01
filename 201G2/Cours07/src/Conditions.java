public class Conditions {
    public Conditions() {
        afficherSiNombreNegatifPositif(0);
        afficherSiNombreNegatifPositif(-1);
        afficherSiNombreNegatifPositif(100);
    }

    public void afficherSiNombreNegatifPositif(int nombre) {
        String str ;

        str = "Le nombre " + nombre + " est ";
        if (nombre < 0)
            str += "négatif.";
        else
            str += "positif.";
        System.out.println(str);
    }


    public static void main(String[] args) {
        new Conditions();
    }
}
