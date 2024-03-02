package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Archers {

    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.countArrow = 10;
        this.priority = 3;
        this.health = 150;
        this.agility = 30;
        this.strength = 20;
        this.level = 1;
        this.stamina = 30;
        this.status = true;
        this.hit = 15;
    }





    @Override
    public String getInfo() {
        return "Снайпер";
    }
}
