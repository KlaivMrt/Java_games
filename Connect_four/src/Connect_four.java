import Connect_four_game_Backend.Gameplay;
import Controller.GameListener;
import Connect_four_front_end_CLI.View;

public class Connect_four {
    public static void main(String[] args) {
        GameListener game = new Gameplay();
        View cli = new View(game);
    }

}
