package service;

import java.util.Random;
import java.util.Scanner;

public class firstProgram {

    public static void String() {
        Random rn = new Random();
        Scanner sc = new Scanner( System.in );

        int a = rn.nextInt( 1 ) + 1;
        int b = rn.nextInt( 2 ) + 1;
        int c = rn.nextInt( 3 ) + 1;
        int d = rn.nextInt( 4 ) + 1;
        String loc1 = String.valueOf( a );
        String loc2 = String.valueOf( b );
        String loc3 = String.valueOf( c );
        String loc4 = String.valueOf( d );

        System.out.println( "Level 1: " );
        String local1 = sc.next();
        if (loc1.equals( local1 )) {
            System.out.println( "GOOD & level 2: " );
            String local2 = sc.next();
            if (loc2.equals( local2 )) {
                System.out.println( "VERY GOOD & level 3: " );
                String local3 = sc.next();
                if (loc3.equals( local3 )) {
                    System.out.println( "You are my hero & level 4: " );
                    String local4 = sc.next();
                    if (loc4.equals( local4 )) {
                        System.out.println( "Super Man & level 5: " );
                    } else {
                        System.out.println( "O no! game over" );
                    }
                } else {
                    System.out.println( "O no! game over" );
                }
            } else {
                System.out.println( "O no! game over" );
            }
        } else {
            System.out.println( "O no! game over" );
        }
    }
}