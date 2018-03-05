package L2;

import L2.Animal.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat( "Bob", 7 );

        System.out.println(cat.getName()+" "+cat.getAge());
    }
}