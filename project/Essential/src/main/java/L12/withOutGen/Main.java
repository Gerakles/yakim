package L12.withOutGen;

public class Main {
    public static void main(String[] args) {
        WithOutGen w1 = new WithOutGen( "test" );
        WithOutGen w2 = new WithOutGen( 10 );
        WithOutGen w3 = new WithOutGen( new Cat( "Marsel" ) );

        w1.display();
        w2.display();
        w3.display();
    }
}
class WithOutGen  {
    Object obj;

    public WithOutGen(Object obj) {
        this.obj = obj;
    }
    void display() {
        System.out.println(obj);
    }

    public Object getObj() {
        return obj;
    }
}
class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
