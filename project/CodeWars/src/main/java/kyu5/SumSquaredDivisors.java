package kyu5;

import java.util.Arrays;

public class SumSquaredDivisors {
    public static String listSquared(int x, int y) {
        int[][] output = new int[y - x + 1][2];
        int j = 0;
        for (int i = x; i <= y; i++) {
            int sum = getDivisors( i );
            if (Math.sqrt( sum ) % 2 == 0 || sum == 1 && sum != 0) {
                output[j][0] = i;
                output[j][1] = sum;
                j++;
            }
        }
        return Arrays.deepToString( Arrays.stream( output ).filter( s -> s[0] != 0 ).toArray() );
    }

    public static int getDivisors(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum += i * i;
            }
        }
        return sum;
    }
}
