package Seminar1;

import Seminar1.Healers.Monk;
import Seminar1.Healers.Wizard;
import Seminar1.Shooters.Archers;
import Seminar1.Shooters.Crossbowman;
import Seminar1.Shooters.Sniper;
import Seminar1.Warriors.Robber;
import Seminar1.Warriors.Spearman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
    public static ArrayList<Pers> holyTeam = new ArrayList<>();
    public static ArrayList<Pers> darkTeam = new ArrayList<>();
    public static ArrayList<Pers> allTeam = new ArrayList<>();
    public static void main(String[] args) {

        Random random = new Random();

        init();


        System.out.println("Первая команда: ");
        for (Pers unit : holyTeam){
            System.out.printf("Имя: %s, Здоровье: %d, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getHealth(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();

        System.out.println("Вторая команда: ");
        for (Pers unit : darkTeam){
            System.out.printf("Имя: %s, Здоровье: %d, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getHealth(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }


        System.out.println("-".repeat(36));


        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);

        allTeam.sort((o1, o2) -> o2.getPriority()- o1.getPriority());

        allTeam.forEach(n->System.out.println(n.getInfo()));
        System.out.println("-".repeat(36));


        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (true) {

            View.view();
            scanner.nextLine();
            int summ1HP = 0;
            int summ2HP = 0;
            for (Pers unit : holyTeam){
                summ1HP += unit.getHp();
            }
            for (Pers unit : darkTeam){
                summ2HP += unit.getHp();
            }
            if (summ1HP == 0){
                System.out.println("Победила команда darkTeam");
                flag = false;
                break;
            }
            if (summ2HP == 0){
                System.out.println("Победила команда holyTeam");
                flag = false;
                break;
            }
            for (Pers unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }

        }




        for (Pers unit : allTeam) {
            System.out.printf("Имя: %s, Здоровье: %d, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getHealth(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();

        allTeam.get(0).nearestEnemy(darkTeam);
    }


    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static void init(){
        Random random = new Random();
        int teamcount = 10;
        for (int i = 1; i < teamcount+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            System.out.println(xy1);
            switch (val) {
                case 0:
                    holyTeam.add(new Crossbowman(getName(), i,1));
                    break;
                case 1:
                    holyTeam.add(new Wizard(getName(), i,1));

                    break;
                case 2:
                    holyTeam.add(new Monk(getName(),i,1));

                    break;
                case 3:
                    holyTeam.add(new Robber(getName(), i,1));

                    break;
                case 4:
                    holyTeam.add(new Peasant(getName(), i,1));

                    break;
                case 5:
                    holyTeam.add(new Sniper(getName(), i,1));

                    break;
                case 6:
                    holyTeam.add(new Spearman(getName(), i,1));

                    break;
            }
        }
        for (int i = 1; i < teamcount+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            System.out.println(xy1);
            switch (val) {
                case 0:

                    darkTeam.add(new Crossbowman(getName(), i,10));
                    break;
                case 1:

                    darkTeam.add(new Wizard(getName(), i,10));
                    break;
                case 2:

                    darkTeam.add(new Monk(getName(), i,10));
                    break;
                case 3:

                    darkTeam.add(new Robber(getName(), i,10));
                    break;
                case 4:

                    darkTeam.add(new Peasant(getName(), i,10));
                    break;
                case 5:

                    darkTeam.add(new Sniper(getName(), i,10));
                    break;
                case 6:

                    darkTeam.add(new Spearman(getName(), i,10));
                    break;
            }
        }
    }

}
