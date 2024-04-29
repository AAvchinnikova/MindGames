package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameEven {
    private static final int NUMBERMAX = 100;

    public static void gameOne() {
        Random random = new Random();
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            int number = random.nextInt(NUMBERMAX);
            String question = Integer.toString(number);
            String answer;
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = answer;
            j = 0;
        }
        dateForGame[STEPS][j] = "Rules";
        dateForGame[STEPS][j + 1] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.playWithUser(dateForGame);
    }
}
