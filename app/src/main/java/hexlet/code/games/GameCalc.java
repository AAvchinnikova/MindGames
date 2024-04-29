package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameCalc {
    static final int NUMBERCHAR = 2;

    public static void gameTwo() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            String question = prepareQuestion();
            var mathExample = question.split(" ");
            int answer = calculation(mathExample[0], mathExample[1], mathExample[2]);
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = String.valueOf(answer);
            j = 0;
        }
        dateForGame[STEPS][j] = "Rules";
        dateForGame[STEPS][j + 1] = "What is the result of the expression?";
        Engine.playWithUser(dateForGame);
    }

    private static String prepareQuestion() {
        int numberOne = Utils.getRandomInt();
        int numberTwo = Utils.getRandomInt();
        int numberToSelect = Utils.getRandomInt(NUMBERCHAR);
        String[] calculationSigns = {"+", "-", "*"};
        String sing = calculationSigns[numberToSelect];
        return numberOne + " " + sing + " " + numberTwo;
    }

    private static int calculation(String firstNumber, String singForCallculate, String secondNumber) {
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
