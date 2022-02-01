public class DateDuJour {
    private Jour jour;


    public DateDuJour() {
        setJour(Jour.MARDI);
    }


    public Jour getJour() {
        return jour;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }


    public static void main(String[] args) {
        new DateDuJour();
    }
}
