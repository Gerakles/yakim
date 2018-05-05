package Essential.L6;


public class NonStaticCla {
    public static final int Y;

    static {
        Y = 10;
        System.out.println("Static block Y = " + Y);
    }

    public NonStaticCla() {
        System.out.println("Constructor Y = " + Y);
    }
}
