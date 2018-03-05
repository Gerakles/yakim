package kyu4;

public class Solution {
    public static String lcs(String x, String y) {
        if (x.isEmpty() || y.isEmpty())
            return new String();
        if (x.charAt( x.length() - 1 ) == y.charAt( y.length() - 1 ))
            return lcs( x.substring( 0, x.length() - 1 ),
                    y.substring( 0, y.length() - 1 ) ) + x.charAt( x.length() - 1 );
        String answerFory = lcs( x, y.substring( 0, y.length() - 1 ) );
        String answerForx = lcs( x.substring( 0, x.length() - 1 ), y );
        return answerFory.length() > answerForx.length() ? answerFory : answerForx;
    }
}