package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.List;

public class Crossbowman extends Archers {

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
        this.arrows=6;
        this.health = 100;
        this.level = 1;
        this.agility = 35;
        this.strength = 15;
        this.priority = 3;
        this.stamina = 45;
        this.status = true;

    }

    @Override
    protected void death(Pers target) {
        super.death(target);
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    protected void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
