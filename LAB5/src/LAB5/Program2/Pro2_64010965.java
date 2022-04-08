package LAB5.Program2;

public class Pro2_64010965 {
    public static void main(String[] args) {
        RegularPolygon regPol_first = new RegularPolygon();
        RegularPolygon regPol_second = new RegularPolygon(6, 4);
        RegularPolygon regPol_third = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("");
        System.out.println("The perimeter of First regularPolygon is " + regPol_first.getPerimeter() + " unit");
        System.out.println("The area of first regularPolygon is " + regPol_first.getArea() + " unit square");
        System.out.println("");
        System.out.println("The perimeter of Second regularPolygon is " + regPol_second.getPerimeter() + " unit");
        System.out.println("The area of second regularPolygon is " + regPol_second.getArea() + " unit square");
        System.out.println("");     
        System.out.println("The perimeter of Third regularPolygon is " + regPol_third.getPerimeter() + " unit");
        System.out.println("The area of third regularPolygon is " + regPol_third.getArea() + " unit square");
        System.out.println("");
    }
}
