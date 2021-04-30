package TicTacToe;

import java.util.Scanner;

public class ConsoleGame {
    Grid board;

    public ConsoleGame() {
        board = new Grid();
//        gameOn();
    }

    public boolean gameOn() {
//        boolean repeat = true;

        for (int i = 0; i < board.grid.length; i++) {
            for (int j = 0; j < board.grid[i].length; j++) {
                if(board.grid[i][j] == null){
                    return true;
                }
            }
        }
        return false;

    }

    public String check(){
        String tie = "tie";
        for(int i = 0; i < board.grid.length; i++){
            if (board.grid[i][0] != null && board.grid[i][0].equals(board.grid[i][1]) && board.grid[i][0].equals(board.grid[i][2])){
                return board.grid[i][0];
            }
            if (board.grid[0][i] != null && board.grid[0][i].equals(board.grid[1][i]) && board.grid[0][i].equals(board.grid[2][i])){
                return board.grid[0][i];
            }
        }if (board.grid[0][0] != null && board.grid[0][0].equals(board.grid[1][1]) && board.grid[0][0].equals(board.grid[2][2])){
            return board.grid[0][0];
        }if (board.grid[0][2] != null && board.grid[0][2].equals(board.grid[1][1]) && board.grid[0][2].equals(board.grid[2][0]) ){
            return board.grid[0][2];
        }
        return "tie";
    }

    public int getValue(){
        while (true){
            try {
                Scanner number = new Scanner(System.in);
                System.out.print(">> >> >>");
                int num = number.nextInt();
                if (num > 0 && num < 4) {
                    return num;
                } else {
                    System.out.println("Input out of range.");
                }
            }
            catch (Exception e){
                System.out.println("Please input an integer(1-3)");

            }
        }
    }

    public void play(Player p1, Player p2){
        p1.symbol = "X";
        p2.symbol = "O";
        Player current_p;
        current_p = p1;

        while (gameOn()){
            System.out.println("It's "+current_p.name+" 's turn");
            boolean retry = true;
            board.printGrid();

            while (retry){
                System.out.print("Choose your row ");
                int row = getValue();
                System.out.print("Choose your column ");
                int col = getValue();

                if(board.grid[row - 1][col - 1] == null){
                    board.grid[row - 1][col - 1] = current_p.symbol;
                    retry = false;
                    if(current_p == p2){
                        current_p = p1;
                    }else {
                        current_p = p2;
                    }
                }else{
                    System.out.println("You can't place you're symbol here. Please try again!");
                }
            }
            if (check().equals(p1.symbol)){
                System.out.println(p1.name+" is the winner!");
                p1.score += 1;
                break;
            }
            else if (check().equals(p2.symbol)){
                System.out.println(p2.name+" is the winner!");
                p2.score += 1;
                break;

            }

        }

    }
}