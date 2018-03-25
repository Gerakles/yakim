package Essential.L7;

interface Interfac {
    void method();
}

public class Main5 {
    public static void main(String[] args) {
        int n = 100;
        Interfac inter = new Interfac() {
            public int publiField = 11;

            @Override
            public void method() {
                publiField = n;
                System.out.println( "inter: publicField " + publiField );
            }

        };
        inter.method();
    }
}
