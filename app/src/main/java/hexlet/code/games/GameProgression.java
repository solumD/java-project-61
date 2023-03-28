package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameProgression {
    public static void progression() {
        var user = Cli.greeting();
        var j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        while (j < 3) {
            Random random = new Random();
            int ch1 = random.nextInt(5, 10);
            int sh = random.nextInt(5, 10);
            String[] numbers = new String[sh];
            var index = 0;
            for (var i = 0; i < numbers.length - 1; i++) {
                ch1 += sh;
                numbers[i] = Integer.toString(ch1);
                index += 1;
            }
            String[] nums = Arrays.copyOfRange(numbers, 0, index);
            var ans = random.nextInt(0, nums.length - 1);
            var qw = nums[ans];
            nums[ans] = "..";
            System.out.println("Question: " + Arrays.toString(nums).replace(",", "")
                    .replace("[", "").replace("]", ""));
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.trim().equals(qw)) {
                j += 1;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + qw + "'.");
                System.out.println("Let's try again, " + user + "!");
                j = 5;
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
}
