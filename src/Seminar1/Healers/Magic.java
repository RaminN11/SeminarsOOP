package Seminar1.Healers;

import Seminar1.Pers;
import Seminar1.Position;

import java.util.ArrayList;

public abstract class Magic extends Pers {
    int mana;
    boolean flag;


    public Magic(String name, int x, int y) {
        super(name,100,0,2,new Position(x,y));
        this.mana = 10;
        this.flag = false;

    }

    @Override
    public void step(ArrayList<Pers> targetTeam, ArrayList<Pers> friends) {
        if (getHp() <= 0) return;
        ArrayList<Pers> sortlist = new ArrayList<>(friends);
        ArrayList<Pers> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());
        int countdead = 0;
        for (Pers unit : sortlist) {
            if (unit.getHp() == 0) {
                deadlist.add(unit);
                countdead++;
            }
        }
        if (deadlist.size() > 3 ) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.getPriority() - o1.getPriority());
            deadlist.getFirst().health = maxHealth;
            mana = 0;
            System.out.println("Воскресил: " + deadlist.getFirst().name);
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        sortlist.getFirst().health += 10;
        mana -= 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana : " + mana;
    }
}
