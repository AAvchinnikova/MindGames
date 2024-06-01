package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameEven {

    public static void dataEntry() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            int number = Utils.getRandomInt();
            String question = Integer.toString(number);
            String answer;
            if (isEven(number)) {
                answer = "yes";
            } else {
                answer = "no";
            }
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = answer;
            j = 0;
        }
        Engine.playWithUser(dateForGame, rules);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
