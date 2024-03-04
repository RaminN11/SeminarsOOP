package Seminar1;

import Seminar1.Shooters.Archers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Peasant extends Pers{
    int countArrow;
    public boolean flag;
    public Peasant(String name, int x, int y){
        super(name,150,15,0,new Position(x,y));
        this.priority = 0;
        this.health = 150;
        this.agility = 20;
        this.strength = 10;
        this.status = true;
        this.level = 1;
        this.stamina = 25;
        this.hit = 15;
        flag = false;
        countArrow = 10;
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
        if (health <= 0) return;
        flag = false;
    }

    public int getCountArrow() {
        return countArrow;
    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }

}

