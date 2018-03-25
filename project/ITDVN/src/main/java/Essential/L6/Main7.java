package Essential.L6;


class MyClass {
    public class Inner {
        public void method() {
            System.out.println("method in Iner class");
        }
    }
}
public class Main7 {
    public static void main(String[] args) {
        MyClass.Inner inst = new MyClass().new Inner();

        inst.method();
    }
}
