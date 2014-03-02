/**
 * Scores.java
 * Scrabble
 *
 * Created by mscndle on 2/24/14.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        if (Scores.tileScore.containsKey(C)) {
            return Scores.tileScore.get(C);
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

    /**
     * Returns the score of the move
     * @param player    who played the move
     * @param move      move being played
     * @return          move score
     */
    public int computeMoveScore(Player player, Move move) {
        ArrayList<String> list = move.secondaryWords;
        String word = move.word;
        int dir = move.direction;
        int row = move.startRow;
        int col = move.startCol;

        int totalScore = 0;
        int tempWordScore = 0;
        int wordMultiplier = 1; //for double or triple scores
        int tileMultiplier = 1;
        int secondaryScore = 0;

        for (int i=0; i<word.length(); i++) {
            if (dir == Move.RIGHT) {

                String boardRef = String.valueOf(row) + String.valueOf(col+i);
                if (Board.getBoardScoreForTile(boardRef).equals("2W")) {    wordMultiplier = 2; }
                if (Board.getBoardScoreForTile(boardRef).equals("3W")) {    wordMultiplier = 3; }
                if (Board.getBoardScoreForTile(boardRef).equals("2L")) {    tileMultiplier = 2; }
                if (Board.getBoardScoreForTile(boardRef).equals("3L")) {    tileMultiplier = 3; }

                tempWordScore += (Scores.tileScore.get(Character.toUpperCase(word.charAt(i)))) *
                        tileMultiplier;

            } else if (dir == Move.DOWN) {

                String boardRef = String.valueOf(row+i) + String.valueOf(col);
                if (Board.getBoardScoreForTile(boardRef).equals("2W")) {    wordMultiplier = 2; }
                if (Board.getBoardScoreForTile(boardRef).equals("3W")) {    wordMultiplier = 3; }
                if (Board.getBoardScoreForTile(boardRef).equals("2L")) {    tileMultiplier = 2; }
                if (Board.getBoardScoreForTile(boardRef).equals("3L")) {    tileMultiplier = 3; }

                tempWordScore += (Scores.tileScore.get(Character.toUpperCase(word.charAt(i)))) *
                        tileMultiplier;

            }
        }

        totalScore += tempWordScore * wordMultiplier;
        secondaryScore = this.computeSecondaryWordScore(move);

        return totalScore + secondaryScore;
    }


    /**
     * Computes the score of a single word, can only be done by the Move class
     * @param move  intended word to be scored
     * @return      total word score
     */
    private int computeSecondaryWordScore(Move move) {
        ArrayList<String> list = move.secondaryWords;
        int tempScore = 0;

        for (String str : list) {
            for (int i=0; i<str.length(); i++) {
                tempScore += Scores.tileScore.get(Character.toUpperCase(str.charAt(i)));
            }
        }

        return tempScore;
    }

}
