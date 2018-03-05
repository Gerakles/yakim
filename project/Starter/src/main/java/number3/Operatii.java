package number3;

public class Operatii {
    public static void main(String[] args) {
        byte var1 = 0;

        var1 = (byte) (var1 + 5);// Громоздкое решение
        var1 += 5;// Элегантное решение
        var1 += 5000; // Сужение типа
        System.out.println( var1 );

        // Присвоение со сложением.
        int var2 = 0;
        var2 = var2 + 5;
        var2 += 5;
        System.out.println( var2 );

        // Присвоение с вычитанием.
        int var3 = 0;
        var3 = var3 - 5;
        var3 -= 5;
        System.out.println( var3 );

        // Присвоение с умножением.
        long var4 = 0;
        var4 = var4 * 5;
        var4 *= 5;
        System.out.println( var4 );

        // Присвоение с делением.
        long var5 = 0;
        var5 = var5 / 5;
        var5 /= 5;
        System.out.println( var5 );

        // Присвоение остатка от деления.
        long var6 = 0;
        var6 = var6 % 5;
        var6 %= 5;
        System.out.println( var6 );
    }
}
