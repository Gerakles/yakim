package kyu8;

import kyu8.Kata4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, Kata4.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, Kata4.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, Kata4.makeNegative(0));
    }
}