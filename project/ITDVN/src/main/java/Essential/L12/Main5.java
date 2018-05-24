package Essential.L12;

interface IContainers<T> {
    T getFigure();

    void setFigure(T figure);
}

abstract class Shapes {
}

class Circles extends Shapes {
}

class Containes<T> implements IContainers<T> {
    private T figure;

    public Containes(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Circles circle = new Circles();
        IContainers<Shapes> container = new Containes<>(circle);
        System.out.println(container.getFigure().toString());
    }
}
