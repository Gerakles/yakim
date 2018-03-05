package kyu6;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {

        public static List<Long> sumDigPow(long a, long b) {
            List<Long> equal = new ArrayList <Long>(  );

            for (long i = a; i <=b ; i++) {
                String yakim = i + "";
                long total = 0;
                long left = i;
                for (int j = yakim.length()-1; j >= 0 ; j--) {
                long mamy = left%10;
                long pow = (long)Math.pow( mamy, j +1 );
                total += pow;
                left = left/10;
                }
                if (total == i)
                equal.add( i );
            }
            return equal;
        }
    }