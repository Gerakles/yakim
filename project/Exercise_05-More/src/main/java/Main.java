public class Main {

    private int nrOfInstances;

    public static void main(String[] args) {

        int quantity = 6;
        boolean outOfStock = false;
        if (quantity == 0) {
            outOfStock = true;
        }


        if (outOfStock) {
            System.out.println( "not items" );
        } else {
            String message = "We have " + quantity + " item";
            if (quantity > 1) {
                System.out.println( message + "s" );
            } else {
                System.out.println( quantity );
            }
        }
    }
    void displayText(int val) {
        System.out.println(val);

    }

}



