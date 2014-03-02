/**
 * Gameplay.java
 * Scrabble
 *
 * Created by mscndle on 2/24/14.
 */


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * This class handles move validation and score handling
 * Also handles the tileBag and tileScores
 */
public class Gameplay {

    private HashMap<Character, Integer> tileBag;    //unchecked warning without types
    private Player[] players = new Player[2];
    private int turn;

    public Gameplay() {
        this.initTileBag();
    }


    /**
     * Tile bag initialization and distribution
     * //TODO: Find a way to read these values directly from the file
     */
    private void initTileBag() {
        this.tileBag =  new HashMap<Character, Integer>();
        if (this.tileBag.isEmpty()) {
            this.tileBag.put('A', 9);
            this.tileBag.put('B', 2);
            this.tileBag.put('C', 2);
            this.tileBag.put('D', 4);
            this.tileBag.put('E', 12);
            this.tileBag.put('F', 2);
            this.tileBag.put('G', 3);
            this.tileBag.put('H', 2);
            this.tileBag.put('I', 9);
            this.tileBag.put('J', 1);
            this.tileBag.put('K', 1);
            this.tileBag.put('L', 4);
            this.tileBag.put('M', 2);
            this.tileBag.put('N', 6);
            this.tileBag.put('O', 8);
            this.tileBag.put('P', 2);
            this.tileBag.put('Q', 1);
            this.tileBag.put('R', 6);
            this.tileBag.put('S', 4);
            this.tileBag.put('T', 6);
            this.tileBag.put('U', 4);
            this.tileBag.put('V', 2);
            this.tileBag.put('W', 2);
            this.tileBag.put('X', 1);
            this.tileBag.put('Y', 2);
            this.tileBag.put('Z', 1);
        }
    }




    /**
     * Used when game starts and after each move
     * @param C     Tile to be removed
     * @return      removed successfully
     */
    public boolean removeTileFromBag(char C) {
        if (this.tileBag.containsKey(C) && this.tileBag.get(C) > 0) {
            int newValue = this.tileBag.get(C) - 1;
            this.tileBag.put(C, newValue);
            return true;
        }
        return false;
    }

    /**
     * Used when players give up their turns
     * @param C     Tile added back to bag
     * @return      added successfully
     */
    public boolean addTileToBag(char C) {
        if (this.tileBag.containsKey(C)) {
            int newValue = this.tileBag.get(C) + 1;
            this.tileBag.put(C, newValue);
            return true;
        }
        return false;
    }


    /**
     * Used when players give up their turns
     * @param C     Letter missing from tray
     */
    public Object getRandomLetterFromBag(char C) {
        Random random = new Random();
        Object[] letters = this.tileBag.keySet().toArray();
        Object randomLetter = letters[random.nextInt(letters.length)];

        if (this.tileBag.get(randomLetter) == 0) {
            // need to go recursive on the getRandomLetterFromBag function
        }

        else {
            int newValue = this.tileBag.get(randomLetter) -1;
            this.tileBag.put((Character) randomLetter, newValue);
        }
        return randomLetter;
    }


    public void createNewPlayers() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < players.length; i++) {
            System.out.println("Enter the name of player "+ (i+1) +" : ");
            players[i] = new Player(scanner.next(), i, new String[7]);

        }
    }

    public void endGame() {
        System.out.println("Game Over!");
        System.out.println("Thanks for playing "+players[0].getName()+" and "+players[1].getName()+"!");
    }


    public int switchTurn() {
        if (turn == 1 || turn == 0) {
            turn = 2;
        }
        else if (turn == 2) {
            turn = 1;
        }
        return turn;
    }

    public void gameOn(int turn){
        Player thePlayer = null;
        if (turn == 1) {
            thePlayer = players[0];
        }
        else if (turn == 2) {
            thePlayer = players[1];
        }
        Board game = new Board();
        Scanner scanner = new Scanner(System.in);
        // Hiding the board for now, for testing. it's big and annoying! :)
        // System.out.println(game.toString());
        refillTray(thePlayer);
        showTray(thePlayer);
        System.out.println(thePlayer.getName() + ", enter a word (skip: *, quit: #)");
        String theWord = scanner.next();

        if (theWord.equals("*")) {
            System.out.println("You decided to skip your turn.");
            System.out.println("");
            gameOn(switchTurn());
        }
        else if (theWord.equals("#")) {
            endGame();
        }
        else {
            if (Board.validateWord(theWord) == true ) {
                System.out.println(theWord +" is valid!");
                // place word on board
                // calculate score
                // add score to total score
                gameOn(switchTurn());
            }
            else {
                // if word isn't working
                // put letters back in tray
                System.out.println("Sorry, your word isn't valid.");
                System.out.println("");
                gameOn(switchTurn());
            }
        }

    }


    public void refillTray(Player player) {
        String[] lettersTray = player.getLetters();
        int lettersMissing = 0;
        for (int i=0 ; i < lettersTray.length ; i++ ) {
            if (lettersTray[i] == "" || lettersTray[i] == null) {
                lettersTray[i] = String.valueOf(this.getRandomLetterFromBag('i'));
            }
        }
        player.setLetters(lettersTray);
    }



    public void showTray(Player player) {
        System.out.print(player.getName() + ", your turn: ");
        for (int i=0 ; i < player.getLetters().length; i++) {
            System.out.print(player.getLetters()[i] + " ");
        }
        System.out.println(" ");
    }



}
