package hexlet.code.games;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class GameFour {

    public static String gameFour(String answerUser, String resultForUser) {
        String[] arrayFromUser = resultForUser.split(" ");

        if (answerUser.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("What number is missing in the progression?");
            answerUser = createArray();
            return answerUser;
        } else  {
            String result = lookingForMissingNumber(arrayFromUser);
            //System.out.println(result);
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

    public static String createArray() {
        int firstNumber = ThreadLocalRandom.current().nextInt(10);
        int numberToAdd = ThreadLocalRandom.current().nextInt(10);
        int positionForMission = ThreadLocalRandom.current().nextInt(10);
        int[] arrayForUser = new int[10];
        arrayForUser[0] = firstNumber;
        for (var i = 1; i < arrayForUser.length; i++) {
            arrayForUser[i] = firstNumber + numberToAdd;
            firstNumber = firstNumber + numberToAdd;
        } //System.out.println(Arrays.toString(arrayForUser));
        int numberForCheck = arrayForUser[positionForMission];
        String answerForUser = Arrays.toString(arrayForUser);
        answerForUser = answerForUser.replaceAll(String.valueOf(numberForCheck), "..");
        return answerForUser;
    }

        public static String lookingForMissingNumber(String[] arrayFromUser){
        //String[] arrayFromUser = resultForUser.split(" ");
            int numberMissingElement = Arrays.asList(arrayFromUser).indexOf("..");
            arrayFromUser[numberMissingElement] = "0";
            int[] arrayFromUserInt = new int [10];
            var difference = 0;
            var result = 0;
            for (var i = 0; i < arrayFromUser.length; i++) {
                arrayFromUserInt[i] = Integer.parseInt(arrayFromUser[i]);
            }
            if (numberMissingElement == 0) {
                difference = arrayFromUserInt[2] - arrayFromUserInt [1];
                result = difference;
            } else {
                for (var i = 0; i < arrayFromUser.length; i++) {
                    if (arrayFromUserInt[i+1] > arrayFromUserInt[i]) {
                        difference = arrayFromUserInt[i+1] - arrayFromUserInt[i];
                        result = arrayFromUserInt[numberMissingElement-1] + difference;
                        break;
                    }
                }
            } System.out.println(Arrays.toString(arrayFromUser));
            return Integer.toString(result);
        }

}
