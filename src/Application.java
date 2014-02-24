import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");


        // Players are created
        String[] playerNames = new String[2];
        for (int i = 0 ; i < playerNames.length ; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            playerNames[i] = scanner.next();
        }

        Player one = new Player();
        Player two = new Player();
        one.setName(playerNames[0]);
        two.setName(playerNames[1]);

        // Game is initialized
        Board game = new Board();
        //System.out.println("board initialization complete");

        //System.out.println("hello score: " + game.calculateWordScore("hello"));

        // TODO: Here we should visualize the board to the user.
        // Code here.

        // TODO: We create user 1 their set of letters and show it to them
        // get random set of 7 letters from all available tiles
        String[] letterBunch = new String[7];
        letterBunch[0] = "a";
        letterBunch[1] = "c";
        letterBunch[2] = "w";
        letterBunch[3] = "i";
        letterBunch[4] = "p";
        letterBunch[5] = "q";
        letterBunch[6] = "m";
        System.out.println(one.getName()+", your tiles are ["+letterBunch[0]+"_"+ letterBunch[1] +"_"+letterBunch[2]+"_"+letterBunch[3]+"_"+letterBunch[4]+"_"+letterBunch[5]+"_"+letterBunch[6]+"]");

        // TODO: get 7 random letters from tilebag
        // Tile stuff should be in board
        // look at number of letter a user has, refill their tile tray
        // get how many letter user's tray has
        Random random = new Random();
        System.out.println(game.tileBag);
        // don't forget to remove letters from tileBag

        //Random generator = new Random();
        //Object[] values = myHashMap.values().toArray();
        //Object randomValue = values[generator.nextInt(values.length)];

        one.setLetters(letterBunch);

        // Loops through the different players' turns (not happening yet!! :) )
        System.out.println(one.getName() + ", type a word to start with.");
        String theWord = scanner.next();
        // check if the word is valid itself
        if (game.validateWord(theWord) == true ) {
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
