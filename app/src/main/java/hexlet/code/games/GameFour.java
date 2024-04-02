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
        }

}
