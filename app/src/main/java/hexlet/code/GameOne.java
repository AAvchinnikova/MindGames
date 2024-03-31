package hexlet.code;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameOne {
    public static void gameOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: 1\n Welcome to the Brain Games!\n May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!" +"Answer 'yes' if the number is even, otherwise answer 'no'");
        var i = 0;

        while (i < 3) {
            var number = ThreadLocalRandom.current().nextInt(1000);
            System.out.println("Question: " + number);
            String userAnswer = scanner.next();
            if (number % 2 == 0 & userAnswer.equals("yes")) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (number % 2 != 0 & userAnswer.equals("no")) {
                System.out.println("Correct!");
                i = i + 1;
            }
            else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, Bill!");
                scanner.close();
            }
        } System.out.println("Congratulations, " + userName);
        }
    }
