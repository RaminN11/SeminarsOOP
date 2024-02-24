package Seminar1.Warriors;

import Seminar1.Pers;

import java.util.ArrayList;
import java.util.List;

public class Spearman extends Pers {
    public Spearman(String name, Integer x, Integer y){
        super(name, x, y);
        this.priority = 2;
        this.health = 100;
        this.strength = 10;
        this.agility = 20;
        this.stamina = 65;
        this.level = 1;
        this.status = true;
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
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
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    public void step(List<Pers> targetTeam) {

    }

}
