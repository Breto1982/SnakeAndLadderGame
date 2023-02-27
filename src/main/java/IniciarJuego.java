import Colores.Colores;
import Jugador.EditJugador;

import java.util.InputMismatchException;
import java.util.Scanner;




public class IniciarJuego {

    public static void iniJuego(){



        Scanner sc= new Scanner(System.in);
        int numJugadores =0;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Colores.BLUE+"------Vamos a comenzar el juego de la Serpiente y la Escalera------       " + Colores.ANSI_RESET);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Colores.YELLOW+"          ---Cuantos jugadores vais a  jugar---"+ Colores.ANSI_RESET);

        System.out.println();
        do {
            try {

                numJugadores = sc.nextInt();
                if (numJugadores<=1){
                    System.out.println(Colores.RED+"El numero de jugadores debe ser mayor que 1"+Colores.ANSI_RESET);
                }

            } catch (InputMismatchException e) {

                System.out.println("No has introducido un valor aceptado por el programa");
                sc.nextLine();

            }

        }while(numJugadores<=1);
        System.out.println();
        System.out.println();
        System.out.println(Colores.BLUE+"El numero de jugadores es de " + numJugadores+Colores.ANSI_RESET);


        new EditJugador();

        EditJugador.editjugaor(numJugadores);
    }
}
