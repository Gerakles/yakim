package kyu7;

class Kata {
    public static String getMiddle(String word) {
        int position;
        int lenght;
        if (word.length() % 2 == 1){
            position = word.length() / 2;
            lenght = 1;
        }else {
            position = word.length()/2-1;
            lenght=2;
        }
        String answer = word.substring( position,position+lenght );
        return answer;
    }
}