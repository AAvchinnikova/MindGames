package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameCalc;

import java.util.Scanner;

public class Engine {
    public static void engine(String userName, String numberGame) {
        Scanner scanner = new Scanner(System.in);
        String resultForUser = "";
        String answerUser = "";
        final int numberOfAttemps = 3;

        for (var i = 0; i <= numberOfAttemps; i++) {
            switch (numberGame) {
                case "2":
                    resultForUser = GameEven.gameOne(answerUser, resultForUser);
                    break;
                case "3":
                    resultForUser = GameCalc.gameTwo(answerUser, resultForUser);
                    break;
                case "4":
                    resultForUser = GameGCD.gameThree(answerUser, resultForUser);
                    break;
                case "5":
                    resultForUser = GameProgression.gameFour(answerUser, resultForUser);
                    break;
                case "6":
                    resultForUser = GamePrime.gameFive(answerUser, resultForUser);
                    break;
                case "1":
                default:
                    return;
            }
            if (!resultForUser.equals("Wrong")) {
                if (i == 0) {
                    System.out.println("Question: " + resultForUser);
                    answerUser = scanner.next();
                } else if (i == 1 || i == 2) {
                    System.out.println("Your answer: " + answerUser);
                    System.out.println("Correct!");
                    System.out.println("Question: " + resultForUser);
                    answerUser = scanner.next();
                } else {
                    System.out.println("Your answer: " + answerUser);
                    System.out.println("Correct!");
                }
            }  else {
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        } System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
