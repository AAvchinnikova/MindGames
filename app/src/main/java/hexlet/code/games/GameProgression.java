package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.NUMBERARRAY;
import static hexlet.code.Engine.STEPS;

public class GameProgression {
    private static final int NUMBERSIZE = 10;

    public static void gameFour() {
        String[][] dateForGame = new String[STEPS + 1][NUMBERARRAY];
        var j = 0;
        var i = 0;
        for (i = 0; i < STEPS; i++) {
            String question = prepareQuestion();
            int answer = calculation(question);
            dateForGame[i][j] = question;
            j += 1;
            dateForGame[i][j] = String.valueOf(answer);
            j = 0;
        }
        dateForGame[STEPS][j] = "Rules";
        dateForGame[STEPS][j + 1] = "What number is missing in the progression?";
        Engine.playWithUser(dateForGame);
    }
    private static String prepareQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(NUMBERSIZE);
        int numberToAdd = random.nextInt(NUMBERSIZE) + 1;
        int positionForMission = random.nextInt(NUMBERSIZE);
        int[] arrayForUser = new int[NUMBERSIZE];
        arrayForUser[0] = firstNumber;
        var questionForUser = new StringBuilder();
        for (var i = 1; i < arrayForUser.length; i++) {
            arrayForUser[i] = firstNumber + numberToAdd;
            firstNumber = firstNumber + numberToAdd;
        }
        for (var i = 0; i < arrayForUser.length; i++) {
            if (i != positionForMission) {
                questionForUser.append(arrayForUser[i]);
                questionForUser.append(" ");
            } else {
                questionForUser.append("..");
                questionForUser.append(" ");
            }
        }
        return questionForUser.toString();
    }
    private static int calculation(String resultForUser) {
        String[] arrayFromUser = resultForUser.split(" ");
        int[] arrayFromUserInt = new int[NUMBERSIZE];
        int result = 0;
        int numberMissingElement = 0;
        var difference = 0;
        for (var i = 0; i < arrayFromUser.length; i++) { //calculate index missing Element
            if (arrayFromUser[i].equals("..")) {
                numberMissingElement = i;
            }
        }
        arrayFromUser[numberMissingElement] = "0";
        for (var i = 0; i < arrayFromUser.length; i++) { //make int array
            arrayFromUserInt[i] = Integer.parseInt(arrayFromUser[i]);
        }
        if (numberMissingElement == 0) { //for case, when missing element is the first
            difference = arrayFromUserInt[2] - arrayFromUserInt[1];
            result = arrayFromUserInt[1] - difference;
        } else {
            for (var i = 0; i < arrayFromUser.length; i++) {
                if (arrayFromUserInt[i + 1] != 0 & arrayFromUserInt[i] != 0) {
                    difference = arrayFromUserInt[i + 1] - arrayFromUserInt[i];
                    result = arrayFromUserInt[numberMissingElement - 1] + difference;
                    break;
                }
            }
        }
        return result;
    }
}
