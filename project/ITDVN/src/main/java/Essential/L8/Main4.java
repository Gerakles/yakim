package Essential.L8;

class MyClass {
    public void myMethod() throws Exception {
        Exception exception = new Exception( "MyException" );
        throw exception;
    }
}
public class Main4 {
    public static void main(String[] args) {
        try {
            MyClass inst = new MyClass();
            inst.myMethod();
        } catch (Exception e) {
            System.out.println("mesage "+e.getMessage());
            System.out.println("Stack trace");
        e.printStackTrace();
        }
    }
}
