package Seminar1.Warriors;

import Seminar1.Pers;

import java.util.List;

public class Robber extends Pers {
    public Robber(String name, Integer x, Integer y){
        super(name, x, y);
        this.priority = 2;
        this.health = 100;
        this.agility = 40;
        this.strength = 20;
        this.level = 1;
        this.stamina = 40;
        this.status = true;
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    public void death(Pers target) {
        super.death(target);
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public void step(List<Pers> targetTeam) {

    }
}

