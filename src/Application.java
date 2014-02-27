import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");


        // Game and gameplay initialized
        Board game = new Board();
        Gameplay gameplay = new Gameplay();


        // Create two players
        Player one = new Player("", 1, new String[7]);
        Player two= new Player("", 2, new String[7]);
        String[] playerNames = new String[2];
        for (int i = 0 ; i < playerNames.length ; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            playerNames[i] = scanner.next();
        }
        one.setName(playerNames[0]);
        two.setName(playerNames[1]);


        // Managing Turns
        // Not happy about this. Talked to Sandeep who suggested
        // creating a class changeTurn that takes player, and turn #
        // this should be managed somewhere else. in gameplay probably.
        int turn = 1;
        boolean gameOn = true;


        // player one will play
        while (gameOn) {
            if (turn == 1) {
                //draw board --> this is not working game.toString();
                gameplay.refillTray(one);
                gameplay.showTray(one);
                System.out.println(one.getName() + ", type a word to start with (skip: *, quit: #)");
                String theWord = scanner.next();

                if (theWord.equals("*")) {
                    System.out.println("You decided to skip your turn.");
                    System.out.println("");
                    turn = 2;
                }
                else if (theWord.equals("#")) {
                    turn = 3;
                }
                else {
                    // check if the word is valid itself and placement is valid and uses tray
                    if (game.validateWord(theWord) == true ) {
                        System.out.println(theWord +" is valid!");
                        // place word on board
                        // calculate score
                        // add score to total score
                    }
                    else {
                        // if word isn't working
                        // put letters back in tray
                        System.out.println("Sorry, your word isn't valid.");
                        System.out.println("");
                        turn = 2;
                    }

                }


            }
            else if (turn == 2) {
                //draw board --> this is not working game.toString();
                gameplay.refillTray(two);
                gameplay.showTray(two);
                System.out.println(two.getName() + ", type a word to start with (skip: *, quit: #)");
                String theWord = scanner.next();

                if (theWord.equals("*")) {
                    System.out.println("You decided to skip your turn.");
                    System.out.println("");
                    turn = 1;
                }
                else if (theWord.equals("#")) {
                    gameOn = false;
                }
                else {

                    // check if the word is valid itself and placement is valid and uses tray
                    if (game.validateWord(theWord) == true ) {
                        System.out.println(theWord +" is valid!");
                        // place word on board
                        // calculate score
                        // add score to total score
                    }
                    else {
                        // if word isn't working
                        // put letters back in tray
                        System.out.println("Sorry, your word isn't valid.");
                        System.out.println("");
                        turn = 2;
                    }

                }

            }

        }


    }


}
