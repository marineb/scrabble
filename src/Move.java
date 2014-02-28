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

    public static final int RIGHT = 1;
    public static final int DOWN  = 2;

    String word;
    int direction;
    int startRow;
    int startCol;
    boolean isValid;


    /**
     * Constructs a move object
     * @param word      the word to be constructed
     * @param direction direction
     * @param startRow  starting row coordinate of the move
     * @param startCol  starting col coordinate of the move
     */
    public Move(String word, int direction, int startRow, int startCol) {
        this.word = word;
        this.direction = direction;
        this.startRow = startRow;
        this.startCol = startCol;
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
    //TODO: Not sure if we need this since we have this method in Board class
    public boolean isWordValid(String word) {
        return Board.validateWord(word);
    }


    public boolean registerMove() {
        return false;
    }






}
