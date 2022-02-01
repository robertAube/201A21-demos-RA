/**
 * Classe de test pour TableauDouble
 * TableauDouble est une stucture de données qui emmagasine des réels (double). Le
 * premier élément est stocké à l'indice 0.
 *
 * @author Robert Aubé
 * @version A21 420-201 TP4a 2021-11-12  V1
 */
public class TableauDoubleTest {
   //Ces variables d'instance doivent être décommentées aussitôt que votre classe TableauTest est créé
   TableauDouble t1;
   TableauDouble t2;
   TableauDouble t3;

    public TableauDoubleTest() {
       testerInstancierEtToString(); //1
       testerSetAll(); //2
       testerSize(); //3
       testerSet(); //4
       testerGet(); //5
       testerAdd(); //6
       testerClear(); //7
       testerRemove(); //8
       testerSetTab(); //9
       testerGetSomme(); //10
       testerEstPlusPetit1Argument(); //11
       testerEstPlusPetit2Arguments(); //12
    }

   private void testerInstancierEtToString() {
       System.out.println("1 - testerInstancierEtToString()");
       System.out.println("\ta. " + (TableauDouble.LONGUEUR_DEFAUT >= 0));
       System.out.println("\tb. " + (TableauDouble.VALEUR_DEFAUT == 0));
       t1 = new TableauDouble(4, 2);
       System.out.println("\tc. " + t1);

       //note: ce constructeur sans paramètre avec un paramèetre doit appeler le constructeur avec paramètres
       t2 = new TableauDouble(3);
       System.out.println("\td. " + t2);

       //note: ce constructeur sans paramètre doit appeler le constructeur avec paramètres
       t3 = new TableauDouble();
       System.out.println("\te. " + t3);

       System.out.println("\tf. " + t1.toString().equals("longueur: 4 [2.0, 2.0, 2.0, 2.0]"));
       System.out.println("\tg. " + t2.toString().equals("longueur: 3 [0.0, 0.0, 0.0]"));
       System.out.println("\th. " + t3.toString().equals("longueur: 5 [0.0, 0.0, 0.0, 0.0, 0.0]"));

       System.out.println("\ti. " + new TableauDouble(0,0).toString().equals("longueur: 0 []"));

   }

   private void testerSetAll() {
       System.out.println("2 - testerSetAll()");
       t1 = new TableauDouble(4, 2);
       System.out.println("\ta. " + t1);
       t1.setAll(1);
       System.out.println("\tb. " + t1);
       System.out.println("\tc. " + t1.toString().equals("longueur: 4 [1.0, 1.0, 1.0, 1.0]"));
   }

   private void testerSize() {
       System.out.println("3 - testerSize()");
       t1 = new TableauDouble(4);
       t2 = new TableauDouble(0);
       System.out.println("\ta. " + t1);
       System.out.println("\tb. " + (t1.size() == 4));
       System.out.println("\tc. " + t2);
       System.out.println("\td. " + (t2.size() == 0));
   }

   private void testerSet() {
       System.out.println("4 - testerSet()");
       t1 = new TableauDouble(4);
       System.out.println("\ta. " + t1);
       for (int i = 0; i < t1.size(); i++) {
           t1.set(i, i + 1);
       }
       System.out.println("\tb. " + t1);
       System.out.println("\tc. " + t1.toString().equals("longueur: 4 [1.0, 2.0, 3.0, 4.0]"));
   }

   private void testerGet() {
       System.out.println("5 - testerGet()");
       double valeurEcrite;
       double valeurLu;

       for (int i = 0; i < t1.size(); i++) {
           valeurEcrite = i + 1;
           t1.set(i, valeurEcrite);
           valeurLu = t1.get(i);
           System.out.println("\t" + (char)('a' + i) + ". valeur écrite : " + valeurEcrite +" - valeur lu : " + valeurLu + " -> " + (valeurEcrite == valeurLu));
       }
   }

   private void testerAdd() {
       System.out.println("6 - testerAdd()");
       double []tDouble = {1, 2, 3, 4};

       t1 = new TableauDouble(0);
       System.out.println("\ta. " + t1.toString());

       for (int i = 0; i < tDouble.length; i++) {
           t1.add(tDouble[i]);
       }

       System.out.println("\tb. " + t1.toString());
       System.out.println("\tc. " + t1.toString().equals("longueur: 4 [1.0, 2.0, 3.0, 4.0]"));
   }


   private void testerClear() {
       System.out.println("7 - testerClear()");
       double []tDouble = {1, 2, 3, 4};

       t1 = new TableauDouble(4,3);

       System.out.println("\ta. " + t1.toString());
       t1.clear();
       System.out.println("\tb. " + t1.toString());

       System.out.println("\tc. " + t2.toString().equals("longueur: 0 []"));
   }

   private void testerRemove() {
       System.out.println("8 - testerRemove()");

       t1 = new TableauDouble(0);
       System.out.println("\ta. " + t1.toString());

       for (int i = 0; i < 5; i++) {
           t1.add(i + 1);
       }

       System.out.println("\tb. " + t1.toString());
       t1.remove(0);
       System.out.println("\tc. " + t1.toString());
       System.out.println("\td. " + t1.toString().equals("longueur: 4 [2.0, 3.0, 4.0, 5.0]"));
       t1.remove(1);
       System.out.println("\te. " + t1.toString());
       System.out.println("\tf. " + t1.toString().equals("longueur: 3 [2.0, 4.0, 5.0]"));
       t1.remove(2);
       System.out.println("\tg. " + t1.toString());
       System.out.println("\th. " + t1.toString().equals("longueur: 2 [2.0, 4.0]"));
   }
   private void testerSetTab() {
       double tab[] = {1.0, 2.0};
       System.out.println("9 - testerSetTab()");

       t1 = new TableauDouble(0);
       System.out.println("\ta. " +  t1.toString());
       t1.set(new double [] {4.0, 2.0});
       System.out.println("\tb. " +  t1.toString());
       System.out.println("\tc. " +  t1.toString().equals("longueur: 2 [4.0, 2.0]"));

       t1 = new TableauDouble(4);
       System.out.println("\td. " +  t1.toString());
       t1.set(new double [] {});
       System.out.println("\te. " +  t1.toString());
       System.out.println("\tf. " +  t1.toString().equals("longueur: 0 []"));

       t1 = new TableauDouble(1);
       System.out.println("\tg. " +  t1.toString());
       t1.set(tab);
       System.out.println("\th. " +  t1.toString());
       tab[0] = 99;  //ici on teste que le tableau encapsulé ne soit pas le même tableau que celui passé en argument.
       System.out.println("\ti. " +  (t1.get(0) == 1));
   }

   private void testerGetSomme() {
       System.out.println("10 - testerGetSomme()");

       t1 = new TableauDouble(0);
       System.out.println("\ta. " +  t1.toString());
       System.out.println("\tb. " + (t1.getSomme() == 0));

       t1 = new TableauDouble(4, 1);
       System.out.println("\tc. " +  t1.toString());
       System.out.println("\td. " + (t1.getSomme() == 4));
   }

   private void testerEstPlusPetit1Argument() {
       System.out.println("11 - testerEstPlusPetit1Argument()");

       t1 = new TableauDouble(0);
       System.out.println("\ta. " +  t1.toString());
       t2 = new TableauDouble(0);
       System.out.println("\tb. " +  t2.toString());
       System.out.println("\tc. " + (t1.estPlusPetit(t2) == false));

       t1 = new TableauDouble(6, 1);
       System.out.println("\td. " +  t1.toString());
       t2 = new TableauDouble(6, 1);
       System.out.println("\te. " +  t2.toString());
       System.out.println("\tf. " + (t1.estPlusPetit(t2) == false));

       t1 = new TableauDouble(6, 2);
       System.out.println("\tg. " +  t1.toString());
       t2 = new TableauDouble(6, 1);
       System.out.println("\th. " +  t2.toString());
       System.out.println("\ti. " + (t1.estPlusPetit(t2) == false));

       t1 = new TableauDouble(2, 1);
       System.out.println("\tj. " +  t1.toString());
       t2 = new TableauDouble(2, 2);
       System.out.println("\tk. " +  t2.toString());
       System.out.println("\tl. " + (t1.estPlusPetit(t2) == true));
   }

   private void testerEstPlusPetit2Arguments() {
       System.out.println("12 - testerEstPlusPetit2Arguments()");

       t1 = new TableauDouble(0);
       System.out.println("\ta. " +  t1.toString());
       t2 = new TableauDouble(0);
       System.out.println("\tb. " +  t2.toString());
       System.out.println("\tc. " + (TableauDouble.estPlusPetit(t1, t2) == false));

       t1 = new TableauDouble(6, 1);
       System.out.println("\td. " +  t1.toString());
       t2 = new TableauDouble(6, 1);
       System.out.println("\te. " +  t2.toString());
       System.out.println("\tf. " + (TableauDouble.estPlusPetit(t1, t2) == false));

       t1 = new TableauDouble(6, 2);
       System.out.println("\tg. " +  t1.toString());
       t2 = new TableauDouble(6, 1);
       System.out.println("\th. " +  t2.toString());
       System.out.println("\ti. " + (TableauDouble.estPlusPetit(t1, t2) == false));

       t1 = new TableauDouble(0);
       t1.set(new double[] {-1, 2, 5});
       System.out.println("\tj. " +  t1.toString());
       t2 = new TableauDouble(0);
       t2.set(new double[] {-1, 2, 6});
       System.out.println("\tk. " +  t2.toString());
       System.out.println("\tl. " + (TableauDouble.estPlusPetit(t1, t2) == true));
   }

    public static void main(String[] args) {
        new TableauDoubleTest();
    }

}
