package kyu7;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int startingOdd = (n * (n + 1) / 2 - n) * 2 + 1;
        int oddsSum = 0;
        for (int i = startingOdd; i < startingOdd + n*2; i += 2) {
            oddsSum += i;
        }
        return oddsSum;
    }
}