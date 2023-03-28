package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameProgression {
    public static void progression() {
        var user = Cli.greeting();
        var j = 0;
        int end = 3;
        int fakeend = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        while (j < end) {
            Random random = new Random();
            int randomend = 100;
            int shstart = 7;
            int ch1start = 5;
            int ch1 = random.nextInt(ch1start, randomend);
            int sh = random.nextInt(shstart, randomend);
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
                j = fakeend;
                break;
            }
        }
        if (j == end) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
}
