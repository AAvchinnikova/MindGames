package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class GameOne {
    public static String gameOne(String answear, String resultForUser) {
        var number = ThreadLocalRandom.current().nextInt(1000);
        if (answear.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
            answear = Integer.toString(number);
            return answear;
        } else {
            if (Integer.parseInt(resultForUser) % 2 == 0 & answear.equals("yes")) {
                System.out.println("Correct!");
                answear = Integer.toString(number);
            } else if (Integer.parseInt(resultForUser) % 2 != 0 & answear.equals("no")) {
                System.out.println("Correct!");
                answear = Integer.toString(number);
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                answear = "Wrong";
            }
        }
        return answear;
    }
}
