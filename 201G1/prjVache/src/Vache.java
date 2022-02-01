public class Vache {
    //variables de classe
    //static appartient à la classe -> il y en a 1 par classe seulement - pas besoin d'avoir d'instance pour l'utiliser.
    public static final int MIN_Y = 0; //les noms de constantes sont en majuscule toujours...
    public static final int MAX_Y = 100; //le mot clé final indique que c'est une constante
    private static final int MAX_LONGUEUR_NOM = 10;

    //variable de classe
    public static int vitesse = 1; //implique que toute les vache vont à la même vitesse.

    //variables d'instance
    private int x; //portée = private -> accessible uniquement dans la classe
    private int y;
    private String nom;

    //constructeur
    public Vache(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        setNom(nom);
    }

    //accesseur et mutateur, c'Est l'encapsulation.
    //accesseur
    public String getNom() { //portée = public -> assessible de partout donc à l'extérieur de la classe
        return nom;
    }

    //mutateur
    public void setNom(String nom) {
//        nom = pNom;  //alternative non souhaité
        int lgNom;

        lgNom = nom.length();

        if (lgNom > MAX_LONGUEUR_NOM) {
            throw new RuntimeException("Nom trop long");
        }
        this.nom = nom; //this = fait référence à l'instance (objet) courante
    }

    //Cette méthode est static parce qu'elle de fait pas référence aux vairables d'instance.
    //En fait, on a pas besoin d'instance pour l'utiliser.
    private static boolean yEstDansLesLimites(int y) {
        boolean estDsLesLimiteY;

        estDsLesLimiteY = Vache.MIN_Y <= y && y <= Vache.MAX_Y;

        return  estDsLesLimiteY;
    }

    private static boolean nomEstValide(String nom) {
        boolean estValide;

        estValide =  nom.length() <= Vache.MAX_LONGUEUR_NOM ;

        return  estValide;
    }

    //avancer en Y
    public void avancer() {
        if (yEstDansLesLimites(y + vitesse))
            this.y += vitesse;
    }

    //    @Override
    public String toString() {
        String str;

        str = "Vache -> {" +  "x=" + x +", y=" + y +
                ", vitesse=" + vitesse +
                ", nom='" + nom + '\'' +
                '}';

        return str;
    }

}
