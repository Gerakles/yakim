package kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

class Opstrings {

    public static String vertMirror (String strng) {
        String[] yakim =strng.split( "\n" );
        List<String> newYakim = Arrays.stream( yakim )
                .map( x-> new StringBuilder( x ).reverse().toString())
                .collect( Collectors.toList());
        return String.join( "\n", newYakim );
    }
    public static String horMirror (String strng) {
        String[] yakim =strng.split( "\n" );
        Collections.reverse( Arrays.asList(yakim));

        return String.join( "\n", yakim  );
    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply( s );
    }
}