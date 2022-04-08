package LAB8.Program3;

public class Pro3 {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(2.0,12.0,"Green",true);
        Rectangle test2 = new Rectangle(2.0,12.0,"Blue",true);
        System.out.println(test);
        System.out.println(test.compareTo(test2));
        System.out.println(test.equals(test2));
    }
}
