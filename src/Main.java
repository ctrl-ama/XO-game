public class Main {
    public static void main(String[] args) {
        xoGame game = new xoGame();

        // Make moves for the players (you can add more moves as needed)
        game.makeMove(0, 0); // Player X's move
        game.makeMove(1, 1); // Player O's move
        game.makeMove(0, 1); // Player X's move

        // Get and print the current player
        System.out.println("Current player: " + game.getCurrentPlayer());

        // You can continue making moves and checking for a win or draw
    }
}
