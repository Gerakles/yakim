package kyu7;//public class kyu7.JadenCase {
//
//    public String toJadenCase(String phrase) {
//        if (phrase.isEmpty())
//        return null;
//
//        String[] a = phrase.split( " " );
//        String good = "";
//        for (String b : a) {
//            good += prefer(b) + " ";
//        }
//        return good.substring(0, good.length() -1);
//    }
//
//    public static String prefer(String c) {
//        return Character.toUpperCase( c.charAt( 0 ))+ c.substring( 1 );
//    }
//
//}
import java.lang.Character;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

}