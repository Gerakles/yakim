package Animale;

public class Cat implements Animal {
    public void walk() {
        int x = 0;
        x++;
        int y = 0;
        y--;
    }

    public void eat() {
        System.out.println( "eat whisky" );
    }

    public void fly() {
        return;
    }

    public boolean jump() {
        System.out.println("De la etajul 2");
        return true;
    }

    public boolean hasHair() {
        return true;

    }
}
