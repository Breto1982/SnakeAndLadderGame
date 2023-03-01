package Dice;

import java.util.Random;

public class Dice {

    Random rd = new Random();

    int dice ;

    public Dice() {
    }

    public Dice(int dice) {
        this.dice = dice;
    }

    public int getDice() {
        return rd.nextInt(6);
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}
