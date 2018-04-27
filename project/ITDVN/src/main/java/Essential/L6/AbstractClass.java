package Essential.L6;

public abstract class AbstractClass {
    public static AbstractClass ctreateObject() {
        return new ConcreteClass();
    }

    public abstract void method();
}
