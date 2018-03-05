package number2;

public class BasicTypes {
    public static void main(String[] args) {
        // 8-bits == 1 byte
        byte a1 = -128;//Диапазон - от -128 до +127
        byte a2 = +127;
        // 16-bits == 2 bytes
        short b1 = -32768;//Диапазон - от -32768 до +32767
        short b2 = +32767;
        // 32-bits = 4 bytes
        int c1 = -2147483648;//Диапазон - от -2147483648 до +2147483647
        int c2 = +2147483647;
        // 64-bits = 8 bytes
        long d1 = -9223372036854775808L;//Диапазон - от -9223372036854775808 до +9223372036854775807
        long d2 = +9223372036854775807L;// Указание суффикса L, является обязательным
        // 32-bits = 4 bytes
        float e1 = -0.123456789f;//Диапазон - от +/-1.5 x 10^-45 до +/-3.4 x 10^38
        float e2 = +1.123456789f;// Указание суффикса f, является обязательным and компилятор интерпретирует данное число как double.
        // 64-bits = 8 bytes
        double f1 = -0.123456789d;//Диапазон - от +/-5.0 x 10^-324 до +/-1.7 x 10^308
        double f2 = +1.123456789;
        //8-bits == 1 byte
        boolean g1 = true;// Логическая величина Истина/Ложь
        boolean g2 = false;
        // 16-bits == 2 bytes
        char h1 = 'I';
        char h2 = 'B';

        String firstString = "Every says: ";
        String secondString = "Soli Deo Gloria!";

        System.out.println( "от " + a1 + " до " + a2 );
        System.out.println( "от " + b1 + " до " + b2 );
        System.out.println( "от " + c1 + " до " + c2 );
        System.out.println( "от " + d1 + " до " + d2 );
        System.out.println( "от " + e1 + " до " + e2 );
        System.out.println( "от " + f1 + " до " + f2 );
        System.out.println( "от " + g1 + " до " + g2 );
        System.out.println( "от " + h1 + " до " + h2 );
        System.out.println( firstString + secondString );
        System.out.println( Integer.MAX_VALUE );
        System.out.println( Integer.MIN_VALUE );
    }
}
