package Essential.L7;

interface Interfaces {
    void method();

    int getValue();
}

public class Main4 {
    public static void main(String[] args) {
        Interfaces inter = new Interfaces() {
            public int publiField = 3;

            @Override
            public void method() {
                publiField = 1234;
                System.out.println("inter: publicField " + getPubliField());
            }

            @Override
            public int getValue() {
                return 0;
            }

            public int getPubliField() {
                return publiField;
            }
        };
        inter.method();
    }
}
