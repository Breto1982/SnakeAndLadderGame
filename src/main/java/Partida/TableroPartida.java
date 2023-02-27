package Partida;

import Colores.Colores;
import Jugador.Jugador;
import Tablero.EscalerasYSerpientes;

import java.util.Arrays;


public class TableroPartida {

    public static String[][] tableroPartida(Jugador jugador, int posicion) {


        int poscionActual=0;

        String[][] jugadorTablero = jugador.getTablero();

        for (int j = 0; j < jugadorTablero.length; j++) {



            if(j%2!=0){

                for (int k = jugadorTablero.length-1; k >=0; k--) {
                    poscionActual++;
                    if (65 - poscionActual == posicion) {
                        jugadorTablero[j][k]=Colores.RED+jugador.getNombre().charAt(0)+"  "+Colores.ANSI_RESET;
                    }else{
                        jugadorTablero[j][k]=EscalerasYSerpientes.Check(j, k);;
                    }
                }

            }else {
                for (int k = 0; k < jugadorTablero.length; k++) {
                    poscionActual++;

                    if (65 - poscionActual == posicion) {
                        jugadorTablero[j][k]=Colores.RED+jugador.getNombre().charAt(0)+"  "+Colores.ANSI_RESET;
                    }else{
                        jugadorTablero[j][k]=EscalerasYSerpientes.Check(j, k);;
                    }

                }


            }
        }
        for (int j = 0; j < jugadorTablero.length; j++) {
            System.out.println();
            System.out.print("    ");
            System.out.print(Colores.ANSI_CYAN_BACKGROUND+Colores.BLACK+"  "+Colores.ANSI_RESET);
            for (int k = 0; k < jugadorTablero.length; k++) {

                System.out.print(Colores.ANSI_CYAN_BACKGROUND+Colores.BLACK+jugadorTablero[j][k]+Colores.ANSI_RESET);
            }

        }


        return jugadorTablero;
    }



}




