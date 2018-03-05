package kyu6;

class Suite2 {
    public static String game(long n) {
        long yakim = n * n;
        if (yakim % 2 == 0) {
            return "[" + yakim / 2 + "]";
        } else {
            return "[" + yakim + ", 2]";
        }
    }
}