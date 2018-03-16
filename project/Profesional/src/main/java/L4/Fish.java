package L4;

public class Fish extends Animal implements Pet {
    private String name;
    public Fish() {
        super( 0 );
        name = "Goldy";
    }

    public void eat() {
        System.out.println("Fish eats meals!");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }

    public void play() {
        System.out.println("Fish don't play");
    }

    public void walk() {
        System.out.println("Fish don't walk, she's swim all the day");
    }
}
