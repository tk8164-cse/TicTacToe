package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

    }
    static int getUserSlot() {
        // Creating a scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}
