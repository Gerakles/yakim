package practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BublleSort {
    public static List<Integer> number;

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        number = new ArrayList <>();
        System.out.println("Write five numer: ");

        for (int i = 0; i < 5; i++) {
            int a = s.nextInt();
            number.add( a );
        }

        Collections.sort( number );
        System.out.println(number);
    }
}
