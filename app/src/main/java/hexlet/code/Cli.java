package hexlet.code;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cli {
    public static void meet() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        try {
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");
        } catch (NoSuchElementException e) {
            System.out.println("Не удалось прочитать строку");
        }
        sc.close();
    }
}

