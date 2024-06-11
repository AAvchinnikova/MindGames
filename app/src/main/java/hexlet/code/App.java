package hexlet.code;

import hexlet.code.games.ParityCheck;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String numberGame = scanner.next();
        System.out.println("Your choice: " + numberGame);

        if (Integer.parseInt(numberGame) != 0) {
            switch (numberGame) {
                case "1":
                    Cli.console();
                    break;
                case "2":
                    ParityCheck.dataEntry();
                    break;
                case "3":
                    Calculator.dataEntry();
                    break;
                case "4":
                    GCD.dataEntry();
                    break;
                case "5":
                    Progression.dataEntry();
                    break;
                case "6":
                    Prime.dataEntry();
                    break;
                default:
                    System.out.println("Not the correct choice");
                    break;
            }
        }
        scanner.close();
    }
}
