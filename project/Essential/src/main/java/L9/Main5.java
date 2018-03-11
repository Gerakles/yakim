package L9;

public class Main5 {
    public static void main(String[] args) {
        Car5 car1 = new Car5( 12 );
        Car5 car2 = new Car5( 12 );
        Car5 car3 = new Car5( 15 );

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
