

public class Player  {

    private String name;
    private int id;
    private String[] letters;
    private int currentScore;


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




    public void refillTray(Board board) {
        // this.letters = new String[7];
        this.setLetters(new String[]{"a", "", "d", "", "t", "p", ""});
        //System.out.println(getLetters());


        // for now, we hard code the letters for testing purposes
        String[] lettersTray = this.getLetters();

        System.out.println(this.getName()+", your tiles are ["+lettersTray[0]+"_"+ lettersTray[1] +"_"+lettersTray[2]+"_"+lettersTray[3]+"_"+lettersTray[4]+"_"+lettersTray[5]+"_"+lettersTray[6]+"]");



        int lettersMissing = 0;
        for (int i=0 ; i < lettersTray.length ; i++ ) {
            if (lettersTray[i] == null) {

                //board.removeTileFromBag('i');
                // TODO: figure out above how to access stuff now that it is in gameplay
                // pass in the game as a parameter in the function -- pass in "board"
                //
                System.out.println(i);

            }

        }



        System.out.println(this.getName()+", your tiles are ["+lettersTray[0]+"_"+ lettersTray[1] +"_"+lettersTray[2]+"_"+lettersTray[3]+"_"+lettersTray[4]+"_"+lettersTray[5]+"_"+lettersTray[6]+"]");

        // TODO: This part doesn't work. Need to think about the way to store these letters.
        //this.setLetters(lettersTray);
        //System.out.println(lettersTray);
        //System.out.println(this.getLetters());



    }




}
