public class Cercle {
    //public = accessible à l'extérieur de la classe
    //static = ne travaille pas avec l'instance (Pas besoin de faire de new pour l'utiliser)
    //final = consante
    public static final double PI = 3.1416;
    public static final double DEFAULT_RAYON = 0;

    private double rayon;

    public Cercle() {
        this(DEFAULT_RAYON);
    }

    public Cercle(double rayon) {
        setRayon(rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double newRayon) {
        if (estRayonValide(newRayon))
            this.rayon = newRayon;
        else
            throw new IllegalArgumentException(newRayon + " est un rayon invalide.");
    }

    public static boolean estRayonValide(double newRayon) {
        boolean estValide;
        estValide = newRayon >= 0;
        return estValide;
    }

    /**
     * Calculer la circonférence de l'instance
     *
     * @return
     */
    public double getCirconference() {
        double circonference;
        circonference = 2 * Cercle.PI * this.rayon;
        return circonference;
    }

    public double getAire() {
        double aire;
        aire = PI * Math.pow(rayon, 2);
        return aire;
    }

    public double getDiametre() {
        double diametre;
        diametre = rayon * 2;
        return diametre;
    }

    public String toString() {
        String s = "";
        s += "Cercle de rayon : " + rayon + '\n';
        s += "Sa circonférence est de : " + getCirconference() + '\n';
        s += "Son aire est de : " + this.getAire() + '\n';
        s += "Son diamètre est de : " + this.getDiametre();
        return s;
    }
}
