/**
 *
 * 1. Constructs words out of tiles -  //Maybe the player should handle this
 *      WORD REPRESENTATION ?
 * 2. Checks if word is valid using GameBoard method
 * 3. If word is valid, then ask GameBoard to place the word
 * 4. If not valid, either give it back to the player or put it back on the board
 * 5. If word is valid, return the total score to the player
 *
 * ANY OTHERS?
 *
 */

public class Move {
    char[] word;
    int direction;
    int coordinate;     //starting coordinate of the word
    boolean isValid;


    /**
     * constructs a move object
     * @param word
     * @param direction
     * @param coordinate
     */
    public Move(char[] word, int direction, int coordinate) {

    }

    /**
     * @return  computes total score of a word
     */
    public int computeWordScore() {

        return -1;
    }

    /**
     * Implements an algorithm to compute if the move is correct
     * @param word  player's input
     * @return      T/F if move is valid
     */
    public boolean isWordValid(char[] word) {


        return false;
    }


    public boolean registerMove() {
        return false;
    }






}
