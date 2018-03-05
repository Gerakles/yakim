import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class HappyBirthdayTest {
    @Test
    public void test() {
        Assert.assertEquals( 16, HappyBirthday.yakim( "Iachimciuc Bogdan" ) );
        Assert.assertEquals( 12, HappyBirthday.yakim( "Blanari Denis" ) );
        Assert.assertEquals( 7, HappyBirthday.yakim( "Vitalie" ) );
        Assert.assertEquals( 6, HappyBirthday.yakim( "Andrei" ) );
        Assert.assertEquals( 0, HappyBirthday.yakim( " " ) );
    }

    @Test
    public void testrandom() {
        int a = 0;
        String b = UUID.randomUUID().toString();
        for (int i = 0; i < b.length(); i++) {
            if (Character.isLetter( b.charAt( i ) ))
                a++;
        }
        Assert.assertEquals( a, HappyBirthday.yakim( b ) );

    }
}