
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Hello. Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");


        // probably need a for loop to create the players
        for (int i=0 ; i<2 ; i++) {

            System.out.println("Enter the name of player "+ (i+1) +" : ");
            String playerName = scanner.next();
            System.out.println(playerName);

            // we need to create an array where we store the player.
            // we need to call the player class.

        }

        //test methods for GameBoard class
        System.out.println("begin board initialization");
        GameBoard game = new GameBoard(2);
        System.out.println("board initialization complete");

        game.validateWord("hello");
        game.validateWord("pilot");
        game.validateWord("juishshsndknaksjhdbahsd");

    }


}
