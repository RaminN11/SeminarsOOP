package Seminar1;

public class Robber extends Pers {
    public Robber(String name, Integer x, Integer y){
        super(1,name,100,30,20,30,true,x,y);
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    public void death(Pers target) {
        super.death(target);
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }
}

