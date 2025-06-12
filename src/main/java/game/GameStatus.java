package game;

public class GameStatus {
    private static final int MAX_MISTAKES = 7;
    private int currentMistakes = 0;

    public void incrementMistakes() {
        currentMistakes++;
    }

    public int getCurrentMistakes() {
        return currentMistakes;
    }

    public boolean isGameOver() {
        return currentMistakes >= MAX_MISTAKES;
    }
}