package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        initializeBoard();
        placeMove(0, 0, 'X');
        placeMove(1, 1, 'O');
        placeMove(2, 2, 'X');
        printBoard();
    }
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}