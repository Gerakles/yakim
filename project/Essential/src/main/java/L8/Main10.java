package L8;

public class Main10 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception( "exception" );
                } catch (Exception e) {
                    System.out.println( "catch 1 : " + e.getMessage() );
                    throw new Exception();
                } finally {
                    System.out.println( "Finally 1" );
                }
            } catch (Exception e2) {
                System.out.println( "catch 2 : " + e2.getMessage() );
                throw new Exception();
            } finally {
                System.out.println( "Finally 2" );
                throw new Exception( "new exception" );
            }
        } catch (Exception e3) {
            System.out.println( "catch 3 : " + e3.getMessage() );
        } finally {
            System.out.println( "Finally 3" );

        }
    }
}