import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


/**
 * Game class for scrabble
 * Stores the gameBoard, dictionary
 *
 * TODO: Representation of a word? - Could be a String by concatenating the Characters
 */
public class Board {
    private char[][] scrabbleBoard;
    private static HashSet<String> dict;

    public Board() {
        this.scrabbleBoard = new char[15][15];
        this.initBoard();

        Board.dict = new HashSet<String>();
        try { this.initDict();  }
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e);
        }
    }

    /**
     * Initialized the board
     */
    private void initBoard() {
        for (int i=0; i<15; i++) {
            for (int j=0; j<15; j++) {
                this.scrabbleBoard[i][j] = '-';
            }
        }
        this.scrabbleBoard[7][7] = 'X';
    }

    /**
     * Initializes the dictionary by reading from a file
     * @throws FileNotFoundException
     */
    private void initDict() throws FileNotFoundException {
        this.dict = new HashSet<String>();
        BufferedReader dictReader = new BufferedReader(new FileReader("words.txt"));
        try {
            String line = dictReader.readLine();

            //add all words from words.txt to hashSet
            while (line != null) {
                dict.add(line);
                line = dictReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("IOException: " + e);
            e.printStackTrace();
        }
    }

    /**
     * @param word  input to be validated
     * @return      boolean if word is valid
     */
    public static boolean validateWord(String word) {
        return dict.contains(word.toLowerCase());
    }

    /**
     * Returns string representation of the Board
     * @return      Board string object
     */
    public String toString() {
        StringBuilder board = new StringBuilder();
        board.append("   A   B   C   D   E   F   G   H   I   J   K   L   M   N   O\n");
        for (int i=0; i<15; i++) {
            if (i >= 10) {  board.append(i + " ");          }
            else         {  board.append(" " + i + " ");    }
            for (int j=0; j<15; j++) {
                board.append(this.scrabbleBoard[i][j] + "   ");
            }
            board.append("\n\n");
        }

        return board.toString();
    }

}
