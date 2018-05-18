package Essential.L9;

public class Main4 {
    public static void main(String[] args) {
        Car2 car = new Car2(2);
        Car2 car2 = new Car2(2);
        Car2 car3 = car;

        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));
    }
}
