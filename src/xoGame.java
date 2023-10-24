import org.junit.Test;
import static org.junit.Assert.*;
public class xoGame {

    private char[][] board;
    private char currentPlayer;

    public xoGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard (){
        for (int i=0; i<2; i++) {
            for (int j = 0; j < 3; j++)
            board[i][j] = ' ';
        }
    }


}
