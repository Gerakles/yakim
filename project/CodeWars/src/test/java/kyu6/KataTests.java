package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTests {

    @Test
    public void BasicTests()
    {
        assertEquals("1", C.f(1));
        assertEquals("120", C.f(5));
        assertEquals("362880", C.f(9));
        assertEquals("1307674368000", C.f(15));
    }

}