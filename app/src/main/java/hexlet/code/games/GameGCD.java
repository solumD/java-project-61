package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GameGCD {
    public static void gcd() {
        var user = Cli.greeting();
        var j = 0;
        final int end = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        while (j < end) {
            Random random = new Random();
            final int randomend = 100;
            int ch1 = random.nextInt(1, randomend);
            int ch2 = random.nextInt(1, randomend);
            System.out.println("Question: " + ch1 + " " + ch2);
            var ch = gcd2(ch1, ch2);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.trim().equals(Integer.toString(ch))) {
                j += 1;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + ch + "'.");
                System.out.println("Let's try again, " + user + "!");
                break;
            }
        }
        if (j == end) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
    public static int gcd2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
