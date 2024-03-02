package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.List;

public class Crossbowman extends Archers {

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
        this.countArrow=10;
        this.health = 150;
        this.level = 1;
        this.agility = 35;
        this.strength = 15;
        this.priority = 3;
        this.stamina = 45;
        this.status = true;
        this.hit = 20;

    }


    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}
