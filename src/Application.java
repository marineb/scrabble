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

        System.out.println(game.validateWord("hello"));
        System.out.println(game.validateWord("pilot"));
        System.out.println(game.validateWord("juishshsndknaksjhdbahsd"));

        //System.out.println("hello score: " + game.calculateWordScore("hello"));

        // TODO: Here we should visualize the board to the user.
        // Code here.

        // TODO: We create user 1 their set of letters and show it to them
        // Code here.

        // We should build some logic so it loops through the turn.
        System.out.println(one.getName()+", type a word to start with.");
        System.out.println("To enter your word, type, the ");


    }


}
