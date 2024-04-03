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
        int numberOfAttemps;
        numberOfAttemps = 3;

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
                switch (i) {
                    case 0:
                        System.out.println("Question: " + resultForUser);
                        answerUser = scanner.next();
                        break;
                    case 1:
                    case 2:
                        System.out.println("Your answer: " + answerUser);
                        System.out.println("Correct!");
                        System.out.println("Question: " + resultForUser);
                        answerUser = scanner.next();
                        break;
                    case 3:
                        System.out.println("Your answer: " + answerUser);
                        System.out.println("Correct!");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + i);
                }
            }  else {
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        } System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
