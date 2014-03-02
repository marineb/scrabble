/**
 * View.java
 * Scrabble
 *
 * Created by mscndle on 2/24/14
 */

/**
 * This class handles all the view drawings. All methods are static
 * Other classes send a String object (optional) and this class adds the UI before displaying
 */
public class View {




    public static void showTray(Player player) {
        System.out.print(player.getName() + ", your turn: ");
        for (int i=0 ; i < player.getLetters().length; i++) {
            System.out.print(player.getLetters()[i] + " ");
        }
        System.out.println(" ");
    }




    public static void printBoard(Board board) {
        System.out.println(board.toString());
    }

    /**
     * Prints out player information such as
     * PLAYER NAME: xyz
     * LETTER TRAY: [A, T, G, Y, B, S, R]
     *
     * @param player    Player object
     */
    public static void printPlayerInformation(Player player) {

    }

    /**
     *
     */
    public static void printScores(Scores scores) {


    }



}
