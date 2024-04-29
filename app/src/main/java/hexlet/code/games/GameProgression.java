package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameProgression {
    static final int MINSIZEARRAY = 10;
    static final int MAXSIZEARRAY = 15;

    public static void gameFour() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        for (var i = 0; i < STEPS; i++) {
            int numberSize = Utils.getRandomInt(MINSIZEARRAY, MAXSIZEARRAY);
            int firstNumber = Utils.getRandomInt();
            int stepForArray = Utils.getRandomInt() + 1;
            int[] questionArray = prepareQuestion(numberSize, firstNumber, stepForArray);
            int indexOfNumberMiss = Utils.getRandomInt(numberSize - 1);
            String answer = Integer.toString(questionArray[indexOfNumberMiss]);
            String question = question(questionArray, indexOfNumberMiss);
            dateForGame[i][j] = question;
            dateForGame[i][j + 1] = answer;
        }
        dateForGame[STEPS][j] = "Rules";
        dateForGame[STEPS][j + 1] = "What number is missing in the progression?";
        Engine.playWithUser(dateForGame);
    }

    private static int[] prepareQuestion(int numberSize, int firstNumber, int step) {
        int[] arrayForUser = new int[numberSize];
        arrayForUser[0] = firstNumber;
        var number = firstNumber;
        for (var i = 1; i < arrayForUser.length; i++) {
            number = number + step;
            arrayForUser[i] = number;
        }
        return arrayForUser;
    }
    private  static String question(int[] arrayForUser, int indexOfNumberMiss) {
        String[] questionArray = new String[arrayForUser.length];
        for (var i = 0; i < arrayForUser.length; i++) {
            questionArray[i] = Integer.toString(arrayForUser[i]);
        }
        questionArray[indexOfNumberMiss] = "..";
        return String.join(" ", questionArray);
    }
}
