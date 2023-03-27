package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
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
    }
}

