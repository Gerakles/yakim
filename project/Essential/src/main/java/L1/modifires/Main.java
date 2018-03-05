package L1.modifires;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println(shape.i);
        System.out.println(shape.f);
        System.out.println(shape.c);
        System.out.println(shape.b);

        shape.square=24.0;                  //доступ к публик полю
        System.out.println(shape.square);
        // задаем параметры нашему объекту
        shape.getHeight();
        shape.setHeight( 200 );

        shape.getLength();
        shape.setLength( 144 );
        //выводим объект через метод
        shape.wiieShape();
    }
}
