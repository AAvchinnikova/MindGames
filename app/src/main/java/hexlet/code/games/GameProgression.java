package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameProgression {
    private static final int NUMBERSIZE = 10;

    public static void gameFour() {
        Engine.meetWithUser("What number is missing in the progression?");
        String questionForUser = prepareQuestion();
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i <= 3; i++) {
            var calculateNumber = calculation(questionForUser);
            if (answerUser.equals(calculateNumber) && i < 3) {
                System.out.println("Correct!");
                questionForUser = prepareQuestion();
                answerUser = Engine.playWithUser(questionForUser);
            } else if (answerUser.equals(calculateNumber)) {
                System.out.println("Correct!");
                answerUser = "";
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + calculateNumber + ".");
                Engine.finishGame("Wrong");
                return;
            }
        }
        Engine.finishGame("");
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
    private static String calculation(String resultForUser) {
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
        return Integer.toString(result);
    }
}
