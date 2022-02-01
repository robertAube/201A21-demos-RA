import java.util.Scanner; //Importer la classe Scanner

public class LectureClavier {
    public LectureClavier() {
        Scanner sc; //variable de type Scanner
        String str; //variable qui contient une chaine de caractères saisi par l'usager

        sc = new Scanner(System.in); //System.in : entrée clacier

        System.out.print("Veuillez saisir un mot : "); //"print" ne fait pas de saut de ligne comme "println"
        str = sc.nextLine(); //attendre que l'usager entre une chaine une caractères qui sera placé

        System.out.println("Vous avez saisi : \"" + str + "\"");


        System.out.print("Veuillez saisir un autre mot : "); //"print" ne fait pas de saut de ligne comme "println"
        str = sc.nextLine(); //attendre que l'usager entre une chaine une caractères qui sera placé

        System.out.println("Vous avez saisi comme autre mot: \"" + str + "\"");
    }

    public static void main(String[] args) {
        new LectureClavier();
    }
}
