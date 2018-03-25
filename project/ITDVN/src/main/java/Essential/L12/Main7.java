package Essential.L12;
class Base {
}
class Derived extends Base {
}
class Myclass7<T extends Base> {
}
public class Main7 {
    public static void main(String[] args) {
        Myclass7<Base> mc1 = new Myclass7 <>();
        Myclass7<Derived> mc2 = new Myclass7 <>();
    }
}
