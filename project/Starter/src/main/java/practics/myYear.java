package practics;

import java.util.Scanner;

public class myYear {
    public static void main(String[] args) {
        int myDay;
        int myMonth;
        System.out.println( "Введите номер дня недели: 1-2-3-4-5-6-7: " );
        Scanner sc = new Scanner( System.in );
        myDay = sc.nextInt();
        System.out.println( "Введите номер месеца года: 1-2-3-4-5-6-7-8-9-10-11-12: " );
        Scanner sc2 = new Scanner( System.in );
        myMonth = sc2.nextInt();
        // Конвертируем значение строковой переменной myDay в целочисленное значение
        // и записываем его в переменную с именем myDay типа int
        switch (myDay) {
            case 1:
                System.out.print( "Понедельник" );
                break;
            case 2:
                System.out.print( "Вторник" );
                break;
            case 3:
                System.out.print( "Среда" );
                break;
            case 4:
                System.out.print( "Четверг" );
                break;
            case 5:
                System.out.print( "Пятница" );
                break;
            case 6:
                System.out.print( "Суббота" );
                break;
            case 7:
                System.out.print( "Воскресенье" );
                break;
            default:
                System.out.println( "Вы ввели несуществующий день недели." );
                break;
        }
        switch (myMonth) {
            case 1:
                System.out.print( " Января 2018 года" );
                break;
            case 2:
                System.out.print( " Февраля 2018 года" );
                break;
            case 3:
                System.out.print( " Марта 2018 года" );
                break;
            case 4:
                System.out.print( " Апреля 2018 года" );
                break;
            case 5:
                System.out.print( " Мая 2018 года" );
                break;
            case 6:
                System.out.print( " Июня 2018 года" );
                break;
            case 7:
                System.out.print( " Июля 2018 года" );
                break;
            case 8:
                System.out.print( " Августа 2018 года" );
                break;
            case 9:
                System.out.print( " Сентября 2018 года" );
                break;
            case 10:
                System.out.print( " Октября 2018 года" );
                break;
            case 11:
                System.out.print( " Ноября 2018 года" );
                break;
            case 12:
                System.out.print( " Декабря 2018 года" );
                break;
            default:
                System.out.println( "Вы ввели несуществующий месяц" );
                break;
        }
    }
}
