package number4;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {
        int myDay;
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        // Конвертируем значение строковой переменной myDay в целочисленное значение
        // и записываем его в переменную с именем myDay типа int

        switch (myDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочии день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }
}
