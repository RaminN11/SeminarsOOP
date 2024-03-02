package Seminar1.Warriors;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.List;

public class Robber extends Soldier {

    public Robber(String name, int x, int y){
        super(name, x, y);
        this.priority = 2;
        this.health = 150;
        this.agility = 40;
        this.strength = 20;
        this.level = 1;
        this.stamina = 40;
        this.status = true;
        this.hit = 10;
    }


//
//    @Override
//    public void attack(Pers target) {
//        super.attack(target);
//    }


    @Override
    public String getInfo() {
        return "Разбойник";
    }
}

