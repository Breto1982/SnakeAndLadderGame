package Game;

import Colour.Colour;
import Player.Player;


public class BoardGame {

    public static String[][] GameBoard(Player player, int position) {


        int actualPosition=100;
        String[][] playerBoard = player.getBoard();


        for (int j = playerBoard.length-1; j >=0 ; j--) {
            System.out.println();
            System.out.print("    ");
            System.out.print(Colour.ANSI_CYAN_BACKGROUND+ Colour.BLACK+"  "+ Colour.ANSI_RESET);

            if (j % 2 == 0) {
                actualPosition=(j*10)+1;
                for (int k = playerBoard.length - 1; k >= 0; k--) {

                    if ( actualPosition == position) {
                        System.out.print( Colour.RED+ player.getName().charAt(0)+" "+ Colour.ANSI_RESET);
                    }else{
                        System.out.print(Colour.ANSI_CYAN_BACKGROUND + Colour.BLACK + playerBoard[j][k] + Colour.ANSI_RESET);
                    }
                    if(j==0){
                        System.out.print(Colour.ANSI_CYAN_BACKGROUND + Colour.BLACK + "   " + Colour.ANSI_RESET);
                    }else{
                        System.out.print(Colour.ANSI_CYAN_BACKGROUND + Colour.BLACK + "  " + Colour.ANSI_RESET);}
                    actualPosition++;
                }
            }else{
                actualPosition=(j+1)*10;
                for (int k = 0; k< playerBoard.length ; k++) {

                    if ( actualPosition == position) {
                        System.out.print( Colour.RED+ player.getName().charAt(0)+" "+ Colour.ANSI_RESET);
                    }else{
                        System.out.print(Colour.ANSI_CYAN_BACKGROUND + Colour.BLACK + playerBoard[j][k] + Colour.ANSI_RESET);
                    }
                    System.out.print(Colour.ANSI_CYAN_BACKGROUND + Colour.BLACK + "  " + Colour.ANSI_RESET);
                    actualPosition--;
                }


            }
        }

        return playerBoard;
    }



}




