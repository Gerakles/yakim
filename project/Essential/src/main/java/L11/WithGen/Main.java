package L11.WithGen;

public class Main {
    public static void main(String[] args) {
        WithGen<String> w1 = new WithGen <>( "test" );
        WithGen<Integer> w2 = new WithGen <>( 10 );
        WithGen<Cat> w3 = new WithGen <>( new Cat( "Marsel" ) );

        w1.display();
        w2.display();
        w3.display();
    }
}
class WithGen <T> {
    T obj;

    public WithGen(T obj) {
        this.obj = obj;
    }
    void display() {
        System.out.println(obj);
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
