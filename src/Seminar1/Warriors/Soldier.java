package Seminar1.Warriors;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.List;

public abstract class Soldier extends Pers {
    public Soldier(String name, int x, int y) {
        super(name, x, y);
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
