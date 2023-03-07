package StartGame;

import Player.EditPlayer;

import java.util.*;

import static Colour.Colour.*;


public class StartGame {

    Scanner sc = new Scanner(System.in);

    public void startGame(){

        /*
        * we need know the number of players for this game
        *
        * */


        int numPlayers =0;
        System.out.println();
        System.out.println();
        System.out.println(BLUE+"------We are going to start the game og snake and ladder------       " + ANSI_RESET);

        System.out.println();
        System.out.println(YELLOW+"          ---¿How many players are you going to play?---"+ ANSI_RESET);

        System.out.println();
        numPlayers=numberPlayers();
        System.out.println();
        System.out.println();
        System.out.println(BLUE+"The number of players is  " + numPlayers+ ANSI_RESET);


        /*
        * Now, we call to class EditPlayer for edit all players
        * */

        EditPlayer editPlayer =new EditPlayer();

        editPlayer.editPlayer(numPlayers);
    }


    public  int numberPlayers() {

        int numPlayers = 0;
        do {
            try {
                numPlayers = sc.nextInt();
                if (numPlayers <= 1) {
                    System.out.println(RED + "The number of players  have be greater than 1" + ANSI_RESET);
                }

            } catch (InputMismatchException e) {

                System.out.println("The value that you are introduced is not correct");
                sc.nextLine();

            }

        } while (numPlayers <= 1);

        return numPlayers;
    }
}
