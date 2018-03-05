package number3;

import java.util.Scanner;

public class Input {
    // Объект класса Scanner позволяет обрабатывать ввод данных с консоли
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ведите Целое число: ");
        int y = input.nextInt();

        System.out.println("Ведите дробное число: ");
        float a = input.nextFloat();

        System.out.println("Введите строку с пробелами: ");
        String b = input.next();

        input=new Scanner(System.in);

        System.out.println("Ведите строку: ");
        String c = input.nextLine();

        System.out.println(y+"\n"+a+"\n"+b+"\n"+c);
    }
}
