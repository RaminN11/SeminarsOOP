package Seminar1;

import java.util.*;

public abstract class Pers implements Step{
    protected static Random r;
    protected int level;
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;
    protected int stamina;
    protected Boolean status;
    public Position position;
    protected int priority;

    static{
        Pers.r = new Random();
    }
    public Pers(String name, int x, int y) {
        this.level = 1;
        this.name = name;
        this.health = 100;
        this.strength = 30;
        this.agility = 20;
        this.stamina = 50;
        this.status = true;
        this.position = new Position(x,y);
        this.priority = 0;
    }

    public String getName(){
        String str = new String(this.name);
        return str;
    }

    public int getStamina(){
        return stamina;
    }

    public Boolean getStatus(){
        return status;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){this.health = health;}

    public String toString() {
        return String.format("Class: %s  Name: %s hp: %s, Position %s", getClass().getSimpleName(), getName(), getHealth(), position.getPosition());
    }
    public String getInfo() {
        String resStr = new String("Name: " + getName() + "   Health: " + getHealth() +"   Position: " + position.getPosition() + "   Status: " + getStatus());
        return resStr;
    }

    public void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    protected void attack(Pers target) {
        int damage = Pers.r.nextInt(10,20);
        target.GetDamage(damage);

    }
    public boolean isDead(){
        if (this.getHealth() <= 0){
            return false;
        }
        return true;
    }
    protected void death(Pers target){
        if (target.getHealth() < 1){
            System.out.println("Ваш персонаж мертв");
        }
    }

    public Pers nearestEnemy (List<Pers> targets) {
        Pers target = null;
        double minDistance = 10;
        for (Pers hero : targets) {
            if (position.getDistanse(hero) < minDistance && hero.isDead()) {
                minDistance = position.getDistanse(hero);
                target = hero;
            }
        }
        return target;
    }

    public int getPriority(){return priority;}

    public Position getPosition(){return position;}

}