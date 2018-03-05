public class XO {
    public static void main(String[] args) {
        System.out.println( getXO("avoxooxxOXo"));
    }

    public static boolean getXO(String str) {
        int numX = 0;
        int numO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt( i ) == 'x' || str.charAt( i ) == 'X') {
                numX++;
            }
            if (str.charAt( i ) == 'o' || str.charAt( i ) == 'O') {
                numO++;
            }
        }
        if (numX == numO) {
            return true;
        }
        return false;

    }
}