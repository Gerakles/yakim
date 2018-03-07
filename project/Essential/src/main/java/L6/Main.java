package L6;

public class Main {
    public static void main(String[] args) {
        NonStaticClass instance1 = new NonStaticClass( 1 );
        NonStaticClass instance2 = new NonStaticClass( 2 );

        instance1.method();
        instance2.method();

        NonStaticClass.field = 1;

        instance1.method();
        instance2.method();
    }
}
