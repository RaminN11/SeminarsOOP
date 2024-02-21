package Seminar1;

public class Peasant extends Pers {
    public Peasant(String name, Integer x, Integer y){
        super(1,name,100,50,20,40,true,x,y);
    }

    @Override
    protected void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    protected void death(Pers target) {
        super.death(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
    }

    @Override
    protected void attack(Pers target) {
        int damage = Pers.r.nextInt(1, 5) * strength * agility;
        target.GetDamage(damage);

    }

    public void work(int hour) {
        stamina -= hour / 4;
    }

}
