package Connect_four_game_Backend;

public class Board {

    private final int[][] grid;

    protected Board(){
        grid = new int[6][7];

    }

    protected void setGrid(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                grid[i][j] = -1;
            }
        }
    }

    protected int[][] getGrid(){
        return grid;
    }

    protected void resetGrid(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                grid[i][j] = -1;
            }
        }
    }

    protected void displayGrid(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] == -1 ? "-  " : grid[i][j] == 0 ? "B  " : grid[i][j] == 1 ? "R  " : "-  " );
            }
            System.out.println();
        }
    }



}
