package kyu6;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class FindUniqTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        Assert.assertEquals(1.0, Kata3.findUniq(new double[]{0, 1, 0}), precision);
        Assert.assertEquals(2.0, Kata3.findUniq(new double[]{1, 13, 1, 2, 1, 15}), precision);
    }
}