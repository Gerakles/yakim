package kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIt {
    public int findIt(String s) {
        List <String> number = new ArrayList <String>();
        Matcher y = Pattern.compile( "\\d+" ).matcher( s );
        while (y.find()) number.add( y.group() );
        int a = Integer.valueOf( number.get( 0 ) ), b = Integer.valueOf( number.get( 1 ) ), c = Integer.valueOf( number.get( 2 ) );
        for (int i = 0; i < c; i++) if ((a * i) % c == b) return i;
        return -1;
    }
}