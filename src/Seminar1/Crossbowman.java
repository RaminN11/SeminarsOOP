package Seminar1;

public class Crossbowman extends Pers{
    int amountOfBowns;
    int accuracy;


    protected Crossbowman(int id, String name, int health, int stamina, String weapon, int amountOfBowns, int accuracy) {
        super(id, name, health, stamina, weapon);
        this.amountOfBowns = amountOfBowns;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

    @Override
    protected void print() {
        super.print();
    }
}
