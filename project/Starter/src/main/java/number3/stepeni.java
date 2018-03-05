package number3;

import static java.lang.Math.pow;

/* Math.pow() - возведение числа в степень
     * 1-ый аргумент - число, которое возводим в степень,
     * 2-ой – показатель степени, в которую возводим число.
     */
public class stepeni {
    public static void main(String[] args) {
        double a = 2, b = 3;

        double result = pow( a, b );

        System.out.println( result );
    }
}
