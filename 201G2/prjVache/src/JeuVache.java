public class JeuVache {
    //variable d'instance
    private Vache[] tabVache;

    public JeuVache(int nbVache) {
        tabVache = new Vache[nbVache];

        remplirTabVache();

        avancerVacheJusquALaFin();
    }


    private void remplirTabVache() {
        int x;
        int y;
//        Vache v;
//        v = new Vache(1,1,"www");
//        System.out.println();
//        v.setX(12);

        String nom;
        for (int i = 0; i < tabVache.length; i++) {
            y = 0;
            x = Utility.getNombreAleatoireEntreBorne(2, 98);
            nom = Utility.lireString("Donner le nom de la vache");

            tabVache[i] = new Vache(x, y, nom);

            System.out.println(tabVache[i]);
        }
    }

    public boolean avancerLesVaches() {
        boolean lesVachesOntAvancees = false;
        for (int i = 0; i < tabVache.length; i++) {
            if (tabVache[i].estDansLesLimites()) {
                tabVache[i].avancer();
                System.out.println(tabVache[i]);
                tabVache[i].setNom("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
                lesVachesOntAvancees = true;
            }
        }

        return lesVachesOntAvancees;
    }

    public void avancerVacheJusquALaFin(){
        boolean lesVachesOntAvances;
        do {
            lesVachesOntAvances =  avancerLesVaches();
        } while(lesVachesOntAvances);
    }

}
