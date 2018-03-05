package kyu6;

public class Kata3 {
    public static double findUniq(double arr[]) {
        double max = 0;
        for (double m : arr) {
            if (m>max) {
                max = m;
            }
        }
        return max;
    }
}