package prototip;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IfHtml {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("http://www.oddsportal.com/soccer/spain/primera-division/rayo-vallecano-valencia-d4LVsDnC/");

            try {
                LineNumberReader reader = new LineNumberReader(new InputStreamReader(url.openStream()));
                String string = reader.readLine();
                while (string != null) {
                    System.out.println(string);
                    string = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }
}