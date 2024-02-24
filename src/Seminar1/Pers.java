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
    protected Position position;
    protected int priority;

    static{
        Pers.r = new Random();
    }
    public Pers(String name, Integer x, Integer y) {
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


    protected String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s", this.name, this.health, this.getClass().getSimpleName());
    }

    protected void print() {
        System.out.println("Level:  " + level + "Name: " + name + "Health: " + health + "Stamina" + stamina);

    }

    protected void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    protected void attack(Pers target) {
        int damage = Pers.r.nextInt(1,5);
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
        Queue<Pers> target = new LinkedList<>();
        double minDistance = 10;
        for (Pers hero : targets) {
            if (position.getDistanse(hero) < minDistance) {
                minDistance = position.getDistanse(hero);
                target.add(hero);
            }
        }
        return target.peek();
    }

    public int getPriority(){return priority;}

    public Position getPosition(){return position;}

}