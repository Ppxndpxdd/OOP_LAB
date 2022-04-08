package LAB8.Program4;

import java.util.Date;

public abstract class GeometricObject4 {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject4() {
        dateCreated = new Date();
    }

    protected GeometricObject4(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return dateCreated + "\n" +
                "Color : " + color + "\n" +
                "Filled : " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
