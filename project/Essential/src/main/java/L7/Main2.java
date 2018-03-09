package L7;

interface Interface1 {
    void method();
}

public class Main2 {
    public static void main(String[] args) {
        Interface1 inter = () -> System.out.println( "call method from anonimus class" );
        System.out.println();
        inter.method();
    }
}
