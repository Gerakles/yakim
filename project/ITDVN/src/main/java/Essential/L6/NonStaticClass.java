package Essential.L6;

public class NonStaticClass {
    public static int field;
    private int ID;

    public NonStaticClass(int ID) {
        this.ID = ID;
    }

    public void method() {
        System.out.println("Instance{0}.field = " + ID + ", " + field);
    }
}
