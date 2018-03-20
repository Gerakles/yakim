package L11;

class MyClass6 <T>{
    public T add(T a,T b) {
        if (a.getClass().equals( Integer.class )) {
            return (T) (Object)((Integer)a+ (Integer)b);
        }
        if (a.getClass().equals( Double.class )) {
            return (T) (Object)((Double)a+ (Double) b);
        }
        return (T) (Object) 0;
    }
}
public class Main6 {
    public static void main(String[] args) {
        MyClass6<Integer> my = new MyClass6 <>();
        int sum = my.add( 2,3 );
        System.out.println(sum);
    }
}
