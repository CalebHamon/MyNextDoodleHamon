public class Tester {

    /**
     * @author Caleb Hamon
     * @since 10/19/2023
     * @version 1.0.0
     *
     * The main method brings all of the classes together
     * This is where all the prompts and input will be put all togehter to make
     * Battlship
     * TO DO: I still need to implement a way to check the guesses. I think I will
     * do it here.
     * I will do it by checking if game[num][num] equals one, if so then hit and if
     * not then it is not a hit
     * If it is not a hit then change it to be a 2, but if it is then make it
     * another number such as 3. Then I can
     * use these number to then check if the guess has been made and also where the
     * hits are. After there are no more zeros then call a method that ends game
     * Also I need to add the classes and methods from the new classes and methods I
     * made yesterday.

     * TO DO (NOT IN THIS METHOD THOUGH): Create a random placement method that way
     * it can be used for both the user and CPU.
     * Also a way to loop the games to make sure it doesnt end prematurely and also
     * prompt the user if they would like to play again.
     * I think I could do this by a do while loop for the former and a conditional
     * for if they would like to play again.
     * Also need to create a board for guessing, though shouldnt be too hard
     * considering I have already made another method similar to it



     *10/19/23
     *I have built everything out in Tester, should be working
     *I havent been able to test what happens in a Man game win/loss
     *Everything else has been tested though.
     *For Next Time: Make sure to put less in tester
     *I think some of the things I did in tester could have been made in other methods, making it easier to implement and debug
     */

    public static void main(String[] args) {
        Board board = new Board();
        Board board2 = new Board();
        Setup setup = new Setup();
        PlayCpu cpu = new PlayCpu();
        PlayMan man = new PlayMan();
        int fasRow = 8;
        int fasCol = 8;
        int regRow = 10;
        int regCol = 10;
        int guessRow;
        int guessCol;
        boolean didWinU1 = true;
        int addWinU1 = 0;
        boolean didWinU2 = true;
        int addWinU2 = 0;
        if (board.Instructions()) { // would they like to play MAN(false) or CPU(true)

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                int[][] gameBrdU2 = new int[fasRow][fasCol];
                int[][] gameBrdU1 = new int[fasRow][fasCol];
                int[][] guessBrdT2 = new int[fasRow][fasCol];
                int[][] guessBrdT1 = new int[fasRow][fasCol];
                board.PrintBoardFas();
                System.out.println("");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU1 = setup.SetupFas();
                } else {
                    gameBrdU1 = setup.SetupCPUFas();
                }
                gameBrdU2 = setup.SetupCPUFas();
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardFas();
                System.out.println("");
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do { //loops until a game is won
                    System.out.println("YOUR TURN!");
                    guessRow = cpu.FastCPURowGuess();
                    guessCol = cpu.FastCPUColGuess();
                    if (guessBrdT1[guessRow][guessCol] == 3) {//error control for overlaping ships
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = cpu.FastCPURowGuess();
                            guessCol = cpu.FastCPUColGuess();
                        } while ((guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU2[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT1[guessRow][guessCol] = 1;
                        addWinU1++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT1[guessRow][guessCol] = 3;
                    }
                    System.out.println("Your Board:");
                    System.out.println("");
                    for (int p = 0; p < fasCol; p++) {
                        for (int c = 0; c < fasRow; c++) {
                            System.out.print(guessBrdT1[p][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    guessRow = cpu.FasCPURowGuessRan();
                    guessCol = cpu.FasCPUColGuessRan();
                    if (guessBrdT2[guessRow][guessCol] == 3) {//Cpu guessing, same principles applied
                        do {
                            guessRow = cpu.FastCPURowGuess();
                            guessCol = cpu.FastCPUColGuess();
                        } while (!(guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU1[guessRow][guessCol] == 1) {
                        System.out.println("The CPU Landed a HIT!");
                        addWinU2++;
                    } else {
                        System.out.println("The CPU missed");
                    }
                    if (addWinU1 == 8) {
                        didWinU1 = false;
                    }
                    if (addWinU2 == 8) {
                        didWinU2 = false;
                    }
                } while (!(didWinU1 == false || didWinU2 == false));
                if (!didWinU1) {
                    System.out.println("YOU WON!!!!");
                    System.out.println("Rerun to play again!");
                }
                if (!didWinU2) {
                    System.out.println("You lost :(");
                    System.out.println("Rerun to play again!");
                }

            } else {
                //Next three are blocks similar are mostly the same
                //They are all the same logic wise at least
                int[][] gameBrdU2 = new int[regRow][regCol];
                int[][] gameBrdU1 = new int[regRow][regCol];
                int[][] guessBrdT2 = new int[regRow][regCol];
                int[][] guessBrdT1 = new int[regRow][regCol];
                board.PrintBoardReg();
                System.out.println("");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU1 = setup.SetupReg();
                } else {
                    gameBrdU1 = setup.SetupCPUReg();
                }
                gameBrdU2 = setup.SetupCPUReg();
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardReg();
                System.out.println("");
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do {
                    System.out.println("YOUR TURN!");
                    guessRow = cpu.RegCPURowGuess();
                    guessCol = cpu.RegCPUColGuess();
                    if (guessBrdT1[guessRow][guessCol] == 3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = cpu.RegCPURowGuess();
                            guessCol = cpu.RegCPUColGuess();
                        } while ((guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU2[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT1[guessRow][guessCol] = 1;
                        addWinU1++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT1[guessRow][guessCol] = 3;
                    }
                    System.out.println("Your Board:");
                    System.out.println("");
                    for (int p = 0; p < regCol; p++) {
                        for (int c = 0; c < regRow; c++) {
                            System.out.print(guessBrdT1[p][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    guessRow = cpu.RegCPURowGuessRan();
                    guessCol = cpu.RegCPUColGuessRan();
                    if (guessBrdT2[guessRow][guessCol] == 3) {
                        do {
                            guessRow = cpu.RegCPURowGuess();
                            guessCol = cpu.RegCPUColGuess();
                        } while (!(guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU1[guessRow][guessCol] == 1) {
                        System.out.println("The CPU Landed a HIT!");
                        addWinU2++;
                    } else {
                        System.out.println("The CPU missed");
                    }
                    if (addWinU1 == 17) {
                        didWinU1 = false;
                    }
                    if (addWinU2 == 17) {
                        didWinU2 = false;
                    }
                } while (!(didWinU1 == false || didWinU2 == false));
                if (!didWinU1) {
                    System.out.println("YOU WON!!!!");
                    System.out.println("Rerun to play again!");
                }
                if (!didWinU2) {
                    System.out.println("You lost :(");
                    System.out.println("Rerun to play again!");
                }

            }
        } else { //These next to blocks are getting rid of CPU and plugging in a new User
                 //Though is is the same for User 1 as User 2

            if (board.WhatGame()) { // would they like to play fast(true) or normal(false)
                int[][] gameBrdU2 = new int[fasRow][fasCol];
                int[][] gameBrdU1 = new int[fasRow][fasCol];
                int[][] guessBrdT2 = new int[fasRow][fasCol];
                int[][] guessBrdT1 = new int[fasRow][fasCol];
                board.PrintBoardFas();
                System.out.println("");
                System.out.println("Player 1, please create your board");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU1 = setup.SetupFas();
                } else {
                    gameBrdU1 = setup.SetupCPUFas();
                }
                System.out.println("");
                System.out.println("Player 2, please create your board");
                if (board2.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU2 = setup.SetupFas();
                } else {
                    gameBrdU2 = setup.SetupCPUFas();
                }
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardReg();
                System.out.println("");
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do {
                    System.out.println("Player 1's Guessing Board:");
                    System.out.println("");
                    for (int p = 0; p < fasCol; p++) {
                        for (int c = 0; c < fasRow; c++) {
                            System.out.print(guessBrdT1[p][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("YOUR TURN Player 1!");
                    guessRow = man.FastManRowGuessU1();
                    guessCol = man.FastManColGuessU1();
                    if (guessBrdT1[guessRow][guessCol] == 3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = man.FastManRowGuessU1();
                            guessCol = man.FastManColGuessU1();
                        } while (!(guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU2[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT1[guessRow][guessCol] = 1;
                        addWinU1++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT1[guessRow][guessCol] = 3;
                    }
                    System.out.println("Player 2's Guessing Board:");
                    System.out.println("");
                    for (int k = 0; k < fasCol; k++) {
                        for (int c = 0; c < fasRow; c++) {
                            System.out.print(guessBrdT2[k][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("YOUR TURN Player 2!");
                    guessRow = man.FastManRowGuessU2();
                    guessCol = man.FastManColGuessU2();
                    if (guessBrdT2[guessRow][guessCol] == 3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = man.FastManRowGuessU1();
                            guessCol = man.FastManColGuessU1();
                        } while (!(guessBrdT2[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU1[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT2[guessRow][guessCol] = 1;
                        addWinU2++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT2[guessRow][guessCol] = 3;
                    }
                    if (addWinU1 == 8) {
                        didWinU1 = false;
                    }
                    if (addWinU2 == 8) {
                        didWinU2 = false;
                    }
                } while (!(didWinU1 == false || didWinU2 == false));
                if (!didWinU1) {
                    System.out.println("YOU WON!!!!");
                    System.out.println("Rerun to play again!");
                }
                if (!didWinU2) {
                    System.out.println("Player 2 WON!!!!");
                    System.out.println("Rerun to play again!");
                }

            } else {
                int[][] gameBrdU2 = new int[regRow][regCol];
                int[][] gameBrdU1 = new int[regRow][regCol];
                int[][] guessBrdT2 = new int[regRow][regCol];
                int[][] guessBrdT1 = new int[regRow][regCol];
                board.PrintBoardReg();
                System.out.println("");
                System.out.println("");
                System.out.println("Player 1, please create your board");
                if (board.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU1 = setup.SetupReg();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    //this is to prevent cheating

                } else {
                    gameBrdU1 = setup.SetupCPUReg();
                }
                System.out.println("");
                System.out.println("Player 2, please create your board");
                if (board2.RandoNo()) { // would they like to place ships manually(true) or randomly(false)
                    gameBrdU2 = setup.SetupReg();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    //this is to prevent cheating
                } else {
                    gameBrdU2 = setup.SetupCPUReg();
                }
                gameBrdU2 = setup.SetupCPUReg();
                System.out.println("Here is the board you will be using for the rest of the game:");
                board.PrintBoardReg();
                System.out.println("");
                System.out.println("1s Indicates HITS and 3s indicate a miss");
                System.out.println("GOOD LUCK!");
                do {
                    System.out.println("Player 1's Guessing Board:");
                    System.out.println("");
                    for (int p = 0; p < regCol; p++) {
                        for (int c = 0; c < regRow; c++) {
                            System.out.print(guessBrdT1[p][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("YOUR TURN Player 1!");
                    guessRow = man.RegManRowGuessU1();
                    guessCol = man.RegManColGuessU1();
                    if (guessBrdT1[guessRow][guessCol] == 3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = man.RegManRowGuessU1();
                            guessCol = man.RegManColGuessU1();
                        } while ((guessBrdT1[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU2[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT1[guessRow][guessCol] = 1;
                        addWinU1++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT1[guessRow][guessCol] = 3;
                    }
                    System.out.println("Player 2's Guessing Board:");
                    System.out.println("");
                    for (int k = 0; k < regCol; k++) {
                        for (int c = 0; c < regRow; c++) {
                            System.out.print(guessBrdT2[k][c]);
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    System.out.println("YOUR TURN Player 2!");
                    guessRow = man.RegManRowGuessU2();
                    guessCol = man.RegManColGuessU2();
                    if (guessBrdT2[guessRow][guessCol] == 3) {
                        System.out.println("You have guessed here already");
                        System.out.println("Please Try Again");
                        do {
                            guessRow = man.RegManRowGuessU1();
                            guessCol = man.RegManColGuessU1();
                        } while ((guessBrdT2[guessRow][guessCol] == 3));
                    }
                    if (gameBrdU1[guessRow][guessCol] == 1) {
                        System.out.println("HIT!");
                        guessBrdT2[guessRow][guessCol] = 1;
                        addWinU2++;
                    } else {
                        System.out.println("Miss");
                        guessBrdT2[guessRow][guessCol] = 3;
                    }
                    if (addWinU1 == 8) {
                        didWinU1 = false;
                    }
                    if (addWinU2 == 8) {
                        didWinU2 = false;
                    }
                } while (!(didWinU1 == false || didWinU2 == false));
                if (!didWinU1) {
                    System.out.println("Player 1 WON!!!!");
                    System.out.println("Rerun to play again!");
                }
                if (!didWinU2) {
                    System.out.println("Player 2 WON!!!!");
                    System.out.println("Rerun to play again!");
                }
            }

        }

        System.out.println("");

    }
}
