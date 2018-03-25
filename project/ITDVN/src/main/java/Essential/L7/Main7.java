package Essential.L7;

interface Interfases {
    void method();

    int getValue();
}

class ConcreteClass implements Interfases {

    protected int protectedField = 10;

    public void method() {
        System.out.println( "concrete class method" );
    }

    public int getValue() {
        return protectedField;
    }
}

public class Main7 {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass() {
            public void method() {
                System.out.println( "instance method" );
            }
        };

        Interfases instance2 = new ConcreteClass() {
          int protectedField = 3;

            @Override
            public void method() {
                System.out.println( "instance2 method" );
            }

            @Override
            public int getValue() {
                return this.protectedField+super.getValue();
            }
        };
        instance.method();
        instance2.method();

        System.out.println("instance1 : "+instance.getValue()+" instance 2 : "+instance2.getValue());
    }
}
