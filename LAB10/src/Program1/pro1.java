package Program1;

import java.util.Scanner;

public class pro1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the index of array : ");
            
            int[] nums = new int[100]; // 0-99
            int index = scanner.nextInt(); // variable for kept user input!
            
            try {
                for (int i = 0; i < 100; i++) {
                    int randNum = (int) (Math.random() * 1000000000);
                    nums[i] = randNum;
                }        
                System.out.println("Element of" + " " + "index " + "< " + index + " >" + " " + "is" + " " + "< "
                + nums[index] + " >");
                System.out.println("");

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds!");
            }
        }
    }
}
