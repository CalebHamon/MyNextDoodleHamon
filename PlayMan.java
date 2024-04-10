/**
     * @author Caleb Hamon
     * @since 10/19/2023
     * @version 1.0.0
     */


import java.util.Scanner;

public class PlayMan {

    // Where guessing implementations is created for both fast and reg games
    // This goes through from FastManColGuess to RegManRowGuess
    // These have different methods for each User, making it easier to keep track of
    // who guessed what
    // TO DO: Error control: I have not tested these methods yet, so I am sure there
    // is bound to be some error, but to the eye it looks good to me.
    // Also might need to do a way to hide each board that way there is no cheating

    public int FastManColGuessU1() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 && colGuess > 8));
        // scan.close();
        colGuess = colGuess - 1;
        return colGuess;

    }

    public int FastManRowGuessU1() {

        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
        } while ((rowGuess < 1 || rowGuess > 8));
        // scan.close();
        rowGuess = rowGuess - 1;
        return rowGuess;
    }

    public int RegManColGuessU1() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 || colGuess > 10));
        // scan.close();
        colGuess = colGuess - 1;
        return colGuess;
    }

    public int RegManRowGuessU1() {

        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
        } while ((rowGuess < 1 || rowGuess > 10));
        // scan.close();
        rowGuess = rowGuess - 1;
        return rowGuess;
    }

    public int FastManColGuessU2() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 || colGuess > 8));
        // scan.close();
        colGuess = colGuess - 1;
        return colGuess;

    }

    public int FastManRowGuessU2() {

        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
        } while ((rowGuess < 1 || rowGuess > 8));
        // scan.close();
        rowGuess = rowGuess - 1;
        return rowGuess;

    }

    public int RegManColGuessU2() {

        Scanner scan = new Scanner(System.in);
        int colGuess;
        System.out.println("Place a guess!");
        do {
            System.out.println("What Col Would you like to guess?");
            colGuess = scan.nextInt();
        } while ((colGuess < 1 || colGuess > 10));
        // scan.close();
        colGuess = colGuess - 1;
        return colGuess;

    }

    public int RegManRowGuessU2() {

        Scanner scan = new Scanner(System.in);
        int rowGuess;
        do {
            System.out.println("What Row Would you like to guess?");
            rowGuess = scan.nextInt();
        } while ((rowGuess < 1 || rowGuess > 10));
        rowGuess = rowGuess - 1;
        // scan.close();
        return rowGuess;
    }

}
