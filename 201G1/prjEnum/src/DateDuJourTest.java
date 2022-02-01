public class DateDuJourTest {

    public DateDuJourTest() {
        test1();
    }

    private void test1() {
        DateDuJour dj = new DateDuJour();
        System.out.println(dj.getJour());

        dj.setJour(Jour.VENDREDI);

        System.out.println(dj.getJour());
    }

    public static void main(String[] args) {
        new DateDuJourTest();
    }
}
