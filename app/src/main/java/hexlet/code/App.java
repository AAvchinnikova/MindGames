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
                    new Engine();
                case "2":
                    GameEven.gameOne();
                    break;
                case "3":
                    GameCalc.gameTwo();
                    break;
                case "4":
                    GameGCD.gameThree();
                    break;
                case "5":
                    GameProgression.gameFour();
                    break;
                case "6":
                    GamePrime.gameFive();
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
