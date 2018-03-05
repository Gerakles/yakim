public class Pant extends Clothing{
    private String fit;
    private final double SHIP_PRICE = 20;

    @Override
    public double calculateShip(){
        System.out.println("Pant");
        return SHIP_PRICE * 5;
    }
}