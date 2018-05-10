package Essential.L8;

class UserExcepti extends Exception {
    public void method() {
        System.out.println("MyException");
    }
}

public class Main8 {
    public static void main(String[] args) {
        try {
            throw new UserExcepti();
        } catch (UserExcepti userExcepti) {
            System.out.println("exception");
            userExcepti.method();
            try {
                throw userExcepti;
            } catch (UserExcepti e) {
                System.out.println("Start");
                e.method();
            }
        } finally {
            System.out.println("Blok Finally");
        }
        System.out.println("end cpde");
    }
}
