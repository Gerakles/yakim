package kyu7;

import java.util.Arrays;

public class Kata3 {
    public static String HighAndLow(String numbers) {
        int min = Arrays.stream( numbers.split( " " ) ).mapToInt( a-> Integer.parseInt( a ) ).min().getAsInt();
        int max = Arrays.stream( numbers.split( " " ) ).mapToInt( a-> Integer.parseInt( a ) ).max().getAsInt();
        return String.format( "%d %d",max,min );
    }
}
