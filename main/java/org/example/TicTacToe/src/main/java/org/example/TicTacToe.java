package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicTacToe {
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    public static void main(String[] args) {
        System.out.println("--- Initial Board ---");
        displayBoard();
        int testRow = 1;
        int testCol = 1;
        if (isValidMove(testRow, testCol)) {
            System.out.println("\nPlacing 'X' at (" + testRow + "," + testCol + ")...");
            board[testRow][testCol] = 'X'; // Simulate making a move
        }
        System.out.println("\n--- Updated Board ---");
        displayBoard();
    }
    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == '-') {
                return true;
            }
            else {
                System.out.println("Move failed: Cell is already occupied.");
                return false;
            }
        }
        else {
            System.out.println("Move failed: Position is out of board boundaries.");
            return false;
        }
    }
}
