package L8;

class MyExceptionA extends Exception {
    public MyExceptionA(String mesage) {
        super( mesage );
    }
}

class MyExceptionB extends MyExceptionA {
    public MyExceptionB(String mesage) {
        super( mesage );
    }
}


public class Main13 {
    public static void main(String[] args) {
        try {
            throw new Exception( "My exceptionA" );
        } catch (MyExceptionB eb) {
            System.out.println( eb.getMessage() );
        } catch (MyExceptionA ea) {
            System.out.println( ea.getMessage() );
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }
}
