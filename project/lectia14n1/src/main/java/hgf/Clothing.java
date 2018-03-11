package hgf;

public class Clothing {
    // fields given default values
    private int itemID = 0;
    private String desc = "-description required-";
    private char colorCode = 'U';
    private double price = 0.0;
    private final double SHIP_PRICE = 20;

    // Constructor
    public Clothing(int itemID, String desc, char color, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;
    }

    public Clothing(){}

    protected double calculateShip(){
        System.out.println("Clothing");
        return SHIP_PRICE;
    }
}