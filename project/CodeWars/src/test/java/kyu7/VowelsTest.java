package kyu7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        Assert.assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}