package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String DESCRIPTION  = "What number is missing in the progression?";

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + step * i);
        }
        return progression;
    }
    public static String[] generateRoundData() {
        final int min = 1;
        final int max = 200;
        final int maxToStep =  21;
        final int minToLength = 5;
        final int maxToLength = 10;
        int first = Utils.generateNumber(min, max);
        int step = Utils.generateNumber(min, maxToStep);
        int length = Utils.generateNumber(minToLength, maxToLength);
        int swap = Utils.generateNumber(min, length - 1);

        String[] progression = makeProgression(first, step, length);
        String result = progression[swap];
        progression[swap] = "..";
        String question = String.join(" ", progression);

        return new String[] {question, result};

    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.communication(DESCRIPTION, roundsData);
    }
}
