import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.HashMap;


/**
 * Game class for scrabble
 * Stores the gameBoard, dictionary
 */
public class Board {

    private char[][] scrabbleBoard;
    private static HashSet<String> dict;
    private static HashMap<String, String> boardScores;

    public Board() {
        this.initBoard();
        this.initBoardScores();

        try { this.initDict();  }
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e);
        }
    }

    /**
     * Initialized the board
     */
    private void initBoard() {
        this.scrabbleBoard = new char[15][15];
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
        Board.dict = new HashSet<String>();
        BufferedReader dictReader = new BufferedReader(new FileReader("../words.txt"));
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
     * Initializes the map that stores special scores for cells
     */
    private void initBoardScores() {
        Board.boardScores = new HashMap<String, String>();
        //TRIPLE WORD
        boardScores.put("00", "3W");
        boardScores.put("70", "3W");
        boardScores.put("07", "3W");
        boardScores.put("014", "3W");

        //DOUBLE WORD
        boardScores.put("11", "2W");
        boardScores.put("22", "2W");
        boardScores.put("33", "2W");
        boardScores.put("44", "2W");
        boardScores.put("113", "2W");
        boardScores.put("212", "2W");
        boardScores.put("311", "2W");
        boardScores.put("410", "2W");
        boardScores.put("131", "2W");
        boardScores.put("122", "2W");
        boardScores.put("113", "2W");
        boardScores.put("104", "2W");
        boardScores.put("1010", "2W");
        boardScores.put("1111", "2W");
        boardScores.put("1212", "2W");
        boardScores.put("1313", "2W");

        //TODO: complete adding the board scores



    }

    /**
     * @param word  input to be validated
     * @return      boolean if word is valid
     */
    public static boolean validateWord(String word) {
        return dict.contains(word.toLowerCase());
    }

    public static String getCellScore(int coordinate) {

        return "";
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



    public void placeWordOnBoard(char[] word, int row, char col, int direction) {
        //assumption is that the word is valid



    }


//    /**
//     * Helper method to find if the word overflows the board
//     * @param word  player's move
//     * @param row   intended row# on the board
//     * @param col   intended col# on the board
//     * @param dir   RIGHT or DOWN
//     * @return      True or False depending on if the word
//     */
//    private boolean doesWordOverflowBoard(char[] word, int row, char col, int dir) {
//        if (dir == RIGHT) {
//            if (col + word.length > 'O'){   return false;   }   //TODO: check if + works on chars
//            else                        {   return true;    }
//        } else if (dir == DOWN) {
//            if (row + word.length > 14) {   return false;   }
//            else                        {   return true;    }
//        }
//        return false;
//    }
//
//    /**
//     *
//     * @param word
//     * @param row
//     * @param col
//     * @param dir
//     * @return
//     */
//    private boolean validateArguments(char[] word, int row, char col, int dir) {
//        if (dir != RIGHT && dir != DOWN){   throw new IllegalArgumentException();   }
//        if (row < 0 || row > 14)                    {   throw new IllegalArgumentException();   }
//        if (col < 'A' || col > 'O')                 {   throw new IllegalArgumentException();   }
//        if (word.length > 7)                        {   throw new IllegalArgumentException();   }
//
//        return true;
//    }


}
