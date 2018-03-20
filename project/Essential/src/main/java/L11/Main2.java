package L11;

class MyGenerics <TYPE1, TYPE2> {
    public TYPE1 var1;
    public TYPE2 var2;

    public MyGenerics(TYPE1 arg1, TYPE2 arg2) {
        this.var1 = arg1;
        this.var2 = arg2;
    }
}
public class Main2 {
    public static void main(String[] args) {
        MyGenerics<Integer, Integer> ins1 = new MyGenerics <>( 1,2 );
        System.out.println(ins1.var1+ins1.var2);

        MyGenerics<String, Integer> ins2 = new MyGenerics <>( "Number ",1 );
        System.out.println(ins2.var1+ins2.var2);

        MyGenerics<String, String> ins3 = new MyGenerics <>( "Hello ","World" );
        System.out.println(ins3.var1+ins3.var2);
    }
}
