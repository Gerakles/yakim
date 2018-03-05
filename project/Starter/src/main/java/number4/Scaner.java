package number4;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        System.out.println("Just input smth:");
        Scanner input = new Scanner(System.in);
        String buffer = input.next();
        Integer in = Integer.parseInt(buffer);
        System.out.println(in);
    }
}