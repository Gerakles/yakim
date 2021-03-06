package Essential.L12;

interface IContainer<T> {
    T getFigure();

    void setFigure(T figure);
}

abstract class Shape {
}

class Circle extends Shape {
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
        IContainer<Circle> container = new Containe<>(circle);
        System.out.println(container.getFigure().toString());
    }
}
