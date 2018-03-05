package Universal;

import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class universalTest {
    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(universal.basicMath("+", 4, 7), is(11));
        assertThat(universal.basicMath("-", 15, 18), is(-3));
        assertThat(universal.basicMath("*", 5, 5), is(25));
        assertThat(universal.basicMath("/", 49, 7), is(7));
        assertThat(universal.basicMath("^", 2, 3), is(8));
    }

    @Test
    public void test() {
        Assert.assertEquals( 16, universal.yakim( "Iachimciuc Bogdan" ) );
        Assert.assertEquals( 12, universal.yakim( "Blanari Denis" ) );
        Assert.assertEquals( 7, universal.yakim( "Vitalie" ) );
        Assert.assertEquals( 6, universal.yakim( "Andrei" ) );
        Assert.assertEquals( 0, universal.yakim( " " ) );
    }

    @Test
    public void testrandom() {
        int a = 0;
        String b = UUID.randomUUID().toString();
        for (int i = 0; i < b.length(); i++) {
            if (Character.isLetter( b.charAt( i ) ))
                a++;
        }
        Assert.assertEquals( a, universal.yakim( b ) );

    }
}
