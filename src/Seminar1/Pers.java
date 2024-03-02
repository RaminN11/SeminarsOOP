package Seminar1;

import java.util.*;

public abstract class Pers implements Step{
    protected static Random r;
    protected int level;
    protected String name;
    public int maxHealth;

    public int health;
    protected int strength;
    protected int agility;
    protected int stamina;
    protected Boolean status;
    public Position position;
    protected int priority;
    public int hit;


    static{
        Pers.r = new Random();
    }
    public Pers(String name, int x, int y) {
        this.level = 1;
        this.name = name;
        this.maxHealth = this.health = health;
        this.status = true;
        this.position = new Position(x,y);
        this.priority = 0;
        this.hit = hit;
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
        return name + ", \u2665: " + health + ",  ⚔ : " + hit;
    }
    public String getInfo() {
        return "";
    }


    public void Hit(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }
        if (health >= maxHealth) health = maxHealth;

    }

    public void attack(Pers target) {
//        int damage = Pers.r.nextInt(20,40);
//        target.Hit(damage);

    }


    public void getHit(Pers pers1, Pers pers2){
        pers1.health = pers1.health - pers2.hit;
    }

    public Pers nearestEnemy (List<Pers> targets) {
        if (targets.isEmpty()) {
            return null;
        }

        Pers nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Pers hero : targets) {
            double distance = position.getDistanse(hero.position);
            if (distance < minDistance && hero.health > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }

        return nearest;
    }

    public int getPriority(){return priority;}

    public Position getPosition(){return position;}

    public int getHp(){
        return health;
    };
}