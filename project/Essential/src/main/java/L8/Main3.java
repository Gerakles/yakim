package L8;

public class Main3 {
    public static void main(String[] args) {

        try {
            throw new Exception( "MyException" );
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
