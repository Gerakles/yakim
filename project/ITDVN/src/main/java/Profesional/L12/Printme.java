package Profesional.L12;

public class Printme implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep( 2000 );
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
