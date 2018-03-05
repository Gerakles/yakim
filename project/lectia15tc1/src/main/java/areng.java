import java.io.File;
import java.io.IOException;

public class areng {
   public static void main(String[] args) {
        try {
            createFile("d:/testFile.txt");
        } catch (Exception e) {

            System.out.println(e);
            //<other actions>
        }
    }

    public static void createFile(String fname) throws IOException {
        File f = new File(fname);
        System.out.println(fname + " exists? " + f.exists());
        f.createNewFile();
        System.out.println(fname + " exists? " + f.exists());
        int[] intArray = new int[5];
        intArray[5] = 27;
    }
}