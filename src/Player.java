<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 58175040576fb9a8474b88b4724dd41ba78b2117

public class Player  {

    private String name;
    private int id;
    private String[] letters;
    private int currentScore;
    private Player[] players;

    public Player (String name, int id, String[] letters) {
        this.name = name;
        this.id = id;
        this.letters = letters;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // TODO: score should be stored in gameplay.
    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public String[] getLetters() {
        return letters;
    }

    public void setLetters(String[] letters) {
        this.letters = letters;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
