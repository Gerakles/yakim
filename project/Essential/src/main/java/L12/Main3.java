package L12;

class MyClass3 {
    public <T> void method(T arg) {
        T var = arg;

        System.out.println(var);
    }
}
public class Main3 {
    public static void main(String[] args) {
        MyClass3 ins = new MyClass3();

        ins.method( "Hello World" );
    }
}
