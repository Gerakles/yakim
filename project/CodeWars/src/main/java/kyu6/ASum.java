package kyu6;

public class ASum {

    public static long findNb(long m) {
        long b = 1;
        long i = 1;
        long y = -2 * (long) Math.sqrt( m );

        if (y * y != 4 * m) {
            return -1;
        }

        long sqrt = (long) Math.sqrt( i * i - 4 * b * y );
        long yakim = (-1*i - sqrt)/ (2*b);
        long high = (-1*i + sqrt)/(2*b);
        return yakim >= 0 ? yakim : high;
    }
}