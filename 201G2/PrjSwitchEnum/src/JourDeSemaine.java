public class JourDeSemaine {
    public JourDeSemaine() {
        demoSwitch();
    }

    private void demoSwitch() {
        System.out.println(quelJour(1));
        System.out.println(travaillesTu(JourSemaine.DIMANCHE));

    }

    private String travaillesTu(JourSemaine jour) {
        String travail = "";
        switch (jour) {
            case LUNDI:
            case MARDI:
            case MERCREDI:
            case JEUDI:
            case VENDREDI:
                travail = "jour de travail";
                break;
            case SAMEDI:
            case DIMANCHE:
                travail = "jour de congé";
                break;
        }
        return travail;
    }

    private String quelJour(int noJour) {
        String strJourSemaine;

        switch (noJour) {
            case 1:
                strJourSemaine = "Dimanche";
                break;
            case 2:
                strJourSemaine = "lundi";
                break;
            case 3:
                strJourSemaine = "Mardi";
                break;
            case 4:
                strJourSemaine = "Mercredi";
                break;
            case 5:
                strJourSemaine = "Jeudi";
                break;
            case 6:
                strJourSemaine = "Vendredi";
                break;
            case 7:
                strJourSemaine = "Samedi";
                break;
            default:
                throw new IllegalArgumentException("Jour invalide");
        }
        return strJourSemaine;
    }

    public static void main(String[] args) {
        new JourDeSemaine();
    }
}
