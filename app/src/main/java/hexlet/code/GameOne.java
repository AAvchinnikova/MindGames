package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class GameOne {
    public static String gameOne(String answear, String numberGame) {
        var numberToInt = ThreadLocalRandom.current().nextInt(100);

        if (answear.equals("") & numberGame .equals("")) {
            return Integer.toString(numberToInt);
        }
        if (Integer.parseInt(numberGame) % 2 == 0 & answear.equals("yes")){
            return Integer.toString(numberToInt);
            } else if (Integer.parseInt(numberGame) % 2 != 0 & answear.equals("no")) {
            return Integer.toString(numberToInt);
            } return "wrong";
    }
}
