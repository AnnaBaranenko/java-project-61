package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);

    public void evenGame() {
        Cli.meet();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(1, 500);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: " + number);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            boolean isEven = correctAnswer(number);
            if (isEven && answer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (!isEven && answer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else  {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + (isEven ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
    private boolean correctAnswer(int number) {
        return number % 2 == 0; }
}

