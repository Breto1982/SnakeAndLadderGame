package Dado;

import java.util.Random;

public class Dado {

    Random rd = new Random();

    int dado ;

    public Dado() {
    }

    public Dado(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return rd.nextInt(6);
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
}
