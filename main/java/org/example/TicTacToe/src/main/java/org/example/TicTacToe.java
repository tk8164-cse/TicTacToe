package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        initializeBoard();
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'O'; board[1][1] = 'X'; board[1][2] = 'O';
        board[2][0] = 'X'; board[2][1] = 'O'; board[2][2] = 'X';
        showBoard();
        boolean xWon = hasWon('X');
        boolean oWon = hasWon('O');
        System.out.println("Has 'X' won? " + xWon);
        System.out.println("Has 'O' won? " + oWon);
        System.out.println("Is the game a draw? " + (isBoardFull() && !xWon && !oWon));
    }
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    static void showBoard() {
        System.out.println("Current Board:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + board[r][c] + " ");
                if (c < 2) System.out.print("|");
            }
            System.out.println();
            if (r < 2) System.out.println("-----------");
        }
        System.out.println();
    }
    static boolean hasWon(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }
    static boolean isBoardFull() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') return false;
            }
        }
        return true;
    }
}