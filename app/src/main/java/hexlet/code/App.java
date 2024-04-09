package hexlet.code;

import hexlet.code.games.*;

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
                case "2":
                    GameEven.gameOne();
                    break;
                case "3":
                    GameCalc.gameTwo();
                    break;
                case "4":
                    new GameGCD();
                    break;
                case "5":
                    new GameProgression();
                    break;
                case "6":
                    new GamePrime();
                    break;
                case "1":
                default:
                    break;
            }
        }
        scanner.close();
    }
}
