package Seminar1.Healers;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;
import java.util.List;

public class Monk extends Magic {

    public Monk(String name, Integer x, Integer y){
        super(name, x, y);
        this.level = 1;
        this.health = 150;
        this.agility = 30;
        this.strength = 20;
        this.status = true;
        this.priority = 2;
        this.stamina = 50;
        this.hit = 0;

    }


    public void healing() {

    }

    @Override
    public String getInfo() {
        return "Монах";
    }

    }


    

