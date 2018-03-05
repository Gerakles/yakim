package kyu6;

import java.util.Arrays;
import java.util.Comparator;

class Kata {
    static String high(String s) {
        return Arrays.stream(s.split( " " ))
                .sorted( Comparator.comparingInt( Kata:: cws )
                        .reversed()).findFirst().get();
    }
    private static int cws(String y) {
        return y.chars().map( i->i-(int)'a'+1 ).sum();
    }
}