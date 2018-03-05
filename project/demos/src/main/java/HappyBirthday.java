import org.junit.Assert;

import java.util.Random;
import java.util.UUID;

public class HappyBirthday {
    public static int yakim(String words) {
        int a = 0;
        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter( words.charAt( i ) ))
                a++;
        }
        return a;
    }

//    public static void main(String[] args) {
//        Random y = new Random();
//        char c = (char) (y.nextInt( 26 ) + 'a');
//        System.out.println( UUID.randomUUID().toString() );
//        System.out.println( UUID.randomUUID().toString() );
//        System.out.println( UUID.randomUUID().toString() );
//
//    }
//    public static int yakim(String words) {
//        int a = 0;
//        for (int i = 0; i < UUID.randomUUID().toString().length(); i++) {
//            if (Character.isLetter( UUID.randomUUID().toString().charAt( i ) ))
//                a++;
//        }
//        return a;
//    }
}