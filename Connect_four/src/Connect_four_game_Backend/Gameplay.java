package Connect_four_game_Backend;

import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.GameListener;

public class Gameplay implements  GameListener{
    Board grid;
    Player player1;
    Player player2;
    Player currentPlayer;

    public Gameplay(){
        grid = new Board();
//        grid.setGrid();
//        this.Play();

    }

    @Override
    public void setGrid() {

        grid.setGrid();
    }



    @Override
    public void setPlayersName() {

        this.setNames();

    }


    private void setNames(){
        player1 = new Player();
        player2 = new Player();

        Scanner n1 = new Scanner(System.in);
        System.out.print("Player 1 type your name:  ");
        player1.setName(n1.next());

        Scanner n2 = new Scanner(System.in);
        System.out.print("Player 2 type your name:  ");
        player2.setName(n2.next());

    }

    @Override
    public void setPlayersChip() {
        int[] data = new int[2];

        this.setChips();

        data[0] = player1.getChip();
        data[1] = player2.getChip();
    }

    private void setChips(){
        Scanner ch1;
        boolean redo = true;

        while (redo) {
            ch1 = new Scanner(System.in);
            System.out.print(player1.getName() + " choose your chip: ");

            String choice = ch1.next();
            if (choice.equals("red") || choice.equals("Red") || choice.equals("r") || choice.equals("R")) {
                player1.setChip(1);
                System.out.println(player2.getName() + ", your chip is blue(B)");
                System.out.println();
                player2.setChip(0);
                redo = false;
            } else if (choice.equals("blue") || choice.equals("Blue") || choice.equals("b") || choice.equals("B")) {
                player1.setChip(0);
                System.out.println(player2.getName() + ", your chip is red(R)");
                System.out.println();
                player2.setChip(1);
                redo = false;
            }
            else {
                System.out.println("Place a valid chip");
            }

        }
    }

    private void fillTheBoard(Player currentP, int[][] g){
        boolean redo = true;
        Scanner col;

        while (redo) {
            int c;

            try {
                col = new Scanner(System.in);
                System.out.print(currentP.getName() + ", choose column: ");
                c = col.nextInt() - 1;
                redo = false;

                int i;
                for (i = 0; i < g.length; i++){

                    if (g[i][c] != -1){
                        g[i-1][c] = currentP.getChip();
                        break;

                    }else if (g[i][c] == -1 && i == g.length - 1){
                        g[i][c] = currentP.getChip();
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Type a number.");
                redo = true;
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of bounds.");
                redo = true;
            }
        }
    }

    @Override
    public void gamePlay() {
        String winner;

        boolean replay = true;
        currentPlayer = player1;
        while (replay) {
            winner = this.Play();
            grid.displayGrid();
            System.out.println();
            if (winner == currentPlayer.getName()) {
                System.out.println(currentPlayer.getName() + " is the winner");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }
    }

    private String Play(){
//        this.setNames();
//        this.setChips();


//        grid.displayGrid();
//        System.out.println();


        this.fillTheBoard(currentPlayer, grid.getGrid());
        int winner = Checks.check(currentPlayer.getChip(), grid.getGrid());
        if (winner == currentPlayer.getChip()) {
            currentPlayer.incrementScore();
            return currentPlayer.getName();
        }



        return null;
    }


}
