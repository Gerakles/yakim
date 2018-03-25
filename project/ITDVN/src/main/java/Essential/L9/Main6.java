package Essential.L9;

public class Main6 {
    public static void main(String[] args) {
        Car6 car1 = new Car6( "1", 12, 1.8F );
        Car6 car2 = new Car6( "2", 21, 1.6F );
        Car6 car3 = new Car6( "3", 10, 1.4F );

        System.out.println( car1.hashCode() );
        System.out.println( car2.hashCode() );
        System.out.println( car3.hashCode() );
    }
}