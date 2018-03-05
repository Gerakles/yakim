package kyu8;

import kyu8.Kata3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OppositeExampleTests {
    @Test
    public void tests() {
        assertEquals(-1, Kata3.opposite(1));
    }
}