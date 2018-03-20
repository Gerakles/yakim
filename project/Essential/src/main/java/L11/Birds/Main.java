package L11.Birds;

public class Main {
    public static void main(String[] args) {
        Straus[] s = {new Straus( 50 ), new Straus( 60 )};
        Pinguin[] p = {new Pinguin( 15 ), new Pinguin( 18 ), new Pinguin( 20 )};
        Logic<Straus> c1 = new Logic <>( s );
        c1.display();
        Logic<Pinguin> c2 = new Logic <>( p );
        c2.display();
        Logic.weightCompare( c1,c2 );
    }
}

class Bird {
    int weight;

    public Bird(int weight) {
        this.weight = weight;
    }

    void move() {
    }
}

class Straus extends Bird {
    Straus(int weight) {
        super( weight );
    }

    @Override
    void move() {
        System.out.println( "Run" );
    }
}

class Pinguin extends Bird {
    Pinguin(int weight) {
        super( weight );
    }

    @Override
    void move() {
        System.out.println( "swim" );
    }
}

class Logic<T extends Bird> {
    T[] array;

    Logic(T[] array) {
        this.array = array;
    }

    void display() {
        for (T temp : array) {
            temp.move();
            System.out.println( temp.weight );
        }
    }

    int eightController() {
        int sum = 0;
        for (T temp :array) {
            sum +=temp.weight;
        }
        return sum;
    }
    static void weightCompare (Logic<?> c1, Logic<?> c2) {
        System.out.println(c1.eightController()-c2.eightController());
    }
}