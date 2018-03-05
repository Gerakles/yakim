public class dopolnenie {
    public static void main(String[] args) {
        metods item1 = new metods();

        if (item1.setCod('y')) {
            System.out.println(item1.cod);
        } else
            System.out.println("invalid");
    }
}
