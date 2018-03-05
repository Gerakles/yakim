package kyu7;

import java.util.Arrays;

class Summation {

    static long summy(String stringOfInts) {
        return Arrays.stream( stringOfInts.split( " " ) ).mapToLong( y -> Long.parseLong( y ) ).sum();
    }
}