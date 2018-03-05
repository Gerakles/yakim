package number4;

import java.util.Scanner;

public class Ternary3 {
    public static void main(String[] args) {
        String string = "Hello my ";

        System.out.println("Ведите свой логин");
        Scanner sc = new Scanner( System.in );
        // На 12 строке создаем переменную с именем login типа String и принимаем в нее ввод от пользователя
        String login = sc.next();
        // На 14 строке переменной string присваиваем возвращаемое значение тернарного оператора
        string += login.equals( "admin" ) ? "Administrator" : "User";
        System.out.println(string);
    }
}
