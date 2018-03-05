public class perevod {
    public static void main(String[] args) {
        int a;

        long long1 = 10_000_000_000L;
        float flaut1 = 19.4F;
        char char1 = 'Y';
        System.out.println("long1: "+long1);

        a = (int) long1;
        System.out.println("Long assigned to int var: " + a);
    }
}
