package hexlet.code.games;

import java.util.Random;

public class GameCalc {

    public static String gameTwo(String answer, String resultForUser) {
        Random random = new Random();
        int numberSize = 100;
        int numberChar = 2;
        int numberOne = random.nextInt(numberSize);
        int numberTwo = random.nextInt(numberSize);
        int numberToSelect = random.nextInt(numberChar);
        String[] calculationSigns = {"+", "-", "*"};
        String sing = calculationSigns[numberToSelect];
        //String calculateNumber = calculation(resultForUser);

        if (answer.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("What is the result of the expression?");
            answer = numberOne + " " + sing + " " + numberTwo;
            return answer;
        } else {
            if (answer.equals(calculation(resultForUser))) {
                answer = numberOne + " " + sing + " " + numberTwo;
                return answer;
            } else {
                var calculateNumber = GameCalc.calculation(resultForUser);
                System.out.println(answer + " is wrong answer ;(. Correct answer was"
                        + calculateNumber + ".");
                answer = "Wrong";
            }
        }
        return answer;
    }
    public static String calculation(String resultForUser) {
        var mathExample = resultForUser.split(" ");
        var firstNumber = mathExample[0];
        var secondNumber = mathExample[2];
        String singForCallculate = mathExample[1];
        int result;
        switch (singForCallculate) {
            case "+":
                result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                break;
            case "-":
                result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                break;
            case "*":
                result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + singForCallculate);
        }
        return Integer.toString(result);
    }
}
