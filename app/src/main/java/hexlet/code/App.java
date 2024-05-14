package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
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
                    GameEven.dataEntry();
                    break;
                case "3":
                    GameCalc.dataEntry();
                    break;
                case "4":
                    GameGCD.dataEntry();
                    break;
                case "5":
                    GameProgression.dataEntry();
                    break;
                case "6":
                    GamePrime.dataEntry();
                    break;
                default:
                    System.out.println("Not the correct choice");
                    break;
            }
        }
        scanner.close();
    }
}
