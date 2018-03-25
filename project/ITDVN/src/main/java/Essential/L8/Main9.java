package Essential.L8;

class ClassWithException {
    public void throwInner() throws Exception {
        throw  new Exception( "This inter exception" );
    }
    public void catchInner( ) throws Exception {
        try {
            this.throwInner();
        } catch (Exception e) {
            throw  new  Exception( "This extra exception ", e );
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        ClassWithException inst = new ClassWithException();

        try {
            inst.catchInner();
        } catch (Exception e) {
            System.out.println(" exceptiom caught "+ e.getMessage());
            System.out.println(" cause exceptiom  "+ e.getCause());
        }
    }
}
