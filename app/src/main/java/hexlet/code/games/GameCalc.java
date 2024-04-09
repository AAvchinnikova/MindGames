package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GameCalc {
    static final int NUMBERMAX = 100;
    static final int NUMBERCHAR = 2;
    public static void gameTwo() {
        Engine.meetWithUser("What is the result of the expression?");
        String questionForUser = prepareQuestion();
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i < 3; i++) {
            var calculateNumber = calculation(questionForUser);
            if (answerUser.equals(calculateNumber)) {
                System.out.println("Correct!");
                questionForUser = prepareQuestion();
                answerUser = Engine.playWithUser(questionForUser);
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + calculateNumber + ".");
                Engine.finishGame("Wrong");
                return;
            }
        }
        Engine.finishGame("");
    }
    public static String prepareQuestion() {
        Random random = new Random();
        int numberOne = random.nextInt(NUMBERMAX);
        int numberTwo = random.nextInt(NUMBERMAX);
        int numberToSelect = random.nextInt(NUMBERCHAR);
        String[] calculationSigns = {"+", "-", "*"};
        String sing = calculationSigns[numberToSelect];
        return numberOne + " " + sing + " " + numberTwo;
    }
    public static String calculation(String questionForUser) {
        var mathExample = questionForUser.split(" ");
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
