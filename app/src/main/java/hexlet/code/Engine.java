package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine() {
        Scanner scanner = new Scanner(System.in);
        String numberGame = scanner.next();
        System.out.println("Your choice: " + numberGame);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
        String resultForUser = "";
        String answearUser = "";
        String answearGame = "";
        for (var i = 1; i <= 3; i++) {
            switch (Integer.parseInt(numberGame)) {
                case 1:
                    resultForUser = GameOne.gameOne(answearUser,resultForUser);
                    break;
                case 2:
                    answearGame = "";
                    break;
            }
            if (!resultForUser.equals("Wrong")) {
                System.out.println ("Question:" + resultForUser);
                answearUser = scanner.next();
            } else {
                break;
            }
        } scanner.close();
    }
}