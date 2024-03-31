package hexlet.code;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameOne {
    public static void gameOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: 1\n Welcome to the Brain Games!\n May I have your name?");
        String userName = scanner.next();
        var number = ThreadLocalRandom.current().nextInt(1000);
        System.out.println("Hello, " + userName + "!" +"Answer 'yes' if the number is even, otherwise answer 'no'");
        System.out.println("Question: " + number);
        var answerPlayer = scanner.next();
        if (number % 2 == 0 & answerPlayer.equals("yes")) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, Bill!");
        }
    }
}
