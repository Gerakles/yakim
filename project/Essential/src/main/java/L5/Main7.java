package L5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main7 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList <>();

        arrayList.add( 7 );
        arrayList.add( 5 );
        arrayList.add( 2 );

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
