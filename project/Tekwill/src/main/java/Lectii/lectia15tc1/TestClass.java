package Lectii.lectia15tc1;

import java.io.File;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        try {
            testClass.testCheckedException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testCheckedException() throws  Exception {
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
           System.out.println("testFile exists:"+testFile.exists());
    }
}
