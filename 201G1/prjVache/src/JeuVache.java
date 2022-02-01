public class JeuVache {
    //variable d'instance
    private Vache[] tabVache;

    public JeuVache(int nbVache) {
        tabVache = new Vache[nbVache];
        //testVache();
        remplirTabVache();

        avancerLesVaches();
        afficherLesVaches();
        Vache.vitesse = 30;
        avancerLesVaches();
        afficherLesVaches();
        avancerLesVaches();
        afficherLesVaches();
        avancerLesVaches();
        afficherLesVaches();
        avancerLesVaches();
        afficherLesVaches();
    }

    private void avancerLesVaches() {
        for (int i = 0; i < tabVache.length; i++) {
            tabVache[i].avancer();
        }
    }

    private void afficherLesVaches() {
        for (int i = 0; i < tabVache.length; i++) {
            System.out.println(tabVache[i]);
        }
    }

    private void remplirTabVache() {
        int x;
        int y;
        String nom;

        for(int i = 0 ; i < tabVache.length; i++){
            y = 0;
            x = Utility.getNombreAleatoireEntreBorne(2, 98);
            nom = "Vache #" + (i + 1);

            tabVache[i] = new Vache(x, y, nom);

            System.out.println(tabVache[i]);
        }


    }

    private void testVache() {
        Vache v1;
        Vache v2;
        Vache v3;

        v1 = new Vache(0, 0, "v1.1");
        v1 = new Vache(10, 0, "v1.2"); //destuction de l'objet v1.1
        v2 = new Vache(0, 0, "v2");
        //  v3 = new Vache(0,20, 1, "sajlkfdsajfdjdsalkjflkdsajflksjdlkfjlkdsjflkdsjflsjdfljslfjsdljflksjfl");

        System.out.println(v1);
        System.out.println(v2.toString());
        System.out.println("Vache.MIN_Y -> " + Vache.MIN_Y);
        System.out.println("Vache.MIN_Y -> " + Vache.vitesse);
        //    System.out.println(v3);

       // v1.setNom("djslfkslkjflkdsjflkdsjfljsldafjlskdjflskdjflkdsafjldsjflskdjflksjfla");

        System.out.println(v1);

        System.out.println("Augmenter la vitesse à 30");
        Vache.vitesse = 30;
        System.out.println(v1);
        System.out.println(v2.toString());

        System.out.println("Faire avancer v1");
        v1.avancer();
        System.out.println(v1);
        v1.avancer();
        System.out.println(v1);
        v1.avancer();
        System.out.println(v1);
        v1.avancer();
        System.out.println(v1);
        System.out.println(v2.toString());
    }

}
