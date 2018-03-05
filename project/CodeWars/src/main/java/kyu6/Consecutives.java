package kyu6;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> egal = new ArrayList <>(  );
        int y =0;
        egal.add( s.get( 0 ) );
        for (int i = 1; i <s.size() ; i++) {
            if (s.get( i )==s.get( i-1 ))
                egal.set( y,egal.get(y)+s.get( i ));
            else {
                egal.add( s.get( i ) );
                ++y;
            }
        }
        return egal;
    }

}