package hexlet.code;

import java.util.Random;

public class RandomValues {
    Random random = new Random();
    private int firstNumber = generateFirstNumber();
    private int secondNumber = generateSecondNumber();
    private String operator = generateOperator();

    private int generateFirstNumber() {
        return random.nextInt(100);
    }
    private int generateSecondNumber() {
        return random.nextInt(100);
    }
    private String generateOperator() {
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(2);
        return operators[i];
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
    public String getOperator() {
        return operator;
    }
}
