package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameGCD {

    public static void dataEntry() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        String rules = "Find the greatest common divisor of given numbers.";
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            int numberOne = Utils.getRandomInt();
            int numberTwo = Utils.getRandomInt();
            String question = numberOne + " " + numberTwo;
            int answer = calculation(numberOne, numberTwo);
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = String.valueOf(answer);
            j = 0;
        }
        Engine.playWithUser(dateForGame, rules);
    }

    private static int calculation(int numberOne, int numberTwo) {
        while (numberOne != 0 & numberTwo != 0) {
            if (numberOne > numberTwo) {
                numberOne = numberOne % numberTwo;
            } else {
                numberTwo = numberTwo % numberOne;
            }
        }
        return numberOne + numberTwo;
    }
}
