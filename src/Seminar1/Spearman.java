package Seminar1;

public class Spearman extends Pers{
    public Spearman(String name, Integer x, Integer y){
        super(1,name,100,60,50,30,true,x,y);
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
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
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

}
