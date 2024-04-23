package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameCalc {
    static final int NUMBERMAX = 10;
    static final int NUMBERCHAR = 2;

    public static void gameTwo() {
        Engine.meetWithUser("What is the result of the expression?");
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
        int numberOne = random.nextInt(NUMBERMAX);
        int numberTwo = random.nextInt(NUMBERMAX);
        int numberToSelect = random.nextInt(NUMBERCHAR);
        String[] calculationSigns = {"+", "-", "*"};
        String sing = calculationSigns[numberToSelect];
        return numberOne + " " + sing + " " + numberTwo;
    }

    public static int calculation(String questionForUser) {
        var mathExample = questionForUser.split(" ");
        var firstNumber = mathExample[0];
        var secondNumber = mathExample[2];
        String singForCallculate = mathExample[1];
        int result;
        switch (singForCallculate) {
            case "+":
                result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                break;
            case "-":
                result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                break;
            case "*":
                result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + singForCallculate);
        }
        return result;
    }
}
