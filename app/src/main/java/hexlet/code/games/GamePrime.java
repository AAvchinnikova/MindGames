package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GamePrime {
    private static final int NUMBERMAX = 10;


    public static void gameFive() {
        Random random = new Random();
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            int number = random.nextInt(NUMBERMAX);
            String question = Integer.toString(number);
            String answer;
            if (calculate(number)) {
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
        dateForGame[STEPS][j + 1] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.playWithUser(dateForGame);

    }
    private static boolean calculate(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
