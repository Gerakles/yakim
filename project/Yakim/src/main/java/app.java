public class app {
    public static void main(String[] args) throws InterruptedException {
        String text = "HELLO! my Lord";

        for (char i : text.toCharArray()) {
            System.out.print(i);
            Thread.sleep(100);
        }
    }
}