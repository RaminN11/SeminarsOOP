package Seminar1;

import Seminar1.Shooters.Archers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Peasant extends Pers{
    public Peasant(String name, int x, int y){
        super(name, x, y);
        this.priority = 0;
        this.health = 150;
        this.agility = 20;
        this.strength = 10;
        this.status = true;
        this.level = 1;
        this.stamina = 25;
        this.hit = 15;
    }


    @Override
    public String getInfo() {
        return "Фермер";
    }

//    public void work(int hour) {
//        stamina -= hour / 4;
//    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
    }

}

