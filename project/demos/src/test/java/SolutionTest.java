import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SolutionTest {
    @Test
    public void test() {
        Assert.assertEquals( 47, Solution.kgPaint( 14,7,3.5 ) );
        Assert.assertEquals( 253, Solution.kgPaint( 63,9,2.7 ) );
        Assert.assertEquals( 77, Solution.kgPaint( 73,2,1.5 ) );
        Assert.assertEquals( 83, Solution.kgPaint( 25,5,7.3 ) );
        Assert.assertEquals( 408, Solution.kgPaint( 100,10,1 ) );
    }
    @Test
    public void testNull() {
        Assert.assertEquals( 0,Solution.kgPaint( 0,0,0 ) );
    }
    @Test
    public void testRandom() {
        Random random = new Random(  );
        int length = random.nextInt(50)+1;
        int width = random.nextInt(50)+1;
        double height = length+(width-length)*random.nextDouble();
        double minusWindow = 0.9;
        double volumeFirst = 8;
        double volumeSecond = 11;
        double ceiling = length * width;
        int wall = (int) ((length * height) + ceiling);
        double area = (ceiling + wall) * minusWindow;
        volumeFirst = area / volumeFirst;
        volumeSecond = area / volumeSecond;
        int paint = (int) (volumeFirst + volumeSecond);
        Assert.assertEquals( paint,Solution.kgPaint( length,width,height ) );
    }
}
