import Colour.Colour;
import IniciarJuego.StartGame;

public class Main {

    public static void main(String[] args) {

        /*
        * Print by console a little description about this game
        * */
        System.out.println(Colour.GREEN+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("----------------------GAME OF LADDERS AND SNAKES-----------------------");
        System.out.println("___All of players have a board and this board will print on console____");
        System.out.println("_________The ladders will be shown by # and the snakkers by g__________"+ Colour.ANSI_RESET);


        new StartGame();
        StartGame.startGame();

    }

}
