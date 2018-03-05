package number3;

public class arithmetik {
    public static void main(String[] args) {
        byte num1 = 6;
        byte num2 = 3;
        int sum = 0;
        int dif = 0;
        int mul = 0;
        int div = 0, rem = 0;
        int tot = 0;

        sum = num1 + num2;
        dif = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        rem = div % num2;
        tot = sum + dif + mul + div + rem;

        System.out.println( sum );
        System.out.println( dif );
        System.out.println( mul );
        System.out.println( div );
        System.out.println( rem );
        System.out.println( tot );


    }
}
