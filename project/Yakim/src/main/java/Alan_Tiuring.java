import java.util.Arrays;
import java.util.Scanner;

public class Alan_Tiuring {//1.01kb

    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (byte b : s.getBytes()) {
                String a = String.format

                        ("%8s", Integer.toBinaryString(b & 0xFF))
                        .replace(' ', '0');
                //System.out.println( a ); // binary code
                num = a.replace('0', '2').replace('1', '0').replace('2', '1');

                //System.out.println(num); // conversely binary code
                StringBuilder sb = new StringBuilder();

                Arrays.stream(num.split("(?<=\\G.{8})")).forEach(r -> sb.append((char) Integer.parseInt(r, 2)));
                String out = sb.toString();
                out = out.replaceAll("=", "")
                        .replaceAll("<", " ")
                        .replaceAll("`", " ");
                System.out.print(out); //result coding
            }
        }
    }
}