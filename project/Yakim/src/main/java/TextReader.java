import java.io.*;

public class TextReader {
    private static final String path = "D://lectii/yakim/db/GUI.txt";

    public static void Read() throws IOException {
        File fil = new File( path );
        FileReader reader = new FileReader( fil );
        BufferedReader buff = new BufferedReader( reader );

        String text = buff.readLine();
        String[] content = text.split( " " );
        String result = String.format( "Name is: %s, Best score is: %s \n", content[0], content[1] );
//        System.out.println(result);
    }

    public static void NewP() throws IOException {
        
    }
}
