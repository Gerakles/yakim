import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Main1Test extends MainAbstract {

    protected void callMain() {
        Yakim1.main(null);
    }
}

abstract class MainAbstract extends YakimAbstract {
    @Test
    public void testEmpty() {
        String in = "";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals(in, outContent.toString());
    }

    @Test
    public void testNotEmpty() {
        String in = "1\r\n2\r\n";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals(in, outContent.toString());
    }


    @Test
    public void test42NotEmpty() {
        String in = "1\r\n2\r\n42\r\n43\r\n";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals("1\r\n2\r\n", outContent.toString());
    }

    protected abstract void callMain();
}

abstract class YakimAbstract {

    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    protected abstract void callMain();
}