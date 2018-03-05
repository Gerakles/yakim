package kyu7;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' ||
                    charArray[i] == 'e' ||
                    charArray[i] == 'i' ||
                    charArray[i] == 'o' ||
                    charArray[i] == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}