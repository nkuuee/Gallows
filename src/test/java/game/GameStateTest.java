package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    void updateState() {
        GameState gameState = new GameState("apple");

        boolean result = gameState.updateState('p');
        String currentState = gameState.getCurrentState();

        assertTrue(result);
        assertEquals("_pp__", currentState);
    }

    @Test
    void isWin() {
        GameState gameState = new GameState("car");

        gameState.updateState('c');
        gameState.updateState('a');
        gameState.updateState('r');
        boolean win = gameState.isWin();

        assertTrue(win);
    }

    @Test
    void getCurrentState() {
        GameState gameState = new GameState("test");

        String initialState = gameState.getCurrentState();
        gameState.updateState('t');
        String updatedState = gameState.getCurrentState();

        assertEquals("____", initialState);
        assertEquals("t__t", updatedState);
    }
}
