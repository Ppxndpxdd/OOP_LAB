package LAB8.Program2;

public class Pro2 {
    public static void main(String[] args) {
        GeometricObject2[] square = { new Square(6, "Blue", true), new Square(5, "Yellow", true),
                new Square(4, "Gray", true), new Square(3, "White", true), new Square(2, "Black", true) };
        for (int i = 0; i < square.length; i++) {
            System.out.println(square[i]);
            ((Square) square[i]).howToColor();
            System.out.println();
        }
    }
}
