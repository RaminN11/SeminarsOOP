package Seminar1.Shooters;

import Seminar1.Peasant;
import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Archers extends Pers {
    protected Integer countArrow;

    public Archers(String name, int x, int y) {
        super(name,150,20,3,new Position(x,y));
    }

    public Integer getArrows() {
        return countArrow;
    }

    public void setArrows(int arrows) {
        this.countArrow = countArrow;
    }


    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }

    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if ((health <= 0) || (countArrow == 0)) return;
        Pers target = super.nearestEnemy(targetTeam);
        if (target==null) return;
        target.Hit(this.hit);

        for (Pers unit : friends) {
            if (unit.getInfo().equals("Фермер") && !((Peasant) unit).flag) {
                ((Peasant) unit).flag = true;
                return;
            }

        }
        countArrow--;
    }




}
