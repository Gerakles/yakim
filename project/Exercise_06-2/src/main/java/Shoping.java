public class Shoping {
    public static void main(String[] args) {
        odject object1, object2;
        object1 = new odject();
        object2 = new odject();

        object1.descr = "Shirt";
        object2.descr = "pants";

        object1=object2;
        System.out.println("object1: "+object1.descr);
        System.out.println("object2: "+object2.descr);
    }
}
