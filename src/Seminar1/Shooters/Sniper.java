package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Archers {

    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.arrows = 6;
        this.priority = 3;
        this.health = 100;
        this.agility = 30;
        this.strength = 20;
        this.level = 1;
        this.stamina = 30;
        this.status = true;
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
    }
    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Это мой последний выстрел... ");
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
