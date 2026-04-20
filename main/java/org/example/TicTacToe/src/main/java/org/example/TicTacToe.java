package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class TicTacToe {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        }
        else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }
    static void displayTossResult() {
        System.out.println("--- Toss Results ---");
        if (isHumanTurn) {
            System.out.println("Toss won by: Human");
            System.out.println("Human plays first with symbol: " + humanSymbol);
            System.out.println("Computer plays second with symbol: " + computerSymbol);
        }
        else {
            System.out.println("Toss won by: Computer");
            System.out.println("Computer plays first with symbol: " + computerSymbol);
            System.out.println("Human plays second with symbol: " + humanSymbol);
        }
        System.out.println("--------------------");
    }
}
