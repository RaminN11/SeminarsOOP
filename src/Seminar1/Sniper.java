package Seminar1;

public class Sniper extends Pers{
    public Sniper(String name, Integer x, Integer y) {
        super(1,name,100,50,25,40,true,x,y);
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
