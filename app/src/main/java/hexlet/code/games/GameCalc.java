package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static hexlet.code.Engine.STEPS;

public class GameCalc {
    static final int NUMBERMAX = 10;
    static final int NUMBERCHAR = 2;
    public static void gameTwo() {
        Engine.meetWithUser("What is the result of the expression?");
        HashMap<String, String> dateForGame = new HashMap<>();
        for (var i = 0; i < STEPS; i++) {
            String question = prepareQuestion();
            int answer = calculation(question);
            dateForGame.put(question, String.valueOf(answer));
        }
        Engine.p
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
    public static int calculation(String questionForUser) {
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
        return result;
    }
}
