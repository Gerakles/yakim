import java.util.Scanner;

class Yakim1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int y;
        while (scanner.hasNext()) {
            y = scanner.nextInt();
            if (y == 42)
                break;
            System.out.println( y );
        }
    }
}