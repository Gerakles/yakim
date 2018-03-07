package L5;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] array1 = {1023,1066,1998,2000,2017,2019};
        int[] array2 = {3201,6601,8991};
        int[] array3 = {1023,1066,1998,2000,2017,2019};

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(array1);
        System.out.println(array2);

        System.out.println(Arrays.toString( array1 ));
        System.out.println(Arrays.toString( array2 ));

        System.out.println(Arrays.binarySearch( array1, 2019 ));

        System.out.println(Arrays.equals( array1,array2 ));

        Arrays.fill( array3, 563 );
        System.out.println(Arrays.toString( array3 ));
    }
}
