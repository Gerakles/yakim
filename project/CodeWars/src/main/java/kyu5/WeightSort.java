package kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String strng) {
        return Arrays.stream( strng.split( " " ) ).sorted((String yakim1, String yakim2)->{
            int y1 = Arrays.stream( yakim1.split( "" ) ).mapToInt( a-> Integer.parseInt( a ) ).sum();
            int y2 = Arrays.stream( yakim2.split( "" ) ).mapToInt( a-> Integer.parseInt( a ) ).sum();
            if (y1<y2)
                return -1;
             else if (y1==y2)
                return yakim1.compareTo( yakim2 );
            else
                return 1;
    }).collect( Collectors.joining( " " ) );
    }
}