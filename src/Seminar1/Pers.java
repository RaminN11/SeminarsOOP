package Seminar1;

import java.util.Random;

public abstract class Pers {
    protected static Random r;
    protected int level;
    protected String name;
    protected int health;
    protected int strength;
    protected int agility;
    protected int stamina;
    protected Boolean status;
    protected Position position;

    static{
        Pers.r = new Random();
    }
    public Pers(int level, String name, int health, int stamina,int strength,int agility, Boolean status,  Integer x, Integer y) {
        this.level = 1;
        this.name = name;
        this.health = 100;
        this.strength = 30;
        this.agility = 20;
        this.stamina = 50;
        this.status = true;
        this.position = new Position(x,y);
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


    protected void death(Pers target){
        if (target.getHealth() <= 0){
            System.out.println("Ваш персонаж мертв");
        }
    }

}