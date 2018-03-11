import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Yakim Bogdan

class Randomm {
        public static List<Integer> cifre;

        public static void main(String[] args) {
            BubleSort bs = new BubleSort();
            bs.intArray = new int[10000];
            Random r = new Random();
            for (int i = 0; i < 10000 ; i++) {
                bs.intArray[i] = r.nextInt();
            }
            //{1, 6, 7, 3, 2, 8};

            List<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < bs.intArray.length; i++) {
                arrayList.add(bs.intArray[i]);
            }


            long startCollections = System.currentTimeMillis();
            Collections.sort(arrayList);
            long endCollections = System.currentTimeMillis();

            System.out.println("Sortarea colectiei: " + (endCollections - startCollections));


            long startBubble = System.currentTimeMillis();
            bs.sort(bs.intArray);
            long endBubble = System.currentTimeMillis();

            System.out.println("Sortarea bubble: " + (endBubble - startBubble));


//        System.out.println("Inainte de sortare: " + Arrays.toString(bs.intArray));
//        bs.sort(bs.intArray);
//
//        System.out.println("dupa sortare: " + Arrays.toString(bs.intArray));
        }
    }

    class BubleSort {
        public int[] intArray;

        public void sort(int[] newIntArray) {
            int temp;
            for (int i = 0; i < newIntArray.length - 1; i++) {
                for (int j = 1; j < newIntArray.length - i; j++) {
                    if (newIntArray[j - 1] > newIntArray[j]) {
                        temp = newIntArray[j - 1];
                        newIntArray[j - 1] = newIntArray[j];
                        newIntArray[j] = temp;
                    }
                }
            }
        }
    }