package kyu7;

class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {

        return (a > 0 && b > 0 && c > 0 && a + b > c && c + b > a && a + c > b);
    }
}
