package L4;

public class Main {
    public static void main(String[] args) {
        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird c = new Chikens();

        p.movie();
        s.movie();
        c.movie();
    }
}
