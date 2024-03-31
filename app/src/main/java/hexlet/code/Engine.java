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
        switch (Integer.parseInt(numberGame)) {
            case 1:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
                String number = "";
                String answer = "";
                for (var i = 1; i <= 3; i++){
                    if (!number.equals("wrong")) {
                        String result = GameOne.gameOne(answer, number);
                        System.out.println("Correct!");
                        System.out.println("Quation: " + result);
                        answer = scanner.next();
                        number = result;
                    } System.out.println("Wrong game1");
                } break;
        }
    }
}
