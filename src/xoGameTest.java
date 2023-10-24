import org.junit.Test;
import static org.junit.Assert.*;

public class xoGameTest {

    @Test
    public void testGamePlay() {
        xoGame game = new xoGame();

        // Player X's move
        assertTrue(game.makeMove(0, 0));
        assertEquals('X', game.getCurrentPlayer());

        // Player O's move
        assertTrue(game.makeMove(1, 1));
        assertEquals('O', game.getCurrentPlayer());

        // Player X's move
        assertTrue(game.makeMove(0, 1));
        assertEquals('X', game.getCurrentPlayer());

        // Player O's move
        assertTrue(game.makeMove(1, 2));
        assertEquals('O', game.getCurrentPlayer());

        // Player X's move
        assertTrue(game.makeMove(0, 2));
        assertEquals('X', game.getCurrentPlayer());

        // Check for a win
        char winner = game.checkWin();
        assertEquals('X', winner);
    }
}
