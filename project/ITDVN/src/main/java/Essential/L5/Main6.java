package Essential.L5;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList <>();

        arrayList.add( "Name" );
        arrayList.add( "SurName" );

        arrayList.ensureCapacity( 30 );

        System.out.println(arrayList.size());

        System.out.println(arrayList.get( 1 ));

        System.out.println(arrayList.indexOf( "Name" ));

        System.out.println(arrayList.lastIndexOf( "SurName" ));
    }
}
