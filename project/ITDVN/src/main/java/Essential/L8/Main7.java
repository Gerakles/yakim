package Essential.L8;

public class Main7 {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("question");
            System.out.println("a/(2-n)= " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Blok Finally");
        }
        System.out.println("end code");
    }
}
