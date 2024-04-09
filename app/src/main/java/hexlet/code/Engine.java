package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameCalc;

import java.util.Scanner;

public class Engine {
    public static String userName;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void meetWithUser (String answerForUser) {
        System.out.println(answerForUser);
    }
    public static String playWithUser(String answerForUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + answerForUser);
        String answerUser = scanner.next();
        System.out.println("Your answer: " + answerUser);
        return answerUser;
    }
    public static void finishGame(String answerForUser) {
        if (answerForUser.equals("Wrong")) {
            System.out.println("Let's try again, " + userName + "!");
        } else {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
