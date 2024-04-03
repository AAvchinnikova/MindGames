package hexlet.code.games;

import java.util.concurrent.ThreadLocalRandom;

public class GameGCD {
    public static String gameThree(String answer, String resultForUser) {
        int numberOne = ThreadLocalRandom.current().nextInt();
        int numberTwo = ThreadLocalRandom.current().nextInt();

        if (answer.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("Find the greatest common divisor of given numbers.");
            answer = numberOne + " " + numberTwo;
            return answer;
        } else {
            if (answer.equals(calculation(resultForUser))) {
                answer = numberOne + " " + numberTwo;
                return answer;
            } else {
                var calculateNumber = calculation(resultForUser);
                System.out.println(answer + " is wrong answer ;(. Correct answer was "
                        + calculateNumber + ".");
                answer = "Wrong";
            }
        }
        return answer;
    }
    private static String calculation(String resultForUser) {
        var mathExample = resultForUser.split(" ");
        var firstNumber = mathExample[0];
        var secondNumber = mathExample[1];
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(secondNumber);
        while (firstNumberInt != 0 & secondNumberInt != 0) {
            if (firstNumberInt > secondNumberInt) {
                firstNumberInt = firstNumberInt % secondNumberInt;
            } else {
                secondNumberInt = secondNumberInt % firstNumberInt;
            }
        }
        int result = firstNumberInt + secondNumberInt;
        return Integer.toString(result);
    }
}
