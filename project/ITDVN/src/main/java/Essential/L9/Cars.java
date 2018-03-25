package Essential.L9;

public class Cars {
    private int speed;
    private String color;

    public Cars(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format( "Speed is: %d\nColor is: %s",speed,color );
    }
}
