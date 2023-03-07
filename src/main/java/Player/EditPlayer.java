package Player;

import Colour.Colour;
import Board.EditBoard;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Colour.Colour.ANSI_RESET;
import static Colour.Colour.RED;

public class EditPlayer {

    Scanner sc= new Scanner(System.in);

    public  void editPlayer(int numPlayers){

        /*
        * we create an Array of players, and we introduce the name and the age by console
        * */


     Player[] players = new Player[numPlayers];

     for (int i=0;i< numPlayers;i++) {

         Player player = new Player();

         System.out.println();
         System.out.println();

         System.out.println("    ---You must introduce the name of player " +(i+1)+" ----");

             player.setName(sc.next());

         System.out.println();
         System.out.println();
         System.out.println("    ---You must introduce the age of player " +(i+1)+" ----");


         /*
         * check the age of player and if the value introduced is correct
         *
         * */
    do {
        try {
            player.setAge(sc.nextInt());
            if(player.getAge()<18){
                System.out.println(RED +"The age of player has to be greater than 18"+ ANSI_RESET);
            }
        } catch (InputMismatchException e) {
            System.out.println(RED +"The value introduced is not correct"+ ANSI_RESET);
            sc.nextLine();
        }
        }while(player.getAge()<18);

         players[i]= player;

     }
     /*
     * we call to class edittablero, and we pass the list of players
     *
     * */

     EditBoard editBoard=new EditBoard();
     editBoard.editBoard(players);

    }
}
