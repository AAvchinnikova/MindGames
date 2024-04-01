package hexlet.code;

import hexlet.code.games.GameOne;
import hexlet.code.games.GameTwo;

import java.util.Scanner;

public class Engine {
    public static void engine(String userName, String numberGame) {
        Scanner scanner = new Scanner(System.in);
        String resultForUser = "";
        String answerUser = "";
        for (var i = 0; i < 3; i++) {
            if (i > 0) {
                System.out.println("Your answer: " + answerUser);
            }
            switch (Integer.parseInt(numberGame)) {
                case 1:
                    resultForUser = GameOne.gameOne(answerUser, resultForUser);
                    break;
                case 2:
                    resultForUser = GameTwo.gameTwo(answerUser, resultForUser);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + Integer.parseInt(numberGame));
            }
            if (!resultForUser.equals("Wrong")) {
                System.out.println("Question: " + resultForUser);
                answerUser = scanner.next();
            } else {
                System.out.println("Let's try again, " + userName);
                return;
            }
        } System.out.println("Congratulations, " + userName);
        scanner.close();
    }
}
