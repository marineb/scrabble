/**
 * BinarySearchTree.java
 * PROJECT: ${PROJECT}
 *
 * @author mscndle
 * Created 2/24/14
 */

import java.util.ArrayList;

public class MandeepTests {

    public static void main(String[] args) {

        Board gameBoard = new Board();
        Gameplay game = new Gameplay();

        System.out.println(gameBoard.toString());

        Move move1 = new Move("start", Move.RIGHT, 7, 7);
        move1.isValid = true;
        gameBoard.placeWordOnBoard(move1);

        System.out.println(gameBoard.toString());


        Move move2 = new Move("termite", Move.DOWN, 7, 11);
        move2.isValid = true;
        gameBoard.placeWordOnBoard(move2);

        System.out.println(gameBoard.toString());

        Move move3 = new Move("rage", Move.RIGHT, 8, 8);
        ArrayList<String> listTest = game.getSecondaryWords(move3, gameBoard);

        System.out.println("new words: " + listTest.size());
        System.out.println("word: " + listTest.remove(0));
        System.out.println("word: " + listTest.remove(0));
        System.out.println("word: " + listTest.remove(0));





    }

}
