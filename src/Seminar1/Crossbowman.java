package Seminar1;

public class Crossbowman extends Pers{

    public Crossbowman(String name, Integer x, Integer y){
        super(1,name,100,50,30,20,true,x,y);
    }

    @Override
    protected void death(Pers target) {
        super.death(target);
    }

    @Override
    protected void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    protected void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s, Name: %s, ", this.getClass().getSimpleName(),getName());
    }

    @Override
    protected void print() {
        super.print();
    }
}
