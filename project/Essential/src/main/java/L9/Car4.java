package L9;

public class Car4 {
    private int id;

    public Car4(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null||getClass() !=obj.getClass()) return false;
        Car4 car = (Car4) obj;
        if (id!=car.id) return false;
        return true;
    }
}
