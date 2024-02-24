package Seminar1.Healers;

import Seminar1.Pers;

import java.util.List;

public class Monk extends Pers {
    public Monk(String name, Integer x, Integer y){
        super(name, x, y);
        this.level = 1;
        this.health = 100;
        this.agility = 30;
        this.strength = 20;
        this.status = true;
        this.priority = 2;
        this.stamina = 50;
    }

    @Override
    public void death(Pers target) {
        super.death(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    public void healing() {

    }


    @Override
    public void step(List<Pers> targetTeam) {

    }
}
