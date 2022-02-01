import java.util.Random;

public class Utility {
    public static int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit être plus grand que min");
        }

        Random r = new Random(); //Instaciation de la classe Random
        return r.nextInt((max - min) + 1) + min;
    }
}
