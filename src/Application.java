import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
        Player[] players = new Player[2];
        for (int i=0; i < players.length; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            players[i] = new Player(scanner.next(), i, new String[7]);
        }


        // Managing Turns
        // Not happy about this. Talked to Sandeep who suggested
        // creating a class changeTurn that takes player, and turn #
        // this should be managed somewhere else. in gameplay probably.
        // how would this work?

        int turn = 1;
        boolean gameOn = true;

        Player playa = new Player("", 3, new String[7]);
        while (gameOn) {
            if (turn == 1) {
                playa = players[0];
                System.out.println("turn 1");
            }
            else if (turn == 2) {
                playa = players[1];
                System.out.println("tune 2");
            }
        }


        // player one will play


        while (gameOn) {
            System.out.println(game.toString());
            gameplay.refillTray(playa);
            gameplay.showTray(playa);
            System.out.println(playa.getName() + ", enter a word (skip: *, quit: #)");
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



    }


}
