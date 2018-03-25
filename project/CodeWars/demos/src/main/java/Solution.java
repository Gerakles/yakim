public class Solution {
    public static int kgPaint(int length, int weight, double height) {
        double minusWindow = 0.9;
        double volumeFirst = 8;
        double volumeSecond = 11;
        double ceiling = length * weight;
        int wall = (int) ((length * height) + ceiling);
        double area = (ceiling + wall) * minusWindow;
        volumeFirst = area / volumeFirst;
        volumeSecond = area / volumeSecond;
        int paint = (int) (volumeFirst + volumeSecond);
        return paint;
    }
}
