package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String USERNAME;
    public static final int STEPS = 3;
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        USERNAME = scanner.next();
        System.out.println("Hello, " + USERNAME + "!");
    }
    public static void meetWithUser(String questionForUser) {
        System.out.println(questionForUser);
    }
    public static String playWithUser(String questionForUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + questionForUser);
        String answerUser = scanner.next();
        System.out.println("Your answer: " + answerUser);
        return answerUser;
    }
    public static void finishGame(String questionForUser) {
        if (questionForUser.equals("Wrong")) {
            System.out.println("Let's try again, " + USERNAME + "!");
        } else {
            System.out.println("Congratulations, " + USERNAME + "!");
        }
    }
}

