package kyu6;

import java.util.Arrays;

public class WhichAreIn {

    public static String[] lastArray(String[] array1, String[] array2) {
        return Arrays.stream(array1).filter(str -> Arrays.stream(array2).anyMatch( s -> s.contains(str))).distinct().sorted().toArray(String[]::new);
    }
}