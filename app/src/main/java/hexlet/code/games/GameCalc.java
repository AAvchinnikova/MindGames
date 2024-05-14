package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameCalc {
    static final int NUMBERCHAR = 2;

    public static void dataEntry() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            String question = prepareQuestion();
            var mathExample = question.split(" ");
            int answer = calculation(Integer.parseInt(mathExample[0]),
                    mathExample[1].charAt(0), Integer.parseInt(mathExample[2]));
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
        char[] calculationSigns = {'+', '-', '*'};
        char sing = calculationSigns[numberToSelect];
        return numberOne + " " + sing + " " + numberTwo;
    }

    private static int calculation(int firstNumber, char singForCallculate, int secondNumber) {
        int result;
        switch (singForCallculate) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + singForCallculate);
        }
        return result;
    }
}
