package kyu7;

public class Kata2 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String win = fighter1.name;
        Fighter atac = fighter1;
        if (fighter2.name.equals( firstAttacker )) {
            atac = fighter2;
        }
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (atac == fighter1) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                atac = fighter2;
            } else {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                atac = fighter1;
            }
        }
        if (fighter1.health <= 0) {
            win = fighter2.name;
        }
        return win;
    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}