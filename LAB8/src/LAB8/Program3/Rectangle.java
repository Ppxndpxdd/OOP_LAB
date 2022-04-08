package LAB8.Program3;

public class Rectangle extends GeometricObject3 implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double width,double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width,double height,String color,boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        return getArea() == ((Rectangle) obj).getArea();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Area : " + getArea() + "\n" +
                "Perimeter : " + getPerimeter();
    }
}
