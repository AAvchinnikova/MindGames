package hexlet.code;

import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameCalc;

import java.util.Scanner;

public class Engine {
    static String userName;
    public static void meetWithUser (String answerForUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(answerForUser);
    }

    public static String playWithUser(String answerForUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + answerForUser);
        String answerUser = scanner.next();
        return answerUser;
    }

    public static void finishGame(String answerForUser) {
        if (answerForUser.equals("Wrong")) {
            System.out.println("Let's try again, " + userName + "!");
        } else {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
