package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class GameFive {

    public static String gameFive(String answerUser, String resultForUser) {
        var numberForUser = ThreadLocalRandom.current().nextInt(10) + 1;

        if (answerUser.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            answerUser = Integer.toString(numberForUser);
            return answerUser;
        } else {
            if (answerUser.equals("yes") & checkNumber(resultForUser)) {
                answerUser = Integer.toString(numberForUser);
            } else if (answerUser.equals("no") & !checkNumber(resultForUser)) {
                answerUser = Integer.toString(numberForUser);
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                answerUser = "Wrong";
            }
        }
        return answerUser;
    }

    private static boolean checkNumber(String resultForUser) {
        int numberForCheck = Integer.parseInt(resultForUser);
        if (numberForCheck < 2) {
            return false;
        }
        for (var i = 2; i <= numberForCheck / 2; i++) {
            if (numberForCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
