package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n"
            + "2 - Even\n"
            + "0 - Exit");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Your choice: " + number);

        switch (number) {
            case 1 -> Cli.meet();
            case 0 -> System.out.println("Good bye!");
            case 2 -> {
                Even even = new Even();
                even.evenGame();
            }
            default -> throw new IllegalArgumentException("Invalid command");
        }
    }
}
