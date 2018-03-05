public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        int opresult = 0;
        if (op == "+") {
            opresult= v1 + v2;
        }
        if (op == "-") {
            opresult= v1 - v2;
        }
        if (op == "/") {
            opresult= v1 / v2;
        }
        if (op == "*") {
            opresult= v1 * v2;
        } ;
        return opresult;
    }
}
