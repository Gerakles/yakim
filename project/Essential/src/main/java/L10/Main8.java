package L10;

interface Interface1 {
}

interface Interface2<U> {
}

class Derivedr implements Interface1, Interface2 <Object> {
}

class MyClass8<T extends Interface1> {
}

class MyClass8_2<T extends Interface2 <Object>> {
}

public class Main8 {
    public static void main(String[] args) {
        MyClass8 <Interface1> my1 = new MyClass8 <>();
        MyClass8 <Derivedr> my2 = new MyClass8 <>();

        MyClass8_2 <Interface2 <Object>> my3 = new MyClass8_2 <>();
        MyClass8_2 <Derivedr> my4 = new MyClass8_2 <>();
    }
}
