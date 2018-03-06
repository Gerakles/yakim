package L4.ex2;

abstract class AbstractClass {
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("Implementation");
    }
}

public class Main1 {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}