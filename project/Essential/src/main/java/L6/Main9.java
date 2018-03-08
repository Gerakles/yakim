package L6;

class MyClasse {
    private int field = 0;

    public class Inner {
        MyClasse inst = new MyClasse();
        public void method(int a) {
            inst.field = a;
            System.out.println(inst.field);
        }
    }
}
public class Main9 {
    public static void main(String[] args) {
        MyClasse.Inner inst = new MyClasse().new Inner();

        inst.method(1);
    }
}
