public class Verification {
    public static void main(String[] args) {
        String custName = "Iachimciuc Bogdan";
        String itemDEsc = "hat";
        double price = 18.5;
        double tax = 1.9;
        int quantity = 2;
        String message = custName + " wants to purchase a " + quantity + " " + itemDEsc;
        double total = price * tax * quantity;

        if (quantity > 1) {
            message = message + "s";
        }

        boolean outOfStock = false;

        if (outOfStock) {
            System.out.println( itemDEsc + " is out of stock" );
        } else {
            System.out.println( message );
            System.out.println( "Total cost with tax is: " + total );
        }
    }
}
