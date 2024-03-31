package hexlet.code;
import java.util.Scanner;

public class GameOne {
    public static void gameOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: 1\n Welcome to the Brain Games!\n May I have your name?");
        String userName = scanner.next();
        var number = Math.random();
        System.out.println("Hello, " + userName + "!" +"\nAnswer 'yes' if the number is even, otherwise answer 'no'/n" + number);
        var answerPlayer = scanner.next();
        if (number % 2 == 0 & answerPlayer.equals("yes")) {
            System.out.println("Correct!");
        }
    }
}
