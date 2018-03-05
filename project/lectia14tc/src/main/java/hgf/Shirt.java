package hgf;

public class Shirt extends Clothing implements Returnable{
    private String fit;
    private final double SHIP_PRICE = 5;

    public Shirt(String fit) {
        super(2, "description", 'R', 34.3);
        this.fit = fit;
    }

    public Shirt(){}

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    public double calculateShip(){
        System.out.println("Shirt");
        return SHIP_PRICE * 3;
    }
}