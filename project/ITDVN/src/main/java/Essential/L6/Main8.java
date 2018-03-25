package Essential.L6;

class MyClasses {
    private static int field = 0;

    public class Inner {
        public void method(int a) {
            field = a;
            System.out.println(field);
        }
    }
}
public class Main8 {
    public static void main(String[] args) {
        MyClasses.Inner inst = new MyClasses().new Inner();

        inst.method(1);
    }
}
