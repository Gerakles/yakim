package Essential.L7;

interface Interfa {
    void method();

    int getValue();
}

public class Main6 {
    public static void main(String[] args) {
        Interfa inter = new Interfa() {
            int publiField = 0;

            @Override
            public void method() {
                publiField = 100;
            }

            @Override
            public int getValue() {
                return publiField;
            }

        };
        Interfa inte = new Interfa() {
            int field = -1;

            @Override
            public void method() {
                field = inter.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };
        inter.method();
        inte.method();

        System.out.println("instance 1: "+inter.getValue()+" instance 2: "+inte.getValue());
    }
}