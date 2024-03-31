package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        var numberGame = scanner.next();

        if (numberGame.equals("2")) {
            GameOne.gameOne();
        } else if (numberGame.equals("0")) {
            return;
        }
        scanner.close();
    }
}
