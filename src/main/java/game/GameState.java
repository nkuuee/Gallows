package game;

public class GameState {
    private final String secretWord;
    private final char[] currentState;

    public GameState(String secretWord) {
        this.secretWord = secretWord.toLowerCase();
        this.currentState = new char[secretWord.length()];
        for (int i = 0; i < currentState.length; i++) {
            currentState[i] = '_';
        }
    }

    public boolean updateState(char letter) {
        letter = Character.toLowerCase(letter);
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter && currentState[i] == '_') {
                currentState[i] = letter;
                found = true;
            }
        }
        return found;
    }

    public boolean isWin() {
        for (char current : currentState) {
            if (current == '_') return false;
        }
        return true;
    }

    public String getCurrentState() {
        return new String(currentState);
    }
}
