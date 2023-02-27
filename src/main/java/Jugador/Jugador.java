package Jugador;

import java.lang.reflect.Array;

public class Jugador {

    private String nombre;
    private int edad;
    private String[][] tablero;

    public Jugador(String nombre, int edad, String[][] tablero) {
        this.nombre = nombre;
        this.edad = edad;
        this.tablero=tablero;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
