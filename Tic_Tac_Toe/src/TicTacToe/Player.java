package TicTacToe;

import java.util.Scanner;

public class Player {
    String name;
    String symbol;
    byte score;

    public Player(){
        name = null;
        symbol = null;
        score = 0;
    }

    public void getInfo(String p){
        Scanner username = new Scanner(System.in);
        System.out.print(p + " enter your name: ");
        this.name = username.next();
    }

    public void getInfo2(){
        this.name = System.console().readLine();
        System.out.println("Enter your name: " + this.name);
    }
}
