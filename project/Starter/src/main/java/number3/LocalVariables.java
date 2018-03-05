package number3;

public class LocalVariables {
    public static void main(String[] args) {
        {// В коде можно создавать локальные области и в двух разных локальных областях хранить одноименные переменные
            int a=1;
            System.out.println(a);
        }
        {
            int a=2;
            System.out.println(a);
        }
        {
            int a=3;
            System.out.println(a);
        }//System.out.println(a); - ОШИБКА: Переменная объявлена в локальной области и не существует за её пределами.

    }
}
