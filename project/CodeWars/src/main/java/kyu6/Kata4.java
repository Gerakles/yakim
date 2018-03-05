package kyu6;

import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class Kata4 {
    public static int[] sortArray(int[] array) {
        OfInt sorry = IntStream.of( array ).filter( s -> s % 2 == 1 ).sorted().iterator();

        return IntStream.of( array ).map( y -> y % 2 == 0 ? y : sorry.nextInt()).toArray();
    }
}