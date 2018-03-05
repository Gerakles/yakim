import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Randomm {
    public static List <Integer> cifre;

    public static void main(String[] args) {
        Random random = new Random();

        cifre = new ArrayList <>();

        for (int i = 0; i < 10; i++) {
            int c = random.nextInt( 99 ) + 1;
//        for (int a = 0; a < 1; a++) {
//            int c1 = random.nextInt( 99 ) + 1;
//        for (int b = 0; b < 1; b++) {
//            int c2 = random.nextInt( 99 ) + 1;
//        for (int d = 0; d < 1; d++) {
//            int c3 = random.nextInt( 99 ) + 1;
//        for (int e = 0; e < 1; e++) {
//            int c4 = random.nextInt( 99 ) + 1;


        cifre.add(c);
//        cifre.add(c1);
//        cifre.add(c2);
//        cifre.add(c3);
//        cifre.add(c4);




        }
        System.out.println("ДО: " + cifre);

        Collections.sort(cifre);
        System.out.println("После: " + cifre);


    }

}