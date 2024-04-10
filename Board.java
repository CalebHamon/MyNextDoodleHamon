/**
     * @author Caleb Hamon
     * @since 10/19/2023
     * @version 1.0.0
     */

/*
 * Board is a class dedicated to both the board creation, as well as other misc methods.
 * These methods are mostly decision making, more specifically yes or no questions.
 * These are designed to then be put into conditionals, to then redirect the path in Tester.
 */
import java.util.Scanner;

public class Board {

    // Variables that will be used for later methods, these will be used in multiple
    // methods
    // hence why it is a global variable

    int numRows = 10;
    int numCols = 10;
    int fNumCols = 8;
    int fNumRows = 8;
    int[] ships = new int[5];
    int newRow;
    int newCol;

    int[][] game = new int[numRows][numCols];

    // Instructions is made to give instructions to the user
    // Instructions is a method due to it also serving the purpose to figure out if
    // the
    // user wants to set up a manual or CPU game

    public boolean Instructions() {
        String newInst;
        String playerSelec;
        String yayer = "YES";
        String noer = "NO";
        boolean cup = false;
        // try catch - resolved
        System.out.println("Welcome to BATTLESHIP!");
        System.out.println("Would you like to learn how to play?");
        Scanner scan = new Scanner(System.in);

        do {
            newInst = scan.nextLine();
        } while (!((newInst.toUpperCase().equals(yayer)) || (newInst.toUpperCase().equals(noer))));
        if ((newInst.toUpperCase().equals(yayer))) {
            System.out.println("BATTLESHIP is a guessing game, where each opponent takes turns guessing coordinates ");
            System.out.println(
                    "Each turn players will the oppurtunity to guess a location in which they think their opponents ships are");
            System.out.println(
                    "If they hit a ship, the computer will say that it did so, and same if it missed or you sinked a ship");
            System.out.println(
                    "The goal by the end of the game is to sink all of your opponents ships before they sink yours");
        }
        System.out.println("Would you like to play CPU or player 2 (on the same computer)");
        System.out.println(
                "Say 'YES' if you would like to play CPU and 'NO' if you would like to play someone on your computer");
        do {
            playerSelec = scan.nextLine();
        } while (!((playerSelec.toUpperCase().equals(yayer)) || (playerSelec.toUpperCase().equals(noer))));
        if ((playerSelec.toUpperCase().equals(yayer))) {
            cup = true;
        } else {
            cup = false;
        }
        // scan.close(); // closed to test error w Caleb
        return cup;

    }

    // WhatGame asks just that, What Game?
    // It comes after instructions and asks the user if they would like to
    // play a fast game or a slow one (reg)
    public boolean WhatGame() {
        String pickbrd = "";
        String fast = "FAST";
        String reg = "NORMAL";
        boolean fastOReg = false;

        Scanner scan2 = new Scanner(System.in);
        do {
            System.out.println("What game would you like to play, Fast or Normal?");
            pickbrd = scan2.nextLine();
        } while (!(pickbrd.toUpperCase().equals(fast) || pickbrd.toUpperCase().equals(reg)));

        if (pickbrd.toUpperCase().equals(fast)) {
            fastOReg = true;
        }
        System.out.println("");
        // Broken; though it was working

        // scan2.close();
        return fastOReg;
    }

    // PrintBoard prints the boards for each type of game
    // Reg(10x10) is bigger than Fast (8x8) 
    //This is the same for the following methods that have similar code

    public void PrintBoardReg() {
        for (int i = 0; i < numCols; i++) {
            for (int r = 0; r < numRows; r++) {
                System.out.print(game[i][r]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void PrintBoardFas() {
        for (int p = 0; p < fNumCols; p++) {
            for (int c = 0; c < fNumRows; c++) {
                System.out.print(game[p][c]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    //Designed to ask the user if they want to place the ships randomly or by themselves
    //This again is going to go into a conditional statement

    public boolean RandoNo() {
        String choice;
        String yay = "YES";
        String nay = "NO";
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to place your ships manually or let the CPU do it?");
        System.out.println("Type 'yes' for manually, 'no' for randomly");
        do {
        choice = scan.nextLine();
        }
        while (!(choice.toUpperCase().equals(yay) || choice.toUpperCase().equals(nay)));
        if (choice.toUpperCase().equals(yay)){
            return true;
        }
        else {
            return false;
        }

    }
}