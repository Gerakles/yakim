package kyu8;

public class Kata2{
    public static String bonusTime(final int salary, final boolean bonus) {
        return "£" + (bonus ? 10 : 1) * salary;
    }
}