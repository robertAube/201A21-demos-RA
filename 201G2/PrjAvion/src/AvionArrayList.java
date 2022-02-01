import java.util.ArrayList;

public class AvionArrayList {
    private ArrayList <Passager>tabPassager;
    private int nbMaxPassager;

    public AvionArrayList(int nbMaxPassager) {
        this.nbMaxPassager = nbMaxPassager;
        tabPassager = new ArrayList<Passager>();
    }

    public void ajouterPassager(Passager passager) {
        if (tabPassager.size() >= nbMaxPassager) {
            throw new ArrayIndexOutOfBoundsException("Il y a trop de passager dans l'avion");
        }
        //expliquer différence entre nbPassager++ et ++nbPassager
        tabPassager.add(passager);
    }

    public double getMoyenneAge() {
        double moyenne;
        int total;

        total = 0;
        for (int i = 0; i < tabPassager.size(); i++) {
//            total += ((Passager)tabPassager.get(i)).getAge();
            total += tabPassager.get(i).getAge();
        }

        moyenne = total / tabPassager.size();
        return moyenne;
    }

    public int getPoidsPassager() {
        int total;

        total = 0;
        for (int i = 0; i < tabPassager.size(); i++) {
            total += tabPassager.get(i).getPoids();
        }

        return total;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Avion{";
        str += " nombre de passager = " + tabPassager.size();
        str += ", moyenne d'âge = " + (tabPassager.size() == 0 ? "Aucun passager" : getMoyenneAge());
        str += ", poids des passagers = " + getPoidsPassager();
        str += ", tabPassager = " + tabPassager.toString();
        str += '}';
        return str;
    }
}
