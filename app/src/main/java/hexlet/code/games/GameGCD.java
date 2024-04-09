package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameGCD {
    private static final int numberSize = 10;
    public static void gameThree() {
        Engine.meetWithUser("Find the greatest common divisor of given numbers.");
        String questionForUser = prepareQuestion();
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i < 3; i++) {
            var calculateNumber = calculation(questionForUser);
            if (answerUser.equals(calculateNumber)) {
                System.out.println("Correct!");
                questionForUser = prepareQuestion();
                answerUser = Engine.playWithUser(questionForUser);
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + calculateNumber + ".");
                Engine.finishGame("Wrong");
                return;
            }
        }
        Engine.finishGame("");
    }
    public static String prepareQuestion() {
        Random random = new Random();
        int numberOne = random.nextInt(numberSize);
        int numberTwo = random.nextInt(numberSize);
        return numberOne + " " + numberTwo;
    }
    private static String calculation(String resultForUser) {
        var mathExample = resultForUser.split(" ");
        var firstNumber = mathExample[0];
        var secondNumber = mathExample[1];
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(secondNumber);
        while (firstNumberInt != 0 & secondNumberInt != 0) {
            if (firstNumberInt > secondNumberInt) {
                firstNumberInt = firstNumberInt % secondNumberInt;
            } else {
                secondNumberInt = secondNumberInt % firstNumberInt;
            }
        }
        int result = firstNumberInt + secondNumberInt;
        return Integer.toString(result);
    }
}
