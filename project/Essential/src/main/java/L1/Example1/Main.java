package L1.Example1;

import L1.Example2.Ex2;
import L1.Example2.Parent;

public class Main extends Parent{
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.name2);
        System.out.println(ex1.name3);
        System.out.println(ex1.name4);

        Ex2 ex2 = new Ex2();
        System.out.println(ex2.name4);

        Main parent = new Main();
        System.out.println(parent.name3);
        System.out.println(parent.name4);
    }
}
