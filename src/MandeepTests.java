/**
 * BinarySearchTree.java
 * PROJECT: ${PROJECT}
 *
 * @author mscndle
 * Created 2/24/14
 */


public class MandeepTests {

    public static void main(String[] args) {

        Board gameBoard = new Board();

        System.out.println(gameBoard.toString());

        Move move1 = new Move("start", Move.RIGHT, 7, 7);
        move1.isValid = true;
        gameBoard.placeWordOnBoard(move1);

        System.out.println(gameBoard.toString());


        Move move2 = new Move("termite", Move.DOWN, 7, 11);
        move2.isValid = true;
        gameBoard.placeWordOnBoard(move2);

        System.out.println(gameBoard.toString());




    }

}
