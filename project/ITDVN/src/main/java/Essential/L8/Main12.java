package Essential.L8;

public class Main12 {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException ne) {
            System.out.println(ne.getMessage());
        }
    }
}
