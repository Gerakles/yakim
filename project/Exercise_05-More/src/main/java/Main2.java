public class Main2 {
    public static void main(String[] args) {
        int index = 2;
        String[] four = {"Shirt","Shirt2","Shirt3","Shirt4",};
        String message = ("We have " + four.length + " items");
        if (index > four.length) {
            System.out.println("number invalid");
        }
        else  {String words= four[3];
            System.out.println(words);
        }
    }

}


