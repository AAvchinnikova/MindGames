package hexlet.code.games;

import java.util.Random;

public class GameProgression {

    public static String gameFour(String answerUser, String resultForUser) {
        String result = lookingForMissingNumber(resultForUser);
        if (answerUser.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("What number is missing in the progression?");
            answerUser = createArray();
            return answerUser;
        } else  {
            if (answerUser.equals(result)) {
                answerUser = createArray();
                return answerUser;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + result + ".");
                answerUser = "Wrong";
            }
        }
        return answerUser;
    }
    private static String createArray() {
        Random random = new Random();
        final int numberSize = 10;

        int firstNumber = random.nextInt(numberSize);
        int numberToAdd = random.nextInt(numberSize) + 1;
        int positionForMission = random.nextInt(numberSize);
        int[] arrayForUser = new int[numberSize];
        arrayForUser[0] = firstNumber;
        var answerForUser = new StringBuilder();
        for (var i = 1; i < arrayForUser.length; i++) {
            arrayForUser[i] = firstNumber + numberToAdd;
            firstNumber = firstNumber + numberToAdd;
        }
        for (var i = 0; i < arrayForUser.length; i++) {
            if (i != positionForMission) {
                answerForUser.append(arrayForUser[i]);
                answerForUser.append(" ");
            } else {
                answerForUser.append("..");
                answerForUser.append(" ");
            }
        }
        System.out.println(answerForUser);
        return answerForUser.toString();
    }
    private static String lookingForMissingNumber(String resultForUser) {
        String[] arrayFromUser = resultForUser.split(" ");
        final int numberSize = 10;

        int[] arrayFromUserInt = new int[numberSize];
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
