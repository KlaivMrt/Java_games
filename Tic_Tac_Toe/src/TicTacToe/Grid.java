package TicTacToe;

public class Grid {
    String[][] grid;



    public Grid(){
        grid = new String[3][3];
    }


    public void resetGrid(){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                this.grid[i][j] = null;
            }
        }
    }

    public void printGrid(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] == null ? "-" : grid[i][j]);
            }
            System.out.println();
        }
    }
}
