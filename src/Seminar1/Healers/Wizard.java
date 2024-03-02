package Seminar1.Healers;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wizard extends Pers {
    public Wizard(String name, int x, int y) {
        super(name, x, y);
        this.level = 1;
        this.agility = 25;
        this.strength = 20;
        this.health = 150;
        this.priority = 2;
        this.status = true;
        this.stamina = 50;
        this.hit = 0;
    }




    @Override
    public String getInfo() {
        return "Волшебник";
    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {

    }
}
