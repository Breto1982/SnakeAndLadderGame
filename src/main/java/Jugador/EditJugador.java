package Jugador;

import Colores.Colores;
import Tablero.EditTablero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EditJugador {

    public static void editjugaor(int numJugadores){
        Scanner sc= new Scanner(System.in);
     Jugador[] jugadores = new Jugador[numJugadores];

     for (int i=0;i< numJugadores;i++) {

         Jugador jugador = new Jugador();

         System.out.println();
         System.out.println();

         System.out.println("    ---Introduce el nombre del jugador " +(i+1)+" ----");

             jugador.setNombre(sc.next());

         System.out.println();
         System.out.println();
         System.out.println("    ---Introduce la edad del jugador " +(i+1)+" ----");
    do {
        try {
            jugador.setEdad(sc.nextInt());
            if(jugador.getEdad()<18){
                System.out.println(Colores.RED +"La edad del jugador debe ser mayor de 18 años"+Colores.ANSI_RESET);
            }
        } catch (InputMismatchException e) {
            System.out.println(Colores.RED +"El valor introducido es erroneo"+Colores.ANSI_RESET);
            sc.nextLine();
        }
        }while(jugador.getEdad()<18);

         jugadores[i]=jugador;

     }

     new EditTablero();
     EditTablero.editTablero(jugadores);

    }
}
