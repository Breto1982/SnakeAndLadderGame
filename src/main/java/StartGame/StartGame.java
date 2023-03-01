package StartGame;

import Colour.Colour;
import Player.EditPlayer;

import java.util.*;


public class StartGame {

    public static void startGame(){

        /*
        * we need know the number of players for this game
        *
        * */

        Scanner sc= new Scanner(System.in);
        int numPlayers =0;
        System.out.println();
        System.out.println();
        System.out.println(Colour.BLUE+"------We are goingt to start the game og snake and ladder------       " + Colour.ANSI_RESET);

        System.out.println();
        System.out.println(Colour.YELLOW+"          ---¿How many players are you going to play?---"+ Colour.ANSI_RESET);

        System.out.println();
        do {
            try {
                numPlayers = sc.nextInt();
                if (numPlayers<=1){
                    System.out.println(Colour.RED+"The number of players  have be greater than 1"+ Colour.ANSI_RESET);
                }

            } catch (InputMismatchException e) {

                System.out.println("The value that you are introduced is not correct");
                sc.nextLine();

            }

        }while(numPlayers<=1);
        System.out.println();
        System.out.println();
        System.out.println(Colour.BLUE+"The number of players is  " + numPlayers+ Colour.ANSI_RESET);


        /*
        * Now, we call to class EditPlayer for edit all players
        * */

        new EditPlayer();

        EditPlayer.editPlayer(numPlayers);
    }


}
