package L4;

public class TestAnimals {
    static Cat myCat = new Cat( "Tiger" );
    static Cat otherCat = new Cat();
    static Animal mySpider = new Spider();
    static Fish myFish = new Fish();

    public static void main(String[] args) {
        myCat.setName( "Toyger" );
        System.out.println(myCat.getName());
        myCat.walk();
        myCat.play();
        myCat.eat();

        System.out.println(otherCat.getName());
        otherCat.walk();
        otherCat.play();
        otherCat.eat();

        mySpider.eat();
        mySpider.walk();

        myFish.setName( "myFish" );
        myFish.walk();
        myFish.eat();
        System.out.println(myFish.getName());
        myFish.play();
    }
}
