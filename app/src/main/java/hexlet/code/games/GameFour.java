package hexlet.code.games;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class GameFour {

    public static String createArray() {
        int firstNumber = ThreadLocalRandom.current().nextInt(10);
        int numberToAdd = ThreadLocalRandom.current().nextInt(10);
        int positionForMission = ThreadLocalRandom.current().nextInt(10);
        int[] arrayForUser = new int[10];
        arrayForUser[0] = firstNumber;
        for (var i = 1; i < 10; i++) {
            arrayForUser[i] = firstNumber + numberToAdd;
            firstNumber = firstNumber + numberToAdd;
        }
        int numberForCheck = arrayForUser[positionForMission];
        String answerForUser = Arrays.toString(arrayForUser);
        answerForUser = answerForUser.replaceAll(String.valueOf(numberForCheck), "..");
        return answerForUser;
    }

        public static String lookingForMissingNumber (String[] arrayFromUser){
            int numberMissingElement = Arrays.asList(arrayFromUser).indexOf("..");
            arrayFromUser[numberMissingElement] = "0";
            int[] arrayFromUserInt = new int [10];
            var difference = 0;
            var result = 0;
            for (var i = 0; i < 10; i++) {
                arrayFromUserInt[i] = Integer.parseInt(arrayFromUser[i]);
            }
            if (numberMissingElement == 0) {
                difference = arrayFromUserInt[2] - arrayFromUserInt [1];
                result = difference;
            } else {
                for (var i = 0; i < 10; i++) {
                    if (arrayFromUserInt[i+1] > arrayFromUserInt[i]) {
                        difference = arrayFromUserInt[i+1] - arrayFromUserInt[i];
                        result = arrayFromUserInt[numberMissingElement-1] + difference;
                        break;
                    }
                }
            }
            return Integer.toString(result);
        }

}
