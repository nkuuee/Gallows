package game;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public char enterLetter() {
        while (true) {
            System.out.print("Введите букву: ");
            String input = scanner.nextLine().trim();

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                return input.charAt(0);
            } else {
                System.out.println("Ошибка: введите одну букву.");
            }
        }
    }

}