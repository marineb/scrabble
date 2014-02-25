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
        String[] lettersTray = new String[7];
        lettersTray[0] = "A";
        lettersTray[1] = "C";
        //lettersTray[2] = "w";
        lettersTray[3] = "I";
        //lettersTray[4] = "p";
        lettersTray[5] = "Q";
        lettersTray[6] = "M";
        System.out.println(one.getName()+", your tiles are ["+lettersTray[0]+"_"+ lettersTray[1] +"_"+lettersTray[2]+"_"+lettersTray[3]+"_"+lettersTray[4]+"_"+lettersTray[5]+"_"+lettersTray[6]+"]");


        // See how many letters a user is missing, refill their tile tray
        // TODO: here this is not even happening for a user.

//        int lettersMissing = 0;
//        for (int i=0 ; i < lettersTray.length ; i++ ) {
//            if (lettersTray[i] == null) {
//
//                Random random = new Random();
//                Object[] letters = game.tileBag.keySet().toArray();
//                Object randomLetter = letters[random.nextInt(letters.length)];
//
//                if (game.tileBag.get(randomLetter) == 0) {
//                    // pick a diff letter if the letter has all been used already
//                }
//
//                else {
//                    Object numberOfThatLetter = game.tileBag.get(randomLetter);
//                    int newValue = game.tileBag.get(randomLetter) -1;
//                    game.tileBag.put((Character) randomLetter, newValue);
//                    System.out.println(randomLetter);
//                    lettersTray[i] = String.valueOf(randomLetter);
//                }
//            }
//        }

        System.out.println(one.getName()+", your tiles are ["+lettersTray[0]+"_"+ lettersTray[1] +"_"+lettersTray[2]+"_"+lettersTray[3]+"_"+lettersTray[4]+"_"+lettersTray[5]+"_"+lettersTray[6]+"]");

        // TODO: This part doesn't work. Need to think about the way to store these letters.
        one.setLetters(lettersTray);
        System.out.println(lettersTray);
        System.out.println(one.getLetters());

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
