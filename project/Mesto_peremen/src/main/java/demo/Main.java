package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = null;
        String num2 = null;
        Scanner sc = new Scanner( System.in );
        String s = sc.nextLine();
        for (byte b : s.getBytes()) {
            String a = String.format
                    ( "%8s", Integer.toBinaryString( b & 0xFF ) )
                    .replace( ' ', '0' );
            //System.out.println( a ); // binary code
            num = a.replace( '0', '2' ).replace( '1', '0' ).replace( '2', '1' );

            //System.out.println(num);
            StringBuilder sb = new StringBuilder();

            Arrays.stream( num.split( "(?<=\\G.{8})" ) ).forEach( r -> sb.append( (char) Integer.parseInt( r, 2 ) ) );
            String out = sb.toString();
            System.out.print( out );
        }
    }
}