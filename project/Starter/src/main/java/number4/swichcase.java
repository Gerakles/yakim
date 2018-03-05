package number4;

public class swichcase {
    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1: {
                System.out.println( "One" );
                break;//Обязательно иначе пойдет дальше
            }
            case 2: {
                System.out.println( "Two" );
                break;
            }
            default: {
                System.out.println( "?" );
                break;
            }
        }
    }
}
