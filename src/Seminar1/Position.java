package Seminar1;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public List<Integer> getPosition() {
//        List<Integer> list = new ArrayList<>();
//        list.add(x);
//        list.add(y);
//        return list;
//    }

    @Override
    public String toString(){
        return "Position " + x + "," + y;
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

    public double getDistanse (Position target) {
        double targetDistanse = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return targetDistanse;
    }


    public Position getDiff (Position targetPos){
        return new Position(x - targetPos.getX(), y - targetPos.getY());
    }


    public boolean equals(Position target) {
        return x == target.getX() && y == target.getY();
    }
}
