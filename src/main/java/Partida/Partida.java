package Partida;

import Colores.Colores;
import Dado.Dado;
import Jugador.Jugador;
import Tablero.EscalerasYSerpientes;

import java.util.Scanner;

public class Partida {

    public static void partida(Jugador[] jugadores){

        Scanner sc= new Scanner(System.in);

        int[] posiciones = new int[jugadores.length];

        boolean ganador= false;

        CheckPartida cP = new CheckPartida();

        System.out.println();
        System.out.println();
        System.out.println(Colores.YELLOW+"   <---Si desean empezar el juego pulse la tecla para empezar-->"+Colores.ANSI_RESET);
        System.out.println();
        sc.nextLine();

        do {

            for (int i = 0; i < jugadores.length; i++) {


                Dado dado = new Dado();

                System.out.println(Colores.BLUE+"     Turno para el jugador " + jugadores[i].getNombre()+Colores.ANSI_RESET);

                int avance = dado.getDado()+1;

                System.out.println();
                System.out.println(Colores.GREEN+"     "+ jugadores[i].getNombre() + " avanza " + avance + " casillas."+Colores.ANSI_RESET);

                posiciones[i] = posiciones[i] + avance;



                if (posiciones[i] > 65) {
                    posiciones[i] = posiciones[i] - avance;
                } else if (posiciones[i] == 65) {
                    ganador = true;
                    System.out.println();
                    System.out.println(Colores.RED+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+Colores.ANSI_RESET);
                    System.out.println(Colores.RED+"---------------- El ganador es : " + jugadores[i].getNombre()+" -------------"+Colores.ANSI_RESET);
                    System.out.println(Colores.RED+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+Colores.ANSI_RESET);
                    break;
                } else {

                    posiciones[i]= cP.checkPartida(posiciones[i]);

                    new TableroPartida();

                    jugadores[i].setTablero(TableroPartida.tableroPartida(jugadores[i], posiciones[i]));




                }
                System.out.println();
                System.out.println();
                System.out.println(Colores.YELLOW+"El jugador " + jugadores[i].getNombre() + " esta en la posicion " + posiciones[i]+Colores.ANSI_RESET);
                sc.nextLine();
            }

        }while(ganador==false);

    }

}
