package hexlet.code;

import java.util.Random;

public class Utils {
    static final int NUMBERMAX = 10;

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(NUMBERMAX);
    }
    public static int randomNumber(int NUMBERMAX) {
        Random random = new Random(NUMBERMAX);
        return random.nextInt(NUMBERMAX);
    }
}
