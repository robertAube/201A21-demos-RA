import java.util.Arrays;

public class Avion {
    private Passager[] tabPassager;
    private int nbPassager;

    public Avion(int nbPassagerMax) {
        tabPassager = new Passager[nbPassagerMax];
        nbPassager = 0;
    }

    public void addPassager(Passager p) {
        tabPassager[nbPassager++] = p;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "\n nbPassager=" + nbPassager +
                "\n Passager dans l'avion=" + getStrPassagers() +
                "\n tabPassager=" + Arrays.toString(tabPassager) +
                "\n}";
    }

    private String getStrPassagers() {
        String str = "";
        for (int i = 0; i < nbPassager; i++) {
            str += ", " + tabPassager[i].toString();
        }
        return str;
    }
}
