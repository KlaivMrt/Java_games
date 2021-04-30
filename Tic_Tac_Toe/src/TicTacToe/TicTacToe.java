package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.getInfo("Player 1");
        p2.getInfo("Player 2");

        Scanner replay;

        while(true){
            ConsoleGame play = new ConsoleGame();

            Grid grid = new Grid();

            play.play(p1, p2);
            System.out.println("|         SCORE:         " +
                                "\n|------------------------"+
                                "\n|" + p1.name + ":" + p1.score+
                                "\n|------------------------"+
                                "\n|" + p2.name + ":" + p2.score);

            replay = new Scanner(System.in);
            System.out.print("Play again? (y/n) >>> ");
            String r = replay.next();
            if (r == "y"){
                grid.resetGrid();
            }else {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
};
