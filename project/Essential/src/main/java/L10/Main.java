package L10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List l = new ArrayList(  );
        List<String> list = new ArrayList <>(  );

        l = list;
        l.add( "hello" );

        String s = list.get( 0 );
        System.out.println(s);
    }
}
