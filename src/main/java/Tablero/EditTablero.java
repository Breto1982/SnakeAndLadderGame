package Tablero;

import Colores.Colores;
import Jugador.Jugador;
import Partida.Partida;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EditTablero {

    public static void editTablero(Jugador[] jugadores){

        Scanner sc= new Scanner(System.in);


        for(int i=0;i<jugadores.length;i++){


            System.out.println();
            System.out.println();
            System.out.println(Colores.BLUE+"    -->El nombre del jugador " +(i+1 )+ " es "+jugadores[i].getNombre()+Colores.ANSI_RESET);


            System.out.println();
            System.out.println();
            System.out.println(Colores.GREEN+" <---El tablero de "+jugadores[i].getNombre()+" es el siguiente--->"+Colores.ANSI_RESET);




            new EscalerasYSerpientes();

            String [][] tablero = new String [8][8];

                for (int j=0;j< tablero.length;j++){

                    System.out.println();
                    System.out.print("         ");
                    System.out.print(Colores.ANSI_CYAN_BACKGROUND+Colores.BLACK+"  "+Colores.ANSI_RESET);
                    if(j%2==0){

                        for(int k=tablero.length-1;k>=0;k--) {

                            tablero[j][k] = EscalerasYSerpientes.Check(j, k);

                            System.out.print(Colores.ANSI_CYAN_BACKGROUND+Colores.BLACK+tablero[j][k]+Colores.ANSI_RESET);

                        }

                    }else{

                    for(int k=0;k<tablero.length;k++) {

                        tablero[j][k] = EscalerasYSerpientes.Check(j, k);

                        System.out.print(Colores.ANSI_CYAN_BACKGROUND+Colores.BLACK+tablero[j][k]+Colores.ANSI_RESET);

                    }
                    }
                }
                jugadores[i].setTablero(tablero);

            System.out.println();

        }

        new Partida();
        Partida.partida(jugadores);

    }
}
