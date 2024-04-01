package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String userName, String numberGame) {
        Scanner scanner = new Scanner(System.in);
        String resultForUser = "";
        String answearUser = "";
        String answearGame = "";
        for (var i = 0; i < 3; i++) {
            switch (Integer.parseInt(numberGame)) {
                case 1:
                    resultForUser = GameOne.gameOne(answearUser, resultForUser);
                    break;
                case 2:
                    answearGame = "";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + Integer.parseInt(numberGame));
            }
            if (!resultForUser.equals("Wrong")) {
                System.out.println("Question: " + resultForUser);
                answearUser = scanner.next();
            } else {
                System.out.println("Let's try again, " + userName);
                return;
            }
        } System.out.println("Congratulations, " + userName);
        scanner.close();
    }
}
