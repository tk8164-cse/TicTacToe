package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
public class TicTacToe {
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    static char humanSymbol = 'X';
    static char computerSymbol = 'O';
    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();
        while (!gameOver) {
            if (isHumanTurn) {
                humanMove();
            }
            else {
                computerMove();
            }
            printBoard();
            checkGameState();
            isHumanTurn = !isHumanTurn;
        }
        System.out.println("Game Over!");
    }
    static void humanMove() {
        Scanner sc = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.print("Your turn (row and col 0-2, e.g., 0 1): ");
            row = sc.nextInt();
            col = sc.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = humanSymbol;
                break;
            }
            System.out.println("Invalid move, try again.");
        }
    }
    static void computerMove() {
        System.out.println("Computer is thinking...");
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed 'O' at (" + row + "," + col + ")");
                break;
            }
        }
    }
    static void checkGameState() {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') full = false;
            }
        }
        if (full) {
            gameOver = true;
            System.out.println("It's a draw!");
        }
    }
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }
}