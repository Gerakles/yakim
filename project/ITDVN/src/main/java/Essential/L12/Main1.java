package Essential.L12;


class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main1 {
    public static void main(String[] args) {
        MyClass<String> inst = new MyClass<>();
        inst.field = "ABC";
        inst.method();

        MyClass<Integer> inst2 = new MyClass<>();
        inst2.field = 1234;
        inst2.method();
    }
}
