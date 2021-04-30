package Connect_four_game_Backend;

public class Checks {

    static int check(int chip, int[][] g){

//      checks rows
        for (int i = 0; i < g.length; i++){
            int row = 0;
            for (int j = 0; j < g[i].length; j++){
                if (g[i][j] == chip){
                    row++;
                }
                else if (g[i][j] != chip){
                    row = 0;
                }
            }
            if (row == 4){
                return chip;
            }
            else {
                row = 0;
            }
        }

//      checks columns
        int y = 0;
        int col = 0;

        while (y < g[0].length) {
            for (int x = 0; x < g.length && y < g[x].length; x++) {
                if (g[x][y] == chip) {
                    col++;
                } else if (g[x][y] != chip) {
                    col = 0;
                }
            }

            if (col == 4) {
                return chip;
            }
            col = 0;
            y++;
        }


//      down-left diagonals
        int c1 = 0;
        int s = 0;
        int bk = g.length - 4;

        while (bk > -1){
            for (int k = bk; k < g.length; k++, s++){

                if (g[k][s] == chip){
                    c1++;
                }
                else if (g[k][s] != chip){
                    c1 = 0;
                }
            }

            if (c1 == 4) {
                return chip;
            }

            c1 = 0;
            s = 0;
            bk--;
        }

//      upper-right diagonals
        int c2 = 0;
        int bl = 1;
        int l = bl;
        int limit = g.length;

        while (limit > g.length - 3){
            for (int m = 0; m < limit; m++, l++){
                if (g[m][l] == chip){
                    c2++;
                }
                else if (g[m][l] != chip) {
                    c2 = 0;
                }
            }

            if (c2 == 4){
                return chip;
            }

            c2 = 0;
            bl++;
            l = bl;
            limit--;
        }

//      upper-left diagonals
        int c3 = 0;
        int bt = g.length - 1;
        int d = 0;
        while (bt > 2){
            for (int t = bt; t > -1; t--, d++){
                if (g[t][d] == chip){
                    c3++;
                }
                else if (g[t][d] != chip){
                    c3 = 0;
                }
            }
            if (c3 == 4){
                return chip;
            }
            bt--;
            d = 0;
        }


//      down-right diagonals
        int c4 = 0;
        int bv = 0;
        int bh = g[0].length - 1;
        int h = bh;

        while (bv < 3){
            for (int v = bv; v < g.length; v++, h--){
                if (g[v][h] == chip){
                    c4++;
                }
                else if(g[v][h] != chip) {
                    c4 = 0;
                }
            }
            if (c4 == 4){
                return chip;
            }
            bv++;
            h = bh;
            c4 = 0;
        }

        return 2;
    }

}
