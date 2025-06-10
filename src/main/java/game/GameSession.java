package game;

import java.util.Scanner;

public class GameSession {

    public void start() {
        WordGenerator generator = new WordGenerator();
        String secretWord = generator.generateWord();
        Scanner sc = new Scanner(System.in);

        char[] letters = secretWord.toCharArray();
        char[] current = new char[letters.length];

        for (int i = 0; i < current.length; i++) {
            current[i] = '_';
        }

        int mistake = 0;
        int mistakeMax = 10;

        while (mistake < mistakeMax) {
            System.out.println("Текущее состояние: " + String.valueOf(current));
            System.out.println("Количество ошибок: " + mistake);
            System.out.print("Введите букву: ");

            String enterLetter = sc.next();
            if (enterLetter.length() != 1) {
                System.out.println("Введите одну букву!");
            }

            char checked = enterLetter.charAt(0);
            boolean correct = false;

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == checked) {
                    current[i] = checked;
                    correct = true;
                }
            }

            if (!correct) {
                mistake++;
            }

            if (String.valueOf(current).equals(secretWord)) {
                System.out.println("Поздравляю, ты победил! Загаданное слово: " + secretWord);
            }
        }

        if (!String.valueOf(current).equals(secretWord)) {
            System.out.println("Ты проиграл... В следующий раз, тебе точно повезет! Загаданное слово: "
                    + secretWord);
        }


    }
}
