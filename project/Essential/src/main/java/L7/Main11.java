package L7;

public class Main11 {
    public static void main(String[] args) {
        MyCompany myCompany = MyCompany.Yakim;
        System.out.println(myCompany);


        int salary = myCompany.getValue();
        String currency = myCompany.getCurrency();
        System.out.println(" I maked "+salary+" "+currency+" in the moon");
    }
}
