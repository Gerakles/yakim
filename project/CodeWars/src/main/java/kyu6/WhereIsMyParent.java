package kyu6;

import java.util.Arrays;


class WhereIsMyParent {
    static String findChildren(final String text) {
        String[] yakim = text.split( "" );
        Arrays.sort( yakim );
        Arrays.sort( yakim, String.CASE_INSENSITIVE_ORDER );
        return String.join( "", yakim );
    }
}
