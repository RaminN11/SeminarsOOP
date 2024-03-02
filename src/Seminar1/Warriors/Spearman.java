package Seminar1.Warriors;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spearman extends Soldier {
    public Spearman(String name, int x, int y){
        super(name, x, y);
        this.priority = 2;
        this.health = 150;
        this.strength = 10;
        this.agility = 20;
        this.stamina = 65;
        this.level = 1;
        this.status = true;
        this.hit = 20;
    }



    @Override
    public String getInfo() {
        return "Копейщик";
    }
}
