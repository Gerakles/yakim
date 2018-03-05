public class Main {
    public static void main(String[] args) {
        MyList list = new NodeList();
        list.add("first");
        list.add("next");
        //System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //System.out.println(list.get(2));

    }
}
