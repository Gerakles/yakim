package Essential.L1.modifires;

public class Shape {
    public double square;
    public int i;
    public float f;
    public char c;
    public boolean b;
    private int length;
    private long height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void wiieShape() {
        System.out.println("Height " + height);
        System.out.println("Length " + length);
    }
}
