package Game;

import Colour.*;
import Dice.Dice;
import Player.Player;

import java.util.Locale;
import java.util.Scanner;

import static Colour.Colour.*;


public class Game {

    public  void game(Player[] players){

        Scanner sc= new Scanner(System.in);

        int[] positions = new int[players.length];

        boolean winner= false;

        CheckGame cP = new CheckGame();

        System.out.println();
        System.out.println();
        System.out.println(YELLOW+"   <---If you want to start game you must pulse intro-->"+ ANSI_RESET);
        System.out.println();
        sc.nextLine();

        do {

            for (int i = 0; i < players.length; i++) {


                Dice dice = new Dice();

                System.out.println(BLUE+"     Sift for player " + players[i].getName()+ ANSI_RESET);

                int avance = dice.getDice()+1;

                System.out.println();
                System.out.println(GREEN+"     "+ players[i].getName() + " keep it up " + avance + " boxes."+ ANSI_RESET);

                positions[i] = positions[i] + avance;



                if (positions[i] > 100) {

                    positions[i] = positions[i] - avance;
                    players[i].setBoard(BoardGame.GameBoard(players[i], positions[i]));

                } else if (positions[i] == 100) {
                    winner = true;
                    System.out.println();
                    System.out.println(RED+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+ ANSI_RESET);
                    System.out.println(RED+"---------------- TEH WINNER IS : " + players[i].getName().toUpperCase(Locale.ROOT)+" ----------------------"+ ANSI_RESET);
                    System.out.println(RED+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+ ANSI_RESET);
                    break;
                } else {

                    positions[i]= cP.checkGame(positions[i]);

                    new BoardGame();

                    players[i].setBoard(BoardGame.GameBoard(players[i], positions[i]));




                }
                System.out.println();
                System.out.println();
                System.out.println(YELLOW+"The player " + players[i].getName() + " is in position " + positions[i]+ ANSI_RESET);
                sc.nextLine();
            }

        }while(winner==false);

    }

}
