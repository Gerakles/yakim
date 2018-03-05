package L1.modifires;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 80, 40, 40);
        Car car2 = new Car();
        System.out.println(car1.getMaxSpeed());
        System.out.println(car1.getModel());

        car1.setMaxSpeed( 140 );
        int speed  = car1.getMaxSpeed();
        System.out.println(speed);

        car2.setMaxSpeed( 150 );
        System.out.println(car2.getMaxSpeed());

    }
}
