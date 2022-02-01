public class Passager {
    //constante à la classe
    public static final int AGE_PAR_DEFAUT = 50;
    public static final int POIDS_PAR_DEFAUT = 300;
    public static final int AGE_MIN = 0;
    public static final int POIDS_MIN = 0;

    //variable d'instance (synonime est attribut)
    private int age;
    private int poids;

    //constructeur par défaut
    public Passager() {
//        this.age = AGE_PAR_DEFAUT;
//        this.poids = POIDS_PAR_DEFAUT;

        this(AGE_PAR_DEFAUT, POIDS_PAR_DEFAUT);
    }

    public Passager(int age, int poids) {
        setAge(age);
        setPoids(poids);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!ageEstValide(age))
            throw new IllegalArgumentException("Age invalide : " + age);
        this.age = age;
    }

    public static boolean ageEstValide(int age) {
        boolean estValide;
        estValide = age > AGE_MIN;
        return estValide;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        if (!poidsEstValide(poids))
            throw new IllegalArgumentException("Poids invalide : " + poids);
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "age=" + age +
                ", poids=" + poids +
                '}';
    }

    public static boolean poidsEstValide(int poids) {
        boolean estValide;
        estValide = poids > POIDS_MIN;
        return estValide;
    }
}
