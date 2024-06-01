package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String USERNAME;
    public static final int STEPS = 3;
    public static final int NUMBERARRAY = 2;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        USERNAME = scanner.next();
        System.out.println("Hello, " + USERNAME + "!");
    }

    public static void playWithUser(String[][] dateForGame, String rules) {
        Scanner scanner = new Scanner(System.in);
        var j = 0;
        System.out.println(rules);
        for (var i = 0; i < dateForGame.length - 1; i++) {
            j = 0;
            System.out.println("Question: " + dateForGame[i][j]);
            String answerUser = scanner.next();
            j += 1;
            if (answerUser.equals(dateForGame[i][j])) {
                System.out.println("Your answer: " + answerUser);
                System.out.println("Correct!");
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was "
                        + dateForGame[i][j] + ".");
                System.out.println("Let's try again, " + USERNAME + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + USERNAME + "!");
    }
}
