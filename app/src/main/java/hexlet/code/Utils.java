package hexlet.code;

import java.util.Random;

public class Utils {
    static final int NUMBERMAX = 10;

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(NUMBERMAX);
    }
    public static int getRandomInt(int numberMux) {
        Random random = new Random();
        return random.nextInt(numberMux);
    }
    public static int getRandomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
