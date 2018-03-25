package Essential.L6;

class MyClassee {
    public class Inner extends BaseClasses {
        public void methodIner() {
            System.out.println("Method in the Iner clas");
        }
    }
}
public class Main10 {
    public static void main(String[] args) {
        MyClassee.Inner insta = new MyClassee().new Inner();

        insta.methodBase();
        insta.methodIner();
    }
}
