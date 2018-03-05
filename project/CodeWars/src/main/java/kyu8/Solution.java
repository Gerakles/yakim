package kyu8;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String y = "";
        for (int i = 0; i <repeat ; i++)
            y += string;
        return y;
    }
}
