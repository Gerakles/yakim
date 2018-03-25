package Essential.L12;
abstract class Shape {
}
class Circle extends Shape {
}
interface IContainer<T> {
    T getFigure();

    void setFigure(T figure);
}
class Containe<T> implements IContainer<T> {
    private T figure;

    public Containe(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }
}
public class Main4 {
    public static void main(String[] args) {
     Circle circle = new Circle();
     IContainer<Circle> container = new Containe <>( circle );
        System.out.println(container.getFigure().toString());
    }
}
