package kyu8;

import kyu8.Kata;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void BasicTest() {
        assertEquals(16, Kata.sum(new int[]{6, 2, 1, 8, 10}));
    }

    @Test
    public void BasicOtherTest() {
        assertEquals(6, Kata.sum(new int[]{1, 1, 11, 2, 3}));
    }

    @Test
    public void okTest() {
        assertEquals(3, Kata.sum(new int[]{7, 1, 3}));
    }
}