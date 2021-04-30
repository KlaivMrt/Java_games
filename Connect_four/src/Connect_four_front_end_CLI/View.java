package Connect_four_front_end_CLI;
import Controller.GameListener;

public class View {
    private GameListener gameListener;

    public View(GameListener game){

        gameListener = game;
        gameListener.setGrid();
        gameListener.setPlayersName();
        gameListener.setPlayersChip();
        gameListener.gamePlay();

    }
}
