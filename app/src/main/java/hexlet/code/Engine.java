package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
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
            System.out.println("Let's try again, " + userName + "!");
        } else {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
