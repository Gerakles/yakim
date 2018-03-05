import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothing shirt1 = new Shirt("M");
        Clothing shirt2 = new Shirt("L");
        Shirt shirt7 = new Shirt();

        List<Clothing> arrList = new ArrayList<>();
        arrList.add(shirt1);
        arrList.add(shirt7);

        System.out.println(shirt1.calculateShip());
        System.out.println(shirt2.calculateShip());

        Clothing shirt3 = new Shirt();
        Clothing shirt4 = new Pant();
        Clothing shirt6 = new Clothing();

        System.out.println(shirt3.calculateShip());
        System.out.println(shirt4.calculateShip());
        System.out.println(shirt6.calculateShip());
    }
}