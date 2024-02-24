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

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }


    public Double getDistanse (Pers target) {
        double targetDistanse = 0;
        targetDistanse = Math.sqrt((Math.pow(target.position.getX() - this.getX(), 2)) + (Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistanse;
    }
}
