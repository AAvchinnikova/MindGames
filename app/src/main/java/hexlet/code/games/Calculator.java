package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final String DESCRIPTION  = "What is the result of the expression?";

    public static String[] generateRoundData() {
        final int min = 1;
        final int max = 200;
        final int minForOperators = 0;
        final int maxForOperators = 2;
        int value1 = Utils.generateNumber(min, max);
        int value2 = Utils.generateNumber(min, max);
        int indexOperators = Utils.generateNumber(minForOperators, maxForOperators);

        char[] operators = {'+', '-', '*'};
        char operator = operators[indexOperators];
        String question = value1 + " " + operator + " " + value2;
        String result = Integer.toString(result(operator, value1, value2));

        return  new String[] {question, result};
    }

    private static int result(char operator, int value1, int value2) {
        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

    public static void dataEntry() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (var i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.communication(DESCRIPTION, roundsData);
    }
}
