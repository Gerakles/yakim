import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        switch (args.length) {
            case 1:
                System.out.println(Arrays.toString(args));
                LocalDateTime myDate = LocalDateTime.now();
                DateTimeFormatter myformat = DateTimeFormatter.ofPattern(args[0]);
                System.out.println(myDate.format(myformat));
                break;
            case 2:
                LocalDateTime parse = LocalDateTime.parse(args[0]);
                System.out.println(Arrays.toString(args));
                DateTimeFormatter myformat1 = DateTimeFormatter.ofPattern(args[1]);
                System.out.println(parse.format(myformat1));
                break;

                default:
                    System.out.println("Luzar");

        }

    }
}
