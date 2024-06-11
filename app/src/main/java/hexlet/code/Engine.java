package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int INDEX_RESULT = 1;
    public static final int INDEX_QUESTION = 0;
    public static final int QUESTION_AND_ANSWER = 2;
    public static void communication(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        final String wrongAnswer = " is wrong answer ;(. Correct answer was ";
        //final String wrongAnswer2 = "Let's try again, ";

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (String[] roundData : roundsData) {
            System.out.println("Question: " + roundData[INDEX_QUESTION]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(roundData[INDEX_RESULT])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + wrongAnswer + "'" + roundData[INDEX_RESULT] + "'");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
