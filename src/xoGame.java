import org.junit.Test;
import static org.junit.Assert.*;

public class xoGame {
    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    public void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            return false;
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        return true;
    }

    public char checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return ' '; // No winner yet
    }

    @Test
    public void testXWins() {
        initializeBoard();
        makeMove(0, 0); // X
        makeMove(0, 1); // O
        makeMove(1, 1); // X
        makeMove(1, 0); // O
        makeMove(2, 2); // X
        assertEquals('X', checkWin());
    }

    @Test
    public void testOWins() {
        initializeBoard();
        makeMove(0, 0); // X
        makeMove(1, 0); // O
        makeMove(0, 1); // X
        makeMove(1, 1); // O
        makeMove(2, 2); // X
        makeMove(1, 2); // O
        assertEquals('O', checkWin());
    }
    @Test
    public void startGame() {
        resetGame(); // Reset the game before starting

        // Perform game moves and check here
        makeMove(0, 0);
        makeMove(1, 1);
        makeMove(0, 1);
        // ...

        // This resets the game and tests
        resetGame();
    }

    private void resetGame() {
    }


    @Test
    public void testNoWinner() {
        initializeBoard();
        makeMove(0, 0); // X
        makeMove(1, 0); // O
        makeMove(0, 1); // X
        makeMove(1, 1); // O
        makeMove(1, 2); // X
        makeMove(2, 0); // O
        makeMove(2, 1); // X
        makeMove(2, 2); // O
        assertEquals(' ', checkWin());
    }

    public char getCurrentPlayer() {
        return 0;
    }
}

