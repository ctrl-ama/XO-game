# XO-game

# Tic-Tac-Toe Game

This is a simple Java implementation of the classic game Tic-Tac-Toe. The game provides methods to check for a win, reset the game, and check for a draw. Test-Driven Development (TDD) was used to develop this game.

#  Game Rules

- Two players, 'X' and 'O', take turns marking spaces on a 3x3 grid.
- The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.
- If all spaces on the board are filled, the game ends in a draw.

# Usage

1. Clone or download this repository to your local machine.

2. Compile and run the `xoGame` class to play the game.

3. Make moves by specifying the row and column where you want to place your mark, e.g. `game.makeMove(1, 1)`.

4. Use the `checkWin()` method to check for a win. If it returns 'X' or 'O', that player has won. If it returns ' ', the game is still ongoing.

5. Use the `reset()` method to reset the game when a player wins or for a n
#  Unit Tests

JUnit tests have been provided to verify the functionality of the game. You can run the tests to ensure the game works as expected. The tests cover various winning conditions and game states.

To run the tests, use your favorite IDE with JUnit support or run them via the command line.

# TDD Approach

Test-Driven Development (TDD) was used to build this game. The development process followed these steps:

1. **Write Failing Tests:** Initially, tests were written for the methods to be implemented.

2. **Implement Code:** The game methods were implemented to make the tests pass.

3. **Refactor:** Code was refactored as necessary to improve readability and maintainability.

4. **Repeat:** Steps 1-3 were repeated for each method and test case.


Enjoy playing XO
