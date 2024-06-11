package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[] generateRoundData() {
        final int min = 1;
        final int max = 600;
        int value1 = Utils.generateNumber(min, max);
        String result = isPrime(value1) ? "yes" : "no";

        return new String[] {Integer.toString(value1), result};
    }

    public static boolean isPrime(int value1) {
        int index = 0;
        for (var y = 1; y <= value1; y++) {
            if (value1 % y == 0) {
                index += 1;
            }
        }
        return (index <= 2);
    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.communication(DESCRIPTION, roundsData);
    }
}
