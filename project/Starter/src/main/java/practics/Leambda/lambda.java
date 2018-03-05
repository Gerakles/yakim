package practics.Leambda;

import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        Incrementer incrementer = x ->  Math.sqrt( Math.sqrt((x+3)*4) );
        System.out.println(incrementer.increment(1));// Lambda где x +1

//        ArrayList<Integer> ints = new ArrayList <>();
//        ints.add( 1 );
//        ints.add( 0 );
//        ints.add( 6 );
//        ints.add( 6 );
//        ints.forEach( integer -> System.out.println(integer+1) );// с помошью lambda плюсуем все +1
//        ints.forEach(System.out::println);//здесь просто печатаем ArrayList
    }
}
