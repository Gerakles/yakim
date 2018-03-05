public class Shop {
    public static void main(String[]args) {
        String custName = "Iachimciuc Bogdan";
        String itemDEsc = "pants";
        double price = 18.5;
        double tax = 1.9;
        int quantity = 2;
        String message = custName + " wants to purchase a " + quantity + " " + itemDEsc;
        double total =price*tax*quantity;

        System.out.println(message);
        System.out.println("Total cost with tax is: "+total);
    }
}

