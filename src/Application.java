import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");


        // Create the players
        String[] playerNames = new String[2];
        for (int i = 0 ; i < playerNames.length ; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            playerNames[i] = scanner.next();
        }

        Player one = new Player();
        Player two = new Player();
        one.setName(playerNames[0]);
        two.setName(playerNames[1]);


        //test methods for GameBoard class
        System.out.println("begin board initialization");
        Board game = new Board();
        System.out.println("board initialization complete");

        //System.out.println(game.validateWord("valid"));
        //System.out.println(game.validateWord("thisWordDoesNotExist"));
        //System.out.println("hello score: " + game.calculateWordScore("hello"));

        // TODO: Here we should visualize the board to the user.
        // Code here.

        // TODO: We create user 1 their set of letters and show it to them
        // Code here.

        // Build logic so it loops through the different players' turns.
        System.out.println(one.getName()+", type a word to start with.");
        String theWord = scanner.next();
        // check if the word is valid itself
        if (game.validateWord(theWord.toLowerCase()) == true ) {
            System.out.println(theWord +" is valid!");
        }


        // TODO: check if the word is being placed in valid location and is still valid with letters around it
        // TODO: place word on board
        // TODO: remove letters from player 1
        // TODO: calculate score for player 1
        // TODO: add score to score table
        // TODO: fill up letters' tray for player 1
        // TODO: player 2 plays -- this will go into a loop after

    }


}
