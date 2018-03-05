package number6;

import java.util.Scanner;

public class whille {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        while (a < 1621) {
            a++;

            if (a == 1066) break;
            System.out.println( "Произведено " + a + "" );
        }
        System.out.println( "Произведено " + a + " итераций." );
    }
}
