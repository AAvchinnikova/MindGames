package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GamePrime {
    private static final int NUMBERMAX = 10;


    public static void gameFive() {
        Engine.meetWithUser("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        String[][] dateForGame = new String[STEPS][NUMBERARRAY];
        for (var i = 0; i < STEPS; i++) {
            int number = random.nextInt(NUMBERMAX);
            String question = Integer.toString(number);
            String answer;
            var j = 0;
            if (calculate(number)) {
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
