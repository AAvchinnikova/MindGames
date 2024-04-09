package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    private static final int NUMBERMAX = 100;
    public static void gameOne() {
        Engine.meetWithUser("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int number = random.nextInt(NUMBERMAX);
        String questionForUser = Integer.toString(number);
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i <= 3; i++) {
            var resultcheck = checkNumbers(number, answerUser);
            if (resultcheck && i < 3) {
                System.out.println("Correct!");
                number = random.nextInt(NUMBERMAX);
                questionForUser = Integer.toString(number);
                answerUser = Engine.playWithUser(questionForUser);
            } else if (resultcheck) {
                System.out.println("Correct!");
                answerUser = "";
            }
            else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                Engine.finishGame("Wrong");
                return;
            }
        } Engine.finishGame("");
    }

    public static boolean checkNumbers(int number, String answerUser) {
        boolean resultCheck;
        resultCheck = number % 2 == 0 && answerUser.equals("yes") || number % 2 != 0 && answerUser.equals("no");
        return resultCheck;
    }
}
