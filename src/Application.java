

public class Application {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Let's play some Scrabble!!");
        System.out.println("---------------------------------");
        System.out.println(" ");

        Gameplay gameplay = new Gameplay();
        gameplay.createNewPlayers();
        gameplay.gameOn(1);

    }

}
