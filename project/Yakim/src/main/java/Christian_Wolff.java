import java.util.Scanner;

public class Christian_Wolff { //2.72 kb
    public static void main(String[] args) {
        Scanner cw = new Scanner( System.in );
        while (cw.hasNext()) {
            String s = cw.nextLine();
                 s=s.replaceAll( "a","(!..," )
                    .replaceAll( "b", "(!,, " )
                    .replaceAll( "c", "(.,  " )
                    .replaceAll( "d", "(,,  " )
                    .replaceAll( "e", "( .! " )
                    .replaceAll( "f", "(!.,+" )
                    .replaceAll( "g", "(,,. " )
                    .replaceAll( "h", "(!.. " )
                    .replaceAll( "i", "(...." )
                    .replaceAll( "j", "(.,, " )
                    .replaceAll( "k", "(!.,." )
                    .replaceAll( "l", "(,..," )
                    .replaceAll( "m", "( ., " )
                    .replaceAll( "n", "(!.  " )
                    .replaceAll( "o", "( , ," )
                    .replaceAll( "p", "(,,. " )
                    .replaceAll( "q", "( ,.," )
                    .replaceAll( "r", "(!,,!" )
                    .replaceAll( "s", "(.,! " )
                    .replaceAll( "t", "(.,,!" )
                    .replaceAll( "u", "(., ." )
                    .replaceAll( "v", "(,., " )
                    .replaceAll( "w", "( .  " )
                    .replaceAll( "x", "( . !" )
                    .replaceAll( "y", "(,., " )
                    .replaceAll( "z", "(!.,-" )
                    .replaceAll( "A", "(!..," )
                    .replaceAll( "B", "(!,, " )
                    .replaceAll( "C", "(.,  " )
                    .replaceAll( "D", "(,,  " )
                    .replaceAll( "E", "( .! " )
                    .replaceAll( "F", "(!.,+" )
                    .replaceAll( "G", "(,,. " )
                    .replaceAll( "H", "(!.. " )
                    .replaceAll( "I", "(...." )
                    .replaceAll( "J", "(.,, " )
                    .replaceAll( "K", "(!.,." )
                    .replaceAll( "L", "(,..," )
                    .replaceAll( "M", "( ., " )
                    .replaceAll( "N", "(!.  " )
                    .replaceAll( "O", "( , ," )
                    .replaceAll( "P", "(,,. " )
                    .replaceAll( "Q", "( ,.," )
                    .replaceAll( "R", "(!,,!" )
                    .replaceAll( "S", "(.,! " )
                    .replaceAll( "T", "(.,,!" )
                    .replaceAll( "U", "(., ." )
                    .replaceAll( "V", "(,., " )
                    .replaceAll( "W", "( .  " )
                    .replaceAll( "X", "( . !" )
                    .replaceAll( "Y", "(,., " )
                    .replaceAll( "Z", "(!.,-" );
            System.out.println(s);
        }
    }
}
