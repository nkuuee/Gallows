package startmenu;

import game.GameSession;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartMenu {
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.setLength(0);
            sb.append("Нажмите:")
                    .append("\n 1.Начать новую игру")
                    .append("\n 2.Выйти");
            System.out.println(sb);
            try {
                int ready = scanner.nextInt();

                if (ready == 1) {
                    // логика игры
                    GameSession gameSession = new GameSession();
                    gameSession.start();
                } else if (ready == 2) {
                    System.exit(0);
                } else {
                    System.out.println("Введите 1 или 2.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Введите число.");
                scanner.nextLine();
            }

        }

    }
}
