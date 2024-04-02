package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class GameFour {

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
        int firstNumber = ThreadLocalRandom.current().nextInt(10);
        int numberToAdd = ThreadLocalRandom.current().nextInt(10);
        int positionForMission = ThreadLocalRandom.current().nextInt(10);
        int[] arrayForUser = new int[10];
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
        int[] arrayFromUserInt = new int[10];
        int result = 0;
        int numberMissingElement = 0;
        var difference = 0;
        for (var i = 0; i < arrayFromUser.length; i++) {
            if (arrayFromUser[i].equals("..")) {
                numberMissingElement = i;
            }
        }
        arrayFromUser[numberMissingElement] = "0";
        for (var i = 0; i < arrayFromUser.length; i++) {
            arrayFromUserInt[i] = Integer.parseInt(arrayFromUser[i]);
        }
        if (numberMissingElement == 0) {
            difference = arrayFromUserInt[2] - arrayFromUserInt[1];
            result = difference;
        } else {
            for (var i = 0; i < arrayFromUser.length; i++) {
                if (arrayFromUserInt[i + 1] > arrayFromUserInt[i]) {
                    difference = arrayFromUserInt[i + 1] - arrayFromUserInt[i];
                    result = arrayFromUserInt[numberMissingElement - 1] + difference;
                    break;
                }
            }
        }
        return Integer.toString(result);
    }
}
