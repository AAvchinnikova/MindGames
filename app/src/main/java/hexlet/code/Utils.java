package hexlet.code;

import java.util.Random;

public class Utils {
    static final int NUMBERMAX = 10;

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(NUMBERMAX);
    }
    public static int getRandomInt(int NUMBERMAX) {
        Random random = new Random(NUMBERMAX);
        return random.nextInt(NUMBERMAX);
    }
}
