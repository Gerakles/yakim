package number4;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Размеры стаканчиков кофе: 1 = маленикий, 2 = Средний, 3 = БОЛЬШОЙ");
        System.out.println("Выбор за вами: ");

        Scanner sc = new Scanner(System.in);
        String coffeeSize = sc.next();

        int cost = 0;

        switch (coffeeSize) {
            case "3": cost +=25;
            break;
            case "2": cost +=15;
            break;
            case "1": cost +=10;
            break;
            default:
                System.out.println("подумайте ещё");
                break;
        }
        if (cost != 0) {
            System.out.println("Внесите "+cost+ " лей");
            System.out.println("Спасибо");
        } else {
            System.out.println("Пожалуйста повторите выбор");
        }
    }
}
