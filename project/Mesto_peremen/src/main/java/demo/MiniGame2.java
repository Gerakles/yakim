package demo;

import java.util.Random;
import java.util.Scanner;

public class MiniGame2 {
    public static void Nums() throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner( System.in );
        while (scanner.hasNext()) {
            for (int i = 1; i < 10; i++) {
                System.out.println( String.format( "LEVEL %s : ", i ) );
                int keyValue = scanner.nextInt();

                int randomValue = random.nextInt( i ) + 1;
                if (keyValue == randomValue) {
                    System.out.println( "GOOD" );
                    Thread.sleep( 800 );
                } else {
                    System.out.println( "GAME OVER" );
                    System.out.println( "ANSWER " + randomValue );
                    break;
                }
            }
        }
    }
}
