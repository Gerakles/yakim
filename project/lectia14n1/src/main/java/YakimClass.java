import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class YakimClass {
    public static void main(String[] args) {
        String[] nume = {"Bogdan", "Serghei", "Sergiu", "Iulian", "Denis","Vitalii"};
        MyList<String> namList = new MyList();
        namList.addAll(Arrays.asList(nume));
        System.out.println(namList);

        namList.updateIf(it -> it.equals("Bogdan"), it -> "Superman-" + it);
        System.out.println(namList);

        namList.updateIf(it -> !it.contains("Bogdan"), it -> "coleg-" + it);
        System.out.println(namList);
    }
}

class MyList<Y> extends ArrayList<Y> {
    public void updateIf(Predicate<? super Y> con, UnaryOperator<Y> operator) {
        for (int i = 0; i < 4; i++) {  //siza() вместо цифры 4
            Y element = get(i);
            if (con.test(element)) {
                set(i, operator.apply(element));
            }
        }
    }
}