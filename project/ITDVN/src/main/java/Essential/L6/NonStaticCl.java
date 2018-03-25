package Essential.L6;

public class NonStaticCl {
    static int y;

    static {
        y = 1;
        System.out.println("Static block y = "+ y);
    }
    static {
        y = 23;
        System.out.println("Static block y = "+ y);
    }
    static {
        y = -99;
        System.out.println("Static block y = "+ y);
    }

    public NonStaticCl(int y) {
        this.y = y;
        System.out.println("Constructor Y = "+ y);
    }
}
