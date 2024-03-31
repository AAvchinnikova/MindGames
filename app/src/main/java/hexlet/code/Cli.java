package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        var numberGame = scanner.next();

        if (numberGame.equals("1")) {
            System.out.println("Welcome to the Brain Games! Your choice: 1 May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } else if (numberGame.equals("0")) {
            System.out.println("Exit");
        }
        scanner.close();
    }
}
