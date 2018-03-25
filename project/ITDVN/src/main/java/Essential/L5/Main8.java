package Essential.L5;

import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList <>();
        for (int i = 0; i <15 ; i++) {
            arrayList.add( i );
        }
        for (Integer temp : arrayList) {
            System.out.println(temp);
        }
//        int[] array = new int[10];
//        for (int i = 0; i <15 ; i++) {
//            array[i]= i+1;
//        }
//        for (int temp : array) {
//            System.out.println(temp);
//        }
    }
}
