package number3;

public class preobrazovanie {
    public static void main(String[] args) {
        //преобразование значения типа - byte в тип int. (преобразование меньшего типа в больший)
        byte a = 10;    //                                      0000 1010  -  1 байт
        int b = 0;      //  0000 0000   0000 0000   0000 0000   0000 0000  -  4 байта
        b = a;          //  0000 0000   0000 0000   0000 0000   0000 1010  -  4 байта
        System.out.println( "b = " + b );
        //преобразование значения типа - int в тип float. (преобразование целого типа в вещественный)
        int c = 255;
        float d = 0f;
        d = c;
        System.out.println( "d = " + d );
        //преобразование значения типа - int в тип byte.(преобразование большего типа в меньший, приводит к потере части результата)
        int e = 128;    //  0000 0000   0000 0000   0000 0000   1000 0000  -  4 байта
        byte f = 0;     //                                      0000 0000  -  1 байт
        f = (byte) e;    //                                      0000 0001  -  1 байт
        // f = e;       //  ОШИБКА.
        System.out.println( "f = " + f );
        //преобразование значения типа - float в тип int
        float g = 10.5F;
        int h = 0;
        h = (int) g;
        // h = g;       // ОШИБКА.
        System.out.println( "h = " + h );
        final int i = 127;
        byte j = 0;
        j = i;
        System.out.println( "j = " + j );
        final float k = 255;
        byte l = 0;
        l = (byte) k;
        System.out.println( "l = " + l );
        final int m = 254;  //  0000 0000   0000 0000   0000 0000   1111 1110  -  4 байта
        byte n = 0;         //                                      0000 0000  -  1 байт
        n = (byte) m;        //                                      0000 0001  -  1 байт
        // n = m;           //  ОШИБКА.
        System.out.println( "n = " + n );
        final float o = 128.5f;
        byte p = 0;
        p = (byte) o;
        // p = o;           //  ОШИБКА.
        System.out.println( "p = " + p );
    }
}