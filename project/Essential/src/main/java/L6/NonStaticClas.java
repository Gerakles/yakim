package L6;

public class NonStaticClas {
    private int id;

    public NonStaticClas(int id) {
        this.id = id;
    }

    public static void method() {
        System.out.println("Can't invoke non-static field");
    }
}
