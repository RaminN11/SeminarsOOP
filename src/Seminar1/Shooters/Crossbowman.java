package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.List;

public class Crossbowman extends Archers {

    public Crossbowman(String name, Integer x, Integer y){
        super(name, x, y);
        this.arrows=6;
        this.health = 100;
        this.level = 1;
        this.agility = 35;
        this.strength = 15;
        this.priority = 3;
        this.stamina = 45;
        this.status = true;

    }

    @Override
    protected void death(Pers target) {
        super.death(target);
    }

    @Override
    protected void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    protected void attack(Pers target) {
        super.attack(target);
    }

    @Override
    public String toString() {
        return String.format("Class: %s, Name: %s, ", this.getClass().getSimpleName(),getName());
    }

    @Override
    protected void print() {
        super.print();
    }

    @Override
    public void step(List<Pers> list) {
        if (this.isDead()) {
            if (this.getArrows() > 1) {
                this.attack(this.nearestEnemy(list));
                System.out.printf("Прямо в цель! (Имя: %s, Класс: %s, Здоровье: %d)\n", this.getName(), this.getClass().getSimpleName(), this.getHealth());
            }else {
                System.out.printf("Мне нужны еще стрелы... (Имя: %s, Класс: %s, Здоровье: %d)\n", this.getName(), this.getClass().getSimpleName(), this.getHealth());
            }
        }


    }
}
