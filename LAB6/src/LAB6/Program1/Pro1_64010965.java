package LAB6.Program1;
import java.util.Scanner;
public class Pro1_64010965 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = in.nextLine();
        System.out.print("enter your age: ");
        int age = in.nextInt();
        System.out.print("enter your weight(pounds): ");
        double weight = in.nextDouble();
        System.out.println("Enter your height(inches)");
        System.out.print("feet: ");
        double feet = in.nextDouble();
        System.out.print("inches: ");
        double inches = in.nextDouble();
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("Your BMI is " + bmi.getBMI());
        System.out.println("Your interpretation is " + bmi.getInterpretation());
        in.close();
    }
}
