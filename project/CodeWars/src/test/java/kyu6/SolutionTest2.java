package kyu6;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class SolutionTest2 {

    @Test
    public void exampleTest1() {
        Assert.assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata4.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        Assert.assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata4.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        Assert.assertArrayEquals(new int[]{}, Kata4.sortArray(new int[]{}));
    }
}