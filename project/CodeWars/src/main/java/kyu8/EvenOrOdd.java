package kyu8;

import java.util.Random;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String yalim1 = "Even";
        String yalim2 = "Odd";

        if (number%2==0)
            return yalim1;
        else
            return yalim2;
    }
}