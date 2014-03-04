import java.util.*;


public class Application {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");

        /*  Initialize all required classes */
        Board gameBoard = new Board();
        Gameplay gameplay = new Gameplay();
        //Scores scores = new Scores();
        //sSystem.out.println("total tiles in bag: " + gameplay.totalNumberOfTilesInBag());
        //Scores scores = new Scores();
        //View view = new View(); //Not sure if this is necessary,


        gameplay.createNewPlayers();
        gameplay.gameOn(1, gameBoard);

    }

}
