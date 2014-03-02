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

class Move {

    public static final int RIGHT = 1;
    public static final int DOWN  = 2;


    String word;
    int direction;
    int startRow;
    int startCol;
    boolean isValid;
    static int totalNumberOfMoves = 0;


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
