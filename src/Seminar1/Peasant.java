package Seminar1;

import java.util.List;

public class Peasant extends Pers {
    public Peasant(String name, Integer x, Integer y){
        super(name, x, y);
        this.priority = 0;
        this.health = 100;
        this.agility = 20;
        this.strength = 10;
        this.status = true;
        this.level = 1;
        this.stamina = 25;
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

    @Override
    public void step(List<Pers> targetTeam) {

    }

}
