package Essential.L8;

public class StackTr {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : st) {
            System.out.println( temp.getMethodName() );
        }
    }
}
