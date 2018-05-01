package Essential.L6;

class Myclas {
    public static class Nested {
        public static void StaticMethodFromNested() {
            System.out.println("StaticMethodFromNested");
        }
    }
}

public class Main11 {
    public static void main(String[] args) {
        Myclas.Nested.StaticMethodFromNested();
    }
}