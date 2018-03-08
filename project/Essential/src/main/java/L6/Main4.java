package L6;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(NonStaticCl.y);

        NonStaticCl inst = new NonStaticCl( 1111 );
        System.out.println(inst.y);

        System.out.println(NonStaticCl.y);
    }
}
