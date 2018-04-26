package Essential.L5;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you?");

        System.out.println(arrayList);

        arrayList.add(0, "Teacher says:");

        arrayList.remove(1);

        arrayList.remove("would you?");

        System.out.println(arrayList);
    }
}
