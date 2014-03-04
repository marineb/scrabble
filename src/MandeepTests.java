/**
 * BinarySearchTree.java
 * PROJECT: ${PROJECT}
 *
 * @author mscndle
 * Created 2/24/14
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MandeepTests {

    public static void main(String[] args) {

//        Board gameBoard = new Board();
//        Gameplay game = new Gameplay();
//
//        System.out.println(gameBoard.toString());
//
//        Move move1 = new Move("start", Move.RIGHT, 7, 7);
//        move1.isValid = true;
//        gameBoard.placeWordOnBoard(move1);
//
//        View.printBoard(gameBoard);
//
//
//        Move move2 = new Move("termite", Move.DOWN, 7, 11);
//        move2.isValid = true;
//        gameBoard.placeWordOnBoard(move2);
//        View.printBoard(gameBoard);
//        //System.out.println(gameBoard.toString());
//
//
//        Move move3 = new Move("tar", Move.RIGHT, 9, 9);
//        move3.isValid = true;
//        gameBoard.placeWordOnBoard(move3);
//        System.out.println(gameBoard.toString());
//
//        Move move4 = new Move("road", Move.DOWN, 7, 10);
//        ArrayList<String> move4Test = game.getSecondaryWords(move4, gameBoard);
//        System.out.println("new word: " + move4Test.size());
//
//        System.out.println("word: " + move4Test.remove(0));
//        System.out.println("word: " + move4Test.remove(0));


//        move4.isValid = true;
//        gameBoard.placeWordOnBoard(move4);
//        System.out.println(gameBoard.toString());


//        Move move5 = new Move("rage", Move.RIGHT, 8, 8);
//        ArrayList<String> listTest = game.getSecondaryWords(move5, gameBoard);
//
//        System.out.println("new words: " + listTest.size());
//        System.out.println("word: " + listTest.remove(0));
//        System.out.println("word: " + listTest.remove(0));
//        System.out.println("word: " + listTest.remove(0));


//        System.out.println("total moves: " + Move.totalNumberOfMoves);

        String[] testStr = new String[5];
        testStr[0] = "A";
        testStr[1] = "B";
        testStr[2] = "C";
        testStr[3] = "D";
        testStr[4] = "E";

        String word = "ABBACD";

        System.out.println(String.valueOf(word.charAt(5)));
        //word.

        int pos = Arrays.binarySearch(testStr, String.valueOf(word.charAt(5)));

        System.out.println("pos: " + pos);


        //TODO: Test these scenarios:
        /*
        1. test if tilbag values are going down
        2.

         */
//
//        System.out.println("str to char");
//        System.out.println(Character.);




    }

}
