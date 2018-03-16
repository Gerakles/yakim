package number3;

public class increment {
    //  (Increment and Decrement Operators)

    public static void main(String[] args) {
        System.out.println("----- PostFix increment"); // Post-increment

        byte number1 = 0;
        System.out.println(number1++); // Сначала выводим на экран, потом увеличиваем на 1.
        System.out.println(number1);

        System.out.println("----- PreFix increment"); // Pre-increment

        byte number2 = 0;
        System.out.println(++number2); // Сначала увеличиваем на 1, потом выводим на экран.

        System.out.println("----- PostFix increment"); // Post-decrement

        byte number3 = 0;
        System.out.println(number3--); // Сначала выводим на экран, потом уменьшаем на 1.
        System.out.println(number3);

        System.out.println("----- PreFix increment"); // Pre-decrement

        byte number4 = 0;
        System.out.println(--number4); // Сначала уменьшаем на 1, потом выводим на экран.
        int i = 0;

        i = i + 1;  i += 1;
        i = i + 5;  i += 5;

        i = i - 10;  i -= 10;
    }
}
