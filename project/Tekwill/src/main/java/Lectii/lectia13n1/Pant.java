package Lectii.lectia13n1;

public class Pant extends Clothing{
    private String fit;
    private final double SHIP_PRICE = 20;

    @Override
    public double calculateShip(){
        System.out.println("Lectii.lectia13n1.Pant");
        return SHIP_PRICE * 5;
    }
}