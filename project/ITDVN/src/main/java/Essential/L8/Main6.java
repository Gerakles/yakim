package Essential.L8;

import java.io.FileInputStream;

class UserExceptio extends Exception {
    public void method() {
        System.out.println("MyException");
    }
}

public class Main6 {
    public static void main(String[] args) {
        try {
            throw new UserExceptio();
        } catch (UserExceptio userExceptio) {
            System.out.println("exception");
            userExceptio.method();
            try {
                FileInputStream fs = new FileInputStream("C:\\nonexist.log");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
