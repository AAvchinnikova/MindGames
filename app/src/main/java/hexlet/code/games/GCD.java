package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GCD {
    public static final String DESCRIPTION  = "Find the greatest common divisor of given numbers.";

    public static String[] generateRoundData() {
        final int min = 1;
        final int max = 200;
        int value1 = Utils.generateNumber(min, max);
        int value2 = Utils.generateNumber(min, max);

        String question = value1 + " " + value2;
        String result = Integer.toString(gcd(value1, value2));
        return new String[] {question, result};
    }

    public static int gcd(int value1, int value2) {
        return value2 == 0 ? value1 : gcd(value2, value1 % value2);
    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.communication(DESCRIPTION, roundsData);
    }
}
