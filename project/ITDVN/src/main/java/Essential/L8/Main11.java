package Essential.L8;

public class Main11 {
    public static void main(String[] args) {
        int [] arr ={3,4,5,7};
        int a =5, b=0;

        try {
            System.out.println(arr[8]);

            System.out.println(a/b);
        }catch (ArithmeticException are) {
            System.out.println(are);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai);
        }
    }
}
