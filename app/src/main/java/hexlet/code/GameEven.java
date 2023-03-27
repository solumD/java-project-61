package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static void even() {
        var user = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var j = 0;
        while (j < 3) {
            Random random = new Random();
            int ch = random.nextInt(100);
            var diff = ch % 2;
            System.out.println("Question: " + ch);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (diff == 1 && answer.trim().equals("no")) {
                j += 1;
                System.out.println("Correct!");
            }
            if (diff == 0 && answer.trim().equals("yes")) {
                j += 1;
                System.out.println("Correct!");
            }
            if (diff == 1 && !answer.trim().equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
            if (diff == 0 && !answer.trim().equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }

        }
        if (j == 3) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
}
