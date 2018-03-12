package L9;

public class Cat {
    String nzme;

    public Cat(String nzme) {
        this.nzme = nzme;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat( "Barsik" );
        Cat cat2 = cat1;

        if (cat1==cat2) {
            System.out.println("equals");
        } else
            System.out.println("they're not equals" );
    }
}
