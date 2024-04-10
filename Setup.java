/**
     * @author Caleb Hamon
     * @since 10/19/2023
     * @version 1.0.0
     */


import java.util.Scanner;
import java.util.Random;

public class Setup {

    int numCols;
    int numRows;
    int newRow;
    int newCol;

    // Method that will eventually host the actual playing of the game

    // Method that ask someone for where they would like to play their pieces
    // Still need to work on errors for if it is out of bounds and if they type in
    // 'one'
    // SetupFas and SetupReg are the same for the exception that Fast has less ships

    // Also I need to add a random option for the user to randomly place ships
    // I think I will do a random number between 1 and 2, one being put the boat
    // in the same Col and 2 being put the boat in the same Row
    // Then have another random num generator from 1-8, where if it adds a peg to
    // that number to either side
    // of either the row or the col. For the exception of 1 and 8 where I would do
    // the 2 place next to the peg
    // that would be in the middle
    // TO DO: Correct names of ships, I think some of them are off still.

    public int[][] SetupFas() {
        numCols = 8;
        numRows = 8;
        int[][] game = new int[numRows][numCols];
        int containerCols = 0;
        int containerRows = 0;
        int fNumCols = 8;
        int fNumRows = 8;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        for (int q = 0; q < 3; q++) {
            System.out.println("What Row would you like to place the peg of your cruiser in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("Choose Location of Submarine");
        for (int q = 0; q < 3; q++) {
            System.out.println("What Row would you like to place the peg of your submarine in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("Choose Location of Destroyer");
        for (int q = 0; q < 2; q++) {
            System.out.println("What Row would you like to place the peg of your destroyer in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("");
        System.out.println("Your Board:");
        System.out.println("");
        for (int p = 0; p < fNumCols; p++) {
            for (int c = 0; c < fNumRows; c++) {
                System.out.print(game[p][c]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        return game;

    }

    public int[][] SetupReg() {
        numCols = 9;
        numRows = 9;
        int[][] game = new int[numRows][numCols];
        int containerCols = 0;
        int containerRows = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Location of Carrier");
        for (int q = 0; q < 5; q++) {
            System.out.println("What Row would you like to place the peg of your carrier in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");

            }
        }
        System.out.println("Choose Location of Battleship");
        for (int q = 0; q < 4; q++) {
            System.out.println("What Row would you like to place the peg of your battleship in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("Choose Location of Cruiser");
        for (int q = 0; q < 3; q++) {
            System.out.println("What Row would you like to place the first peg of your cruiser in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("Choose Location of Submarine");
        for (int q = 0; q < 3; q++) {
            System.out.println("What Row would you like to place the first peg of your submarine in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }
        }
        System.out.println("Choose Location of Destroyer");
        for (int q = 0; q < 2; q++) {
            System.out.println("What Row would you like to place the first peg of your destroyer in?");
            newRow = scan.nextInt() - 1;
            System.out.println("What Column");
            newCol = scan.nextInt() - 1;
            if (!(game[newRow][newCol] == 1)) {

                if (q == 0) {
                    game[newRow][newCol] = 1;
                    containerCols = newCol;
                    containerRows = newRow;
                } else if (newCol == containerCols) {
                    if ((newRow == containerRows + 1) || (newRow == containerRows - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else if (newRow == containerRows) {
                    if ((newCol == containerCols + 1) || (newCol == containerCols - 1)) {
                        game[newRow][newCol] = 1;
                        containerCols = newCol;
                        containerRows = newRow;
                    } else {
                        q = q - 1;
                        System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                    }
                } else {
                    q = q - 1;
                    System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
                }
            } else {
                q = q - 1;
                System.out.println("Try Again. Make Sure You Place Your Ships Right Next To Each Other");
            }

        }
        return game;

        // scan.close();

    }

    //These are the random setups for both fast game and normal
    //Makes sure the ship will not go off the board with certain ships by conditionals for each ship
    //TODO: Make sure ships dont have the ability to overlap each other.

    public int[][] SetupCPUFas() {
        numCols = 8;
        numRows = 8;
        int[][] game = new int[numRows][numCols];
        Random random = new Random();
        int upperBound = 2;
        int rVc;
        int randRow;
        int randCol;
        for (int q = 0; q < upperBound; q++){
            rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(8);
                randCol = random.nextInt(8);
                if (randCol == 0){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol + 2] = 1;
                }
                else if (randCol == 7){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol - 2] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol - 1] = 1;
                }

            }
            else {
                randRow = random.nextInt(8);
                randCol = random.nextInt(8);
                if (randRow == 0){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                }
                else if (randRow == 7){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow - 2][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                }


            }
            
        }
        rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(8);
                randCol = random.nextInt(8);
                if (randCol == 0){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                }
                else if (randCol == 7){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                }

            }
            else {
                randRow = random.nextInt(8);
                randCol = random.nextInt(8);
                if (randRow == 0){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                }
                else if (randRow == 7){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                }


            }
            
        
        return game;
    }

    public int[][] SetupCPUReg() {
        numCols = 10;
        numRows = 10;
        int[][] game = new int[numRows][numCols];
        Random random = new Random();
        int upperBound = 2;
        int rVc;
        int randRow;
        int randCol;
        for (int q = 0; q < upperBound; q++){
            rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randCol == 0){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol + 2] = 1;
                }
                else if (randCol == 9){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol - 2] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol - 1] = 1;
                }

            }
            else {
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randRow == 0){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                }
                else if (randRow == 9){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow - 2][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                }


            }
        }
            rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randCol <= 2){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol + 2] = 1;
                    game[randRow][randCol + 3] = 1;
                    game[randRow][randCol + 4] = 1;
                }
                else if (randCol >= 7){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol - 2] = 1;
                    game[randRow][randCol - 3] = 1;
                    game[randRow][randCol - 4] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol + 2] = 1;
                    game[randRow][randCol - 2] = 1;
                }

            }
            else {
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randRow <= 2){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                    game[randRow + 3][randCol] = 1;
                    game[randRow + 4][randCol] = 1;
                }
                else if (randRow >= 7){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow - 2][randCol] = 1;
                    game[randRow - 3][randCol] = 1;
                    game[randRow - 4][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                    game[randRow - 2][randCol] = 1;
                }


            }
            rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randCol <= 1){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol + 2] = 1;
                    game[randRow][randCol + 3] = 1;
                }
                else if (randCol >= 8){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol - 2] = 1;
                    game[randRow][randCol - 3] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                    game[randRow][randCol - 1] = 1;
                    game[randRow][randCol - 2] = 1;
                }

            }
            else {
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randRow <= 1){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                    game[randRow + 3][randCol] = 1;
                }
                else if (randRow >= 8){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow - 2][randCol] = 1;
                    game[randRow - 3][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                    game[randRow + 2][randCol] = 1;
                }


            }
            rVc = random.nextInt(2);
            if (rVc == 0){
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randCol == 0){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                }
                else if (randCol == 9){
                    game[randRow][randCol] = 1;
                    game[randRow][randCol - 1] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow][randCol + 1] = 1;
                }

            }
            else {
                randRow = random.nextInt(10);
                randCol = random.nextInt(10);
                if (randRow == 0){
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                }
                else if (randRow == 9){
                    game[randRow][randCol] = 1;
                    game[randRow - 1][randCol] = 1;
                }
                else {
                    game[randRow][randCol] = 1;
                    game[randRow + 1][randCol] = 1;
                }


            }
        
        return game;
    }
}