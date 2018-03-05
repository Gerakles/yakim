package kyu6;

public class Keypad {
    private static final String[] yakim = {
            "1",     "ABC2", "DEF3",
            "GHI4",  "JKL5", "MNO6",
            "PQRS7", "TUV8", "WXYZ9",
            "*",     " 0",   "#",
    };

    public static int presses(String phrase) {
        char[] letters = phrase.toUpperCase().toCharArray();
        int button = 0;

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < yakim.length; j++) {
                button += yakim[j].indexOf( letters[i] ) + 1;
            }
        }
        return button;
    }
}
