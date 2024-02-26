package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Position {
    protected int x;
    protected int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Integer> getPosition() {
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){this.x = x;}

    public void setY(int y) {
        this.y = y;
    }

    public double getDistanse (Pers target) {
        double targetDistanse = 0;
        targetDistanse = Math.sqrt((Math.pow(target.position.getX() - this.getX(), 2)) + (Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistanse;
    }


    public Position getDiff (Position targetPos){
        return new Position(x - targetPos.getX(), y - targetPos.getY());
    }


    public boolean equals(Position target) {
        return x == target.getX() && y == target.getY();
    }
}
