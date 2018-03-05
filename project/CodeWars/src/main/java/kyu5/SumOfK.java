package kyu5;

import java.util.List;

public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List <Integer> ls) {
        int local = -1;
        for (int i = 0; i < ls.size(); ++i) {
            if (ls.get( i ) <= t) {
                if (k == 1)
                    local = Math.max( local, ls.get( i ) );
                else {
                    Integer answer = chooseBestSum( t - ls.get( i ), k - 1, ls.subList( i + 1, ls.size() ) );
                    if (answer != null)
                        local = Math.max( local, ls.get( i ) + answer );
                }

            }
        }
        if (local < 0)
            return null;
        return local;
    }
}