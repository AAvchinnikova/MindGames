package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrime {
    private static final int NUMBERMAX = 10;

    public static void gameFive() {
        Engine.meetWithUser("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        int number = random.nextInt(NUMBERMAX);
        String questionForUser = Integer.toString(number);
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i <= Engine.STEPS; i++) {
            var resultPrime = calculate(number);
            var resultcheck = checkPrime(resultPrime, answerUser);
            if (resultcheck && i < Engine.STEPS) {
                System.out.println("Correct!");
                number = random.nextInt(NUMBERMAX);
                questionForUser = Integer.toString(number);
                answerUser = Engine.playWithUser(questionForUser);
            } else if (resultcheck) {
                System.out.println("Correct!");
                answerUser = "";

            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                Engine.finishGame("Wrong");
                return;
            }
        } Engine.finishGame("");
    }
    private static boolean calculate(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkPrime(boolean resultPrime, String answerUser) {
        return resultPrime && answerUser.equals("yes") || !resultPrime && answerUser.equals("no");
    }
}
