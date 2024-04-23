package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameGCD {
    private static final int NUMBERSIZE = 10;

    public static void gameThree() {
        Engine.meetWithUser("Find the greatest common divisor of given numbers.");
        String[][] dateForGame = new String[STEPS][NUMBERARRAY];
        for (var i = 0; i < STEPS; i++) {
            String question = prepareQuestion();
            int answer = calculation(question);
            var j = 0;
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = String.valueOf(answer);
        }
        Engine.playWithUser(dateForGame);
    }
    public static String prepareQuestion() {
        Random random = new Random();
        int numberOne = random.nextInt(NUMBERSIZE);
        int numberTwo = random.nextInt(NUMBERSIZE);
        return numberOne + " " + numberTwo;
    }
    private static int calculation(String question) {
        var mathExample = question.split(" ");
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
        return firstNumberInt + secondNumberInt;
    }
}
