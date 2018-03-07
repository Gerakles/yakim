package L6;

public class NonStaticClass {
    private int ID;
    public static int field;

    public NonStaticClass(int ID) {
        this.ID = ID;
    }
    public void method() {
        System.out.println("Instance{0}.field = "+ID+", "+field);
    }
}
