package L7;

interface Interface {
    void method();
}

public class Main3 {
    public static void main(String[] args) {
        Interface inter = new Interface() {
            public double d = 7.7;
            protected String s = "Anonimus class";
            private int num = 10;
            @Override
            public void method() {
                num = 1234;
                System.out.println("interface: d = "+d+", s = "+s+", num = "+ num);
            }
        };
        inter.method();
    }
}
