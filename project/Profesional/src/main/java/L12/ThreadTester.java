package L12;

public class ThreadTester { //918 b
    public static void main(String[] args) {
        Runnable prog = new Printme();
        Thread thread = new Thread( prog );
        Thread thread2 = new Thread( prog );
        Thread thread3 = new Thread( prog );
        thread.setName( "1" );
        thread2.setName( "2" );
        thread3.setName( "3" );

        thread3.setPriority( Thread.MAX_PRIORITY );
        thread.setPriority( Thread.MIN_PRIORITY );

        thread.start();
        thread2.start();
        thread3.start();
    }
}
