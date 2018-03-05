import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    private static List<String> months;

    public static void main(String[]args) {
        int [] array = new int[5];

        // int arrSize = array.length;

        array[0] = 1;
        array[1] = 2;
        array[2] = 6;
        array[3] = 8;
        array[4] = 4;


        months = new ArrayList<>();

        //   int arrListSize = months.size();

        months.add("January");
        months.add("February");
        months.add("Marth");
        months.add("Aprill");
        months.add("May");
        months.add("June");
        months.add("Julle");
        months.add("August");

        System.out.println("lunile: "+months);

        Collections.sort(months);
        System.out.println("lunile: "+months);
    }
}
