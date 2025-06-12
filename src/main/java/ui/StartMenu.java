package ui;

import game.GameSession;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartMenu {
    private final Scanner scanner = new Scanner(System.in);

    private int readChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return -1;
        }
    }

    public void runMenu() {
        while (true) {
            printMenu();
            int choice = readChoice();
            switch (choice) {
                case 1 -> {
                    GameSession gameSession = new GameSession();
                    gameSession.start();
                }
                case 2 -> {
                    System.out.println("До скорых встреч!");
                    System.exit(0);
                }
                default -> System.out.println("Введите 1 или 2.");
            }
        }
    }

    private void printMenu() {
        System.out.println("""
                ===== ВИСЕЛИЦА =====
                1. Начать новую игру
                2. Выйти
                """);
        System.out.print("Ваш выбор: ");
    }
}

