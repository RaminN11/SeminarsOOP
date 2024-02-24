package Seminar1.Shooters;

import Seminar1.Pers;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Archers {
    private final int arrows;

    public Sniper(String name, Integer x, Integer y) {
        super(name, x, y);
        this.arrows = 5;
        this.priority = 3;
        this.health = 100;
        this.agility = 30;
        this.strength = 20;
        this.level = 1;
        this.stamina = 30;
        this.status = true;
    }

    @Override
    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    @Override
    public void attack(Pers target) {
        super.attack(target);
    }
    public void death() {
        if (this.getHealth() < 1) {
            System.out.println("Это мой последний выстрел... ");
        }
    }
    @Override
    public String toString() {
        return String.format("Class: %s  Name: %s", this.getClass().getSimpleName(), getName());
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
