package Animale;

public class Dog implements Animal, Wild {

    public void walk() {
        int x = 0;
        x++;
        int y = 0;
        y--;
    }

    public void eat() {
        System.out.println( "eat bear" );
    }

    public void fly() {
        return;
    }

    public boolean jump() {
        System.out.println("De la etajul 10");
        return true;
    }

    public boolean hasHair() {
        return true;

    }

    public boolean canAttackHuman() {
        return true;
    }
}
