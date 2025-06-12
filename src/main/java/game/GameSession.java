package game;

import java.util.HashSet;
import java.util.Set;

public class GameSession {
    private final WordGenerator wordGenerator;
    private final UserInput userInput;
    private final GameStatus gameStatus;
    private final HangmanDrawer hangmanDrawer;

    private Set<Character> guessedLetters;

    public GameSession() {
        this.wordGenerator = new WordGenerator();
        this.userInput = new UserInput();
        this.gameStatus = new GameStatus();
        this.hangmanDrawer = new HangmanDrawer();
        this.guessedLetters = new HashSet<>();
    }

    public void start() {
        String secretWord = wordGenerator.generateWord();
        GameState gameState = new GameState(secretWord);

        while (true) {
            hangmanDrawer.draw(gameStatus.getCurrentMistakes());
            System.out.println("Текущее слово: " + gameState.getCurrentState());
            System.out.println("Угаданные буквы: " + guessedLetters);
            System.out.println("Ошибки: " + gameStatus.getCurrentMistakes() + "/" + GameStatus.MAX_MISTAKES);

            char guess = userInput.enterLetter();

            if (guessedLetters.contains(guess)) {
                System.out.println("Эта буква уже вводилась.");
                continue;
            }

            guessedLetters.add(guess);

            if (!gameState.updateState(guess)) {
                gameStatus.incrementMistakes();
            }

            if (gameState.isWin()) {
                hangmanDrawer.draw(gameStatus.getCurrentMistakes());
                System.out.println("Вы выиграли! Слово: " + secretWord);
                break;
            }

            if (gameStatus.isGameOver()) {
                hangmanDrawer.draw(gameStatus.getCurrentMistakes());
                System.out.println("Вы проиграли! Загаданное слово: " + secretWord);
                break;
            }
        }
    }
}
