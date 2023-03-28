package hexlet.code.games;
import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class GameCalc {
    public static void calc() {
        var user = Cli.greeting();
        var j = 0;
        final int end = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        while (j < end) {
            Random random = new Random();
            final int randomend  = 100;
            int ch1 = random.nextInt(randomend);
            int ch2 = random.nextInt(randomend);
            String operators = "+-*";
            int ch = 0;
            char op = operators.charAt(random.nextInt(operators.length()));
            if (op == '*') {
                ch = ch1 * ch2;
                System.out.println("Question: " + ch1 + " * " + ch2);
            } else if (op == '+') {
                ch = ch1 + ch2;
                System.out.println("Question: " + ch1 + " + " + ch2);
            } else {
                ch = ch1 - ch2;
                System.out.println("Question: " + ch1 + " - " + ch2);
            }
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.trim().equals(Integer.toString(ch))) {
                j += 1;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
        }
        if (j == end) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
}
