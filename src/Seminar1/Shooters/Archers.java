package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.List;

public abstract class Archers extends Pers {
    protected Integer arrows;

    public Archers(String name, int x, int y) {
        super(name, x, y);
    }

    public Integer getArrows(){
        return arrows;
    }

    public void setArrows(Integer arrows){
        this.arrows = arrows;
    }
    public void attac(Pers target){
        int damage = r.nextInt(5, 15);
        this.arrows--;
        target.GetDamage(damage);
    }
    public void step(List<Pers> list, List<Pers> friends) {


        if (!isDead() || getArrows() <= 0) return;
        attac(nearestEnemy(list));
        System.out.println(toString());

    }

}
