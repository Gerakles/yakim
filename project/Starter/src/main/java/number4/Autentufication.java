package number4;

import java.time.LocalTime;
import java.util.Scanner;

public class Autentufication {
    public static void main(String[] args) {
        String login = "Yakim";
        String password = "vittoria44";

        LocalTime myDate = LocalTime.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write login: ");
        String userLogin = sc.next();

        if (login.equals( userLogin )) {
            System.out.println("Write password: ");
            String UserPassword = sc.next();

            if (password.equals( UserPassword )) {
                System.out.println("Добро пожаловать "+login+" ,Вы вошли в "+ myDate);
            } else {
                System.out.println();
            }
        } else {
            System.out.println("There is no user with that name!");
        }
    }
}
