package Jugador;

import java.util.Arrays;

public class Player {

    private String name;
    private int age;
    private String[][] board;

    public Player(String name, int age, String[][] board) {
        this.name = name;
        this.age = age;
        this.board = board;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
