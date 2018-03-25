package practics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polindrome {

        public static void main(String[] args) throws IOException {
            BufferedReader scan = new BufferedReader( new InputStreamReader( System.in ) );

                System.out.println( "Write and I'll check: " );
                String input = scan.readLine();
                System.out.println( "this is a palindrome?: " );
                System.out.println( isPalindrome( input ) );
        }

        public static boolean isPalindrome(String input) {
            Pattern pattern =Pattern.compile( "\\w" );
            Matcher matcher = pattern.matcher( input );
            StringBuilder build = new StringBuilder();

            while (matcher.find())
                build.append(matcher.group());

            String result = build.toString();
            String reserveResult = build.reverse().toString();

            if (result.compareToIgnoreCase( reserveResult )==0)
                return true;
            return false;
        }
}