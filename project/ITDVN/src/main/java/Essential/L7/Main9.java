package Essential.L7;

enum Days {
    monday, teusday, wednesday, thuersday, friday, saturday, sunday
}

public class Main9 {
    public static void main(String[] args) {
        Days today = Days.saturday;
        switch (today) {
            case monday:
                System.out.println("first day monday");
                break;
            case saturday:
                System.out.println("last day saturday");
                break;
            default:
                System.out.println("none");
        }
        if (today == Days.saturday)
            System.out.println("finaly weekend");
    }
}
