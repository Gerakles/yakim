package Practica2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        A o = new A();
        A o2 = new B();
        A o3 = new C();

        List<A> arrList = new ArrayList<>();
        arrList.add(o2);
        arrList.add(o3);

        for (A o : arrList) {
            if (o instanceof B) {
                ((B)o).doWork();
            } //System.out.println(o);
        }
    }
}
