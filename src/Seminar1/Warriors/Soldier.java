package Seminar1.Warriors;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Soldier extends Pers {
    public Soldier(String name, int x, int y) {
        super(name, x, y);
    }


    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (health<=0) return;
        Pers target = super.nearestEnemy(targetTeam);
        if (target==null) return;
        if (position.getDistanse(target.position) < 2){
            target.Hit(this.hit);
            return;
        }
        Position diff = position.getDiff(target.position);
        if (Math.abs(diff.x) > Math.abs(diff.y)){
            this.position.x += diff.x < 0? 1: -1;
        } else {
            this.position.y += diff.y < 0? 1: -1;
        }


    }

}
