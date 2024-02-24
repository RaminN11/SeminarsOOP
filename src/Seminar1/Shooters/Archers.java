package Seminar1.Shooters;

import Seminar1.Pers;

public abstract class Archers extends Pers {
    public Integer arrows;

    public Archers(String name, Integer x, Integer y) {
        super(name, x, y);
    }

    public Integer getArrows(){
        return arrows;
    }

    public void setArrows(Integer arrows){
        this.arrows = arrows;
    }

}
