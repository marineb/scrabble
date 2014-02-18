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
        for (int i = 0 ; i < 2 ; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            playerNames[i] = scanner.next();
        }

        Player one = new Player();
        Player two = new Player();
        one.setName(playerNames[0]);
        two.setName(playerNames[1]);

        System.out.println(one.getName());

        //test methods for GameBoard class
        System.out.println("begin board initialization");
        Board game = new Board();
        System.out.println("board initialization complete");

        System.out.println(game.validateWord("hello"));
        System.out.println(game.validateWord("pilot"));
        System.out.println(game.validateWord("juishshsndknaksjhdbahsd"));

        //System.out.println("hello score: " + game.calculateWordScore("hello"));

    }


}
