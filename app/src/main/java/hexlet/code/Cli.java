package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        var numberGame = scanner.next();

        if (numberGame.equals("1")) {
            GameOne.gameOne();
        } else if (numberGame.equals("0")) {
            System.out.println("Exit");
        }
        scanner.close();
    }
}
