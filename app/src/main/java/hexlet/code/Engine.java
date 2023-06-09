package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class Engine {
    public static void engine() {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n"
                + "4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        System.out.println();
        if (command.equals("1")) {
            Cli.greeting();
        }
        if (command.equals("0")) {
            System.exit(0);
        }
        if (command.equals("2")) {
            GameEven.even();

        }
        if (command.equals("3")) {
            GameCalc.calc();
        }
        if (command.equals("4")) {
            GameGCD.gcd();
        }
        if (command.equals("5")) {
            GameProgression.progression();
        }
        if (command.equals("6")) {
            GamePrime.prime();
        }
    }
}
