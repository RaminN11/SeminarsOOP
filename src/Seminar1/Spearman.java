package Seminar1;

public class Spearman extends Pers{
    int strength;
    int protection;

    protected Spearman(int id, String name, int health, int stamina, String weapon, int strength, int protection) {
        super(id, name, health, stamina, weapon);
        this.strength = strength;
        this.protection = protection;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ", getClass(), name);
    }

}
