package hexlet.code.games;
import hexlet.code.Cli;
import java.util.Scanner;
import java.util.Random;

public class GamePrime {
    public static void prime() {
        var user = Cli.greeting();
        var j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (j < 3) {
            Random random = new Random();
            var ch = random.nextInt(1, 100);
            var li = isPrime(ch);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (li == 0 && answer.trim().equals("yes")) {
                System.out.println("Correct!");
                j += 1;
            }
            if (li > 0 && answer.trim().equals("no")) {
                System.out.println("Correct!");
                j += 1;
            }
            if (li > 0 && !answer.trim().equals("no")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
            if (li == 0 && !answer.trim().equals("yes")) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
    public static int isPrime(int num) {
        var k = 0;
        for (var i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                k += 1;
            }
        }
        System.out.println("Question: " + num);
        return k;
    }
}
