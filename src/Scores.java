/**
 * Scores.java
 * Scrabble
 *
 * Created by mscndle on 2/24/14.
 */

import java.util.HashMap;

public class Scores {

    private HashMap<Player, Integer> scoreMap;
    public static HashMap<Character, Integer> tileScore;

    public Scores(Player player1, Player player2) {
        this.scoreMap = new HashMap<Player, Integer>();
        this.scoreMap.put(player1, 0);
        this.scoreMap.put(player2, 0);
        this.initTileScore();
    }

    /**
     * Initializes tile scores in another hashmap
     * //TODO: Find a way to read these directly from the file
     */
    public void initTileScore() {
        Scores.tileScore = new HashMap<Character, Integer>();
        if (Scores.tileScore.isEmpty()) {
            Scores.tileScore.put('A', 1);
            Scores.tileScore.put('B', 3);
            Scores.tileScore.put('C', 3);
            Scores.tileScore.put('D', 2);
            Scores.tileScore.put('E', 1);
            Scores.tileScore.put('F', 2);
            Scores.tileScore.put('G', 2);
            Scores.tileScore.put('H', 4);
            Scores.tileScore.put('I', 1);
            Scores.tileScore.put('J', 8);
            Scores.tileScore.put('K', 5);
            Scores.tileScore.put('L', 1);
            Scores.tileScore.put('M', 3);
            Scores.tileScore.put('N', 1);
            Scores.tileScore.put('O', 1);
            Scores.tileScore.put('P', 3);
            Scores.tileScore.put('Q', 10);
            Scores.tileScore.put('R', 1);
            Scores.tileScore.put('S', 1);
            Scores.tileScore.put('T', 1);
            Scores.tileScore.put('U', 1);
            Scores.tileScore.put('V', 4);
            Scores.tileScore.put('W', 4);
            Scores.tileScore.put('X', 8);
            Scores.tileScore.put('Y', 4);
            Scores.tileScore.put('Z', 10);
        }
    }

    /**
     * @param C     Tile to be scored
     * @return      Score for a tile
     */
    private int getTileScore(Character C) {
        if (this.tileScore.containsKey(C)) {
            return this.tileScore.get(C);
        }
        return -1;
    }


    /**
     * Updates the player's score
     * @param player    Player in question
     * @param score     New Score
     */
    private void updatePlayerScore(Player player, int score) {
        if (score < 0)         {   throw new IllegalArgumentException("negative score!"); }
        if (player == null)    {   throw new IllegalArgumentException("player obj null"); }

        int newScore = this.scoreMap.get(player) + score;
        this.scoreMap.put(player, newScore);
    }

    /**
     * Get player's score
     * @param player    Player in question
     * @return          Player's score
     */
    public int getPlayerScore(Player player) {
        if (player == null)    {   throw new IllegalArgumentException("player obj null"); }

        if (this.scoreMap.containsKey(player)) {
            return this.scoreMap.get(player);
        } else return -1;
    }

    // The score of letters only of the formed word
    //
    public int computeWordScore(String word) {

       return -1;
    }


    // The score of that move assuming the move is valid
    public int computeMoveScore(Move move) {
        return -1;
    }

}
