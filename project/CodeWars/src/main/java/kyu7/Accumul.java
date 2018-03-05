package kyu7;

public class Accumul {

    public static String accum(String s) {
        String yakim = "";

        for (int i = 0; i < s.length(); i++) {
            char todayChar = s.charAt( i );
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    yakim += Character.toUpperCase( todayChar );
                } else {
                    yakim += Character.toLowerCase( todayChar );
                }
            }
            yakim += "-";
        }
        return yakim.substring( 0, yakim.length()-1 );
    }
}