package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String numberGame) {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println ("Question: " + resultForUser);
                answearUser = scanner.next();
            } else {
                break;
            }
        } scanner.close();
    }
}