package Essential.L6;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(NonStaticCla.Y);

        NonStaticCla inst = new NonStaticCla();
        System.out.println(inst.Y);
    }
}
