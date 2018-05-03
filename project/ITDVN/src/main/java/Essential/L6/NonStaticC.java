package Essential.L6;

public class NonStaticC {
    static {
        System.out.println("Static block.");
    }

    public NonStaticC() {
        System.out.println("Constructor.");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void NonStaticCMethod() {
        System.out.println("NonStaticMethod");
    }
}
