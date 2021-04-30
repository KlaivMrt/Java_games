package Connect_four_game_Backend;

public class Player {
    private String name;
    private int score;
    private int chip;

    protected Player(){
        name = null;
        score = 0;
        chip = -1;
    }

    protected void setName(String n){this.name = n; }

    protected String getName() {return name;}

    protected void incrementScore(){
        this.score ++;
    }

    protected void setChip(int ch) {
        this.chip = ch;
    }

    protected int getChip() {
        return chip;
    }
}
