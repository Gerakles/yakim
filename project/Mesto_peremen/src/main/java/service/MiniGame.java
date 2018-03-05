package service;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    public void Nums() {

        Random rn = new Random();
        Scanner sc = new Scanner( System.in );

        int a = rn.nextInt( 1 ) + 1;
        int b = rn.nextInt( 2 ) + 1;
        int c = rn.nextInt( 3 ) + 1;
        int d = rn.nextInt( 4 ) + 1;
        int e = rn.nextInt( 5 ) + 1;
        int f = rn.nextInt( 6 ) + 1;
        int g = rn.nextInt( 7 ) + 1;
        int h = rn.nextInt( 8 ) + 1;
        int i = rn.nextInt( 9 ) + 1;
        System.out.println( "Level 1: " );
        int local1 = sc.nextInt();
        if (a == local1) {
            System.out.println( "GOOD & level 2: " );
            int local2 = sc.nextInt();
            if (b == local2) {
                System.out.println( "VERY GOOD & level 3: " );
                int local3 = sc.nextInt();
                if (c == local3) {
                    System.out.println( "You are my hero & level 4: " );
                    int local4 = sc.nextInt();
                    if (d == local4) {
                        System.out.println( "Super Man & level 5: " );
                        int local5 = sc.nextInt();
                        if (d == local5) {
                            System.out.println( "Super Man & level 6: " );
                            int local6 = sc.nextInt();
                            if (d == local6) {
                                System.out.println( "Super Man & level 7: " );
                                int local7 = sc.nextInt();
                                if (d == local7) {
                                    System.out.println( "Super Man & level 8: " );
                                    int local8 = sc.nextInt();
                                    if (d == local8) {
                                        System.out.println( "Super Man & level 9: " );
                                        int local9 = sc.nextInt();
                                        if (d == local9)
                                            System.out.println( "End Game & level 10: " );
                                        else
                                            System.out.println( "O no! game over" );
                                    } else
                                        System.out.println( "O no! game over" );
                                } else
                                    System.out.println( "O no! game over" );
                            } else
                                System.out.println( "O no! game over" );
                        } else
                            System.out.println( "O no! game over" );
                    } else
                        System.out.println( "O no! game over" );
                } else
                    System.out.println( "O no! game over" );
            } else
                System.out.println( "O no! game over" );
        } else
            System.out.println( "O no! game over" );
    }
}