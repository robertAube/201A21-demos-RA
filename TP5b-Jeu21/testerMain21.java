import paquet.*;
//Peux vous aider à tester votre classe Main21
//Fait gracieusement par un étudiant.
//Si certains tests ne passent pas, ca peut être des détails...

public class testerMain21 {
    public Paquet p = new Paquet(false);
    Main21 m = new Main21(p, 2);
    public testerMain21(){
        testerGetNbCartesDsMain();
        testerGetValeurCarte21();
        testerGetValeurMainDe21();
        testerToString();
        testerGagnantPerdantPiger();
    }


    private void testerGetNbCartesDsMain() {
        System.out.println("testerGetNbCartesDsMain()");
        System.out.println((m.getNbCartesDsMain() == 2) == true);
        System.out.println((m.getNbCartesDsMain() == 3) == false);
    }

    private void testerGetValeurCarte21() {
        System.out.println("testerGetValeurCarte21()");
        System.out.println((m.getValeurCarte21(new Carte(2, "pique"))) == 2);
        System.out.println((m.getValeurCarte21(new Carte(1, "coeur"))) == 11);
        System.out.println((m.getValeurCarte21(new Carte(11, "carreau"))) == 10);
        System.out.println((m.getValeurCarte21(new Carte(9, "trèfle"))) == 9);
    }

    private void testerGetValeurMainDe21() {
        System.out.println("testerGetValeurMainDe21()");
        System.out.println(m);
        System.out.println(m.getValeurMainDe21() == 13);
    }

    private void testerToString() {
        String s;
        System.out.println("testerToString()");
        String reponse = "1 - 1 de pique (♠)\n" +
                "2 - 2 de pique (♠)\n" +
                "valeur du jeu 21 : 13 -> 8 pour dépasser.\n";
        s = m.toString();
        System.out.println(s.equals(reponse));
    }

    private void testerGagnantPerdantPiger() {
        System.out.println("testerGagnantPerdantPiger()");
        m.pigerAu21();
        System.out.println(m);
        System.out.println(m.main21GagnanteOuPerdante() == false);
        m.pigerAu21();
        System.out.println(m);
        System.out.println(m.main21GagnanteOuPerdante() == false);
        m.pigerAu21();
        System.out.println(m);
        System.out.println(m.main21GagnanteOuPerdante() == true);
    }

    public static void main(String[] args) {
        new testerMain21();
    }
}
