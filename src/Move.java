/**
 *
 * 1. Constructs words out of tiles
 * 2. Checks if word is valid using Gameplay method
 * 3. If word is valid, then ask Gameplay to place the word
 * 4. If not valid, either give it back to the player or put it back on the board
 * 5. If word is valid, return the total score to the player
 *
 * ANY OTHERS?
 *
 */

import java.util.ArrayList;

class Move {

    public static final int RIGHT = 1;
    public static final int DOWN  = 2;

    static int totalNumberOfMoves = 0;

    String word;
    int direction;
    int startRow;
    int startCol;
    boolean isValid;
    ArrayList<String> secondaryWords;


    /**
     * Constructs a move object
     * @param word      the word to be constructed
     * @param direction direction
     * @param startRow  starting row coordinate of the move
     * @param startCol  starting col coordinate of the move
     */
    public Move(String word, int direction, int startRow, int startCol) {
        //TODO: Add invalid argument checks here

        this.word = word;
        this.direction = direction;
        this.startRow = startRow;
        this.startCol = startCol;
        this.isValid = false;       //each moves starts off as invalid unless validated

        Move.totalNumberOfMoves++;
    }

    //variables are not declared private
    //Probably not good practice but doing it for ease of implementation
//
//    public void setSecondaryWords(ArrayList<String> list) {
//        if (!list.isEmpty()) {
//            this.secondaryWords = list;
//        } else {
//            System.out.println("secondary list empty! Nothing to set.");
//        }
//    }

    /**
     * Utility method that converts Strings to char arrays
     * Useful for using characters for move validation
     * @param str   Input string word
     * @return      Char array of str
     */
    public static char[] convertStringToCharsArray(String str) {
        char[] charArr = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            charArr[i] = str.charAt(i);
        }

        return charArr;
    }

    /**
     * Helpful for checking game state (valid + invalid)
     * @return  # of moves
     */
    public static int movedPlayedSoFar() {
        return Move.totalNumberOfMoves;
    }

    /**
     * @return  computes total score of a word
     */
    public int computeWordScore() {

        return -1;
    }

    public boolean registerMove() {
        return false;
    }






}
