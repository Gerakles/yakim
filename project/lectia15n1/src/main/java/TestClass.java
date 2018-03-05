public class TestClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add( 1998, 1066 );
        System.out.println( "Add Result: " + addResult );

        // Add exception handling to catch ArithmeticException
        try {
            double divResult = calc.divide( 19, 19);
            System.out.println( "Division Result: " + divResult );
        } catch (ArithmeticException e) {
            System.out.println("divizarea la zero nu se efectueaza!");
        }
    }
}
