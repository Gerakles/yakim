package L3;

public class A {
    {
        System.out.println("In block1");
    }
    static {
        System.out.println("In static block1");
    }
    A () {
        System.out.println("In constructor A");
    }
    {
        System.out.println("In block2");
    }
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
    }
}