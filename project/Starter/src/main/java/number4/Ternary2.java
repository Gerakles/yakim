package number4;

public class Ternary2 {

    public static void main(String[] args) {
        int a = 1, b = 7, c = -5, max = 0;

        max = a > b ? (c = a) : (b = c);
        System.out.println( max );
    }
}
