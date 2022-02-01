import java.util.ArrayList;
import java.util.Arrays;

public class AvionArrayList
{
    private ArrayList<Passager> arrayListPassager;
    private int nbMaxPassager;

    public AvionArrayList(int nbMaxPassager)
    {
        this.nbMaxPassager = nbMaxPassager;
        arrayListPassager = new ArrayList<Passager>();
    }

    public void ajouterPassager(Passager passager)
    {
        if (arrayListPassager.size() >= nbMaxPassager)
        {
            throw new ArrayIndexOutOfBoundsException("Il y a trop de passager dans l'avion");
        }
        //expliquer différence entre nbPassager++ et ++nbPassager
        arrayListPassager.add(passager);
    }

    public double getMoyenneAge()
    {

        int total;

        total = 0;
        for (int i = 0; i < arrayListPassager.size(); i++)
        {
            total += arrayListPassager.get(i).getAge();
        }

        return (double) total / arrayListPassager.size();
    }

    public int getPoidsPassager()
    {
        int total;

        total = 0;
        for (int i = 0; i < arrayListPassager.size(); i++)
        {
            total += arrayListPassager.get(i).getPoids();
        }

        return total;
    }

    @Override
    public String toString()
    {
        String str = "";
        str += "Avion{";
        str += " nombre de passager = " + arrayListPassager.size();
        str += ", moyenne d'âge = " + (arrayListPassager.size() == 0 ? "Aucun passager" : getMoyenneAge());
        str += ", poids des passagers = " + getPoidsPassager();
        str += ", tabPassager = " + arrayListPassager;
        str += '}';
        return str;
    }
}
