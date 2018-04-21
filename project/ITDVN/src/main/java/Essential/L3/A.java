package Essential.L3;

public class A {
    static {
        System.out.println("In static block1");
    }

    {
        System.out.println("In block1");
    }

    {
        System.out.println("In block2");
    }

    A() {
        System.out.println("In constructor A");
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
    }
}