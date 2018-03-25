package Essential.L6;

public class NonStaticC {
    public NonStaticC() {
        System.out.println("Constructor.");
    }

    static {
        System.out.println("Static block.");
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void NonStaticCMethod() {
        System.out.println("NonStaticMethod");
    }
}
