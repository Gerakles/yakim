package Universal;

public class universal {
    public static Integer basicMath(String op, int v1, int v2) {
        int opresult = 0;
        if (op == "+")
            opresult= v1 + v2;
        if (op == "-")
            opresult= v1 - v2;
        if (op == "/")
            opresult= v1 / v2;
        if (op == "*")
            opresult= v1 * v2;
        if (op== "^")
            opresult= (int) Math.pow( v1, v2 );
        return opresult;
    }
    public static int yakim(String words) {
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter( words.charAt( i ) ))
                count++;
        }
        return count;
    }
}
