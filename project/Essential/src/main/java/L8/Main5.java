package L8;

class UserException extends Exception {
    public void method() {
        System.out.println( "MyException" );
    }
}

public class Main5 {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println( "exception" );
            e.method();
        }
    }
}
