package Game;


import Player.Player;

import static Colour.Colour.*;


public class BoardGame {

    public static String[][] GameBoard(Player player, int position) {


        int actualPosition=100;
        String[][] playerBoard = player.getBoard();


        for (int j = playerBoard.length-1; j >=0 ; j--) {
            System.out.println();
            System.out.print("    ");
            System.out.print(ANSI_CYAN_BACKGROUND+ BLACK+"  "+ ANSI_RESET);

            if (j % 2 == 0) {
                actualPosition=(j*10)+1;
                for (int k = playerBoard.length - 1; k >= 0; k--) {

                    if ( actualPosition == position) {
                        System.out.print( RED+ player.getName().charAt(0)+" "+ ANSI_RESET);
                    }else{
                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + playerBoard[j][k] + ANSI_RESET);
                    }
                    if(j==0){
                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "   " + ANSI_RESET);
                    }else{
                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "  " + ANSI_RESET);}
                    actualPosition++;
                }
            }else{
                actualPosition=(j+1)*10;
                for (int k = 0; k< playerBoard.length ; k++) {

                    if ( actualPosition == position) {
                        System.out.print( RED+ player.getName().charAt(0)+" "+ ANSI_RESET);
                    }else{
                        System.out.print(ANSI_CYAN_BACKGROUND + BLACK + playerBoard[j][k] + ANSI_RESET);
                    }
                    System.out.print(ANSI_CYAN_BACKGROUND + BLACK + "  " + ANSI_RESET);
                    actualPosition--;
                }


            }
        }

        return playerBoard;
    }



}




