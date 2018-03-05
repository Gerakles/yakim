package kyu7;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int year = 0;
        while (principal < desired) {
            double rata = principal*interest;
            double rest = rata * tax;
            principal += rata - rest;
            year++;
        }
        return year;
    }
}