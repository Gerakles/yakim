package kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    static String toCamelCase(String s) {
        String[] local = s.split( "[ ]" );
        return local[0] + Arrays
                .stream( local )
                .skip( 1 ).map( y -> y.substring( 0, 1 ).
                        toUpperCase() + y.substring( 1 ) ).
                        collect( Collectors.joining() );
    }
}