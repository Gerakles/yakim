package kyu7;

class DivSeven {
    public static long[] seven(long m) {

        return recurs(m, 0);
    }
    public static long[] recurs(long m, long iterotor) {
        if (m <99) {
            return new long[]{m, iterotor};

        }
        long a = m % 10;
        long n = m / 10;
        long s = n -2*a;
        iterotor++;


        return recurs(s,iterotor);
    }
}