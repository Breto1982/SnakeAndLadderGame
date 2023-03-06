package Board;


import Player.Player;
import Game.Game;

import java.util.Scanner;

import static Colour.Colour.*;

public class EditBoard {

    public static void editBoard(Player[] players) {


        /*
        * We crete a board for a player and show by console
        * */

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < players.length; i++) {


            System.out.println();
            System.out.println();
            System.out.println(BLUE + "    -->The name of players  " + (i + 1) + " is " + players[i].getName() + ANSI_RESET);


            System.out.println();
            System.out.println();
            System.out.println(GREEN + " <---The board of " + players[i].getName() + " is the next--->" + ANSI_RESET);


            LadderAndSnake ladderAndSnake=new LadderAndSnake();

            String [][] board = new String[10][10];
            int actualPosition = 100;

            for (int j = board.length-1; j >=0 ; j--) {

                System.out.println();

                if (j == 0) {
                    System.out.print("     " + players[i].getName().charAt(0) + "-->");
                } else {
                    System.out.print("         ");
                }

                System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "  " + ANSI_RESET);
                if (j % 2 == 0) {

                    actualPosition=(j*10)+1;

                    for (int k = board.length-1; k >= 0; k--) {


                        if(ladderAndSnake.Check(actualPosition)=="") {

                            board[j][k] = String.valueOf(actualPosition);
                        }else{

                            board[j][k]= ladderAndSnake.Check(actualPosition);
                        }

                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + board[j][k] + ANSI_RESET);
                        if(j==0){
                            System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "   " + ANSI_RESET);
                        }else{
                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "  " + ANSI_RESET);}
                        actualPosition++;
                    }
                } else {
                    actualPosition=(j+1)*10;
                    for (int k = 0; k < board.length; k++) {

                        if(ladderAndSnake.Check(actualPosition)=="") {

                            board[j][k] = String.valueOf(actualPosition);
                        }else{

                            board[j][k]= ladderAndSnake.Check(actualPosition);
                        }

                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + board[j][k] + ANSI_RESET);
                        System.out.print(ANSI_CYAN_BACKGROUND +BLACK + "  " + ANSI_RESET);
                        actualPosition--;
                    }
                }
            }



                players[i].setBoard(board);

                System.out.println();

        }
        new Game();
        Game.game(players);
    }
}