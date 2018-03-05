package kyu8;

public class Kata4 {

    public static int makeNegative(final int x) {
        int neg;
        if (x>=0)
        neg = x-x-x;
        else
            return x;
        return neg;
    }

}