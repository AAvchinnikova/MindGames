package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameEven {
    private static final int NUMBERMAX = 100;

    public static void gameOne() {
        Engine.meetWithUser("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        String[][] dateForGame = new String[STEPS][NUMBERARRAY];
        for (var i = 0; i < STEPS; i++) {
            int number = random.nextInt(NUMBERMAX);
            String question = Integer.toString(number);
            String answer;
            var j = 0;
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = answer;
        }
        Engine.playWithUser(dateForGame);
    }
}
