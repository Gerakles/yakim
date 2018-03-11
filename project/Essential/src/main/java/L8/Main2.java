package L8;

public class Main2 {
    public static void main(String[] args) {
        Exception ex = new Exception( "MyException" );

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
