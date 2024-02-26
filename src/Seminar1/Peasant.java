package Seminar1;

import java.util.List;
import java.util.Scanner;

public class Peasant extends Pers {
    public Peasant(String name, int x, int y){
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
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    protected void death(Pers target) {
        super.death(target);
    }

    @Override
    public String toString() {
        return super.toString();
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
    public void step(List<Pers> targetTeam, List<Pers> friends) {
        if(!isDead()) return;
        Pers unit = nearestEnemy(targetTeam);
        if(position.getDistanse(unit) < 2){
            attack(unit);
            return;
        }

        Position diff = this.position.getDiff(unit.position);
        Position currentPos = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) > Math.abs(diff.getY())){
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
            System.out.println(toString());
        } else position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        System.out.println(toString());

        friends.forEach(n -> {
            if ( n.position.equals(position)){
                this.position = currentPos;
            }
        });

    }

}

