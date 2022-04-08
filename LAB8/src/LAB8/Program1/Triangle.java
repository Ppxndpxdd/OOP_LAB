package LAB8.Program1;

import java.lang.Math;

public class Triangle extends GeometricObject1 {
    private double side1, side2, side3; // side1, side2, side3

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double area = (side1 + side2 + side3) / 2;
        return Math.sqrt((area * (area - side1)) * (area - side2) * (area - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Perimeter = " + getPerimeter() + "\n" +
                "Area = " + getArea();
    }
}
