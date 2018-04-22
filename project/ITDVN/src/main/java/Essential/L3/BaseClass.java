package Essential.L3;

public class BaseClass {
    public String publicField = "BaseClass.publicField";
    protected String protectedField = "BaseClass.protectedField";
    private String privateField = "BaseClass.privateField";

    public void show() {
        System.out.println(privateField);
    }
}
