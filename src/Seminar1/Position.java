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


    public double calculateDistance(Position other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
