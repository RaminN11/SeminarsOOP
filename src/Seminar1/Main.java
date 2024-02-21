package Seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд)
3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.

Крестьянин:
    - Здоровье
    - Сила
    - Ловкость
    - Выносливость
    - Вид оружия
    - Уровень
    - ID
    - Имя

Разбойник:
    - ID
    - Имя
    - Здоровье
    - Сила
    - Ловкость
    - Выносливость
    - Вид оружия

Снайпер:
    - ID
    - Имя
    - Здоровье
    - Сила
    - Ловкость
    - Выносливость
    - Вид оружия
    - Меткость

Колдун:
    - ID
    - Имя
    - Здоровье
    - Интеллект
    - Выносливость
    - Вид оружия
    - Мана

Копейщик:
    - ID
    - Имя
    - Здоровье
    - Сила
    - Выносливость
    - Вид оружия
    - Защита

Арбалетчик:
    - ID
    - Имя
    - Здоровье
    - Выносливость
    - Вид оружия
    - Меткость
    - Количество стрел
    - Скорость стрельбы

Монах:
    - ID
    - Имя
    - Здоровье
    - Выносливость
    - Интеллект
    - Вид оружияkkk
    - Вера
    - Чакра


 */
public class Main {
    public static void main(String[] args) {
        Sniper sniper = new Sniper(getName(),0,0);
        Archer archer = new Archer(getName(),0,0);
        Crossbowman crossbowman = new Crossbowman(getName(),0,0);
        Monk monk = new Monk(getName(),0,0);
        Peasant peasant = new Peasant(getName(),0,0);
        Robber robber = new Robber(getName(),0,0);
        Spearman spearman = new Spearman(getName(),0,0);
        Wizard wizard = new Wizard(getName(),0,0);


        int teamCount = 10;
        List<Pers> team1 = new ArrayList<>();
        List<Pers> team2 = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1,8)){
                case 1:
                    team1.add(new Archer(getName(),i,0));
                    break;
                case 2:
                    team1.add(new Robber(getName(),i,0));
                    break;
                case 3:
                    team1.add(new Sniper(getName(),i,0));
                    break;
                case 4:
                    team1.add(new Spearman(getName(),i,0));
                    break;
                case 5:
                    team1.add(new Monk(getName(),i,0));
                    break;
                case 6:
                    team1.add(new Crossbowman(getName(),i,0));
                    break;
                case 7:
                    team1.add(new Peasant(getName(),i,0));
                    break;
                case 8:
                    team1.add(new Wizard(getName(),i,0));
                    break;


            }

        }



        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1,8)){
                case 1:
                    team2.add(new Archer(getName(),i,9));
                    break;
                case 2:
                    team2.add(new Robber(getName(),i,9));
                    break;
                case 3:
                    team2.add(new Sniper(getName(),i,9));
                    break;
                case 4:
                    team2.add(new Spearman(getName(),i,9));
                    break;
                case 5:
                    team2.add(new Monk(getName(),i,9));
                    break;
                case 6:
                    team2.add(new Crossbowman(getName(),i,9));
                    break;
                case 7:
                    team2.add(new Peasant(getName(),i,9));
                    break;
                case 8:
                    team2.add(new Wizard(getName(),i,9));
                    break;
            }
        }


        for (Pers unit : team1){
            System.out.printf("Name: %s, Class: %s, Position: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
        for (Pers unit : team2){
            System.out.printf("Name: %s, Class: %s, Position: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
    }

    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
