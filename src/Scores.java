/**
 * Scores.java
 * Scrabble
 *
 * Created by mscndle on 2/24/14.
 */

import java.util.HashMap;

public class Scores {

    private HashMap<Player, Integer> scoreMap;

    public Scores(Player player1, Player player2) {
        this.scoreMap = new HashMap<Player, Integer>();
        this.scoreMap.put(player1, 0);
        this.scoreMap.put(player2, 0);
    }

    /**
     * Updates the player's score
     * @param player    Player in question
     * @param score     New Score
     */
    public void updateScore(Player player, int score) {
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
    public int getScoreForPlayer(Player player) {
        if (player == null)    {   throw new IllegalArgumentException("player obj null"); }

        if (this.scoreMap.containsKey(player)) {
            return this.scoreMap.get(player);
        } else return -1;
    }

}
