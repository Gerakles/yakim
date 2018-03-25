package Profesional.L4;

public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String n) {
        super( 4 );
        this.name = n;
    }

    public Cat() {
        super( 4 );
        this.name = "Fluffy";
    }

    public void eat() {
        System.out.println("Cat eats mice!");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void play() {
        System.out.println("Cat plays with mouse!");
    }
}
