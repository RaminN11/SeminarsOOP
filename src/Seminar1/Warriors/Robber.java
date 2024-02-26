package Seminar1.Warriors;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.List;

public class Robber extends Pers {

    public Robber(String name, int x, int y){
        super(name, x, y);
        this.priority = 2;
        this.health = 100;
        this.agility = 40;
        this.strength = 20;
        this.level = 1;
        this.stamina = 40;
        this.status = true;
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
        return super.toString();
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

