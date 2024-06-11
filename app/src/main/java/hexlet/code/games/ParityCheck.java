package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class ParityCheck {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] generateRoundData() {
        final int min = 1;
        final int max = 200;
        int value = Utils.generateNumber(min, max);

        String question = Integer.toString(value);
        String result = isEven(value) ? "yes" : "no";

        return new String[] {question, result};
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.communication(DESCRIPTION, roundsData);
    }
}


