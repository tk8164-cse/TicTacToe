package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class TicTacToe {
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static char computerSymbol = 'O';
    public static void main(String[] args) {
        System.out.println("Board before move:");
        printBoard();
        computerMove();
        System.out.println("\nBoard after computer move:");
        printBoard();
    }
    static void computerMove() {
        Random random = new Random();
        boolean moved = false;
        while (!moved) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                moved = true;
                System.out.println("Computer placed 'O' at: row " + row + ", col " + col);
            }
        }
    }
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}