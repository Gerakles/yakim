import java.util.List;
import java.util.Random;

public class test {
    public static void shuffle(List <?> list, Random rnd) {
        rnd = r;
        if (rnd == null)
            r = rnd = new Random(); // harmless race.
        shuffle(list, rnd);
        System.out.println(r);
    }

    public static Random r;

}

